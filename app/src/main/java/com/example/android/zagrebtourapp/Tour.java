package com.example.android.zagrebtourapp;

/**
 * Created by Tea on 24.4.2018..
 */

public class Tour {

    private int mImageResourceId;
    private int mTextResourceId;
    private int iTextResourceId;
    private String mUrlLocation;
    private String mUrlId;

    public Tour (int imageResourceId, int textResourceId, int textInfoId, String locationId, String urlId) {
       mImageResourceId = imageResourceId;
        mTextResourceId = textResourceId;
        iTextResourceId = textInfoId;
        mUrlLocation = locationId;
        mUrlId = urlId;
}
      public int getImageResourceId(){return mImageResourceId; }
    public int getTextResourceId() {return mTextResourceId;}
    public int getTextInfoId() {return iTextResourceId;    }
    public String getLocationId(){
        return  mUrlLocation;
    }
    public String getUrlId(){
        return mUrlId;
    }




}
