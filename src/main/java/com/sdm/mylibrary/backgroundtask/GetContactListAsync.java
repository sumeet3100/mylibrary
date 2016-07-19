package com.sdm.mylibrary.backgroundtask;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Toast;

import com.sdm.mylibrary.Utils.CommonMethod;
import com.sdm.mylibrary.callbacks.Contactlist;
import com.sdm.mylibrary.callbacks.PostJsonAsynListener;
import com.sdm.mylibrary.models.ContactDetailsModel;
import com.sdm.mylibrary.models.MailDataModel;
import com.sdm.mylibrary.models.MailNameModel;


import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetContactListAsync extends AsyncTask<String, Void, ArrayList<MailNameModel>> {
	// ProgressDialog authDialog;
	Dialog mDialog;
	JSONObject json;
	String url;
	Contactlist<Integer,ArrayList<MailNameModel> > mListener;
	boolean isDialogDisplay, isSuccess = false;
	Context context;
	int receivedId;
	int errorCode;
	ProgressDialog authDialog;
	String loaderString;
	private CommonMethod commonMethods;

	String items[] = new String[2];

	String mFirstName = "";
	String mLastName = "";

	ArrayList<ContactDetailsModel> contactWithEmailList;
	ArrayList<String> mailIDs;
	ArrayList<MailNameModel> mailsContact =new ArrayList<MailNameModel>();
	private String mMails;

	private HashMap<String,ArrayList<String>> userContacts = new HashMap<String,ArrayList<String>>();

	public GetContactListAsync(Context context,int receivedId,
							   Contactlist<Integer ,ArrayList<MailNameModel>>mListener ,
							   String loaderString, boolean isDialogDisplay) {
		this.context = context;
		this.json = json;
		this.url = url;
		this.receivedId = receivedId;
		this.mListener = mListener;
		this.isDialogDisplay = isDialogDisplay;
		this.loaderString = loaderString;

	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
		commonMethods=new CommonMethod();
		if (isDialogDisplay) {
			viewProgressVisible("Please wait..");
		}

	}

	@Override
	protected ArrayList<MailNameModel> doInBackground(String... params) {

//		contactWithEmailList = getAllEmailsFromContentProvider();
		fetchMails();
		List newList = new ArrayList(new LinkedHashSet(
				mailsContact));
		Iterator myVeryOwnIterator = userContacts.entrySet().iterator();
		while(myVeryOwnIterator.hasNext()) {
		ArrayList<MailDataModel> mailData = new ArrayList<>();
			Map.Entry pairs = (Map.Entry) myVeryOwnIterator.next();
			String key= (String) pairs.getKey();
			ArrayList<String> value=(ArrayList<String>)pairs.getValue();
			MailNameModel item = new MailNameModel();
			System.out.println(key + " values are= " + value.size());
			item.setName(key);
			if(commonMethods.checkEmail(key)){
				item.setEmail(key);
			}
			for (int i = 0; i <value.size() ; i++) {
				MailDataModel mailitem = new MailDataModel();
				mailitem.setMail(value.get(i));
				mailData.add(mailitem);
			}
			if(value.size()>=1){

				item.setEmail(value.get(0));
			}

			item.setMailsName(value);
			item.setEmails(mailData);
			mailsContact.add(item);

		}





		Log.e("the value of list", "size of list>>" + userContacts.size());

		isSuccess=true;
		return mailsContact;
	}

	@Override
	protected void onPostExecute(final ArrayList<MailNameModel> _result) {
		// TODO Auto-generated method stub
		super.onPostExecute(_result);

		Log.e("PostJsonAsyn", "Background operation is completed");

		try {
			viewProgressGone();
		} catch (Exception exception) {
			Log.e("", "progress stopped error");
		}

		finally {

			if (isSuccess) {

				Log.e("PostJsonAsyn", "Successfuly entered:" + mailsContact.size());

				mListener.listingContacts(receivedId, mailsContact);

			} else {
				Log.e("PostJsonAsyn", "erroerrr" + errorCode);

                if(errorCode==3){
                    Toast.makeText(context,"Internet connection is running slow",Toast.LENGTH_SHORT).show();

                }else if(errorCode==4){
                    Toast.makeText(context,"Server error",Toast.LENGTH_SHORT).show();
                }

				mListener.listingContacts(receivedId, mailsContact);
			}

		}

	}

	/** Functions to display progress dialog box **/

	public void viewProgressGone() {
		Log.e("PostJsonAsyn", "Inside viewProgressGone()");
		if (authDialog != null)

			authDialog.dismiss();

	}

	public void viewProgressVisible(String paramString) {
		authDialog = ProgressDialog.show(context, "", paramString, true, false);
	}


	// Get all email address and contact name from contact provider
	private ArrayList<ContactDetailsModel> getAllEmailsFromContentProvider() {
		Cursor cur = null;
		ArrayList<ContactDetailsModel> contactDetailList = new ArrayList<ContactDetailsModel>();
		int count = 0;
		try {
			ContentResolver cr = context.getContentResolver();
			cur = cr.query(ContactsContract.Contacts.CONTENT_URI, null, null,
					null, null);
			if (cur.getCount() > 0) {
				cur.moveToFirst();
				do {
					String contactId = cur.getString(cur
							.getColumnIndex(ContactsContract.Contacts._ID));
					// Create query to use CommonDataKinds classes to fetch
					// emails
					String name = cur
							.getString(cur.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));

					try {
						String mName[] = name.split(" ");

						try {

							if (!commonMethods.checkEmail(mName[0])) {

								if (!commonMethods.checkName(mName[0].toString().trim())) {

									mFirstName = "";

								} else {
									mFirstName = mName[0];
								}

							} else {
								mFirstName = "";
							}

						} catch (Exception e) {
							e.printStackTrace();
							mFirstName = "";
						}

						try {
							if (!commonMethods.checkEmail(mName[1])) {
								if (!commonMethods.checkName(mName[1]
										.toString().trim())) {

									mLastName = "";

								} else {
									mLastName = mName[1];
								}

							} else {
								mLastName = "";
							}

						} catch (Exception e) {
							e.printStackTrace();
							mLastName = "";
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

					Cursor emails = cr.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null,
							ContactsContract.CommonDataKinds.Email.CONTACT_ID + " = ?",
							new String[] { contactId }, null);

					try {
						if (emails != null) {
							if (emails.getCount() > 0) {
								// if (name != null) {
								// if (!name.equals("")) {
								ContactDetailsModel contactDetail = new ContactDetailsModel();

								contactDetail.firstName = mFirstName;
								contactDetail.lastName = mLastName;

								ArrayList<ContactDetailsModel> contactList = new ArrayList<ContactDetailsModel>();
								emails.moveToFirst();
								do {
									// This would allow you get several
									// email addresses
									// ContactDetail emailDetail = new
									// ContactDetail();
									String emailAddress = emails
											.getString(emails
													.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA1));
									if (emailAddress != null) {
										if (!emailAddress.equals("")) {

											// contactDetail.contactName = name;
											if (contactDetail.lastName
													.equalsIgnoreCase("")) {
												if (contactDetail.firstName
														.equalsIgnoreCase("")) {
													contactDetail.mSearchShort = emailAddress;

												} else {
													if (!commonMethods
															.checkEmail(contactDetail.firstName)) {
														contactDetail.mSearchShort = contactDetail.firstName;
													} else {
														contactDetail.mSearchShort = emailAddress;
													}

												}
											} else {
												contactDetail.mSearchShort = contactDetail.lastName;
											}

											contactDetail.contactName = emailAddress;
											contactList.add(contactDetail);
										}
									}

								} while (emails.moveToNext());

								if (!contactList.isEmpty()) {
									contactDetail.pos = count;
									contactDetail.emailList = contactList;
									count++;
									contactDetailList.add(contactDetail);
								}

							}
						}
					} catch (Exception e) {
//						showErroLog("ActivityInviteEmailList", e.toString());
					} finally {
						try {
							if (emails != null) {
								emails.close();
							}
						} catch (Exception e) {
//							showErroLog("ActivityInviteEmailList", e.toString());
						}
					}
				} while (cur.moveToNext());
			}

		} catch (Exception e) {
//			showErroLog("ActivityInviteEmailList", e.toString());
		} finally {
			try {
				if (cur != null) {
					cur.close();
				}

			} catch (Exception e) {
//				showErroLog("ActivityInviteEmailList", e.toString());
			}
		}

		return contactDetailList;
	}





	public ArrayList<MailNameModel> fetchMails(){
		ArrayList<MailNameModel> contactsMails = new ArrayList<MailNameModel>();
		ArrayList<MailDataModel> mails = new ArrayList<MailDataModel>();

		ContentResolver cr = context.getContentResolver();
		Cursor cur = cr.query(ContactsContract.Contacts.CONTENT_URI,
				null, null, null, null);
		if (cur.getCount() > 0) {
			while (cur.moveToNext()) {
				mails.clear();
				mMails="";

				MailNameModel item = new MailNameModel();

				String id = cur.getString(
						cur.getColumnIndex(ContactsContract.Contacts._ID));
				String name = cur.getString(
						cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));


				if (!commonMethods.checkEmail(name)) {


					item.setName(name);


				}else{

					mailIDs=new ArrayList<>();
					mailIDs.add(name);


					if(mailIDs.size()>0) {
						userContacts.put(name, mailIDs);

					}
				}

				if (Integer.parseInt(cur.getString(cur.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))) > 0) {
					Cursor emailCur = cr.query(
							ContactsContract.CommonDataKinds.Email.CONTENT_URI,
							null,
							ContactsContract.CommonDataKinds.Email.CONTACT_ID + " = ?",
							new String[]{id}, null);
					mailIDs=new ArrayList<>();
					while (emailCur.moveToNext()) {
						// This would allow you get several email addresses
						// if the email addresses were stored in an array
						String email = emailCur.getString(
								emailCur.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA));
						String emailType = emailCur.getString(
								emailCur.getColumnIndex(ContactsContract.CommonDataKinds.Email.TYPE));
						mailIDs.add(email);

						ArrayList<String> newList = new ArrayList(new HashSet(
								mailIDs));
						mailIDs.clear();
						mailIDs = newList;

					}
					emailCur.close();

					if(mailIDs.size()>0) {
						userContacts.put(name, mailIDs);


					}
				}
			}
		}

			return contactsMails;
	}

}
