package cn.tedu.springboot1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor//无参构造
@AllArgsConstructor//全部参数构造器
@Accessors(chain=true)//实现set方法的链式写法
public class User {
    private Integer id;
    private String name;

}
