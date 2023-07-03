package com.zyt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MyConfig
 * @author: Tao_zy
 * @date: 2023/6/30
 **/
@Configuration
@MapperScan("com.zyt.mapper")
public class MyConfig {
}
