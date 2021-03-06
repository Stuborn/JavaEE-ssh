package cn.edu.zjut.action;

import cn.edu.zjut.po.AccountEntity;
import cn.edu.zjut.service.IUserService;

public class UserAction {
    private AccountEntity loginUser;
    private IUserService userService = null;

    public AccountEntity getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(AccountEntity loginUser) {
        this.loginUser = loginUser;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 注册
     * @return result
     */
    public String register() {
        if(userService.register(loginUser)){
            return "success";
        }
        return "fail";
    }
    /**
     * 登录
     * @return result
     */
    public String login() {
        if(userService.login(loginUser)){
            return "success";
        }
        return "fail";
    }

}