package spring_anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_anno.action.UserAction;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午2:16
 * @desc 注解
 **/

public class anno {

    //创造容器对象
    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean_anno.xml");

    @Test
    public void test3(){
        UserAction userAction = (UserAction) ac.getBean("userAction");

        userAction.execute();
    }
}
