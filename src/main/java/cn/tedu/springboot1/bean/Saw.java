package cn.tedu.springboot1.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@Accessors(chain = true)
@Data
public class Saw implements Serializable,Tool {
    private String name="烈火锯";

    @Override
    public String toString() {
        return name;
    }
}
