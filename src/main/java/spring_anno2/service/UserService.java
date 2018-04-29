package spring_anno2.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring_anno2.dao.UserDao;

import javax.annotation.Resource;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午3:30
 * @desc service
 **/

//@Component("userService")
//    @Component //加入IOC容器的UserDao对象的引用名称,默认与类名一致,,且第一个字母小写

    @Service //业务逻辑层组件
public class UserService {
//    @Resource(name = "userDao")  根据名字查到

    @Resource  //去容器中找userDao类型的变量,找到就赋值  根据类型查找<在容器中要确保该类型只有一个>
    private UserDao userDao;

    public void save(){
        userDao.save();
    }
}
