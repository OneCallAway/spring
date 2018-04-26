package spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * @author OneCallAway
 * @create 2018-04-11 下午7:17
 * @desc test1
 **/

public class spring_IOC {
    /** 
    * @author OneCallAway 18-4-16 
    * @time 上午9:41 
    * @method 通过工厂类得到IOC容器创建的对象
    * @param  
    * @return  
    * @version V1.0.0 
    * @description  
    */
    @Test
    public void testIOC() throws Exception{
        //创建对象
//        user user = new user();

        //spring的IOC容器创建对象
        Resource resource = new ClassPathResource("spring/applicationContext.xml");

        //创建容器对象(Bean的工厂),IOC容器=工厂类+bean.xml
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        //得到容器创建的对象
        User user = (User) beanFactory.getBean("user");

        System.out.println(user);
    }

    @Test
    public void testAc() throws Exception{
        //得到IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        //获取bean
        User user = (User) ac.getBean("user");

        System.out.println(user);


    }
}
