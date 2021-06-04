package cn.lksun.test.mybatisplusshardingjdbc.mapper;

import cn.lksun.test.mybatisplusshardingjdbc.entity.Goods;
import cn.lksun.test.mybatisplusshardingjdbc.pagehelper.pageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface GoodsMapper {
//    List<Goods> selectAll(@Param("name") String name, @Param("page") pageEntity page);
    List<Goods> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}