package com.sdm.mylibrary.models;

/**
 * Created by jatindersi on 7/7/2015.
 */
public class CartItemClass
{
    public int getSelectedpos() {
        return selectedpos;
    }

    public void setSelectedpos(int selectedpos) {
        this.selectedpos = selectedpos;
    }

    private int selectedpos;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }


    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(String item_quantity) {
        this.item_quantity = item_quantity;
    }

    public String getItem_status() {
        return item_status;
    }

    public void setItem_status(String item_status) {
        this.item_status = item_status;
    }

    private String id;

    private String item_name;

    private String item_desc;

    private String item_image;

    private float item_price;

    private String  item_type;

    private String item_quantity;

    private String item_status;

    private String category_id;

    private String menu_id;

    private String image;

    private String resturant_id;

    private int quantity;


    public float getItem_price() {
        return item_price;
    }

    public void setItem_price(float item_price) {
        this.item_price = item_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResturant_id() {
        return resturant_id;
    }

    public void setResturant_id(String resturant_id) {
        this.resturant_id = resturant_id;
    }
}
