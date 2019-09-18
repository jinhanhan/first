package com.daocheng.perfectmathematical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.daocheng.perfectmathematical.dao")
public class PerfectMathematicalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerfectMathematicalApplication.class, args);
    }

}
