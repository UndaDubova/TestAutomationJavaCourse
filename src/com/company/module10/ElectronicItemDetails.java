package com.company.module10;

import java.util.HashMap;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 345d);
        itemHashMap.put("Refrigerator", 443d);
        itemHashMap.put("Washing Machine", 565d);
        itemHashMap.put("Laptop", 2001d);

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));

    }

    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }

}
