package com.sdm.mylibrary.Utils;


public class Const {

    public static int GO_BACK = 0;
    public static boolean REFRESH_DISPLAY = false;
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

    public static int TIME_CHECK = 0;
    public static int ZOOM_LEVEL = 13;
    public static final float SPACING = -0.02f;

    public static final String DAYMNTHDDHHMMSS = "EEE, MMM d, yyyy hh:mm aa";
    public static final String HH = "hh";
    public static final String MM = "mm";
    public static final String YYYYMMDD = "yyyy-MM-dd";
    public static final String aa = "aa";

    public static final String CATERING_STATUS = "catering_status";

    // Webservice of Staging Server
    public static class WB_URL {

        public static final String WEB_SERVICE = "http://192.155.246.146:8191/webservices/";
        public static final String BASEURL = "http://192.155.246.146:8191/";
        public static final String sServerImagePath = BASEURL + "img/ads/mobanner/";
        public static final String RESTURANTMENUITEM = WEB_SERVICE + "restaurant_menu_items";
        public static final String IMAGE_DELIGHT_PATH = BASEURL + "img/deals/secondary/";
        public static final String IMAGE_DEAL_CODE_PATH = BASEURL + "img/deals/small_banner/";
        public static final String MENU_LISTING = WEB_SERVICE + "menu_categories";
        public static final String DELETE_CARD = WEB_SERVICE + "delete_credit_card";
        public static final String MENU_ITEM_DETAIL = WEB_SERVICE + "restaurant_menu_item_details";
        public static int HOLDMENU = -1;
        public static String IMAGE_PATH = BASEURL + "img/mob-icons/";
        public static String IMAGE_CAT = BASEURL + "img/category-icons/";
        public static String MENU_IMAGE_PATH = BASEURL + "img/menuitem_pic/android/";
        public static String MENU_IMAGE_MEDIUM_PATH = BASEURL + "img/menuitem_pic/medium/";


    }

}