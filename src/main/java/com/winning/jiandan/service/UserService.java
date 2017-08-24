package com.winning.jiandan.service;

import com.github.pagehelper.PageHelper;
import com.winning.jiandan.mapper.UserMapper;
import com.winning.jiandan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhouhangbo on 2017/8/23.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> query() {
        PageHelper.startPage(2, 1);
        return userMapper.selectAll();
    }

    @Transactional
    public void save(User user) {
        userMapper.insert(user);
    }

    @Transactional
    public void test() {
        User u1 = new User();
        User u2 = new User();
        u1.setName("周航波2");
        u2.setName("周航波3");
        this.save(u1);
        this.save(u2);
        throw new RuntimeException();
    }
}
