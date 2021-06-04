//package cn.lksun.test.mybatisplusshardingjdbc.pagehelper;
//
//import com.github.pagehelper.ISelect;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//
//public class UnPageHelper {
//    public static <T> PageResult<T> doSelect(pageEntity pageEntity, ISelect select){
//        PageInfo<T> pageInfo = PageHelper.
//                startPage(pageEntity.getPageNum(), pageEntity.getPageSize()).
//                doSelectPageInfo(select);
//        return new PageResult<T>(pageInfo.getList(),pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getSize(),pageInfo.getPages());
//    }
//
//    public static <T> PageResult<T> doSelect(Integer pageNum,Integer pageSize, ISelect select){
//        PageInfo<T> pageInfo = PageHelper.
//                startPage(pageNum, pageSize).
//                doSelectPageInfo(select);
//        return new PageResult<T>(pageInfo.getList(),pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getSize(),pageInfo.getPages());
//    }
//}
