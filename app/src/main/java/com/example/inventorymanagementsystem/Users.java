package com.example.inventorymanagementsystem;

import java.io.Serializable;

public class Users implements Serializable {

    private String mFirstName, mLastName, mUserKey, mEmail, mSystemId;
    private boolean mIsAdmin;

    public Users()
    {
        // empty constructor
        // required by Firebase
    }

    // Constructors for all variables
    public Users(String _firstName, String _lastName, String _userKey, String _email, boolean _isAdmin) {
        mFirstName = _firstName;
        mLastName = _lastName;
        mUserKey = _userKey;
        mEmail = _email;
        mIsAdmin = _isAdmin;
    }

    // getters

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getUserKey() {
        return mUserKey;
    }

    public String getEmail() {
        return mEmail;
    }
    public String getSystemId() {
        return mSystemId;
    }
    public boolean getIsAdmin() {
        return mIsAdmin;
    }
    // setters

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public void setUserKey(String userKey) {
        mUserKey = userKey;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
    public void setIsAdmin(boolean isAdmin) {
        mIsAdmin = isAdmin;
    }
    public void setSystemId(String systemId) {
        mSystemId = systemId;
    }
}
