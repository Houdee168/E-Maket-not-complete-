package com.company;

import javax.swing.table.TableModel;

public class Category {
    static String ACCESSORY = "All Departments";
    static String ARTS_AND_CRAFTS = "Arts & Crafts";
    static String AUTOMOTIVE = "Automotive";
    static String BABY_STORE = "Baby";
    static String BEAUTY = "Beauty & Personal Care";
    static String Computer = "Computers";
    static String ELECTRONIC = "Electronics";
    static String WOMEN = "Woman's Fashion";
    static String MEN = "Men's Fashion";
    static String HOUSEHOLD = "Health & Household";
    static String SPORT = "Sports & Outdoors";
    static String TOOL = "Tools & Home Improvement";


    public static String[] getAll(){
        return new String[]{ACCESSORY,ARTS_AND_CRAFTS,AUTOMOTIVE,BABY_STORE,BEAUTY,Computer,ELECTRONIC,WOMEN,MEN,HOUSEHOLD,SPORT, TOOL};
    }
}
