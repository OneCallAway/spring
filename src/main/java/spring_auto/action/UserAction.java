package spring_auto.action;

import spring_auto.service.UserService;

/**
 * @author OneCallAway
 * @create 2018-04-26 下午2:01
 * @desc action
 **/
public class UserAction {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute(){
        userService.save();
        return null;
    }
}
