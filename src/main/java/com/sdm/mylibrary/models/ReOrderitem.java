package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sumeetb on 8/26/2015.
 */
public class ReOrderitem implements Serializable{
    @SerializedName("data")
    data Data;

    public data getData() {
        return Data;
    }

    public void setData(data data) {
        Data = data;
    }

    public class data implements Serializable{

        private String OrderType;
        private String service_type;

        private String special_instructions;

        private String driver_instructions;

        public String getDriver_instructions() {
            return driver_instructions;
        }

        public void setDriver_instructions(String driver_instructions) {
            this.driver_instructions = driver_instructions;
        }

        public String getSpecial_instructions() {
            return special_instructions;
        }

        public void setSpecial_instructions(String special_instructions) {
            this.special_instructions = special_instructions;
        }

        private String ct;

        public String getCt() {
            if(ct==null){

                ct="";
            }
            return ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getOrderType() {
            return OrderType;
        }

        public void setOrderType(String orderType) {
            OrderType = orderType;
        }

        public String getService_type() {
            return service_type;
        }

        public void setService_type(String service_type) {
            this.service_type = service_type;
        }

        @SerializedName("OperatingPartnerLocation")
        DefaultLocationModel.Data.OperatingPartnerLocation item ;


        @SerializedName("userdata")
        DefaultLocationModel.userdata userData;

        public DefaultLocationModel.userdata getUserData() {
            return userData;
        }

        public void setUserData(DefaultLocationModel.userdata userData) {
            this.userData = userData;
        }

        public DefaultLocationModel.Data.OperatingPartnerLocation getItem() {
            return item;
        }

        public void setItem(DefaultLocationModel.Data.OperatingPartnerLocation item) {
            this.item = item;
        }

        @SerializedName("LineItem")
        ArrayList<LineItem> lineItems;

        public ArrayList<LineItem> getLineItems() {
            return lineItems;
        }

        public void setLineItems(ArrayList<LineItem> lineItems) {
            this.lineItems = lineItems;
        }

        public class LineItem implements Serializable{

            @SerializedName("SelectedItem")
            SelectedItem supplyItem;

            public SelectedItem getSupplyItem() {
                return supplyItem;
            }

            public void setSupplyItem(SelectedItem supplyItem) {
                this.supplyItem = supplyItem;
            }

            @SerializedName("SupplyIcon")
            SupplyIcon supplyIcon;

            public SupplyIcon getSupplyIcon() {
                return supplyIcon;
            }

            public void setSupplyIcon(SupplyIcon supplyIcon) {
                this.supplyIcon = supplyIcon;
            }

            public class SupplyIcon{

                private String icon_name;

                private String icon_ext;

                public String getIcon_name() {
                    return icon_name;
                }

                public void setIcon_name(String icon_name) {
                    this.icon_name = icon_name;
                }

                public String getIcon_ext() {
                    return icon_ext;
                }

                public void setIcon_ext(String icon_ext) {
                    this.icon_ext = icon_ext;
                }
            }




            public class SelectedItem{


                private String quantity;

                private String total_price;

                public String getQuantity() {
                    return quantity;
                }

                public void setQuantity(String quantity) {
                    this.quantity = quantity;
                }

                public String getTotal_price() {
                    return total_price;
                }

                public void setTotal_price(String total_price) {
                    this.total_price = total_price;
                }
            }




            private String item_type;
            @SerializedName("MenuPackage")
            CateringLandingModel.data.MenuPackage menupackage;

            @SerializedName("MenuPackageItem")
            ArrayList<CateringLandingModel.data.MenuPackageItem> menupackageitem;

            @SerializedName("CategorySwitch")
            ArrayList<CateringLandingModel.data.CategorySwitch> categorySwitch;

            public ArrayList<CateringLandingModel.data.CategorySwitch> getCategorySwitch() {
                return categorySwitch;
            }

            public void setCategorySwitch(ArrayList<CateringLandingModel.data.CategorySwitch> categorySwitch) {
                this.categorySwitch = categorySwitch;
            }

            public ArrayList<CateringLandingModel.data.MenuPackageItem> getMenupackageitem() {
                return menupackageitem;
            }

            public void setMenupackageitem(ArrayList<CateringLandingModel.data.MenuPackageItem> menupackageitem) {
                this.menupackageitem = menupackageitem;
            }

            public CateringLandingModel.data.MenuPackage getMenupackage() {
                return menupackage;
            }

            public void setMenupackage(CateringLandingModel.data.MenuPackage menupackage) {
                this.menupackage = menupackage;
            }

            public String getItem_type() {
                return item_type;
            }

            public void setItem_type(String item_type) {
                this.item_type = item_type;
            }

            @SerializedName("Totals")
            Totals total;
            @SerializedName("Selection")
            Selection selection;

            public Selection getSelection() {
                return selection;
            }

            public void setSelection(Selection selection) {
                this.selection = selection;
            }

            public Totals getTotal() {
                return total;
            }

            public void setTotal(Totals total) {
                this.total = total;
            }

            public addon getmAddon() {
                return mAddon;
            }

            public void setmAddon(addon mAddon) {
                this.mAddon = mAddon;
            }

            public MItem getItem() {
                return Item;
            }

            public void setItem(MItem item) {
                Item = item;
            }

            public class Totals implements Serializable{


                private String quantity;

                private String subtotal;
                private String subtotal_normal;

                public String getQuantity() {
                    return quantity;
                }

                public void setQuantity(String quantity) {
                    this.quantity = quantity;
                }

                public String getSubtotal() {
                    return subtotal;
                }

                public void setSubtotal(String subtotal) {
                    this.subtotal = subtotal;
                }

                public String getSubtotal_normal() {
                    return subtotal_normal;
                }

                public void setSubtotal_normal(String subtotal_normal) {
                    this.subtotal_normal = subtotal_normal;
                }
            }


            public class Selection implements Serializable{

                private String standard_cost;
                private String retail_price;
                private String quantity;
                private String subtotal;



                public String getStandard_cost() {
                    return standard_cost;
                }

                public void setStandard_cost(String standard_cost) {
                    this.standard_cost = standard_cost;
                }

                public String getRetail_price() {
                    return retail_price;
                }

                public void setRetail_price(String retail_price) {
                    this.retail_price = retail_price;
                }

                public String getQuantity() {
                    return quantity;
                }

                public void setQuantity(String quantity) {
                    this.quantity = quantity;
                }

                public String getSubtotal() {
                    return subtotal;
                }

                public void setSubtotal(String subtotal) {
                    this.subtotal = subtotal;
                }
            }


            @SerializedName("MenuItem")
            private MItem Item;
            public class MItem implements Serializable {
                private String ingredient_status;
                private String description;
                private String id;
                private String menu_category_id;
                private String item_name;
                private String item_pic_android_medium;
                private String android_image;
                private String healthy_status;
                private String restaurant_menu_item_id;
                private String size;
                private String size_name;
                private String original_price;
                private String standard_cost;
                private String is_md;
                private String md_price;
                private String item_special_instruction;
                private String item_type;
                private String meal;
                private String meal_name;
                private String retail_price;
                private String status;
                private String spicy_status;


                public String getSpicy_status() {
                    return spicy_status;
                }

                public void setSpicy_status(String spicy_status) {
                    this.spicy_status = spicy_status;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getIngredient_status() {
                    return ingredient_status;
                }

                public void setIngredient_status(String ingredient_status) {
                    this.ingredient_status = ingredient_status;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                @SerializedName("ItemPrice")
                ArrayList<ItemDetailModel.data.MItem.ItemPrice> itemPrice;


                public ArrayList<ItemDetailModel.data.MItem.ItemPrice> getItemPrice() {
                    return itemPrice;
                }

                public void setItemPrice(ArrayList<ItemDetailModel.data.MItem.ItemPrice> itemPrice) {
                    this.itemPrice = itemPrice;
                }

                public String getRetail_price() {
                    return retail_price;
                }

                public void setRetail_price(String retail_price) {
                    this.retail_price = retail_price;
                }

                private String item_size;


                public String getItem_size() {
                    return item_size;
                }

                public void setItem_size(String item_size) {
                    this.item_size = item_size;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getMenu_category_id() {
                    return menu_category_id;
                }

                public void setMenu_category_id(String menu_category_id) {
                    this.menu_category_id = menu_category_id;
                }

                public String getItem_name() {
                    return item_name;
                }

                public void setItem_name(String item_name) {
                    this.item_name = item_name;
                }

                public String getItem_pic_android_medium() {
                    return item_pic_android_medium;
                }

                public void setItem_pic_android_medium(String item_pic_android_medium) {
                    this.item_pic_android_medium = item_pic_android_medium;
                }

                public String getAndroid_image() {
                    return android_image;
                }

                public void setAndroid_image(String android_image) {
                    this.android_image = android_image;
                }

                public String getHealthy_status() {
                    return healthy_status;
                }

                public void setHealthy_status(String healthy_status) {
                    this.healthy_status = healthy_status;
                }

                public String getRestaurant_menu_item_id() {
                    return restaurant_menu_item_id;
                }

                public void setRestaurant_menu_item_id(String restaurant_menu_item_id) {
                    this.restaurant_menu_item_id = restaurant_menu_item_id;
                }

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getSize_name() {
                    return size_name;
                }

                public void setSize_name(String size_name) {
                    this.size_name = size_name;
                }

                public String getOriginal_price() {
                    return original_price;
                }

                public void setOriginal_price(String original_price) {
                    this.original_price = original_price;
                }

                public String getStandard_cost() {
                    return standard_cost;
                }

                public void setStandard_cost(String standard_cost) {
                    this.standard_cost = standard_cost;
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

                public String getItem_special_instruction() {
                    return item_special_instruction;
                }

                public void setItem_special_instruction(String item_special_instruction) {
                    this.item_special_instruction = item_special_instruction;
                }

                public String getItem_type() {
                    return item_type;
                }

                public void setItem_type(String item_type) {
                    this.item_type = item_type;
                }

                public String getMeal() {
                    return meal;
                }

                public void setMeal(String meal) {
                    this.meal = meal;
                }

                public String getMeal_name() {
                    return meal_name;
                }

                public void setMeal_name(String meal_name) {
                    this.meal_name = meal_name;
                }
            }

            @SerializedName("addon")
            private addon mAddon;


            public class addon implements Serializable{
                @SerializedName("appetizer")
                private appetizer mAppetizer;

                public appetizer getmAppetizer() {
                    return mAppetizer;
                }

                public void setmAppetizer(appetizer mAppetizer) {
                    this.mAppetizer = mAppetizer;
                }

                public rice_noodles getmRiceNoodle() {
                    return mRiceNoodle;
                }

                public void setmRiceNoodle(rice_noodles mRiceNoodle) {
                    this.mRiceNoodle = mRiceNoodle;
                }

                public soup getmSoup() {
                    return mSoup;
                }

                public void setmSoup(soup mSoup) {
                    this.mSoup = mSoup;
                }


                public class appetizer
                {
                    private String id;
                    private String menu_category_id;
                    private String item_name;
                    private String item_pic_android_medium;
                    private String cart_icon;
                    private String status;
                    private String weight;
                    private String description;
                    private String standard_cost;
                    private String item_pic_android_big;
                    private String healthy_status;

                    public String getSpicy_status() {
                        return spicy_status;
                    }

                    public void setSpicy_status(String spicy_status) {
                        this.spicy_status = spicy_status;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenu_category_id() {
                        return menu_category_id;
                    }

                    public void setMenu_category_id(String menu_category_id) {
                        this.menu_category_id = menu_category_id;
                    }

                    public String getItem_name() {
                        return item_name;
                    }

                    public void setItem_name(String item_name) {
                        this.item_name = item_name;
                    }

                    public String getItem_pic_android_medium() {
                        return item_pic_android_medium;
                    }

                    public void setItem_pic_android_medium(String item_pic_android_medium) {
                        this.item_pic_android_medium = item_pic_android_medium;
                    }

                    public String getCart_icon() {
                        return cart_icon;
                    }

                    public void setCart_icon(String cart_icon) {
                        this.cart_icon = cart_icon;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getWeight() {
                        return weight;
                    }

                    public void setWeight(String weight) {
                        this.weight = weight;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getStandard_cost() {
                        return standard_cost;
                    }

                    public void setStandard_cost(String standard_cost) {
                        this.standard_cost = standard_cost;
                    }

                    public String getItem_pic_android_big() {
                        return item_pic_android_big;
                    }

                    public void setItem_pic_android_big(String item_pic_android_big) {
                        this.item_pic_android_big = item_pic_android_big;
                    }

                    public String getHealthy_status() {
                        return healthy_status;
                    }

                    public void setHealthy_status(String healthy_status) {
                        this.healthy_status = healthy_status;
                    }

                    private String spicy_status;

                }

                @SerializedName("rice_noodles")
                private rice_noodles mRiceNoodle;

                public class rice_noodles
                {
                    private String id;
                    private String menu_category_id;
                    private String item_name;
                    private String item_pic_android_medium;
                    private String cart_icon;
                    private String status;
                    private String weight;
                    private String description;
                    private String standard_cost;
                    private String item_pic_android_big;
                    private String healthy_status;
                    private String is_md;
                    private String spicy_status;
                    private String retail_price;
                    private String md_price;

                    public String getMd_price() {
                        return md_price;
                    }

                    public void setMd_price(String md_price) {
                        this.md_price = md_price;
                    }

                    public String getIs_md() {
                        return is_md;
                    }

                    public void setIs_md(String is_md) {
                        this.is_md = is_md;
                    }

                    public String getRetail_price() {
                        return retail_price;
                    }

                    public void setRetail_price(String retail_price) {
                        this.retail_price = retail_price;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenu_category_id() {
                        return menu_category_id;
                    }

                    public void setMenu_category_id(String menu_category_id) {
                        this.menu_category_id = menu_category_id;
                    }

                    public String getItem_name() {
                        return item_name;
                    }

                    public void setItem_name(String item_name) {
                        this.item_name = item_name;
                    }

                    public String getItem_pic_android_medium() {
                        return item_pic_android_medium;
                    }

                    public void setItem_pic_android_medium(String item_pic_android_medium) {
                        this.item_pic_android_medium = item_pic_android_medium;
                    }

                    public String getCart_icon() {
                        return cart_icon;
                    }

                    public void setCart_icon(String cart_icon) {
                        this.cart_icon = cart_icon;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getWeight() {
                        return weight;
                    }

                    public void setWeight(String weight) {
                        this.weight = weight;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getStandard_cost() {
                        return standard_cost;
                    }

                    public void setStandard_cost(String standard_cost) {
                        this.standard_cost = standard_cost;
                    }

                    public String getItem_pic_android_big() {
                        return item_pic_android_big;
                    }

                    public void setItem_pic_android_big(String item_pic_android_big) {
                        this.item_pic_android_big = item_pic_android_big;
                    }

                    public String getHealthy_status() {
                        return healthy_status;
                    }

                    public void setHealthy_status(String healthy_status) {
                        this.healthy_status = healthy_status;
                    }

                    public String getSpicy_status() {
                        return spicy_status;
                    }

                    public void setSpicy_status(String spicy_status) {
                        this.spicy_status = spicy_status;
                    }
                }

                @SerializedName("extra")
                private ArrayList<extra> mExtra;

                public ArrayList<extra> getmExtra() {
                    return mExtra;
                }

                public void setmExtra(ArrayList<extra> mExtra) {
                    this.mExtra = mExtra;
                }

                public class extra implements Serializable{
                    private String id;
                    private String menu_category_id;
                    private String item_name;
                    private String item_pic_android_medium;
                    private String cart_icon;
                    private String status;
                    private String weight;
                    private String description;
                    private String standard_cost;
                    private String item_pic_android_big;
                    private String healthy_status;

                    private String retail_price;

                    public String getRetail_price() {
                        return retail_price;
                    }

                    public void setRetail_price(String retail_price) {
                        this.retail_price = retail_price;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenu_category_id() {
                        return menu_category_id;
                    }

                    public void setMenu_category_id(String menu_category_id) {
                        this.menu_category_id = menu_category_id;
                    }

                    public String getItem_name() {
                        return item_name;
                    }

                    public void setItem_name(String item_name) {
                        this.item_name = item_name;
                    }

                    public String getItem_pic_android_medium() {
                        return item_pic_android_medium;
                    }

                    public void setItem_pic_android_medium(String item_pic_android_medium) {
                        this.item_pic_android_medium = item_pic_android_medium;
                    }

                    public String getCart_icon() {
                        return cart_icon;
                    }

                    public void setCart_icon(String cart_icon) {
                        this.cart_icon = cart_icon;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getWeight() {
                        return weight;
                    }

                    public void setWeight(String weight) {
                        this.weight = weight;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getStandard_cost() {
                        return standard_cost;
                    }

                    public void setStandard_cost(String standard_cost) {
                        this.standard_cost = standard_cost;
                    }

                    public String getItem_pic_android_big() {
                        return item_pic_android_big;
                    }

                    public void setItem_pic_android_big(String item_pic_android_big) {
                        this.item_pic_android_big = item_pic_android_big;
                    }

                    public String getHealthy_status() {
                        return healthy_status;
                    }

                    public void setHealthy_status(String healthy_status) {
                        this.healthy_status = healthy_status;
                    }
                }
                @SerializedName("soup")
                private soup mSoup;
                public class soup
                {
                    private String id;
                    private String menu_category_id;
                    private String item_name;
                    private String item_pic_android_medium;
                    private String cart_icon;
                    private String status;
                    private String weight;
                    private String description;
                    private String standard_cost;
                    private String item_pic_android_big;
                    private String healthy_status;
                    private String spicy_status;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenu_category_id() {
                        return menu_category_id;
                    }

                    public void setMenu_category_id(String menu_category_id) {
                        this.menu_category_id = menu_category_id;
                    }

                    public String getItem_name() {
                        return item_name;
                    }

                    public void setItem_name(String item_name) {
                        this.item_name = item_name;
                    }

                    public String getItem_pic_android_medium() {
                        return item_pic_android_medium;
                    }

                    public void setItem_pic_android_medium(String item_pic_android_medium) {
                        this.item_pic_android_medium = item_pic_android_medium;
                    }

                    public String getCart_icon() {
                        return cart_icon;
                    }

                    public void setCart_icon(String cart_icon) {
                        this.cart_icon = cart_icon;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getWeight() {
                        return weight;
                    }

                    public void setWeight(String weight) {
                        this.weight = weight;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getStandard_cost() {
                        return standard_cost;
                    }

                    public void setStandard_cost(String standard_cost) {
                        this.standard_cost = standard_cost;
                    }

                    public String getItem_pic_android_big() {
                        return item_pic_android_big;
                    }

                    public void setItem_pic_android_big(String item_pic_android_big) {
                        this.item_pic_android_big = item_pic_android_big;
                    }

                    public String getHealthy_status() {
                        return healthy_status;
                    }

                    public void setHealthy_status(String healthy_status) {
                        this.healthy_status = healthy_status;
                    }

                    public String getSpicy_status() {
                        return spicy_status;
                    }

                    public void setSpicy_status(String spicy_status) {
                        this.spicy_status = spicy_status;
                    }
                }


       }
        }

        @SerializedName("Category")
        private HashMap<String, CategoryImage> values;

        public HashMap<String, CategoryImage> getValues() {
            return values;
        }

        public void setValues(HashMap<String, CategoryImage> values) {
            this.values = values;
        }

        public class CategoryImage implements Serializable{
            @SerializedName("icon_name")
            private String icon_name;

            @SerializedName("icon_ext")
            private String icon_ext;

            public String getIcon_name() {
                return icon_name;
            }

            public void setIcon_name(String icon_name) {
                this.icon_name = icon_name;
            }

            public String getIcon_ext() {
                return icon_ext;
            }

            public void setIcon_ext(String icon_ext) {
                this.icon_ext = icon_ext;
            }
        }

        public data(){
            values = new HashMap<>();
        }















    }




}
