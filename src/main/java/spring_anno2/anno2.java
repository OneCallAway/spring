package spring_anno2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import spring_anno2.action.UserAction;

import javax.annotation.Resource;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午3:28
 * @desc 注解
 **/

public class anno2 {

    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean_anno2.xml");

    @Test
    public void test4(){
        UserAction userAction = (UserAction) ac.getBean("userAction");

        userAction.execute();
    }
}
