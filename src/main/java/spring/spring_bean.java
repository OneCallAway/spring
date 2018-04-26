package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OneCallAway
 * @create 2018-04-16 上午10:08
 * @desc 多个对象的创建
 **/

public class spring_bean {

//    得到IOC容器对象
//    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean.xml");

    /**
     * 1):对象创建:单例/多例
     * @throws Exception
     * scope="singleton" 默认是单例      [service/dao/工具类]
     * scope="prototype" 多例           [action对象]
     *
     *
     * 2):什么时候创建
     * scope="singleton" 在启动(容器初始化之前),就已经创建了bean,且整个应用只有一个
     * scope="prototype" 在用到对象的时候才创建对象
     *
     * 3):是否延迟创建
     *  lazy-init="false" 默认为false,不延迟加载,即在创建的时候就启动
     *  lazy-init="true" 延迟初始化.在用到对象的时候才创建对象
     *
     * 4):创建对象之后初始化或者销毁
     *  init-method="init_user"         在对象创建后执行
     *  destory-method="destory_user"       在调用destory方法的时候执行,要使用实现类
     */
    @Test
    public void testIOC() throws Exception{
        //得到IOC容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        System.out.println("----容器创建----");
        //从容器获得对象
        User user1 = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");

        System.out.println(user1);
        System.out.println(user2);

        ac.destroy();
    }
}
