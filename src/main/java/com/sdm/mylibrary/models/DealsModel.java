package com.sdm.mylibrary.models;

/**
 * Created by jatindersi on 5/21/2015.
 */
public class DealsModel
{
    private String dealtitle,dealoffer,dealdesc,dealimageurl;
    public void setTitle(String title)
    {
        this.dealtitle=title;
    }

    public String getTitle() {
        return dealtitle;
    }
    public void setOffer(String offer)
    {
        this.dealoffer=offer;
    }

    public String getOffer() {
        return dealoffer;
    }
    public void setDesc(String desc)
    {
        this.dealdesc=desc;
    }

    public String getDesc() {
        return dealdesc;
    }
    public void setImage(String url)
    {
        this.dealimageurl=url;
    }
    public String getImage()
    {
        return dealimageurl;
    }
}
