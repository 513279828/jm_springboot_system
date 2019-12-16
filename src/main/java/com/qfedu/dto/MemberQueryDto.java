package com.qfedu.dto;

import lombok.Data;

@Data
public class MemberQueryDto {
    private int page;
    private int size;
    private String name;
    private int sex;
}