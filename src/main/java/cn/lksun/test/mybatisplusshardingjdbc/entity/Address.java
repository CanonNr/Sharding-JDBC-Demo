package cn.lksun.test.mybatisplusshardingjdbc.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Address implements Serializable {
    private Long id;

    private String address;

    private Long userId;

    private Integer groupId;

}