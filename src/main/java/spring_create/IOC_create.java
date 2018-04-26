package spring_create;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.User;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午2:45
 * @desc IOC容器创建对象
 **/

public class IOC_create {

    @Test
    public void IOC() throws Exception{
        //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean.xml");

        //获取容器对象
        user user = (user) ac.getBean("user");

        System.out.println(user);
    }
}
