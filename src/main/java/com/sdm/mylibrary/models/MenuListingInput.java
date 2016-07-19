package com.sdm.mylibrary.models;

/**
 * Created by sumeetb on 7/14/2015.
 */
public class MenuListingInput {



    private String menu_category_id;

    private String operating_partner_location_id;

    private String type;

    public MenuListingInput(String menu_category_id,String operating_partner_location_id,String type){

        this.menu_category_id = menu_category_id;
        this.operating_partner_location_id = operating_partner_location_id;
        this.type = type;

    }


}
