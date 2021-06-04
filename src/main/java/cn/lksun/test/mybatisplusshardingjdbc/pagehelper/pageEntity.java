package cn.lksun.test.mybatisplusshardingjdbc.pagehelper;

import lombok.Data;

@Data
public class pageEntity {
    private Integer pageNum = 1;

    private Integer pageSize = 10;
}
