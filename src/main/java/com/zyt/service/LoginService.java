package com.zyt.service;

import com.zyt.entity.User;
import com.zyt.utils.ResponseResult;

/**
 * @className: LoginService
 * @author: Tao_zy
 * @date: 2023/7/1
 **/
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
