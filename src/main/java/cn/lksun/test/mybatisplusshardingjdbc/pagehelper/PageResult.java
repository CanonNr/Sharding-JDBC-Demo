package cn.lksun.test.mybatisplusshardingjdbc.pagehelper;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    //当前页
    private int pageNum;

    //每页的数量
    private int pageSize;

    //当前页的数量
    private int size;

    //总页数
    private int pages;

    private List<T> list;

    public PageResult(List<T> list,int pageNum, int pageSize, int size, int pages) {
        this.list = list;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.size = size;
        this.pages = pages;
    }
}
