package spring_anno2.action;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import spring_anno2.service.UserService;

import javax.annotation.Resource;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午3:36
 * @desc action
 **/

//@Component("userAction")
//@Component
    @Controller  //控制层组件
public class UserAction {

//    @Resource(name = "userService")
    @Resource
    private UserService userService;

    public String execute(){
        userService.save();
        return null;
    }
}
