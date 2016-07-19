package com.sdm.mylibrary.Utils;


public class Const {

    public static int GO_BACK = 0;
    public static boolean REFRESH_DISPLAY = false;
    //    public static  int UPDATED_NUMBER = 0;
    // identifier for our Preferences
    public static String[] MONTHS = {"MONTH", "JAN", "FEB", "MAR", "APR",
            "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    public static String[] MONTHS_INTEGER = {"MONTH", "01", "02", "03", "04",
            "05", "06", "07", "08", "09", "10", "11", "12"};
    public static String[] YEARS = {"YEAR", "2014", "2015", "2016", "2017",
            "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025",
            "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033",
            "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041",
            "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049",
            "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057",
            "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065",
            "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073",
            "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081",
            "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089",
            "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097",
            "2098", "2099"};


    public static String SELECTED_ITEM = "";

    public static  int TIME_CHECK=0;
    public static int ZOOM_LEVEL = 13;
    public static final float SPACING = -0.02f;


    public static final String DAYMNTHDDHHMMSS = "EEE, MMM d, yyyy hh:mm aa";
    public static final String HH = "hh";
    public static final String MM = "mm";
    public static final String YYYYMMDD = "yyyy-MM-dd";
    public static final String aa = "aa";

    public static final String CATERING_STATUS = "catering_status";


    public static final String TWITTER_CONSUMER_KEY = "XibC9oYxIVdhTMA0NPjEfafM4";
    public static final String TWITTER_CONSUMER_SECRET = "1i8vJaBWm8n6PXWtZeo9PWavi6zakipj6vEZ4lbNCDfG4KGEhn";

    // Webservice of Staging Server
    public static class WB_URL {

//	192.155.246.146:8191/img/supply_items/thumb/
//          public static final String WEB_SERVICE = "http://192.155.246.146:8191/webservices/";
//        public static final String WEB_SERVICE = "http://192.155.246.146:8191/webservices_beta/";
//        public static final String WEB_SERVICE = "http://alpha.foomanchew.com/webservices/";
        public static final String WEB_SERVICE = "https://www.foomanchew.com/webservices/";

//        public static final String BASEURL = "http://alpha.foomanchew.com/";

        public static final String BASEURL = "https://www.foomanchew.com/";

//        public static final String BASEURL = "http://192.155.246.146:8191/";

        public static final String SUPPLIES_IMAGE = BASEURL + "img/supply_items/thumb/";

//        public static final String WEB_SERVICE = "http://www.foomanchew.com/api/v2/webservices/";


        // http://108.168.203.226:8306
        // server path
//        public static final  String sServerPath = "http://www.foomanchew.com/api/v2/webservices/";
        public static final String sServerImagePath = BASEURL+"img/ads/mobanner/";
        //        public static final String sServerImagePath = "http://192.155.246.146:8191/img/ads/mobanner/";
        public static final String RESTURANTMENUITEM = WEB_SERVICE + "restaurant_menu_items";
                public static  final String sServerWebViewPath = "http://alpha.foomanchew.com/";
        public static final String IMAGE_DELIGHT_PATH = BASEURL+"img/deals/secondary/";
        public static final String IMAGE_DEAL_CODE_PATH = BASEURL+"img/deals/small_banner/";
        public static final String MENU_LISTING = WEB_SERVICE + "menu_categories";
        public static final String DELETE_CARD = WEB_SERVICE + "delete_credit_card";
        public static final String MENU_ITEM_DETAIL = WEB_SERVICE + "restaurant_menu_item_details";
        // ActivityCatering (Image path for deal code)
//        public static final String IMAGE_BIG_DEAL_CODE_PATH = "http://alpha.foomanchew.com/img/deals/big_banner/";
        // public static Boolean sloginStatus = false;
        public static int HOLDMENU = -1;
//        public static String IMAGE_PATH = "http://www.foomanchew.com/img/mob-icons/";
//
//        public static String IMAGE_PATH = BASEURL + "img/mob-icons/";

        public static String IMAGE_PATH = BASEURL+"img/mob-icons/";


//        public static String IMAGE_CAT = "http://www.foomanchew.com/img/category-icons/";

        public static String IMAGE_CAT = BASEURL + "img/category-icons/";

//        public static String IMAGE_CAT = "http://192.155.246.146:8191/img/category-icons/";

        public static String MENU_IMAGE_PATH = BASEURL+"img/menuitem_pic/android/";

//        public static String MENU_IMAGE_PATH = "http://192.155.246.146:8191/img/menuitem_pic/android/";

        public static String MENU_IMAGE_MEDIUM_PATH = BASEURL + "img/menuitem_pic/medium/";

        public static final String HOME_TOP_ADS = WEB_SERVICE + "home_banners";
        public static final String FAQS = WEB_SERVICE + "faq";
        public static final String LOGIN = WEB_SERVICE + "login";
        public static final String PROFILE = WEB_SERVICE + "user_profile";

        public static final String INVITE_FRIEND = WEB_SERVICE + "invite_friends";

        public static final String INVITE_FACEBOOK_FRIEND = WEB_SERVICE + "invite_friends_via_facebook";

        public static final String ADDRESS_LISTING = WEB_SERVICE + "user_address_list";

