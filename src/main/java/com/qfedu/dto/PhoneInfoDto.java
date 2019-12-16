package com.qfedu.dto;

import lombok.Data;

// 用于view层和service传输数据
@Data
public class PhoneInfoDto {
    private String phonename;
    private String brand;
    private String quantity;
    private String icon;
}
