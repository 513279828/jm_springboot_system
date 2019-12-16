package com.qfedu.phone.entity;

import java.util.List;

public class Page {

    private List<Phone> list;
    private int pageNum;

    private int total;

    private int pageSize;

    private int startIndex;

    private int pages;

    public Page(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
    }

    public List<Phone> getList() {
        return list;
    }

    public void setList(List<Phone> list) {
        this.list = list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        this.pages = total / pageSize;
        if (total % pageSize != 0) {
            pages = pages + 1;
        }
    }

    public int getPages() {
        return pages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

}
