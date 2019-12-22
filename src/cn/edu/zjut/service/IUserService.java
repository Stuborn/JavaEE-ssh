package cn.edu.zjut.service;

import cn.edu.zjut.po.AccountEntity;

public interface IUserService {
    boolean register(AccountEntity user);
    boolean login(AccountEntity user);
}
