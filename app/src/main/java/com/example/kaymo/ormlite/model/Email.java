package com.example.kaymo.ormlite.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by kaymo on 10/06/2017.
 */


public class Email {

    public static final String TABLE_NAME_EMAIL = "emails";

    public static final String FIELD_NAME_ID = "id";
    public static final String FIELD_NAME_EMAIL = "email";
    public static final String FIELD_NAME_USER = "user";

    private int mId;

    private String mEmail;

    private User mUser;

    public Email() {
        //ORMLite precisa de um construtor vazio
    }

    public Email(User user) {
        mUser = user;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getEmail() {
        return mEmail;
    }

    public Email setEmail(final String mEmail) {
        this.mEmail = mEmail;
        return this;
    }

    public User getUser() {
        return mUser;
    }

    public Email setUser(User mUser) {
        this.mUser = mUser;
        return  this;
    }
}

