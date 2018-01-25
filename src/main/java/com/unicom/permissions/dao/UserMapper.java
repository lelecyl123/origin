package com.unicom.permissions.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    public List<Map> getAll();
    @Select("SELECT * FROM USERS WHERE USER_ID=#{id}")
    public Map getOne(Long id);

    public void insert(Map user);

    public void update(Map user);

    public void delete(Long id);
}
