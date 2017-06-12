package com.example.kaymo.ormlite.model;

/**
 * Created by kaymo on 10/06/2017.
 */

public class Project {

    public static final String TABLE_NAME_PROJECTS = "projects";

    public static final String FIELD_NAME_ID   = "id";
    public static final String FIELD_NAME_NAME = "name";

    private int mId;

    private String mName;

    public Project() {
        // Don't forget the empty constructor, needed by ORMLite.
    }

    /** Getters & Setters **/

    public int getId() {
        return mId;
    }

    public Project setId(final int id) {
        mId = id;
        return this;
    }

    public String getName() {
        return mName;
    }

    public Project setName(final String name) {
        mName = name;
        return this;
    }
}
