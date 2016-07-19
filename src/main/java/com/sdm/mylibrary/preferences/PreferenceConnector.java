package com.sdm.mylibrary.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * The class PreferenceConnector is a class useful to
 * simplify you the interaction with your app preferences.
 * In fact it has methods that interact with the basical features
 * of SharedPreferences but still the possibility to obtain
 * preferences.
 * 
 * 
 *
 */
    public class PreferenceConnector {
	public static final String PREF_NAME ="PEOPLE_PREF";
	public static final int MODE = Context.MODE_PRIVATE;
	public static final String EMAILID="emailid";
	public static final String PASSWORDID="password";
	public static final String MOBILENUM="mobile_num";

	public static final String CHECK_FAV_DEFAULT="FAV_DEF";
	public static final String ENCRYPT_ID="encrypt_id";
	public static final String USERID="user_id";
	public static final String CUSTOMERID="customer_id";
	public static final String FIRSTNAME="first_name";
	public static final String LASTNAME="last_name";
	public static final String LOGINSTATUS="login_status";
	public static final String LOGINFACEBOOK="facebook_s";
	public static final String FACEBOOK_ID="facebook_id";
	public static final String LOGINEMAIL="email_s";
	public static final String TOKEN="token";
	public static final String KEY="key";
	public static final String ZIPADDRESS="zipaddress";
	public static final String CUSTOMER_PHONE="customer_phone";
	public static final String EMAILALERT="email_alert";
	public static final String SPECIALOFFER="special_offers";
	public static final String CART_SIZE="cart_size";
	public static final String KEEP_SIGNIN = "check_sign";
	public static final String VALUE_UPDATED="value_updated";
	//public static final String RESTURANT_ID_FIND="RESTURANT_ID_Find";
	public static final String RESTURANT_ID="RESTURANT_ID";

	public static final String LATTITUDE="lattitude";
	public static final String LOGIN_RESPONSE="login_response";

	public static final String LONGITUDE="longitude";

	public static final String PAYMENT_TYPE="payment_type";

	public static final String PAYMENT_CARD_POSITION="PAYMENT_CARD_POSITION";

	public static final String FIRST_LOGIN="first_login";

	public static final String RECENT_VALUES="recent_values";
	
	public static void writeBoolean(Context context, String key, boolean value) {
		getEditor(context).putBoolean(key, value).commit();
	}

	public static boolean readBoolean(Context context, String key, boolean defValue) {
		return getPreferences(context).getBoolean(key, defValue);
	}

	public static void writeInteger(Context context, String key, int value) {
		getEditor(context).putInt(key, value).commit();
    }

	public static int readInteger(Context context, String key, int defValue) {
		return getPreferences(context).getInt(key, defValue);
	}

	public static void writeString(Context context, String key, String value) {
		getEditor(context).putString(key, value).commit();
    }
	
	public static String readString(Context context, String key, String defValue) {
		return getPreferences(context).getString(key, defValue);
	}
	
	public static void writeFloat(Context context, String key, float value) {
		getEditor(context).putFloat(key, value).commit();
	}

	public static float readFloat(Context context, String key, float defValue) {
		return getPreferences(context).getFloat(key, defValue);
	}
	
	public static void writeLong(Context context, String key, long value) {
		getEditor(context).putLong(key, value).commit();
	}

	public static long readLong(Context context, String key, long defValue) {
		return getPreferences(context).getLong(key, defValue);
	}

	public static SharedPreferences getPreferences(Context context) {
		return context.getSharedPreferences(PREF_NAME, MODE);
	}

	public static Editor getEditor(Context context) {
		return getPreferences(context).edit();
	}

}
