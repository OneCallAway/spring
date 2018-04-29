package spring_anno.dao;

import org.springframework.stereotype.Component;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午2:17
 * @desc dao
 **/

/**
 * Component 把当前对象加入IOC容器
 */
@Component("userDao")    //相当于bean.xml中的 <bean id = "UserDao" class = "..."/>
public class UserDao {
    public void save(){
        System.out.println("DB:保存用户");
    }
}
