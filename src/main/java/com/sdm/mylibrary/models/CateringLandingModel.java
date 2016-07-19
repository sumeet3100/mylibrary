package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 9/28/15.
 */
public class CateringLandingModel implements Serializable{

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<data> mData;

    @SerializedName("catering_banner")
    private String catering_banner;

    public String getCatering_banner() {
        return catering_banner;
    }

    public void setCatering_banner(String catering_banner) {
        this.catering_banner = catering_banner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data implements Serializable{

        @SerializedName("MenuPackage")
        MenuPackage menupackage;

        @SerializedName("MenuPackageItem")
        ArrayList<MenuPackageItem> menupackageitem;

        public MenuPackage getMenupackage() {
            return menupackage;
        }

        public void setMenupackage(MenuPackage menupackage) {
            this.menupackage = menupackage;
        }

        public ArrayList<MenuPackageItem> getMenupackageitem() {
            return menupackageitem;
        }

        public void setMenupackageitem(ArrayList<MenuPackageItem> menupackageitem) {
            this.menupackageitem = menupackageitem;
        }

        public class MenuPackage implements Serializable{

            @SerializedName("id")
            private String id;

            @SerializedName("meal_package_name")
            private String meal_package_name;

            @SerializedName("meal_package_standard_price")
            private String meal_package_standard_price;

            @SerializedName("meal_package_retail_price")
            private String meal_package_retail_price;

            @SerializedName("meal_package_serving")
            private String meal_package_serving;

            @SerializedName("no_mark_down")
            private String no_mark_down;

            @SerializedName("status")
            private String status;

            @SerializedName("meal_pkg_id")
            private String meal_pkg_id;

            @SerializedName("is_md")
            private String is_md;

            @SerializedName("md_price")
            private String md_price;

            private String item_special_instruction;

            public String getItem_special_instruction() {
                return item_special_instruction;
            }

            public void setItem_special_instruction(String item_special_instruction) {
                this.item_special_instruction = item_special_instruction;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMeal_package_name() {
                return meal_package_name;
            }

            public void setMeal_package_name(String meal_package_name) {
                this.meal_package_name = meal_package_name;
            }

            public String getMeal_package_standard_price() {
                return meal_package_standard_price;
            }

            public void setMeal_package_standard_price(String meal_package_standard_price) {
                this.meal_package_standard_price = meal_package_standard_price;
            }

            public String getMeal_package_retail_price() {
                return meal_package_retail_price;
            }

            public void setMeal_package_retail_price(String meal_package_retail_price) {
                this.meal_package_retail_price = meal_package_retail_price;
            }

            public String getMeal_package_serving() {
                return meal_package_serving;
            }

            public void setMeal_package_serving(String meal_package_serving) {
                this.meal_package_serving = meal_package_serving;
            }

            public String getNo_mark_down() {
                return no_mark_down;
            }

            public void setNo_mark_down(String no_mark_down) {
                this.no_mark_down = no_mark_down;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getMeal_pkg_id() {
                return meal_pkg_id;
            }

            public void setMeal_pkg_id(String meal_pkg_id) {
                this.meal_pkg_id = meal_pkg_id;
            }

            public String getIs_md() {
                return is_md;
            }

            public void setIs_md(String is_md) {
                this.is_md = is_md;
            }

            public String getMd_price() {
                return md_price;
            }

            public void setMd_price(String md_price) {
                this.md_price = md_price;
            }
        }


        public class MenuPackageItem implements Serializable{

            @SerializedName("id")
            private String id;

            @SerializedName("meal_package_id")
            private String meal_package_id;

            @SerializedName("meal_id")
            private String meal_id;

            @SerializedName("meal_type")
            private String meal_type;

            @SerializedName("quantity")
            private String quantity;

            private String updatedQuantity;

            public String getUpdatedQuantity() {
                return updatedQuantity;
            }

            public void setUpdatedQuantity(String updatedQuantity) {
                this.updatedQuantity = updatedQuantity;
            }

            private String is_divide;

            public String getIs_divide() {
                return is_divide;
            }

            public void setIs_divide(String is_divide) {
                this.is_divide = is_divide;
            }

            @SerializedName("weight")
            private String weight;

            @SerializedName("size")
            private String size;

            @SerializedName("name")
            private String name;

            @SerializedName("display_name")
            private String display_name;


            private String is_switch;

            @SerializedName("size_name")
            private String size_name;

            private String display_short_name;

            private boolean checked;

            ItemDetailModel.data.MItem mpselected;

            public ItemDetailModel.data.MItem getMpselected() {
                return mpselected;
            }

            public void setMpselected(ItemDetailModel.data.MItem mpselected) {
                this.mpselected = mpselected;
            }

            public boolean isChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }

            public String getSize_name() {
                return size_name;
            }

            public void setSize_name(String size_name) {
                this.size_name = size_name;
            }

            public String getDisplay_short_name() {
                return display_short_name;
            }

            public void setDisplay_short_name(String display_short_name) {
                this.display_short_name = display_short_name;
            }

            public String getIs_switch() {
                return is_switch;
            }

            public void setIs_switch(String is_switch) {
                this.is_switch = is_switch;
            }

            @SerializedName("MenuCategory")
            private MenuCategory category;




            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMeal_package_id() {
                return meal_package_id;
            }

            public void setMeal_package_id(String meal_package_id) {
                this.meal_package_id = meal_package_id;
            }

            public String getMeal_id() {
                return meal_id;
            }

            public void setMeal_id(String meal_id) {
                this.meal_id = meal_id;
            }

            public String getMeal_type() {
                return meal_type;
            }

            public void setMeal_type(String meal_type) {
                this.meal_type = meal_type;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;

            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDisplay_name() {
                return display_name;
            }

            public void setDisplay_name(String display_name) {
                this.display_name = display_name;
            }

            public MenuCategory getCategory() {
                return category;
            }

            public void setCategory(MenuCategory category) {
                this.category = category;
            }

            public class MenuCategory implements Serializable{


                @SerializedName("id")
                private String id;


                @SerializedName("name")
                private String name;


                @SerializedName("mobile_medium_icon")
                private String mobile_step2_icon;


                @SerializedName("mobile_medium_icon_ext")
                private String mobile_step2_icon_ext;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getMobile_step2_icon() {
                    return mobile_step2_icon;
                }

                public void setMobile_step2_icon(String mobile_step2_icon) {
                    this.mobile_step2_icon = mobile_step2_icon;
                }

                public String getMobile_step2_icon_ext() {
                    return mobile_step2_icon_ext;
                }

                public void setMobile_step2_icon_ext(String mobile_step2_icon_ext) {
                    this.mobile_step2_icon_ext = mobile_step2_icon_ext;
                }
            }


            @SerializedName("addon")
            ArrayList<addon> mAddons = new ArrayList<>();


            public ArrayList<addon> getmAddons() {
                return mAddons;
            }

            public void setmAddons(ArrayList<addon> mAddons) {
                this.mAddons = mAddons;
            }

            public class addon implements Serializable{
                @SerializedName("MenuItem")
                ItemDetailModel.data.MItem mpselected;

                @SerializedName("Selection")
                ReOrderitem.data.LineItem.Selection selectionItem;

                @SerializedName("extra")
                ArrayList<ReOrderitem.data.LineItem.addon.extra> Extra;


                public ArrayList<ReOrderitem.data.LineItem.addon.extra> getExtra() {
                    return Extra;
                }

                public void setExtra(ArrayList<ReOrderitem.data.LineItem.addon.extra> extra) {
                    Extra = extra;
                }

                public ItemDetailModel.data.MItem getMpselected() {
                    return mpselected;
                }

                public void setMpselected(ItemDetailModel.data.MItem mpselected) {
                    this.mpselected = mpselected;
                }

                public ReOrderitem.data.LineItem.Selection getSelectionItem() {
                    return selectionItem;
                }

                public void setSelectionItem(ReOrderitem.data.LineItem.Selection selectionItem) {
                    this.selectionItem = selectionItem;
                }






            }





        }


        @SerializedName("CategorySwitch")
        private ArrayList<CategorySwitch> categoryswitch;

        public ArrayList<CategorySwitch> getCategoryswitch() {
            return categoryswitch;
        }

        public void setCategoryswitch(ArrayList<CategorySwitch> categoryswitch) {
            this.categoryswitch = categoryswitch;
        }

        public class CategorySwitch implements  Serializable{



            private String id;

            private String name;

            private String mobile_medium_icon;

            private String mobile_medium_icon_ext;

            private String device_icon_name;

            private String device_icon_ext;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMobile_medium_icon() {
                return mobile_medium_icon;
            }

            public void setMobile_medium_icon(String mobile_medium_icon) {
                this.mobile_medium_icon = mobile_medium_icon;
            }

            public String getMobile_medium_icon_ext() {
                return mobile_medium_icon_ext;
            }

            public void setMobile_medium_icon_ext(String mobile_medium_icon_ext) {
                this.mobile_medium_icon_ext = mobile_medium_icon_ext;
            }

            public String getDevice_icon_name() {
                return device_icon_name;
            }

            public void setDevice_icon_name(String device_icon_name) {
                this.device_icon_name = device_icon_name;
            }

            public String getDevice_icon_ext() {
                return device_icon_ext;
            }

            public void setDevice_icon_ext(String device_icon_ext) {
                this.device_icon_ext = device_icon_ext;
            }
        }
    }



}
