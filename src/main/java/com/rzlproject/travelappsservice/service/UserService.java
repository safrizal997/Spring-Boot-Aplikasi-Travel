package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.User;
import com.rzlproject.travelappsservice.model.UserRequest;

import java.util.List;

public interface UserService {

List<User> getAllUser ();

User getUserById(Long userId);

User updateUser(UserRequest userRequest, Long userId);

String deleteById(Long userId);

}
