package cn.lksun.test.mybatisplusshardingjdbc.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;
import java.util.Collection;


/**
 * 自定义分区策略
 */
@Slf4j
@Component
public class UserPreciseUserLoginShardingAlgorithm implements PreciseShardingAlgorithm<Integer>{


    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        log.info("=======:" + JSON.toJSONString(availableTargetNames) + ",preciseShardingValue:" + JSON.toJSONString(shardingValue));
//        for (String name : availableTargetNames) {
//            System.out.println("gg:"+shardingValue.getValue());
            if (shardingValue.getValue() == 6) {
                return "user_6";
            }
//        }
        return "user_1";
    }
}
