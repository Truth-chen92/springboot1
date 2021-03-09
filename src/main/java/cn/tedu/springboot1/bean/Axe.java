package cn.tedu.springboot1.bean;

import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Accessors(chain = true)
public class Axe implements Serializable,Tool {
    private String name="小老斧";

}
