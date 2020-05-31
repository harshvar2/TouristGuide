package com.harsh.application.TourGuide;

public class Citydata {

    
    private  String mPlaceName;
    private String mplaceDetails;
    private   int mPLaceImageID=DEFAULT_ID;
    private static final  int DEFAULT_ID = -1;

     public Citydata(String placeName,String placeDetails,int placeImageID){

        mPlaceName=placeName;
        mplaceDetails=placeDetails;
        mPLaceImageID=placeImageID;


    }

    public Citydata(String placeName,String placeDetails){

        mPlaceName=placeName;
        mplaceDetails=placeDetails;


    }



    public  String getPlaceName(){
        return mPlaceName;
    }


    public  String getPlaceDetails(){
        return mplaceDetails;
    }


    public  int placeImageID(){
        return mPLaceImageID;
    }
    public boolean hasImage() {
        return mPLaceImageID != DEFAULT_ID;
    }




}
