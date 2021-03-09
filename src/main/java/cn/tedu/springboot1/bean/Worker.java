package cn.tedu.springboot1.bean;

import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

@Component
@Accessors(chain = true)
@Slf4j
public class Worker implements Serializable {
    private String name="秃头强";
    @Resource
    private Tool tool;

    public void work(){
        log.debug("{}使用{}砍树",name,tool);

    }

}
