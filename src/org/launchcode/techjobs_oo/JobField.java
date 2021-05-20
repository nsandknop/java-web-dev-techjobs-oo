package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
private int id;
private static int nextId = 1;
private String value;

public JobField(){
    id = nextId;
    nextId++;
}

public JobField (String aValue){
    this();
    this.value = aValue;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField JobField = (JobField) o;
        return getId() == JobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
    //}


    public String getValue() {

    return value;
    }

    public void setValue(String value) {

    this.value = value;
    }
}
