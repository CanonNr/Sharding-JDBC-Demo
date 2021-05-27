package cn.lksun.test.mybatisplusshardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    @TableId()
    public Long id;

    public String name;

    public Integer groupId;

    public Integer Status;


}
