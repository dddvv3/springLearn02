package org.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setTypeAliasesPackage("org.example.pojo");
        factory.setDataSource(dataSource);
        return factory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("org.example.dao");
        return msc;
    }
}
