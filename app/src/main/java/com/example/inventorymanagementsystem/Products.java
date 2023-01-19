package com.example.inventorymanagementsystem;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Products implements Serializable {

    // variables for storing our data
    private String mProductId, mProductDescription, mProductUpc,mProductPcsPerBox, mProductTimeAdded, mUserKey, mUniqueIdentifier, mImageUri, mProductOwner;

    public Products()
    {
        // empty constructor
        // required for Firebase
    }

    // Constructor for all variables
    public Products(String _productId, String _productDescription, String _productUpc, String _productPcsPerBox, String _productTimeAdded, String _userKey, String _productOwner, String _imageUri)
    {
        mProductId = _productId;
        mProductDescription = _productDescription;
        mProductUpc = _productUpc;
        mProductPcsPerBox = _productPcsPerBox;
        mProductTimeAdded = _productTimeAdded;
        mUserKey = _userKey;
        mProductOwner = _productOwner;
        mImageUri = _imageUri;
    }

    // getter methods for all variables
    public String getProductId() {
        return mProductId;
    }
    public String getProductDescription() {
        return mProductDescription;
    }
    public String getProductUpc() {
        return mProductUpc;
    }
    public String getProductPcsPerBox() {
        return mProductPcsPerBox;
    }
    public String getProductTimeAdded() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        SimpleDateFormat currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        currentTime.setTimeZone(TimeZone.getTimeZone("EST"));

        return currentTime.format(calendar.getTime());
    }
    public String getUserKey() {
        return mUserKey;
    }
    public String getProductOwner() {
        return mProductOwner;
    }
    public String getImageUri() {
        return mImageUri;
    }
    public String getUniqueIdentifier() {
        return mUniqueIdentifier;
    }

    // setter method for all variables
    public void setProductId(String productId) {
        mProductId = productId;
    }
    public void setProductDescription(String productDescription) {
        mProductDescription = productDescription;
    }
    public void setProductUpc(String productUpc) {
        mProductUpc = productUpc;
    }
    public void setProductPcsPerBox(String productPcsPerBox) {
        mProductPcsPerBox = productPcsPerBox;
    }
    public void setProductTimeAdded() {
       mProductTimeAdded = getProductTimeAdded();
    }
    public void setUserKey(String userKey) {
        mUserKey = userKey;
    }
    public void setProductOwner(String productOwner) {
        mProductOwner = productOwner;
    }
    public void setImageUri(String imageUri) {
        mImageUri = imageUri;
    }
}
