package com.yan.api.service;

import com.yan.api.domain.User;

import java.util.Collection;

public interface UserService {

    User save(User user);

    Collection<User> findAll();
}
