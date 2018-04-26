package spring_property.service;

import spring_property.dao.UserDao;

/**
 * @author OneCallAway
 * @create 2018-04-18 下午7:35
 * @desc service
 **/

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
