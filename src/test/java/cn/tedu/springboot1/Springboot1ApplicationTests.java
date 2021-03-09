package cn.tedu.springboot1;

import cn.tedu.springboot1.bean.DemoBean;
import cn.tedu.springboot1.bean.User;
import cn.tedu.springboot1.bean.Worker;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * springboot 整合了junit5
 * 1.测试类需要和启动类在相同的包
 * 2.需要标注
 * 3.可以注入spring中的javabean对象
 * 4.测试类方法可以不用public
 */
@SpringBootTest
@Slf4j//Lombok 提供的日志工具 添加以后当前类中就有了log对象
class Springboot1ApplicationTests {
    @Resource
    DemoBean demoBean;
    @Resource
    Worker worker;
    @Test
    void contextLoads() {
        System.out.println(demoBean);
    }
    @Test
    void testWorker(){
        worker.work();
    }
    @Test
    void testLombok(){
        User user1=new User();
        user1.setId(1);
        user1.setName("Tom");
        log.debug("user1:{}",user1);
        User user2=new User();
        user2.setId(1);
        user2.setName("Tom");
        log.debug("user1.equals(user2):{}",user1.equals(user2));
        User user=new User(2,"Jerry");
        log.debug("user:{}",user);
        //利用链式API（函数式编程）创建对象
        //更方便维护 更不容易错误 可以无序赋值
        User user3=new User().setId(5).setName("熊大");
        log.debug("user3:{}",user3);
    }
}
