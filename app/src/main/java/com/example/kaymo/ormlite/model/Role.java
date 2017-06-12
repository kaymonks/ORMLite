package com.example.kaymo.ormlite.model;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by kaymo on 10/06/2017.
 */

public class Role {

    public static final String TABLE_NAME_ROLES = "roles";
    public static final String FIELD_NAME_ID    = "id";
    public static final String FIELD_NAME_ROLE  = "role_nome";

    private int mId;

    private String mRoleName;

    public Role(final String roleName) {
        mRoleName = roleName;
    }

    public int getId() {
        return mId;
    }

    public String getRoleName() {
        return mRoleName;
    }

    public Role setRoleName(final String roleName) {
        mRoleName = roleName;
        return this;
    }
}
