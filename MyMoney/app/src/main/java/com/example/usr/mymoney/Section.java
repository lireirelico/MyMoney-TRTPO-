package com.example.usr.mymoney;

/**
 * Created by usr on 30.11.2017.
 */

public class Section {
    protected String name;
    protected int imageId;
    protected String amount;

    public Section(String name, int imageId, String amount){
        this.name = name;
        this.imageId = imageId;
        this.amount =  amount;
    }
}