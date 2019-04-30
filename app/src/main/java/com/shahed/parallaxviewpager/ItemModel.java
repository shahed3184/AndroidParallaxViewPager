package com.shahed.parallaxviewpager;

import java.util.ArrayList;
import java.util.List;


public class ItemModel {

    private String name;
    private String description;
    private String firstLetter;

    public ItemModel(String name, String description) {
        this.name = name;
        this.firstLetter = String.valueOf(name.charAt(0));
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public static List<ItemModel> prepareDesserts(String[] names, String[] descriptions) {
        List<ItemModel> itemModels = new ArrayList<>(names.length);

        for (int i = 0; i < names.length; i++) {
            ItemModel itemModel = new ItemModel(names[i], descriptions[i]);
            itemModels.add(itemModel);
        }

        return itemModels;
    }
}
