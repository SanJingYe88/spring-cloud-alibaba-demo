package it.com.nc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   // 通过该注解实现配置的自动刷新
public class ConfigController {

    @Value("${config.info}")
    private String info;    //读取配置文件中的 config.info 的值

    @GetMapping("info")
    public String info(){
        return  info;
    }
}
