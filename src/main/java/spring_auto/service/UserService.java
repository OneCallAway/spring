package spring_auto.service;

import spring_auto.dao.UserDao;

/**
 * @author OneCallAway
 * @create 2018-04-26 下午1:59
 * @desc service
 **/

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();
    }
}
