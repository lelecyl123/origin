package com.unicom.permissions.service;

import com.unicom.permissions.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Map likeName(long id){
        return userMapper.getOne(id);
    }


}
