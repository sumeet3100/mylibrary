package com.sdm.mylibrary.models;

/**
 * Created by sumeetb on 11/2/15.
 */
public class FavItem {


    private String categoryId;

    private String categoryname;

    private String itemName;

    private String icon;

    private String iconextension;

    private String stepIcon;

    private String itemId;



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getStepIcon() {
        return stepIcon;
    }

    public void setStepIcon(String stepIcon) {
        this.stepIcon = stepIcon;
    }




    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconextension() {
        return iconextension;
    }

    public void setIconextension(String iconextension) {
        this.iconextension = iconextension;
    }
}
