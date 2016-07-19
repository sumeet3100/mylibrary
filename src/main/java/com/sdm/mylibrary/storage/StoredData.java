package com.sdm.mylibrary.storage;

import android.util.Log;

import com.sdm.mylibrary.models.AddtoCart;
import com.sdm.mylibrary.models.CardListModel;
import com.sdm.mylibrary.models.CartItemClass;
import com.sdm.mylibrary.models.DatesModel;
import com.sdm.mylibrary.models.DealModel;
import com.sdm.mylibrary.models.DefaultLocationModel;
import com.sdm.mylibrary.models.FavItem;
import com.sdm.mylibrary.models.GetDefaultModel;
import com.sdm.mylibrary.models.HomeAdsModel;
import com.sdm.mylibrary.models.HouseAccountModel;
import com.sdm.mylibrary.models.LocationRestaurantModel;
import com.sdm.mylibrary.models.MealGridModel;
import com.sdm.mylibrary.models.MealSecondModel;
import com.sdm.mylibrary.models.SelectedItemModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by sumeetb on 7/7/2015.
 */
public class StoredData {


    private static StoredData singletonInstance = null;
    private AddtoCart items;
    private int count=0;
    private int delivery_status;
    private String orderfor;
    private int serviceType=1;
    private int paymentType;
    private int intializer=0;
    private int datePosition;
    private int timePosition;
    private int minutePosition=0;
    private int meridianPosition=0;
    private int reorder;
    private  MealGridModel.data selectedCategory;
    private int deliver30=1;
    private String orderID;
    private String globalNumber;

    private String customerSuite;

    private int customerLocation;


    public String getCustomerSuite() {
        if(customerSuite==null){
            customerSuite="";
        }
        return customerSuite;
    }

    public void setCustomerSuite(String customerSuite) {
        this.customerSuite = customerSuite;
    }

    public int getCustomerLocation() {

        return customerLocation;
    }

    public void setCustomerLocation(int customerLocation) {
        this.customerLocation = customerLocation;
    }

    public String getGlobalNumber() {
        return globalNumber;
    }

    public void setGlobalNumber(String globalNumber) {
        this.globalNumber = globalNumber;
    }

    private String specialInstruction;

    private String driverInstruction;

    public String getSpecialInstruction() {
        if(specialInstruction==null){
            specialInstruction="";
        }

        return specialInstruction;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    public String getDriverInstruction() {
        if(driverInstruction==null){
            driverInstruction="";
        }
        return driverInstruction;
    }

    public void setDriverInstruction(String driverInstruction) {
        this.driverInstruction = driverInstruction;
    }

    private int eventLocaiton ;

    public int getEventLocaiton() {
        return eventLocaiton;
    }

    public void setEventLocaiton(int eventLocaiton) {
        this.eventLocaiton = eventLocaiton;
    }

    private ArrayList<DealModel.Data.OfferItem> DealArray=new ArrayList<>();


    private DatesModel datesData;

    public DatesModel getDatesData() {
        return datesData;
    }

    public void setDatesData(DatesModel datesData) {
        this.datesData = datesData;
    }

    private GetDefaultModel getDefault;

    public GetDefaultModel getGetDefault() {
        return getDefault;
    }

    public void setGetDefault(GetDefaultModel getDefault) {
        this.getDefault = getDefault;
    }

    private String cateringHour="";

    private String cateringMin="";

    private String cateringMeridan="";

    private String mainDeal;

    private Float mDealPrice=0.0f;

    private String fooPoints;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getFooPoints() {
        return fooPoints;
    }

    public void setFooPoints(String fooPoints) {
        this.fooPoints = fooPoints;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    public AddtoCart getItems() {
        return items;
    }

    public void setItems(SelectedItemModel items) {

        cartArray.add(items);
    }


    public int getDelivery_status() {
        return delivery_status;
    }

    public void setDelivery_status(int delivery_status) {
        this.delivery_status = delivery_status;
    }

    private ArrayList<SelectedItemModel> cartArray = new ArrayList<SelectedItemModel>();

    public ArrayList<SelectedItemModel> getCartArray() {
        return cartArray;
    }


    public void updateCart(ArrayList<SelectedItemModel> items){

        cartArray.clear();
        cartArray.addAll(items);


    }


    public void clearCart(){

        cartArray.clear();

    }

    private StoredData() {
    }
    public static synchronized StoredData getSingletonInstance() {
        if (null == singletonInstance) {

            singletonInstance = new StoredData();
        }
        return singletonInstance;
    }




    private HashMap<String, SelectedItemModel> itemsOrders=new HashMap<>();


    public HashMap<String, SelectedItemModel> getItemsOrders() {
        return itemsOrders;
    }

    public void setItemsOrders(HashMap<String, SelectedItemModel> order) {

        Iterator it = order.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

            SelectedItemModel  appitizerItem  = (SelectedItemModel)pair.getValue();
            cartArray.add(appitizerItem);

        }

//        Log.e(itemsOrders.size()+" size of items","before size  is"+order.size());
//        this.itemsOrders.putAll(order);

        Log.e("size of items","size is"+itemsOrders.size());
    }


    public int getSizeofOrder(){


        return cartArray.size();
    }



    private DefaultLocationModel.Data.OperatingPartnerLocation restuarntItem;

    public DefaultLocationModel.Data.OperatingPartnerLocation getRestuarntItem() {
        return restuarntItem;
    }


    public void setRestuarntItem(DefaultLocationModel.Data.OperatingPartnerLocation operatingPartnerLocation) {

        this.restuarntItem=operatingPartnerLocation;
    }


    private DefaultLocationModel.userdata userAddress;

    public DefaultLocationModel.userdata getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(DefaultLocationModel.userdata userAddress) {
        this.userAddress = userAddress;
    }


    public int getDatePosition() {
        return datePosition;
    }

    public void setDatePosition(int datePosition) {
        this.datePosition = datePosition;
    }

    public int getTimePosition() {
        return timePosition;
    }

    public void setTimePosition(int timePosition) {
        this.timePosition = timePosition;
    }




    public int getServiceType() {

        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }


    public int getIntializer() {
        return intializer;
    }

    public void setIntializer(int intializer) {
        this.intializer = intializer;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }


    private CardListModel.data creditcard;

    public CardListModel.data getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CardListModel.data creditcard) {
        this.creditcard = creditcard;
    }