        public static final String STATE_LIST = WEB_SERVICE + "state_list";

        public static final String ADD_ADDRESS = WEB_SERVICE + "add_address";


        public static final String REGISTRATION_DETAIL = WEB_SERVICE + "register";


        public static final String GET_DEFAULT_ADDRESS = WEB_SERVICE + "get_default_location";

        public static final String FACEBOOK_SIGNUP = WEB_SERVICE + "facebook_login";

        public static final String EDIT_USER_PROFILE = WEB_SERVICE + "edit_user_profile";

//String for saving and updating card data

        public static final String EDIT_CARD = WEB_SERVICE + "edit_credit_card";

        public static final String SET_DEFAULT_CARD = WEB_SERVICE + "set_default_credit_card";

        public static final String GET_CARD_lIST = WEB_SERVICE + "credit_card_list";
        public static final String CREDIT_CARD_LIST = WEB_SERVICE + "credit_card_list";
        public static final String SET_ADDRESS_DEFAULT = WEB_SERVICE + "set_default_address";
        public static final String FOOCREW = WEB_SERVICE + "foocrew_points";
        public static final String SAVE_CARD = WEB_SERVICE + "save_credit_card";
        public static final String DELETE_ACCOUNT = WEB_SERVICE + "delete_account";
        public static final String FEEDBACK = WEB_SERVICE + "feedback";
        public static final String FIND_RESTAURANT = WEB_SERVICE + "find_restaurant";
        public static final String FORGOT_PASSWORD = WEB_SERVICE + "forgot_password";

        public static final String SET_FAVORITE = WEB_SERVICE + "set_fav_location";

        public static final String REMOVE_FAVORITE = WEB_SERVICE + "remove_fav_location";


        public static final String SET_DEFAULT = WEB_SERVICE + "set_default_location";

        public static final String REMOVE_DEFAULT = WEB_SERVICE + "remove_default_location";

        public static final String GET_FUTURE_DATE = WEB_SERVICE + "get_future_date_time";


        public static final String NO_SERVICE_LOCATION = WEB_SERVICE + "location_alert";

        public static final String CHECK_DEAL = WEB_SERVICE + "checkDealCode";

        public static final String CHECKOUT = WEB_SERVICE + "checkout";

        public static final String FUTURE_DATE_STATUS = WEB_SERVICE + "future_date_status";


        public static final String PAYPAL_CHECKOUT = WEB_SERVICE + "paypal_checkout";

        public static final String GET_CUSTOMER_DEAL = WEB_SERVICE + "get_customer_deal";


        public static final String MY_ORDER_HISTORY = WEB_SERVICE + "my_orders";

        public static final String ADD_ITEM_TOFAVORITE = WEB_SERVICE + "mark_item_as_favorite";

        public static final String RE_ORDER = WEB_SERVICE + "view_re_order";


        public static final String PROGRAM_CODE_EMAILS = WEB_SERVICE + "get_progcode_emails";

        public static final String START_MY_ORDER = WEB_SERVICE + "start_group_order";


        public static final String START_PARTICIPANT_GO = WEB_SERVICE + "start_participant_go";

        public static final String CANCEL_GO = WEB_SERVICE + "cancel_go";

        public static final String FAQ_URL = BASEURL + "faq-mb";

        public static final String GET_LOCATION = WEB_SERVICE + "get_locations";

        public static final String GET_HOUSE_ACCOUNT = WEB_SERVICE + "get_house_account_details";

        public static final String MEAL_PACKAGES = WEB_SERVICE + "meal_packages";

        public static final String REQUEST_QUOTE = WEB_SERVICE + "request_quote";

        public static final String SEARCH_ITEMS = WEB_SERVICE + "search_items";

        public static final String MENU_PACKAGES_DETAIL = WEB_SERVICE + "meal_package_details";

        public static final String DEALS_BANNER = WEB_SERVICE + "deal_banners";

        public static final String ACCOUNT_SETTING = WEB_SERVICE + "account_setting";


        public static final String ADDRESS_DELETE = WEB_SERVICE + "delete_customer_address";

        public static final String FAVORITE_LISTING = WEB_SERVICE + "favorite_listing";

        public static final String ODER_RATING = WEB_SERVICE + "order_rating";

        public static final String MP_DETAILS = WEB_SERVICE + "get_mp_item_details";


        public static final String SUPPLIES_ITEMS = WEB_SERVICE + "get_supply_items";


        public static final String REMOVE_ITEM = WEB_SERVICE + "remove_favorite_item";


        public static final String REMOVE_ORDER = WEB_SERVICE + "remove_favorite_order";


        public static final String GET_DEFAULT_SETTINGS = WEB_SERVICE + "get_default_settings";

        public static final String GET_REST_DATETIME = WEB_SERVICE + "get_rest_dateTime";

        public static final String MAKE_ORDER_FAV = WEB_SERVICE + "mark_order_as_fav";

        public static final String REMOVE_ORDER_FAV = WEB_SERVICE + "remove_favorite_order";


        public static final String MARK_ITEM_FAV = WEB_SERVICE + "mark_item_as_favorite";


        public static final String REMOVE_ITEM_FAV = WEB_SERVICE + "remove_favorite_item";


    }

}