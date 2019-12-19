package cn.edu.zjut.service;

import cn.edu.zjut.po.Account;

public interface IUserService {
    boolean register(Account user);
    boolean login(Account user);
}
