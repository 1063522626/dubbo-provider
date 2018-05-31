package com.demo;

import com.demo.dubbo.UserService;

/**
 * Created by lubo3 on 2018/5/30.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi(String name) {

        return "hello"+name;
    }
}
