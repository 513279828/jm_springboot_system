package com.qfedu.dto;

import lombok.Data;

@Data
public class ArticleQueryDto {
    private int type;//资讯的类型
    private String title;//标题
    private int page;//当前页码
    private int size;//每页显示的数量
}
