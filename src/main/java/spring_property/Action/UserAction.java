package spring_property.Action;

import spring_property.service.UserService;

/**
 * @author OneCallAway
 * @create 2018-04-23 上午11:21
 * @desc service:springIOC容器注入
 **/

public class UserAction {
    private UserService userservice;

    public void setUserservice(UserService userservice) {
        this.userservice = userservice;
    }

    public String execute(){
        userservice.save();
        return null;
    }
}
