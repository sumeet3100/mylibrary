package com.sdm.mylibrary.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jatindersi on 7/3/2015.
 */
public class ItemDetailModel implements Serializable,Cloneable {

    //Defined clone method in Department class.
    @Override
    public Object clone() throws CloneNotSupportedException {
        ItemDetailModel cloned = (ItemDetailModel)super.clone();
        cloned.setmData((ItemDetailModel.data) cloned.getmData().clone());
        return cloned;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("message")
    private String message;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @SerializedName("status")
    private String Status;


    public data getmData() {
        return mData;
    }

    public void setmData(data mData) {
        this.mData = mData;
    }

    @SerializedName("data")
    private data mData;

    public  class data implements Serializable,Cloneable {

        //Defined clone method in Department class.
        @Override
        public Object clone() throws CloneNotSupportedException {
            data cloned = (data)super.clone();
            cloned.setItem((ItemDetailModel.data.MItem) cloned.getItem().clone());
            return cloned;
        }


        public MItem getItem() {
            return Item;
        }

        public void setItem(MItem item) {
            Item = item;
        }

        @SerializedName("MenuItem")
        private MItem Item;



        public class MItem implements Serializable ,Cloneable {

            //Defined clone method in Department class.
            @Override
            public Object clone() throws CloneNotSupportedException {


                return super.clone();
            }


            private String is_favorite;

            private String favorite_order_item_id;

            public String getFavorite_order_item_id() {
                return favorite_order_item_id;
            }

            public void setFavorite_order_item_id(String favorite_order_item_id) {
                this.favorite_order_item_id = favorite_order_item_id;
            }

            public String getIs_favorite() {
                return is_favorite;
            }

            public void setIs_favorite(String is_favorite) {
                this.is_favorite = is_favorite;
            }

            private String item_special_instruction;

            public String getItem_special_instruction() {
                return item_special_instruction;
            }

            public void setItem_special_instruction(String item_special_instruction) {
                this.item_special_instruction = item_special_instruction;
            }

            private String size_name;

            private String quantity;

            private String size;

            private String add_price;

            public String getAdd_price() {
                return add_price;
            }

            public void setAdd_price(String add_price) {
                this.add_price = add_price;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;
            }

            public String getSize_name() {
                return size_name;
            }

            public void setSize_name(String size_name) {
                this.size_name = size_name;
            }

            public String getItem_Pic_Big() {
                return Item_Pic_Big;
            }

            public void setItem_Pic_Big(String item_Pic_Big) {
                Item_Pic_Big = item_Pic_Big;
            }

            @SerializedName("item_pic_android_big")
            private String Item_Pic_Big;

            public String getItem_Pic_Medium() {
                return Item_Pic_Medium;
            }

            public void setItem_Pic_Medium(String item_Pic_Medium) {
                Item_Pic_Medium = item_Pic_Medium;
            }

            @SerializedName("item_pic_android_medium")
            private String Item_Pic_Medium;

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            @SerializedName("weight")
            private String weight;

            public String getItemStatus() {
                return ItemStatus;
            }

            public void setItemStatus(String itemStatus) {
                ItemStatus = itemStatus;
            }

            @SerializedName("status")
            private String ItemStatus;

            public String getItem_Pic_Detail_page() {
                return Item_Pic_Detail_page;
            }

            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                Item_Pic_Detail_page = item_Pic_Detail_page;
            }

            @SerializedName("item_pic_thumd_detail_page")
            private String Item_Pic_Detail_page;

            public String getHealthy_Status() {
                return Healthy_Status;
            }

            public void setHealthy_Status(String healthy_Status) {
                Healthy_Status = healthy_Status;
            }

            @SerializedName("healthy_status")
            private String Healthy_Status;

            public String getItemId() {
                return ItemId;
            }

            public void setItemId(String itemId) {
                ItemId = itemId;
            }

            @SerializedName("id")
            private String ItemId;

            public String getSpicyStatus() {
                return SpicyStatus;
            }

            public void setSpicyStatus(String spicyStatus) {
                SpicyStatus = spicyStatus;
            }

            @SerializedName("spicy_status")
            private String SpicyStatus;

            public String getItemName() {
                return ItemName;
            }

            public void setItemName(String itemName) {
                ItemName = itemName;
            }

            @SerializedName("item_name")
            private String ItemName;




            private boolean isChecked;

            private  SelectedItemModel  mpObj;

            public SelectedItemModel getMpObj() {
                return mpObj;
            }

            public void setMpObj(SelectedItemModel mpObj) {
                this.mpObj = mpObj;
            }

            public boolean isChecked() {
                return isChecked;
            }

            public void setIsChecked(boolean isChecked) {
                this.isChecked = isChecked;
            }



            public String getItemDesc() {
                return ItemDesc;
            }

            public void setItemDesc(String itemDesc) {
                ItemDesc = itemDesc;
            }

            @SerializedName("description")
            private String ItemDesc;

            public String getMenuCategoryId() {
                return MenuCategoryId;
            }

            public void setMenuCategoryId(String menuCategoryId) {
                MenuCategoryId = menuCategoryId;
            }

            @SerializedName("menu_category_id")
            private String MenuCategoryId;

            public String getIngradientStatus() {
                return IngradientStatus;
            }

            public void setIngradientStatus(String ingradientStatus) {
                IngradientStatus = ingradientStatus;
            }

            @SerializedName("ingredient_status")
            private String IngradientStatus;

            public String getCalories() {
                return Calories;
            }

            public void setCalories(String calories) {
                Calories = calories;
            }

            @SerializedName("Calories")
            private String Calories;

            public String getSodium() {
                return Sodium;
            }

            public void setSodium(String sodium) {
                Sodium = sodium;
            }

            @SerializedName("sodium")
            private String Sodium;

            public String getSaturatedFat() {
                return SaturatedFat;
            }

            public void setSaturatedFat(String saturatedFat) {
                SaturatedFat = saturatedFat;
            }

            @SerializedName("saturated_fat")
            private String SaturatedFat;

            public String getCarboHyradtes() {
                return CarboHyradtes;
            }

            public void setCarboHyradtes(String carboHyradtes) {
                CarboHyradtes = carboHyradtes;
            }

            @SerializedName("carbohydrates")
            private String CarboHyradtes;

            public String getFat() {
                return Fat;
            }

            public void setFat(String fat) {
                Fat = fat;
            }

            @SerializedName("total_fat")
            private String Fat;

            public String getNutritionStatus() {
                return NutritionStatus;
            }

            public void setNutritionStatus(String nutritionStatus) {
                NutritionStatus = nutritionStatus;
            }

            @SerializedName("nutritional_status")
            private String NutritionStatus;

            public ArrayList<ItemPrice> getItemprice() {
                return itemprice;
            }

            public void setItemprice(ArrayList<ItemPrice> itemprice) {
                this.itemprice = itemprice;
            }

            @SerializedName("ItemPrice")
            private ArrayList<ItemPrice> itemprice;

            public class ItemPrice implements  Serializable ,Cloneable {

                //Defined clone method in Department class.
                @Override
                public Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }
                public String getCheckMd() {
                    return CheckMd;
                }

                public void setCheckMd(String checkMd) {
                    CheckMd = checkMd;
                }

                @SerializedName("is_md")
                private String CheckMd;

                private String add_price;


                public String getAdd_price() {
                    return add_price;
                }

                public void setAdd_price(String add_price) {
                    this.add_price = add_price;
                }

                public String getMain_Special_Text() {
                    return Main_Special_Text;
                }

                public void setMain_Special_Text(String main_Special_Text) {
                    Main_Special_Text = main_Special_Text;
                }

                @SerializedName("main_special_text")
                  private String Main_Special_Text;
                public String getSpecialText() {
                    return SpecialText;
                }

                public void setSpecialText(String specialText) {
                    SpecialText = specialText;
                }

                @SerializedName("special_text")
                private String SpecialText;

                public String getMdPrice() {
                    return MdPrice;
                }

                public void setMdPrice(String mdPrice) {
                    MdPrice = mdPrice;
                }

                @SerializedName("md_price")
                private String MdPrice;

                public String getPriceid() {
                    return priceid;
                }

                public void setPriceid(String priceid) {
                    this.priceid = priceid;
                }

                @SerializedName("id")
                private String priceid;

                public String getStandardCost() {
                    return StandardCost;
                }

                public void setStandardCost(String standardCost) {
                    StandardCost = standardCost;
                }

                @SerializedName("standard_cost")
                private String StandardCost;

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                @SerializedName("size")
                private String size;

                @SerializedName("size_serve")
                private String size_serve;


                public String getSize_serve() {
                    return size_serve;
                }

                public void setSize_serve(String size_serve) {
                    this.size_serve = size_serve;
                }

                public String getRetailPrice() {
                    return RetailPrice;
                }

                public void setRetailPrice(String retailPrice) {
                    RetailPrice = retailPrice;
                }

                @SerializedName("retail_price")
                private String RetailPrice;

                @SerializedName("description")
                private String description;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }


                private int selected = 0;

                public int getSelected() {
                    return selected;
                }

                public void setSelected(int selected) {
                    this.selected = selected;
                }
            }

