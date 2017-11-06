package com.zxg;

import com.zxg.core.BasePathExposer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan("com.zxg.mapper")
@SpringBootApplication
public class ZxgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxgApplication.class, args);
    }

    /**
     * 生成全局路径
     *
     * @return BasePathExposer
     */
    @Bean(initMethod = "init")
    public BasePathExposer getBasePathExposer() {
        return new BasePathExposer();
    }
}
