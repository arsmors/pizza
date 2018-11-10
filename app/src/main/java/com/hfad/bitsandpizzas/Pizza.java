package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;
    private String info;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo, "pizza pizza"),
            new Pizza("Funghi", R.drawable.funghi, "pizza pizza"),
            new Pizza("Studentu", R.drawable.studentu, "pizza pizza")
    };

    private Pizza(String name, int imageResourceId, String info) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.info = info;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getInfo() {
        return info;
    }
}
