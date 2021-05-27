package cn.lksun.test.mybatisplusshardingjdbc.config;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自定义主键生成不生效?
 *
 * 因为Sharding-JDBC
 * 最终采用了以JDBC接口来实现对于生成Id的访问，而将底层具体的Id生成实现分离出来。通过JDBC提供的API来获取。
 *
 * 所以如果使用mybatis insert标签 需要使用 useGeneratedKeys
 * useGeneratedKeys | （仅对 insert 和 update 有用）这会令 MyBatis 使用 JDBC 的 getGeneratedKeys 方法来取出由数据库内部生成的主键（比如：像 MySQL 和 SQL Server 这样的关系数据库管理系统的自动递增字段），默认值：false。
 *
 * https://github.com/apache/shardingsphere/issues/556
 **/
@Component
public class AutoKeyGenerator implements ShardingKeyGenerator {

    private final AtomicInteger count = new AtomicInteger();

    @Override
    public Comparable<?> generateKey() {
        return (int) (Math.random() * 1000);
    }

    @Override
    public String getType() {
        return "MyRule";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