    public String getOrderfor() {
        if(orderfor==null){
            orderfor="";

        }

        return orderfor;
    }

    public void setOrderfor(String orderfor) {
        this.orderfor = orderfor;
    }


    public ArrayList<DealModel.Data.OfferItem> getDealArray() {
        return DealArray;
    }

    public void setDealArray(ArrayList<DealModel.Data.OfferItem> dealArray) {
        DealArray = dealArray;
    }

    public Float getmDealPrice() {
        return mDealPrice;
    }

    public void setmDealPrice(Float mDealPrice) {
        this.mDealPrice = mDealPrice;
    }



    private int dealType = 0;


    public int getDealType() {
        return dealType;
    }

    public void setDealType(int dealType) {
        this.dealType = dealType;
    }


    private String dealValue;


    public String getDealValue() {
        if(dealValue==null){
            return "";
        }
        return dealValue;
    }

    public void setDealValue(String dealValue) {
        this.dealValue = dealValue;
    }

    public MealGridModel.data getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(MealGridModel.data selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    private int enableGO;

    public int getEnableGO() {
        return enableGO;
    }

    public void setEnableGO(int enableGO) {
        this.enableGO = enableGO;
    }


    private String group_order_id;

    public String getGroup_order_id() {
        if(group_order_id==null){
            group_order_id="";
        }
        return group_order_id;
    }

    public void setGroup_order_id(String group_order_id) {
        this.group_order_id = group_order_id;
    }


    private int GO_owner;

    public int getGO_owner() {
        return GO_owner;
    }

    public void setGO_owner(int GO_owner) {
        this.GO_owner = GO_owner;
    }


    private String participantTime;

    public String getParticipantTime() {
        if(participantTime==null){
            participantTime="";
        }
        return participantTime;
    }

    public void setParticipantTime(String participantTime) {
        this.participantTime = participantTime;
    }

    private String participantId;

    public String getParticipantId() {
        if(participantId==null){
            participantId="";
        }
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    private String who_pays;

    public String getWho_pays() {
        if(who_pays==null){
            who_pays="";
        }
        return who_pays;
    }

    public void setWho_pays(String who_pays) {
        this.who_pays = who_pays;
    }

    private String org_name;

    public String getOrg_name() {
        if(org_name==null){
            org_name="";
        }
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    private String max_amount;

    public String getMax_amount() {
        if(max_amount==null || max_amount.equalsIgnoreCase("")){
            max_amount="0.00";
        }
        return max_amount;
    }

    public void setMax_amount(String max_amount) {
        this.max_amount = max_amount;
    }


    private  String participant_email;

    public String getParticipant_email() {
        return participant_email;
    }

    public void setParticipant_email(String participant_email) {
        this.participant_email = participant_email;
    }

    private String go_participant_id;

    public String getGo_participant_id() {
        return go_participant_id;
    }

    public void setGo_participant_id(String go_participant_id) {
        this.go_participant_id = go_participant_id;
    }

    public int getReorder() {
        return reorder;
    }

    public void setReorder(int reorder) {
        this.reorder = reorder;
    }

    public int getMinutePosition() {
        return minutePosition;
    }

    public void setMinutePosition(int minutePosition) {
        this.minutePosition = minutePosition;
    }

    public int getMeridianPosition() {
        return meridianPosition;
    }

    public void setMeridianPosition(int meridianPosition) {
        this.meridianPosition = meridianPosition;
    }

    public int getDeliver30() {
        return deliver30;
    }

    public void setDeliver30(int deliver30) {
        this.deliver30 = deliver30;
    }




    private  HouseAccountModel.data.HouseAccount account;

    public HouseAccountModel.data.HouseAccount getAccount() {
        return account;
    }

    public void setAccount(HouseAccountModel.data.HouseAccount account) {
        this.account = account;
    }

    // Banner id for home banners
    private String bannerMenuId;

    public String getBannerMenuId() {
        if(bannerMenuId==null){
            bannerMenuId="";
        }
        return bannerMenuId;
    }

    public void setBannerMenuId(String bannerMenuId) {
        this.bannerMenuId = bannerMenuId;
    }

    private HomeAdsModel.data.SiteAd.menuitem dealMenuItem;

    public HomeAdsModel.data.SiteAd.menuitem getDealMenuItem() {
        return dealMenuItem;
    }

    public void setDealMenuItem(HomeAdsModel.data.SiteAd.menuitem dealMenuItem) {
        this.dealMenuItem = dealMenuItem;
    }

    private  MealSecondModel.data.RestaurantMenuItem searchItem;

    public MealSecondModel.data.RestaurantMenuItem getSearchItem() {
        return searchItem;
    }

    public void setSearchItem(MealSecondModel.data.RestaurantMenuItem searchItem) {
        this.searchItem = searchItem;
    }


    private int catering_enabled=0;

    public int getCatering_enabled() {
        return catering_enabled;
    }

    public void setCatering_enabled(int catering_enabled) {
        this.catering_enabled = catering_enabled;
    }

    private String requestQuoteid;

    public String getRequestQuoteid() {
        if(requestQuoteid==null){
            requestQuoteid="";
        }
        return requestQuoteid;
    }

    public void setRequestQuoteid(String requestQuoteid) {
        this.requestQuoteid = requestQuoteid;
    }

    private FavItem favSelected;

    public FavItem getFavSelected() {
        return favSelected;
    }

    public void setFavSelected(FavItem favSelected) {
        this.favSelected = favSelected;
    }

    private int menuPackagesEnabled;

    public int getMenuPackagesEnabled() {
        return menuPackagesEnabled;
    }

    public void setMenuPackagesEnabled(int menuPackagesEnabled) {
        this.menuPackagesEnabled = menuPackagesEnabled;
    }
    private int setup;

    public int getSetup() {
        return setup;
    }

    public void setSetup(int setup) {
        this.setup = setup;
    }

    public String getMainDeal() {
        if(mainDeal==null){
            mainDeal="";
        }
        return mainDeal;
    }

    public void setMainDeal(String mainDeal) {
        this.mainDeal = mainDeal;
    }


    private int openMealPackage=0;

    public int getOpenMealPackage() {
        return openMealPackage;
    }

    public void setOpenMealPackage(int openMealPackage) {
        this.openMealPackage = openMealPackage;
    }

    private String MealPackageID;

    public String getMealPackageID() {
        return MealPackageID;
    }

    public void setMealPackageID(String mealPackageID) {
        MealPackageID = mealPackageID;
    }


    private Object savedObj;

    public Object getSavedObj() {
        return savedObj;
    }

    public void setSavedObj(Object savedObj) {
        this.savedObj = savedObj;
    }


    public String getCateringHour() {
        return cateringHour;
    }

    public void setCateringHour(String cateringHour) {
        this.cateringHour = cateringHour;
    }

    public String getCateringMin() {
        return cateringMin;
    }

    public void setCateringMin(String cateringMin) {
        this.cateringMin = cateringMin;
    }

    public String getCateringMeridan() {
        return cateringMeridan;
    }

    public void setCateringMeridan(String cateringMeridan) {
        this.cateringMeridan = cateringMeridan;
    }


    private String favOrderId="1";


    public String getFavOrderId() {
        if(favOrderId==null){

            favOrderId="";
        }
        return favOrderId;
    }

    public void setFavOrderId(String favOrderId) {

        this.favOrderId = favOrderId;
    }
}
