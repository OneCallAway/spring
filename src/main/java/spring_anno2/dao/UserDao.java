package spring_anno2.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午3:28
 * @desc dao
 **/


//@Component("userDao")
//    @Component
//    @Repository //在持久层可以选择用


    /**
     * 注解和xml配置文件可以同时使用
     *
     */
    public class UserDao {

        public UserDao(){
            System.out.println("UserDao.UserDao()");
        }

        public UserDao(int id){
            System.out.println("UserDao.UserDao(int id)" + id);
        }
    public void save(){
        System.out.println("DB:保存数据");
    }
}
