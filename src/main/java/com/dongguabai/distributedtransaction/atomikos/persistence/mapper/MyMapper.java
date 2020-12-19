package com.dongguabai.distributedtransaction.atomikos.persistence.mapper;



/**
 * @author Dongguabai
 * @Description
 * @Date 创建于 2020-12-19 15:36
 */
public interface MyMapper<T> /*extends Mapper<T>, MySqlMapper<T>*/ {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
    //FIXME 最后在启动类中通过MapperScan注解指定扫描的mapper路径：
}
