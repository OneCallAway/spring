package spring_anno.service;

import org.springframework.stereotype.Component;
import spring_anno.dao.UserDao;

import javax.annotation.Resource;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午2:17
 * @desc service
 **/

@Component("userService")
public class UserService {


    /**
     * Resource注入属性
     * 会从IOC容器找到userDao对象,注入到当前字段
     * 相当于
     * <bean id = "UserService" class = "..">
     *      <property name = "userDao" ref = "userDao"></property>
     * </bean>
     */
    @Resource(name = "userDao")
    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();
    }
}
