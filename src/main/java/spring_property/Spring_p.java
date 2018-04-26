package spring_property;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.User;
import spring_property.Action.UserAction;

/**
 * @author OneCallAway
 * @create 2018-04-23 下午7:51
 * @desc p名称空间
 **/

public class Spring_p {
//    创建容器对象
    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean_p.xml");

    @Test
    public void test1(){

        UserAction userAction = (UserAction) ac.getBean("UserAction");

        userAction.execute();

        System.out.println(ac.getBean("user"));
    }
}
