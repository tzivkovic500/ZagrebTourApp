package com.example.android.zagrebtourapp;

/**
 * Created by Tea on 24.4.2018..
 */

public class Tour {

    private int mImageResourceId;
    private int mTextResourceId;
    private int iTextResourceId;
    private String mUrlId;
    private String mUrlLocation;

    public Tour (int imageResourceId, int textResourceId, int textInfoId, String urlId, String locationId) {
       mImageResourceId = imageResourceId;
        mTextResourceId = textResourceId;
        iTextResourceId = textInfoId;
        mUrlId = urlId;
        mUrlLocation = locationId;
}
      public int getImageResourceId(){return mImageResourceId; }
    public int getTextResourceId() {return mTextResourceId;}
    public int getTextInfoId() {return iTextResourceId;    }
    public String getUrlId(){
        return mUrlId;
    }
    public String getLocationId(){
        return  mUrlLocation;
    }




}
