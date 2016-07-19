package com.sdm.mylibrary.models;

/**
 * Created by sumeetb on 7/14/2015.
 */
public class MenuDetailInput {


    private String menu_item_id;

    private String operating_partner_location_id;

    private String customer_status;


    private String view_item_price_for;


    private String type;


    public MenuDetailInput(String menu_item_id,String operating_partner_location_id,String customer_status,
                           String view_item_price_for,String type){


        this.menu_item_id=menu_item_id;
        this.operating_partner_location_id=operating_partner_location_id;
        this.customer_status=customer_status;
        this.view_item_price_for = view_item_price_for;
        this.type=type;




    }


}
