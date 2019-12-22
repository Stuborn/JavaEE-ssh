package cn.edu.zjut.service;

import cn.edu.zjut.dao.IAccountDAO;
import cn.edu.zjut.po.AccountEntity;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

public class UserService implements IUserService {
    private IAccountDAO accountDao = null;
    private Map<String, Object> request, session;


    public UserService() {
        System.out.println("create UserService.");
    }

    public void setAccountDao(IAccountDAO accountDao) {
        System.out.println("--setAccountDao--");
        this.accountDao = accountDao;
    }

    /**
     * 用户注册
     *
     * @param user account
     * @return 注册结果
     */
    public boolean register(AccountEntity user) {
        System.out.println("execute --register()-- method.");

        try {
            accountDao.save(user);
            return true;
        } catch (Exception e) {
            ActionContext ctx = ActionContext.getContext();
            session = (Map) ctx.getSession();
            request = (Map) ctx.get("request");
            request.put("tip", "注册失败！");
            System.out.println("register error!!!");
            return false;
        }
    }

    /**
     * 用户登录
     *
     * @param user account
     * @return 登陆结果
     */
    public boolean login(AccountEntity user) {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        System.out.println("execute --login()-- method.");
        List list = accountDao.findByAccount(user);
        if (list.isEmpty()) {
            request.put("tip", "登录失败，请检查用户名和密码！");
            return false;
        } else {
            request.put("tip", "登录成功！");
            user = (AccountEntity) list.get(0);
            session.put("user", user);
            return true;
        }
    }
}