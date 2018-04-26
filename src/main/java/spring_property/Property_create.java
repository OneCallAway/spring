package spring_property;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.User;
import spring_property.Action.UserAction;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午5:44
 * @desc 对象属性
 **/

public class Property_create {
    //创建容器对象
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean_property.xml");

    @Test
    public void test(){

        //从容器获取对象
         user user = (user) ac.getBean("user");

        System.out.println(user);
    }

    @Test
    public void UserAction(){
        UserAction userAction = (UserAction) ac.getBean("userAction");

        userAction.execute();
    }
}