            public ArrayList<MenuInger> getMenuingr() {
                return Menuingr;
            }

            public void setMenuingr(ArrayList<MenuInger> menuingr) {
                Menuingr = menuingr;
            }

            @SerializedName("MenuIngredient")
            private ArrayList<MenuInger> Menuingr;

            public class MenuInger implements  Serializable ,Cloneable {

                //Defined clone method in Department class.
                @Override
                public Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }
                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                @SerializedName("id")
                private String id;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                @SerializedName("name")
                private String name;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                @SerializedName("description")
                private String description;
            }

            @SerializedName("Nutrition")
            private Nutrition mNutrition;

            public Nutrition getmNutrition() {
                return mNutrition;
            }

            public void setmNutrition(Nutrition mNutrition) {
                this.mNutrition = mNutrition;
            }

            public class Nutrition implements  Serializable,Cloneable {

                //Defined clone method in Department class.
                @Override
                public Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }

                @SerializedName("calories")
                private String calories;

                @SerializedName("sodium")
                private String sodium;


                @SerializedName("saturated_fat")
                private String saturated_fat;

                @SerializedName("carbohydrates")
                private String carbohydrates;

                @SerializedName("total_fat")
                private String total_fat;

                public String getCalories() {
                    return calories;
                }

                public void setCalories(String calories) {
                    this.calories = calories;
                }

                public String getSodium() {
                    return sodium;
                }

                public void setSodium(String sodium) {
                    this.sodium = sodium;
                }

                public String getSaturated_fat() {
                    return saturated_fat;
                }

                public void setSaturated_fat(String saturated_fat) {
                    this.saturated_fat = saturated_fat;
                }

                public String getCarbohydrates() {
                    return carbohydrates;
                }

                public void setCarbohydrates(String carbohydrates) {
                    this.carbohydrates = carbohydrates;
                }

                public String getTotal_fat() {
                    return total_fat;
                }

                public void setTotal_fat(String total_fat) {
                    this.total_fat = total_fat;
                }
            }

            public Custom getCustomItem() {
                return CustomItem;
            }

            public void setCustomItem(Custom customItem) {
                CustomItem = customItem;
            }

            @SerializedName("Custom")
            private Custom CustomItem;

            public class Custom implements  Serializable ,Cloneable {

                //Defined clone method in Department class.
                @Override
                public Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }
                public Custom.LunchEntree getLunchEntree() {
                    return LunchEntree;
                }

                public void setLunchEntree(Custom.LunchEntree lunchEntree) {
                    LunchEntree = lunchEntree;
                }

                @SerializedName("LunchEntree")
                private LunchEntree LunchEntree;

                @SerializedName("DinnerEntree")
                private DinnerEntree Dinnerentree;

                public DinnerEntree getDinnerentree() {
                    return Dinnerentree;
                }

                public void setDinnerentree(DinnerEntree dinnerentree) {
                    Dinnerentree = dinnerentree;
                }

                public class DinnerEntree implements Serializable,Cloneable {

                    //Defined clone method in Department class.
                    @Override
                    public Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }

                    @SerializedName("id")
                    private String id;

                    @SerializedName("menu_item_id")
                    private String menu_item_id;

                    @SerializedName("meal1_status")
                    private String meal1_status;


                    @SerializedName("meal2_status")
                    private String meal2_status;


                    @SerializedName("meal1_retail_price")
                    private String meal1_retail_price;

                    @SerializedName("meal2_retail_price")
                    private String meal2_retail_price;

                    @SerializedName("ricenoodle_status")
                    private String ricenoodle_status;


                    @SerializedName("extra_status")
                    private String extra_status;

                    @SerializedName("appetizer_status")
                    private String appetizer_status;

                    @SerializedName("soup_status")
                    private String soup_status;


                    @SerializedName("drink_status")
                    private String drink_status;



                    @SerializedName("modified")
                    private String modified;


                    @SerializedName("restaurant_menu_dinner_entree_id")
                    private String restaurant_menu_dinner_entree_id;



                    @SerializedName("menu_dinner_entree_id")
                    private String menu_dinner_entree_id;


                    @SerializedName("created")
                    private String created;


                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenu_item_id() {
                        return menu_item_id;
                    }

                    public void setMenu_item_id(String menu_item_id) {
                        this.menu_item_id = menu_item_id;
                    }

                    public String getMeal1_status() {
                        return meal1_status;
                    }

                    public void setMeal1_status(String meal1_status) {
                        this.meal1_status = meal1_status;
                    }

                    public String getMeal2_status() {
                        return meal2_status;
                    }

                    public void setMeal2_status(String meal2_status) {
                        this.meal2_status = meal2_status;
                    }

                    public String getMeal1_retail_price() {
                        return meal1_retail_price;
                    }

                    public void setMeal1_retail_price(String meal1_retail_price) {
                        this.meal1_retail_price = meal1_retail_price;
                    }

                    public String getMeal2_retail_price() {
                        return meal2_retail_price;
                    }

                    public void setMeal2_retail_price(String meal2_retail_price) {
                        this.meal2_retail_price = meal2_retail_price;
                    }

                    public String getRicenoodle_status() {
                        return ricenoodle_status;
                    }

                    public void setRicenoodle_status(String ricenoodle_status) {
                        this.ricenoodle_status = ricenoodle_status;
                    }

                    public String getExtra_status() {
                        return extra_status;
                    }

                    public void setExtra_status(String extra_status) {
                        this.extra_status = extra_status;
                    }

                    public String getAppetizer_status() {
                        return appetizer_status;
                    }

                    public void setAppetizer_status(String appetizer_status) {
                        this.appetizer_status = appetizer_status;
                    }

                    public String getSoup_status() {
                        return soup_status;
                    }

                    public void setSoup_status(String soup_status) {
                        this.soup_status = soup_status;
                    }

                    public String getDrink_status() {
                        return drink_status;
                    }

                    public void setDrink_status(String drink_status) {
                        this.drink_status = drink_status;
                    }

                    public String getCreated() {
                        return created;
                    }

                    public void setCreated(String created) {
                        this.created = created;
                    }

                    public String getModified() {
                        return modified;
                    }

                    public void setModified(String modified) {
                        this.modified = modified;
                    }

                    public String getRestaurant_menu_dinner_entree_id() {
                        return restaurant_menu_dinner_entree_id;
                    }

                    public void setRestaurant_menu_dinner_entree_id(String restaurant_menu_dinner_entree_id) {
                        this.restaurant_menu_dinner_entree_id = restaurant_menu_dinner_entree_id;
                    }

                    public String getMenu_dinner_entree_id() {
                        return menu_dinner_entree_id;
                    }

                    public void setMenu_dinner_entree_id(String menu_dinner_entree_id) {
                        this.menu_dinner_entree_id = menu_dinner_entree_id;
                    }
                }


                public class LunchEntree implements Serializable ,Cloneable {

                    //Defined clone method in Department class.
                    @Override
                    public Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }
                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    @SerializedName("id")
                    private String id;

                    public String getMenuItemId() {
                        return MenuItemId;
                    }

                    public void setMenuItemId(String menuItemId) {
                        MenuItemId = menuItemId;
                    }

                    @SerializedName("menu_item_id")
                    private String MenuItemId;

                    public String getMealoneStatus() {
                        return MealoneStatus;
                    }

                    public void setMealoneStatus(String mealoneStatus) {
                        MealoneStatus = mealoneStatus;
                    }

                    @SerializedName("meal1_status")
                    private String MealoneStatus;

                    public String getMealTwoStatus() {
                        return MealTwoStatus;
                    }

                    public void setMealTwoStatus(String mealTwoStatus) {
                        MealTwoStatus = mealTwoStatus;
                    }

                    @SerializedName("meal2_status")
                    private String MealTwoStatus;

                    public String getMealOneName() {
                        return MealOneName;
                    }

                    public void setMealOneName(String mealOneName) {
                        MealOneName = mealOneName;
                    }

                    @SerializedName("meal1_name")
                    private String MealOneName;

                    public String getMealTwoName() {
                        return MealTwoName;
                    }

                    public void setMealTwoName(String mealTwoName) {
                        MealTwoName = mealTwoName;
                    }

                    @SerializedName("meal2_name")
                    private String MealTwoName;

                    public String getMealOneRetailPrice() {
                        return MealOneRetailPrice;
                    }

                    public void setMealOneRetailPrice(String mealOneRetailPrice) {
                        MealOneRetailPrice = mealOneRetailPrice;
                    }

                    @SerializedName("meal1_retail_price")
                    private String MealOneRetailPrice;

                    public String getMealTworetailPrice() {
                        return MealTworetailPrice;
                    }

                    public void setMealTworetailPrice(String mealTworetailPrice) {
                        MealTworetailPrice = mealTworetailPrice;
                    }

                    @SerializedName("meal2_retail_price")
                    private String MealTworetailPrice;

                    public String getRNstatus() {
                        return RNstatus;
                    }

                    public void setRNstatus(String RNstatus) {
                        this.RNstatus = RNstatus;
                    }

                    @SerializedName("ricenoodle_status")
                    private String RNstatus;

                    public String getExtraStaus() {
                        return ExtraStaus;
                    }

                    public void setExtraStaus(String extraStaus) {
                        ExtraStaus = extraStaus;
                    }

                    @SerializedName("extra_status")
                    private String ExtraStaus;


                    public String getAppTizerStatus() {
                        return AppTizerStatus;
                    }

                    public void setAppTizerStatus(String appTizerStatus) {
                        AppTizerStatus = appTizerStatus;
                    }

                    @SerializedName("appetizer_status")
                    private String AppTizerStatus;

                    public String getSoupStatus() {
                        return SoupStatus;
                    }

                    public void setSoupStatus(String soupStatus) {
                        SoupStatus = soupStatus;
                    }

                    @SerializedName("soup_status")
                    private String SoupStatus;

                    public String getDrinkStatus() {
                        return DrinkStatus;
                    }

                    public void setDrinkStatus(String drinkStatus) {
                        DrinkStatus = drinkStatus;
                    }

                    @SerializedName("drink_status")
                    private String DrinkStatus;

                    public String getMliD() {
                        return MliD;
                    }

                    public void setMliD(String mliD) {
                        MliD = mliD;
                    }

                    @SerializedName("menu_lunch_entree_id")
                    private String MliD;
                }

                public ValueMealOne getValuemealOne() {
                    return ValuemealOne;
                }

                public void setValuemealOne(ValueMealOne valuemealOne) {
                    ValuemealOne = valuemealOne;
                }

                @SerializedName("ValueMeal1")
                private ValueMealOne ValuemealOne;

                public class ValueMealOne implements Serializable ,Cloneable {

                    //Defined clone method in Department class.
                    @Override
                    public Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }

                    public ArrayList<AppeTizer> getApptizer() {
                        return Apptizer;
                    }

                    public void setApptizer(ArrayList<AppeTizer> apptizer) {
                        Apptizer = apptizer;
                    }

                    @SerializedName("Appetizer")
                    private ArrayList<AppeTizer> Apptizer;

                    public class AppeTizer implements  Serializable,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }
                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        @SerializedName("id")
                        private String id;

                        public String getMenuCategoryId() {
                            return MenuCategoryId;
                        }

                        public void setMenuCategoryId(String menuCategoryId) {
                            MenuCategoryId = menuCategoryId;
                        }

                        @SerializedName("menu_category_id")
                        private String MenuCategoryId;

                        public String getItem_Name() {
                            return Item_Name;
                        }

                        public void setItem_Name(String item_Name) {
                            Item_Name = item_Name;
                        }

                        @SerializedName("item_name")
                        private String Item_Name;

                        public String getItemDesc() {
                            return ItemDesc;
                        }

                        public void setItemDesc(String itemDesc) {
                            ItemDesc = itemDesc;
                        }

                        @SerializedName("description")
                        private String ItemDesc;

                        public String getItemPicMedium() {
                            return ItemPicMedium;
                        }

                        public void setItemPicMedium(String itemPicMedium) {
                            ItemPicMedium = itemPicMedium;
                        }

                        @SerializedName("item_pic_android_medium")

                        private String ItemPicMedium;

                        public String getItemPicBig() {
                            return ItemPicBig;
                        }

                        public void setItemPicBig(String itemPicBig) {
                            ItemPicBig = itemPicBig;
                        }

                        @SerializedName("item_pic_android_big")
                        private String ItemPicBig;

                        public String getHealthyStatus() {
                            return HealthyStatus;
                        }

                        public void setHealthyStatus(String healthyStatus) {
                            HealthyStatus = healthyStatus;
                        }

                        @SerializedName("healthy_status")
                        private String HealthyStatus;

                        public String getSpicyStatus() {
                            return SpicyStatus;
                        }

                        public void setSpicyStatus(String spicyStatus) {
                            SpicyStatus = spicyStatus;
                        }

                        @SerializedName("spicy_status")
                        private String SpicyStatus;

                        public String getWeight() {
                            return Weight;
                        }

                        public void setWeight(String weight) {
                            Weight = weight;
                        }

                        @SerializedName("weight")
                        private String Weight;

                        public String getStatus() {
                            return status;
                        }

                        public void setStatus(String status) {
                            this.status = status;
                        }

                        @SerializedName("status")
                        private String status;

                        public String getValue_meal_id() {
                            return value_meal_id;
                        }

                        public void setValue_meal_id(String value_meal_id) {
                            this.value_meal_id = value_meal_id;
                        }

                        @SerializedName("value_meal_id")
                        private String value_meal_id;
                    }
                }

                public ValueMealTwo getValuemealtwo() {
                    return Valuemealtwo;
                }

                public void setValuemealtwo(ValueMealTwo valuemealtwo) {
                    Valuemealtwo = valuemealtwo;
                }

                @SerializedName("ValueMeal2")
                private ValueMealTwo Valuemealtwo;

                public class ValueMealTwo implements  Serializable,Cloneable {

                    //Defined clone method in Department class.
                    @Override
                    public Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }
                    public ArrayList<Soup> getSoup() {
                        return soup;
                    }

                    public void setSoup(ArrayList<Soup> soup) {
                        this.soup = soup;
                    }

                    @SerializedName("Soup")
                    private ArrayList<Soup> soup;

                    public class Soup  implements  Serializable ,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }
                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        @SerializedName("id")
                        private String id;

                        public String getMenuCategoryId() {
                            return MenuCategoryId;
                        }

                        public void setMenuCategoryId(String menuCategoryId) {
                            MenuCategoryId = menuCategoryId;
                        }

                        @SerializedName("menu_category_id")
                        private String MenuCategoryId;

                        public String getItem_Name() {
                            return Item_Name;
                        }

                        public void setItem_Name(String item_Name) {
                            Item_Name = item_Name;
                        }

                        @SerializedName("item_name")
                        private String Item_Name;

                        public String getItemDesc() {
                            return ItemDesc;
                        }

                        public void setItemDesc(String itemDesc) {
                            ItemDesc = itemDesc;
                        }

                        @SerializedName("description")
                        private String ItemDesc;

                        public String getItemPicMedium() {
                            return ItemPicMedium;
                        }

                        public void setItemPicMedium(String itemPicMedium) {
                            ItemPicMedium = itemPicMedium;
                        }

                        @SerializedName("item_pic_android_medium")

                        private String ItemPicMedium;

                        public String getItemPicBig() {
                            return ItemPicBig;
                        }

                        public void setItemPicBig(String itemPicBig) {
                            ItemPicBig = itemPicBig;
                        }

                        @SerializedName("item_pic_android_big")
                        private String ItemPicBig;

                        public String getHealthyStatus() {
                            return HealthyStatus;
                        }

                        public void setHealthyStatus(String healthyStatus) {
                            HealthyStatus = healthyStatus;
                        }

                        @SerializedName("healthy_status")
                        private String HealthyStatus;

                        public String getSpicyStatus() {
                            return SpicyStatus;
                        }

                        public void setSpicyStatus(String spicyStatus) {
                            SpicyStatus = spicyStatus;
                        }

                        @SerializedName("spicy_status")
                        private String SpicyStatus;

                        public String getWeight() {
                            return Weight;
                        }

                        public void setWeight(String weight) {
                            Weight = weight;
                        }

                        @SerializedName("weight")
                        private String Weight;

                        public String getStatus() {
                            return status;
                        }

                        public void setStatus(String status) {
                            this.status = status;
                        }

                        @SerializedName("status")
                        private String status;

                        public String getValue_meal_id() {
                            return value_meal_id;
                        }

                        public void setValue_meal_id(String value_meal_id) {
                            this.value_meal_id = value_meal_id;
                        }

                        @SerializedName("value_meal_id")
                        private String value_meal_id;
                    }
                }

                public Common getCommonItem() {
                    return CommonItem;
                }

                public void setCommonItem(Common commonItem) {
                    CommonItem = commonItem;
                }

                @SerializedName("Common")
                private Common CommonItem;

                public class Common implements Serializable,Cloneable {

                    //Defined clone method in Department class.
                    @Override
                    public Object clone() throws CloneNotSupportedException {
                        return super.clone();
                    }
                    public Category getCategory_icon() {
                        return Category_icon;
                    }

                    public void setCategory_icon(Category category_icon) {
                        Category_icon = category_icon;
                    }

                    @SerializedName("Category")
                    private Category Category_icon;
                    public class Category implements  Serializable,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }

                        public AppetizerIcon getAicon() {
                            return Aicon;
                        }

                        public void setAicon(AppetizerIcon aicon) {
                            Aicon = aicon;
                        }
                        @SerializedName("Appetizer")
                        private AppetizerIcon Aicon;

                        @SerializedName("Supply")
                        private Supply msupply;

                        public Supply getMsupply() {
                            return msupply;
                        }

                        public void setMsupply(Supply msupply) {
                            this.msupply = msupply;
                        }

                        public class Supply implements Serializable,Cloneable {

                            @SerializedName("icon_name")
                            private String iconName;

                            @SerializedName("icon_ext")
                            private String icon_ext;

                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            public String getIcon_ext() {
                                return icon_ext;
                            }

                            public void setIcon_ext(String icon_ext) {
                                this.icon_ext = icon_ext;
                            }
                        }


                        public class AppetizerIcon implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            @SerializedName("icon_name")
                            private String iconName;

                            public String getIconext() {
                                return iconext;
                            }

                            public void setIconext(String iconext) {
                                this.iconext = iconext;
                            }

                            @SerializedName("icon_ext")
                            private String iconext;
                        }

                        public DrinkIcon getDicon() {
                            return Dicon;
                        }

                        public void setDicon(DrinkIcon dicon) {
                            Dicon = dicon;
                        }

                        @SerializedName("Drink")
                        private DrinkIcon Dicon;
                        public class DrinkIcon implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            @SerializedName("icon_name")
                            private String iconName;

                            public String getIconext() {
                                return iconext;
                            }

                            public void setIconext(String iconext) {
                                this.iconext = iconext;
                            }

                            @SerializedName("icon_ext")
                            private String iconext;
                        }

                        public ExtraIcon getEicon() {
                            return Eicon;
                        }

                        public void setEicon(ExtraIcon eicon) {
                            Eicon = eicon;
                        }

                        @SerializedName("Extra")
                        private ExtraIcon Eicon;
                        public class ExtraIcon implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            @SerializedName("icon_name")
                            private String iconName;

                            public String getIconext() {
                                return iconext;
                            }

                            public void setIconext(String iconext) {
                                this.iconext = iconext;
                            }

                            @SerializedName("icon_ext")
                            private String iconext;
                        }

                        public RiceNoodle getRNicon() {
                            return RNicon;
                        }

                        public void setRNicon(RiceNoodle RNicon) {
                            this.RNicon = RNicon;
                        }

                        @SerializedName("RiceNoodles")
                        private RiceNoodle RNicon;
                        public class RiceNoodle implements  Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            @SerializedName("icon_name")
                            private String iconName;

                            public String getIconext() {
                                return iconext;
                            }

                            public void setIconext(String iconext) {
                                this.iconext = iconext;
                            }

                            @SerializedName("icon_ext")
                            private String iconext;
                        }

                        public SoupIcon getSicon() {
                            return Sicon;
                        }

                        public void setSicon(SoupIcon sicon) {
                            Sicon = sicon;
                        }

                        @SerializedName("Soup")
                        private  SoupIcon Sicon;
                        public class SoupIcon implements  Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getIconName() {
                                return iconName;
                            }

                            public void setIconName(String iconName) {
                                this.iconName = iconName;
                            }

                            @SerializedName("icon_name")
                            private String iconName;

                            public String getIconext() {
                                return iconext;
                            }

                            public void setIconext(String iconext) {
                                this.iconext = iconext;
                            }

                            @SerializedName("icon_ext")
                            private String iconext;
                        }
                    }
                    public ArrayList<RiceNoodle> getRicenoodle() {
                        return Ricenoodle;
                    }

                    public void setRicenoodle(ArrayList<RiceNoodle> ricenoodle) {
                        Ricenoodle = ricenoodle;
                    }

                    @SerializedName("RiceNoodles")
                    private ArrayList<RiceNoodle> Ricenoodle;

                    public class RiceNoodle implements Serializable ,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }


                        public MenuEntryOption getMenuEnteeItem() {
                            return MenuEnteeItem;
                        }

                        public void setMenuEnteeItem(MenuEntryOption menuEnteeItem) {
                            MenuEnteeItem = menuEnteeItem;
                        }

                        @SerializedName("MenuEntreeOption")
                        private MenuEntryOption MenuEnteeItem;
                        public class MenuEntryOption implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getEntryTime() {
                                return EntryTime;
                            }

                            public void setEntryTime(String entryTime) {
                                EntryTime = entryTime;
                            }

                            public String getEntreeType() {
                                return EntreeType;
                            }

                            public void setEntreeType(String entreeType) {
                                EntreeType = entreeType;
                            }

                            @SerializedName("EntreeType")

                            private String EntreeType;
                            @SerializedName("EntreeTime")
                            private String EntryTime;
                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            @SerializedName("id")
                            private String id;

                            public String getMenuiid() {
                                return Menuiid;
                            }

                            public void setMenuiid(String menuiid) {
                                Menuiid = menuiid;
                            }

                            @SerializedName("menu_item_id")
                            private String Menuiid;

                            public String getMenuCategoryid() {
                                return MenuCategoryid;
                            }

                            public void setMenuCategoryid(String menuCategoryid) {
                                MenuCategoryid = menuCategoryid;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;

                            public String getDefaultStatus() {
                                return DefaultStatus;
                            }

                            public void setDefaultStatus(String defaultStatus) {
                                DefaultStatus = defaultStatus;
                            }

                            @SerializedName("default_status")
                            private String DefaultStatus;

                            public String getIncludeStatus() {
                                return IncludeStatus;
                            }

                            public void setIncludeStatus(String includeStatus) {
                                IncludeStatus = includeStatus;
                            }

                            @SerializedName("include_status")
                            private String IncludeStatus;

                            public String getStatus() {
                                return status;
                            }

                            public void setStatus(String status) {
                                this.status = status;
                            }

                            @SerializedName("status")
                            private String status;
                        }


                        public MenuItem getMitem() {
                            return Mitem;
                        }

                        public void setMitem(MenuItem mitem) {
                            Mitem = mitem;
                        }

                        @SerializedName("MenuItem")
                        private MenuItem Mitem;

                        public class MenuItem implements Serializable ,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getItem_Pic_Big() {
                                return Item_Pic_Big;
                            }

                            public void setItem_Pic_Big(String item_Pic_Big) {
                                Item_Pic_Big = item_Pic_Big;
                            }

                            @SerializedName("item_pic_android_big")
                            private String Item_Pic_Big;

                            public String getItem_Pic_Medium() {
                                return Item_Pic_Medium;
                            }

                            public void setItem_Pic_Medium(String item_Pic_Medium) {
                                Item_Pic_Medium = item_Pic_Medium;
                            }

                            @SerializedName("item_pic_android_medium")
                            private String Item_Pic_Medium;

                            public String getWeight() {
                                return weight;
                            }

                            public void setWeight(String weight) {
                                this.weight = weight;
                            }

                            @SerializedName("weight")
                            private String weight;

                            public String getItemStatus() {
                                return ItemStatus;
                            }

                            public void setItemStatus(String itemStatus) {
                                ItemStatus = itemStatus;
                            }

                            @SerializedName("status")
                            private String ItemStatus;

                            public String getItem_Pic_Detail_page() {
                                return Item_Pic_Detail_page;
                            }

                            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                                Item_Pic_Detail_page = item_Pic_Detail_page;
                            }

                            @SerializedName("item_pic_thumd_detail_page")
                            private String Item_Pic_Detail_page;

                            public String getHealthy_Status() {
                                return Healthy_Status;
                            }

                            public void setHealthy_Status(String healthy_Status) {
                                Healthy_Status = healthy_Status;
                            }

                            @SerializedName("healthy_status")
                            private String Healthy_Status;

                            public String getItemId() {
                                return ItemId;
                            }

                            public void setItemId(String itemId) {
                                ItemId = itemId;
                            }

                            @SerializedName("id")
                            private String ItemId;

                            public String getSpicyStatus() {
                                return SpicyStatus;
                            }

                            public void setSpicyStatus(String spicyStatus) {
                                SpicyStatus = spicyStatus;
                            }

                            @SerializedName("spicy_status")
                            private String SpicyStatus;

                            public String getItemName() {
                                return ItemName;
                            }

                            public void setItemName(String itemName) {
                                ItemName = itemName;
                            }

                            @SerializedName("item_name")
                            private String ItemName;

                            public String getItemDesc() {
                                return ItemDesc;
                            }

                            public void setItemDesc(String itemDesc) {
                                ItemDesc = itemDesc;
                            }

                            @SerializedName("description")
                            private String ItemDesc;

                            public String getMenuCategoryId() {
                                return MenuCategoryId;
                            }

                            public void setMenuCategoryId(String menuCategoryId) {
                                MenuCategoryId = menuCategoryId;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryId;
                        }
                    }

                    public ArrayList<Extra> getExtraItem() {
                        return ExtraItem;
                    }

                    public void setExtraItem(ArrayList<Extra> extraItem) {
                        ExtraItem = extraItem;
                    }

                    @SerializedName("Extra")
                    private ArrayList<Extra> ExtraItem;

                    public class Extra implements Serializable ,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }


                        public MenuEntryOption getMenuEntreeOption() {
                            return MenuEntreeOption;
                        }

                        public void setMenuEntreeOption(MenuEntryOption menuEntreeOption) {
                            MenuEntreeOption = menuEntreeOption;
                        }

                        @SerializedName("MenuEntreeOption")
                        private MenuEntryOption MenuEntreeOption;
                        public class MenuEntryOption implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getEntryTime() {
                                return EntryTime;
                            }

                            public void setEntryTime(String entryTime) {
                                EntryTime = entryTime;
                            }

                            public String getEntreeType() {
                                return EntreeType;
                            }

                            public void setEntreeType(String entreeType) {
                                EntreeType = entreeType;
                            }

                            @SerializedName("EntreeType")

                            private String EntreeType;
                            @SerializedName("EntreeTime")
                            private String EntryTime;
                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            @SerializedName("id")
                            private String id;

                            public String getMenuiid() {
                                return Menuiid;
                            }

                            public void setMenuiid(String menuiid) {
                                Menuiid = menuiid;
                            }

                            @SerializedName("menu_item_id")
                            private String Menuiid;

                            public String getMenuCategoryid() {
                                return MenuCategoryid;
                            }

                            public void setMenuCategoryid(String menuCategoryid) {
                                MenuCategoryid = menuCategoryid;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;

                            public String getDefaultStatus() {
                                return DefaultStatus;
                            }

                            public void setDefaultStatus(String defaultStatus) {
                                DefaultStatus = defaultStatus;
                            }

                            @SerializedName("default_status")
                            private String DefaultStatus;

                            public String getIncludeStatus() {
                                return IncludeStatus;
                            }

                            public void setIncludeStatus(String includeStatus) {
                                IncludeStatus = includeStatus;
                            }

                            @SerializedName("include_status")
                            private String IncludeStatus;

                            public String getStatus() {
                                return status;
                            }

                            public void setStatus(String status) {
                                this.status = status;
                            }

                            @SerializedName("status")
                            private String status;
                        }
                        @SerializedName("MenuLunchEntreeOption")

                        private LunchEntreeOption Lunchentreeoption;

                        public class LunchEntreeOption implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            @SerializedName("id")
                            private String id;

                            public String getMenuiid() {
                                return Menuiid;
                            }

                            public void setMenuiid(String menuiid) {
                                Menuiid = menuiid;
                            }

                            @SerializedName("menu_item_id")
                            private String Menuiid;

                            public String getMenuCategoryid() {
                                return MenuCategoryid;
                            }

                            public void setMenuCategoryid(String menuCategoryid) {
                                MenuCategoryid = menuCategoryid;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;

                            public String getDefaultStatus() {
                                return DefaultStatus;
                            }

                            public void setDefaultStatus(String defaultStatus) {
                                DefaultStatus = defaultStatus;
                            }

                            @SerializedName("default_status")
                            private String DefaultStatus;

                            public String getIncludeStatus() {
                                return IncludeStatus;
                            }

                            public void setIncludeStatus(String includeStatus) {
                                IncludeStatus = includeStatus;
                            }

                            @SerializedName("include_status")
                            private String IncludeStatus;

                            public String getStatus() {
                                return status;
                            }

                            public void setStatus(String status) {
                                this.status = status;
                            }

                            @SerializedName("status")
                            private String status;

                        }

                        public MenuItem getMitem() {
                            return Mitem;
                        }

                        public void setMitem(MenuItem mitem) {
                            Mitem = mitem;
                        }

                        @SerializedName("MenuItem")
                        private MenuItem Mitem;

                        public class MenuItem implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getMobile_hover_medium_icon() {
                                return Mobile_hover_medium_icon;
                            }

                            public void setMobile_hover_medium_icon(String mobile_hover_medium_icon) {
                                Mobile_hover_medium_icon = mobile_hover_medium_icon;
                            }
                            @SerializedName("mobile_hover_medium_icon")
                            private String Mobile_hover_medium_icon;
                            public int getSelection() {
                                return selection;
                            }

                            public void setSelection(int selection) {
                                this.selection = selection;
                            }

                            private int selection;
                            public String getItem_Pic_Big() {
                                return Item_Pic_Big;
                            }

                            public void setItem_Pic_Big(String item_Pic_Big) {
                                Item_Pic_Big = item_Pic_Big;
                            }

                            @SerializedName("item_pic_android_big")
                            private String Item_Pic_Big;

                            public String getItem_Pic_Medium() {
                                return Item_Pic_Medium;
                            }

                            public void setItem_Pic_Medium(String item_Pic_Medium) {
                                Item_Pic_Medium = item_Pic_Medium;
                            }

                            @SerializedName("item_pic_android_medium")
                            private String Item_Pic_Medium;

                            public String getWeight() {
                                return weight;
                            }

                            public void setWeight(String weight) {
                                this.weight = weight;
                            }

                            @SerializedName("weight")
                            private String weight;

                            public String getItemStatus() {
                                return ItemStatus;
                            }

                            public void setItemStatus(String itemStatus) {
                                ItemStatus = itemStatus;
                            }

                            @SerializedName("status")
                            private String ItemStatus;

                            public String getItem_Pic_Detail_page() {
                                return Item_Pic_Detail_page;
                            }

                            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                                Item_Pic_Detail_page = item_Pic_Detail_page;
                            }

                            @SerializedName("item_pic_thumd_detail_page")
                            private String Item_Pic_Detail_page;

                            public String getHealthy_Status() {
                                return Healthy_Status;
                            }

                            public void setHealthy_Status(String healthy_Status) {
                                Healthy_Status = healthy_Status;
                            }

                            @SerializedName("healthy_status")
                            private String Healthy_Status;

                            public String getItemId() {
                                return ItemId;
                            }

                            public void setItemId(String itemId) {
                                ItemId = itemId;
                            }

                            @SerializedName("id")
                            private String ItemId;

                            public String getSpicyStatus() {
                                return SpicyStatus;
                            }

                            public void setSpicyStatus(String spicyStatus) {
                                SpicyStatus = spicyStatus;
                            }

                            @SerializedName("spicy_status")
                            private String SpicyStatus;

                            public String getItemName() {
                                return ItemName;
                            }

                            public void setItemName(String itemName) {
                                ItemName = itemName;
                            }

                            @SerializedName("item_name")
                            private String ItemName;

                            public String getItemDesc() {
                                return ItemDesc;
                            }

                            public void setItemDesc(String itemDesc) {
                                ItemDesc = itemDesc;
                            }

                            @SerializedName("description")
                            private String ItemDesc;

                            public String getMenuCategoryId() {
                                return MenuCategoryId;
                            }

                            public void setMenuCategoryId(String menuCategoryId) {
                                MenuCategoryId = menuCategoryId;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryId;


                            private String retail_price;

                            public String getRetail_price() {
                                return retail_price;
                            }

                            public void setRetail_price(String retail_price) {
                                this.retail_price = retail_price;
                            }
                        }
                    }


                    public ArrayList<Appetizer> getAPPtizer() {
                        return APPtizer;
                    }

                    public void setAPPtizer(ArrayList<Appetizer> APPtizer) {
                        this.APPtizer = APPtizer;
                    }

                    @SerializedName("Appetizer")
                    private ArrayList<Appetizer> APPtizer;
                    public class Appetizer implements Serializable,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }
                        private float price;

                        public float getPrice() {
                            return price;
                        }

                        public void setPrice(float price) {
                            this.price = price;
                        }

                        public int getSelection() {
                            return selection;
                        }

                        public void setSelection(int selection) {
                            this.selection = selection;
                        }

                        public int selection;

                        private String selected_value;

                        private int quantity;




                        public int getQuantity() {
                            if(quantity==0){
                                quantity =1;
                            }
                            return quantity;
                        }


                        private String discription;

                        public String getDiscription() {
                            return discription;
                        }

                        public void setDiscription(String discription) {
                            this.discription = discription;
                        }

                        public void setQuantity(int quantity) {
                            this.quantity = quantity;
                        }

                        public String getSelected_value() {
                            if(selected_value==null){

                                selected_value ="";
                            }
                            return selected_value;
                        }

                        public void setSelected_value(String selected_value) {


                            this.selected_value = selected_value;
                        }

                        public MenuItem getMitem() {
                            return Mitem;
                        }

                        public void setMitem(MenuItem mitem) {
                            Mitem = mitem;
                        }

                        @SerializedName("MenuItem")
                        private MenuItem Mitem;
                        public class MenuItem implements  Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getItem_Pic_Big() {
                                return Item_Pic_Big;
                            }

                            public void setItem_Pic_Big(String item_Pic_Big) {
                                Item_Pic_Big = item_Pic_Big;
                            }

                            @SerializedName("item_pic_android_big")
                            private String Item_Pic_Big;

                            public String getItem_Pic_Medium() {
                                return Item_Pic_Medium;
                            }

                            public void setItem_Pic_Medium(String item_Pic_Medium) {
                                Item_Pic_Medium = item_Pic_Medium;
                            }

                            @SerializedName("item_pic_android_medium")
                            private String Item_Pic_Medium;

                            public String getWeight() {
                                return weight;
                            }

                            public void setWeight(String weight) {
                                this.weight = weight;
                            }

                            @SerializedName("weight")
                            private String weight;

                            public String getItemStatus() {
                                return ItemStatus;
                            }

                            public void setItemStatus(String itemStatus) {
                                ItemStatus = itemStatus;
                            }

                            @SerializedName("status")
                            private String ItemStatus;

                            public String getItem_Pic_Detail_page() {
                                return Item_Pic_Detail_page;
                            }

                            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                                Item_Pic_Detail_page = item_Pic_Detail_page;
                            }

                            @SerializedName("item_pic_thumd_detail_page")
                            private String Item_Pic_Detail_page;

                            public String getHealthy_Status() {
                                return Healthy_Status;
                            }

                            public void setHealthy_Status(String healthy_Status) {
                                Healthy_Status = healthy_Status;
                            }

                            @SerializedName("healthy_status")
                            private String Healthy_Status;

                            public String getItemId() {
                                return ItemId;
                            }

                            public void setItemId(String itemId) {
                                ItemId = itemId;
                            }

                            @SerializedName("id")
                            private String ItemId;

                            public String getSpicyStatus() {
                                return SpicyStatus;
                            }

                            public void setSpicyStatus(String spicyStatus) {
                                SpicyStatus = spicyStatus;
                            }

                            @SerializedName("spicy_status")
                            private String SpicyStatus;

                            public String getItemName() {
                                return ItemName;
                            }

                            public void setItemName(String itemName) {
                                ItemName = itemName;
                            }

                            @SerializedName("item_name")
                            private String ItemName;

                            public String getItemDesc() {
                                return ItemDesc;
                            }

                            public void setItemDesc(String itemDesc) {
                                ItemDesc = itemDesc;
                            }

                            @SerializedName("description")
                            private String ItemDesc;

                            public String getMenuCategoryId() {
                                return MenuCategoryId;
                            }

                            public void setMenuCategoryId(String menuCategoryId) {
                                MenuCategoryId = menuCategoryId;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryId;
                        }

                        public ArrayList<ItemPrice> getItemprice() {
                            return Itemprice;
                        }

                        public void setItemprice(ArrayList<ItemPrice> itemprice) {
                            Itemprice = itemprice;
                        }

                        @SerializedName("ItemPrice")
                        private ArrayList<ItemPrice> Itemprice;
                        public class ItemPrice implements  Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }


                            private int selected;

                            private String selected_value;

                            public int getSelected() {
                                return selected;
                            }

                            public void setSelected(int selected) {
                                this.selected = selected;
                            }

                            public String getSelected_value() {
                                return selected_value;
                            }

                            public void setSelected_value(String selected_value) {
                                this.selected_value = selected_value;
                            }

                            @SerializedName("description")
                            private String descripition;

                            public String getDescripition() {
                                return descripition;
                            }

                            public void setDescripition(String descripition) {
                                this.descripition = descripition;
                            }
                            public String getCheckMd() {
                                return CheckMd;
                            }

                            public void setCheckMd(String checkMd) {
                                CheckMd = checkMd;
                            }

                            @SerializedName("is_md")
                            private String CheckMd;

                            public String getSpecialText() {
                                return SpecialText;
                            }

                            public void setSpecialText(String specialText) {
                                SpecialText = specialText;
                            }

                            @SerializedName("special_text")
                            private String SpecialText;

                            public String getMdPrice() {
                                return MdPrice;
                            }

                            public void setMdPrice(String mdPrice) {
                                MdPrice = mdPrice;
                            }

                            @SerializedName("md_price")
                            private String MdPrice;

                            public String getPriceid() {
                                return priceid;
                            }

                            public void setPriceid(String priceid) {
                                this.priceid = priceid;
                            }

                            @SerializedName("id")
                            private String priceid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getSize() {
                                return size;
                            }

                            public void setSize(String size) {
                                this.size = size;
                            }

                            @SerializedName("size")
                            private String size;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;


                        }
                    }

                    public ArrayList<Soup> getSoupValue() {
                        return soupValue;
                    }

                    public void setSoupValue(ArrayList<Soup> soupValue) {
                        this.soupValue = soupValue;
                    }

                    @SerializedName("Soup")
                    private ArrayList<Soup> soupValue;
                    public class Soup implements Serializable,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }


                        private float price;

                        public float getPrice() {
                            return price;
                        }

                        public void setPrice(float price) {
                            this.price = price;
                        }

                        private int quantity;

                        public int getQuantity() {
                            if(quantity ==0){
                                quantity=1;
                            }
                            return quantity;
                        }


                        private String discription;

                        public String getDiscription() {
                            return discription;
                        }

                        public void setDiscription(String discription) {
                            this.discription = discription;
                        }

                        public void setQuantity(int quantity) {
                            this.quantity = quantity;
                        }
                        public int getSelection() {
                            return selection;
                        }

                        public void setSelection(int selection) {
                            this.selection = selection;
                        }

                        private int selection;

                        private String selected_value;


                        public String getSelected_value() {
                            if(selected_value == null){
                                selected_value = "";
                            }
                            return selected_value;
                        }

                        public void setSelected_value(String selected_value) {
                            this.selected_value = selected_value;
                        }

                        public MenuItem getMitem() {
                            return Mitem;
                        }

                        public void setMitem(MenuItem mitem) {
                            Mitem = mitem;
                        }

                        @SerializedName("MenuItem")
                        private MenuItem Mitem;
                        public class MenuItem implements Serializable ,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getItem_Pic_Big() {
                                return Item_Pic_Big;
                            }

                            public void setItem_Pic_Big(String item_Pic_Big) {
                                Item_Pic_Big = item_Pic_Big;
                            }

                            @SerializedName("item_pic_android_big")
                            private String Item_Pic_Big;

                            public String getItem_Pic_Medium() {
                                return Item_Pic_Medium;
                            }

                            public void setItem_Pic_Medium(String item_Pic_Medium) {
                                Item_Pic_Medium = item_Pic_Medium;
                            }

                            @SerializedName("item_pic_android_medium")
                            private String Item_Pic_Medium;

                            public String getWeight() {
                                return weight;
                            }

                            public void setWeight(String weight) {
                                this.weight = weight;
                            }

                            @SerializedName("weight")
                            private String weight;

                            public String getItemStatus() {
                                return ItemStatus;
                            }

                            public void setItemStatus(String itemStatus) {
                                ItemStatus = itemStatus;
                            }

                            @SerializedName("status")
                            private String ItemStatus;

                            public String getItem_Pic_Detail_page() {
                                return Item_Pic_Detail_page;
                            }

                            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                                Item_Pic_Detail_page = item_Pic_Detail_page;
                            }

                            @SerializedName("item_pic_thumd_detail_page")
                            private String Item_Pic_Detail_page;

                            public String getHealthy_Status() {
                                return Healthy_Status;
                            }

                            public void setHealthy_Status(String healthy_Status) {
                                Healthy_Status = healthy_Status;
                            }

                            @SerializedName("healthy_status")
                            private String Healthy_Status;

                            public String getItemId() {
                                return ItemId;
                            }

                            public void setItemId(String itemId) {
                                ItemId = itemId;
                            }

                            @SerializedName("id")
                            private String ItemId;

                            public String getSpicyStatus() {
                                return SpicyStatus;
                            }

                            public void setSpicyStatus(String spicyStatus) {
                                SpicyStatus = spicyStatus;
                            }

                            @SerializedName("spicy_status")
                            private String SpicyStatus;

                            public String getItemName() {
                                return ItemName;
                            }

                            public void setItemName(String itemName) {
                                ItemName = itemName;
                            }

                            @SerializedName("item_name")
                            private String ItemName;

                            public String getItemDesc() {
                                return ItemDesc;
                            }

                            public void setItemDesc(String itemDesc) {
                                ItemDesc = itemDesc;
                            }

                            @SerializedName("description")
                            private String ItemDesc;

                            public String getMenuCategoryId() {
                                return MenuCategoryId;
                            }

                            public void setMenuCategoryId(String menuCategoryId) {
                                MenuCategoryId = menuCategoryId;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryId;
                        }

                        public ArrayList<ItemPrice> getItemprice() {
                            return itemprice;
                        }

                        public void setItemprice(ArrayList<ItemPrice> itemprice) {
                            this.itemprice = itemprice;
                        }

                        @SerializedName("ItemPrice")
                        public ArrayList<ItemPrice> itemprice;
                        public class ItemPrice implements Serializable ,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }

                            @SerializedName("description")
                            private String descripition;

                            public String getDescripition() {
                                return descripition;
                            }

                            public void setDescripition(String descripition) {
                                this.descripition = descripition;
                            }
                            public String getCheckMd() {
                                return CheckMd;
                            }

                            public void setCheckMd(String checkMd) {
                                CheckMd = checkMd;
                            }

                            @SerializedName("is_md")
                            private String CheckMd;

                            public String getSpecialText() {
                                return SpecialText;
                            }

                            public void setSpecialText(String specialText) {
                                SpecialText = specialText;
                            }

                            @SerializedName("special_text")
                            private String SpecialText;

                            public String getMdPrice() {
                                return MdPrice;
                            }

                            public void setMdPrice(String mdPrice) {
                                MdPrice = mdPrice;
                            }

                            @SerializedName("md_price")
                            private String MdPrice;

                            public String getPriceid() {
                                return priceid;
                            }

                            public void setPriceid(String priceid) {
                                this.priceid = priceid;
                            }

                            @SerializedName("id")
                            private String priceid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getSize() {
                                return size;
                            }

                            public void setSize(String size) {
                                this.size = size;
                            }

                            @SerializedName("size")
                            private String size;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;


                        }
                    }

                    public ArrayList<Drink> getDrinkValues() {
                        return DrinkValues;
                    }

                    public void setDrinkValues(ArrayList<Drink> drinkValues) {
                        DrinkValues = drinkValues;
                    }

                    @SerializedName("Drink")
                    private ArrayList<Drink> DrinkValues;
                    public class Drink implements Serializable,Cloneable {

                        //Defined clone method in Department class.
                        @Override
                        public Object clone() throws CloneNotSupportedException {
                            return super.clone();
                        }

                        private float price;

                        public float getPrice() {
                            return price;
                        }

                        public void setPrice(float price) {
                            this.price = price;
                        }

                        private int quantity;

                        public int getQuantity() {
                            if(quantity==0){
                                quantity=1;
                            }
                            return quantity;
                        }


                        private String discription;

                        public String getDiscription() {
                            return discription;
                        }

                        public void setDiscription(String discription) {
                            this.discription = discription;
                        }

                        public void setQuantity(int quantity) {
                            this.quantity = quantity;
                        }

                        public int getSelection() {
                            return selection;
                        }

                        public void setSelection(int selection) {
                            this.selection = selection;
                        }

                        public int selection;
                        public MenuItem getMitem() {
                            return Mitem;
                        }

                        public void setMitem(MenuItem mitem) {
                            Mitem = mitem;
                        }


                        private String selected_value;

                        public String getSelected_value() {

                            if(selected_value ==null){

                                selected_value = "";
                            }

                            return selected_value;
                        }

                        public void setSelected_value(String selected_value) {
                            this.selected_value = selected_value;
                        }

                        @SerializedName("MenuItem")
                        private MenuItem Mitem;
                        public class MenuItem implements Serializable,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getItem_Pic_Big() {
                                return Item_Pic_Big;
                            }

                            public void setItem_Pic_Big(String item_Pic_Big) {
                                Item_Pic_Big = item_Pic_Big;
                            }

                            @SerializedName("item_pic_android_big")
                            private String Item_Pic_Big;

                            public String getItem_Pic_Medium() {
                                return Item_Pic_Medium;
                            }

                            public void setItem_Pic_Medium(String item_Pic_Medium) {
                                Item_Pic_Medium = item_Pic_Medium;
                            }

                            @SerializedName("item_pic_android_medium")
                            private String Item_Pic_Medium;

                            public String getWeight() {
                                return weight;
                            }

                            public void setWeight(String weight) {
                                this.weight = weight;
                            }

                            @SerializedName("weight")
                            private String weight;

                            public String getItemStatus() {
                                return ItemStatus;
                            }

                            public void setItemStatus(String itemStatus) {
                                ItemStatus = itemStatus;
                            }

                            @SerializedName("status")
                            private String ItemStatus;

                            public String getItem_Pic_Detail_page() {
                                return Item_Pic_Detail_page;
                            }

                            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                                Item_Pic_Detail_page = item_Pic_Detail_page;
                            }

                            @SerializedName("item_pic_thumd_detail_page")
                            private String Item_Pic_Detail_page;

                            public String getHealthy_Status() {
                                return Healthy_Status;
                            }

                            public void setHealthy_Status(String healthy_Status) {
                                Healthy_Status = healthy_Status;
                            }

                            @SerializedName("healthy_status")
                            private String Healthy_Status;

                            public String getItemId() {
                                return ItemId;
                            }

                            public void setItemId(String itemId) {
                                ItemId = itemId;
                            }

                            @SerializedName("id")
                            private String ItemId;

                            public String getSpicyStatus() {
                                return SpicyStatus;
                            }

                            public void setSpicyStatus(String spicyStatus) {
                                SpicyStatus = spicyStatus;
                            }

                            @SerializedName("spicy_status")
                            private String SpicyStatus;

                            public String getItemName() {
                                return ItemName;
                            }

                            public void setItemName(String itemName) {
                                ItemName = itemName;
                            }

                            @SerializedName("item_name")
                            private String ItemName;

                            public String getItemDesc() {
                                return ItemDesc;
                            }

                            public void setItemDesc(String itemDesc) {
                                ItemDesc = itemDesc;
                            }

                            @SerializedName("description")
                            private String ItemDesc;

                            public String getMenuCategoryId() {
                                return MenuCategoryId;
                            }

                            public void setMenuCategoryId(String menuCategoryId) {
                                MenuCategoryId = menuCategoryId;
                            }

                            @SerializedName("menu_category_id")
                            private String MenuCategoryId;
                        }

                        public ArrayList<ItemPrice> getItemprice() {
                            return itemprice;
                        }

                        public void setItemprice(ArrayList<ItemPrice> itemprice) {
                            this.itemprice = itemprice;
                        }

                        @SerializedName("ItemPrice")
                        private ArrayList<ItemPrice> itemprice;
                        public class ItemPrice implements  Serializable ,Cloneable {

                            //Defined clone method in Department class.
                            @Override
                            public Object clone() throws CloneNotSupportedException {
                                return super.clone();
                            }
                            public String getCheckMd() {
                                return CheckMd;
                            }

                            public void setCheckMd(String checkMd) {
                                CheckMd = checkMd;
                            }

                            @SerializedName("is_md")
                            private String CheckMd;

                            public String getSpecialText() {
                                return SpecialText;
                            }

                            public void setSpecialText(String specialText) {
                                SpecialText = specialText;
                            }

                            @SerializedName("special_text")
                            private String SpecialText;

                            public String getMdPrice() {
                                return MdPrice;
                            }

                            public void setMdPrice(String mdPrice) {
                                MdPrice = mdPrice;
                            }

                            @SerializedName("md_price")
                            private String MdPrice;

                            public String getPriceid() {
                                return priceid;
                            }

                            public void setPriceid(String priceid) {
                                this.priceid = priceid;
                            }

                            @SerializedName("id")
                            private String priceid;

                            public String getStandardCost() {
                                return StandardCost;
                            }

                            public void setStandardCost(String standardCost) {
                                StandardCost = standardCost;
                            }

                            @SerializedName("standard_cost")
                            private String StandardCost;

                            public String getSize() {
                                return size;
                            }

                            public void setSize(String size) {
                                this.size = size;
                            }

                            @SerializedName("size")
                            private String size;

                            public String getRetailPrice() {
                                return RetailPrice;
                            }

                            public void setRetailPrice(String retailPrice) {
                                RetailPrice = retailPrice;
                            }

                            @SerializedName("retail_price")
                            private String RetailPrice;


                            @SerializedName("description")
                            private String descripition;

                            public String getDescripition() {
                                return descripition;
                            }

                            public void setDescripition(String descripition) {
                                this.descripition = descripition;
                            }
                        }
                    }
                }
            }


        }
    }
}


