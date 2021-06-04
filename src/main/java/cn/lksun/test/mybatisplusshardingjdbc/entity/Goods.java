package cn.lksun.test.mybatisplusshardingjdbc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {

    private Integer id;

    private String name;

    private Integer num;

    private String status;

    private Integer pid;

    private static final long serialVersionUID = 1L;
}