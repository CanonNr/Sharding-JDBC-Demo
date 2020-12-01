package cn.lksun.test.mybatisplusshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lksun.test.mybatisplusshardingjdbc.mapper")
public class MybatisPlusShardingJDBCApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusShardingJDBCApplication.class, args);
    }

}
