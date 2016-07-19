package com.sdm.mylibrary.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 7/15/2015.
 */
public class SelectedItemModel implements Serializable {

    private String name;

    private String id;

    private String specailText;

    public String getSpecailText() {
        if(specailText==null || specailText.equalsIgnoreCase("null")||specailText.equals(null)){

            specailText="";
        }
        return specailText;
    }

    public void setSpecailText(String specailText) {
        this.specailText = specailText;
    }

    public String getRequired() {
        return Required;
    }

    public void setRequired(String required) {
        Required = required;
    }

    private String Required="false";
    public String getMain_Special_Text() {
        return Main_Special_Text;
    }

    public void setMain_Special_Text(String main_Special_Text) {
        Main_Special_Text = main_Special_Text;
    }

    private String Main_Special_Text;

    private int mealType=1;

    public int getMealType() {
        return mealType;
    }

    public void setMealType(int mealType) {
        this.mealType = mealType;
    }

    private float price;

    private  String parentid;

    private String mResturantId;

    public String getmResturantId() {
        return mResturantId;
    }

    public void setmResturantId(String mResturantId) {
        this.mResturantId = mResturantId;
    }

    public String getParentid() {
        if(parentid==null){
            parentid="";
        }
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    private int quantity;

    private String size;

    private String discription;

    private String image;

    private String type;

    private String parentName;

    private boolean show;

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    private int updatedQuantity;

    public int getUpdatedQuantity() {
        return updatedQuantity;
    }

    public void setUpdatedQuantity(int updatedQuantity) {
        this.updatedQuantity = updatedQuantity;
    }

    private String parentType;

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public int parentQuantity;

    private float parentPrice;

    public float getParentPrice() {
        return parentPrice;
    }

    public void setParentPrice(float parentPrice) {
        this.parentPrice = parentPrice;
    }

    public int getParentQuantity() {
        return parentQuantity;
    }

    public void setParentQuantity(int parentQuantity) {
        this.parentQuantity = parentQuantity;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    private SelectedItemModel soup;

    public SelectedItemModel getSoup() {
        return soup;
    }

    public void setSoup(SelectedItemModel soup) {
        this.soup = soup;
    }

    private SelectedItemModel appitizers;

    public String getType() {
        if(type==null){
            type="";
        }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SelectedItemModel getAppitizers() {
        return appitizers;
    }

    public void setAppitizers(SelectedItemModel appitizers) {
        this.appitizers = appitizers;
    }

    private ArrayList<SelectedItemModel> Extra;

    public ArrayList<SelectedItemModel> getExtra() {
        return Extra;
    }

    public void setExtra(ArrayList<SelectedItemModel> extra) {
        Extra = extra;
    }

    public String getImage() {
        if(image==null){
            image = "";
        }
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getSize() {
        if(size==null){
            size="";
        }

        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public String getName() {
        if(name==null){
            name="";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int catering=0;

    private int Supply;

    public int getSupply() {
        return Supply;
    }

    public void setSupply(int supply) {
        Supply = supply;
    }

    private int menupacakge;

    public int getMenupacakge() {
        return menupacakge;
    }

    public void setMenupacakge(int menupacakge) {
        this.menupacakge = menupacakge;
    }

    public int getCatering() {
        return catering;
    }

    public void setCatering(int catering) {
        this.catering = catering;
    }


    private ArrayList<CateringLandingModel.data.MenuPackageItem> mealpackage;

    public ArrayList<CateringLandingModel.data.MenuPackageItem> getMealpackage() {
        return mealpackage;
    }

    public void setMealpackage(ArrayList<CateringLandingModel.data.MenuPackageItem> mealpackage) {
        this.mealpackage = mealpackage;
    }


    private int selectedItemPrice;

    public int getSelectedItemPrice() {
        return selectedItemPrice;
    }

    public void setSelectedItemPrice(int selectedItemPrice) {
        this.selectedItemPrice = selectedItemPrice;
    }

    private ItemDetailModel.data.MItem mSupply;


    public ItemDetailModel.data.MItem getmSupply() {
        return mSupply;
    }

    public void setmSupply(ItemDetailModel.data.MItem mSupply) {
        this.mSupply = mSupply;
    }
}
