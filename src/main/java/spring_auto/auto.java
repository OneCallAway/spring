package spring_auto;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_auto.action.UserAction;


/**
 * @author OneCallAway
 * @create 2018-04-26 下午1:49
 * @desc 自动装配
 **/

public class auto {
    //创建容器对象
    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean_auto.xml");

    @Test
    public void test2(){
        //从容器中获取Action
        UserAction userAction = (UserAction) ac.getBean("userAction");

        userAction.execute();
    }
}