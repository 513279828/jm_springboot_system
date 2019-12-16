package com.qfedu.phone.entity;

import lombok.Data;

@Data
public class Phone {
    private int id;
    private String phonename;
    private String brand;
    private String memory;
    private String colour;
    private String quantity;
    private double price;
    private String icon;
}
