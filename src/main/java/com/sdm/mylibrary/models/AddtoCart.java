package com.sdm.mylibrary.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sumeetb on 7/15/2015.
 */
public class AddtoCart {


    private String itemName;

    private String itemImage;

    private String itemID;

    private String meal;

    private int itemQuantitiy;

    private String spl_instructions;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getItemQuantitiy() {
        return itemQuantitiy;
    }

    public void setItemQuantitiy(int itemQuantitiy) {
        this.itemQuantitiy = itemQuantitiy;
    }

    public String getSpl_instructions() {
        return spl_instructions;
    }

    public void setSpl_instructions(String spl_instructions) {
        this.spl_instructions = spl_instructions;
    }


    private SelectedItemModel Rice;

    public SelectedItemModel getRice() {
        return Rice;
    }

    public void setRice(SelectedItemModel rice) {
        Rice = rice;
    }

    private ArrayList<SelectedItemModel> Extra;

    public ArrayList<SelectedItemModel> getExtra() {
        return Extra;
    }

    public void setExtra(ArrayList<SelectedItemModel> extra) {
        Extra = extra;
    }

    private ArrayList<SelectedItemModel> Appitizers;



    private ArrayList<SelectedItemModel> Soup;

    public ArrayList<SelectedItemModel> getAppitizers() {
        return Appitizers;
    }

    public void setAppitizers(ArrayList<SelectedItemModel> appitizers) {
        Appitizers = appitizers;
    }

    public ArrayList<SelectedItemModel> getSoup() {
        return Soup;
    }

    public void setSoup(ArrayList<SelectedItemModel> soup) {
        Soup = soup;
    }

    private ArrayList<SelectedItemModel> Drink;

    public ArrayList<SelectedItemModel> getDrink() {
        return Drink;
    }

    public void setDrink(ArrayList<SelectedItemModel> drink) {
        Drink = drink;
    }
}
