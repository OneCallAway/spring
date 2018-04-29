package spring_anno.action;

import org.springframework.stereotype.Component;
import spring_anno.service.UserService;

import javax.annotation.Resource;

/**
 * @author OneCallAway
 * @create 2018-04-29 下午2:18
 * @desc action
 **/

@Component("userAction")
public class UserAction {

    @Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute(){
        userService.save();
        return null;
    }
}
