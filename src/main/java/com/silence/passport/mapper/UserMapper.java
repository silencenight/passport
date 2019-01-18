package com.silence.passport.mapper;

import com.silence.passport.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Silence
 * @create 2019-01-17 11:54
 */
@Component
public interface UserMapper {

    int add(User user);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKey(User user);

    User findByPrimaryKey(String id);

    List<User> findAll();
}
