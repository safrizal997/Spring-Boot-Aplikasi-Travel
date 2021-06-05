package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.entity.User;
import com.rzlproject.travelappsservice.model.UserRequest;
import com.rzlproject.travelappsservice.repository.ShuttelRepository;
import com.rzlproject.travelappsservice.repository.UserRepository;
import com.rzlproject.travelappsservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ShuttelRepository shuttelRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> findUserId = userRepository.findById(userId);
        return findUserId.orElse(null);
    }

    @Override
    public User addUser(UserRequest userRequest) {
        User user = new User();
        return saveUser(userRequest,user);
    }

    @Override
    public User updateUser(UserRequest userRequest, Long userId) {
        Optional<User> findUserId = userRepository.findById(userId);
        if (findUserId.isPresent()){
            User user = findUserId.get();

            return saveUser(userRequest, user);
        }
        return null;
    }

    private User saveUser (UserRequest userRequest, User user){
        user.setUserName(userRequest.getUserName());
        user.setPassword(userRequest.getPassword());
        user.setNama(userRequest.getNama());
        Optional<Shuttle> findShutleId = shuttelRepository.findById(userRequest.getShuttleId());
        if (findShutleId.isPresent()){
            user.setShuttleId(findShutleId.get());
            user.setLevel(userRequest.getLevel());

            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public String deleteById(Long userId) {

        Optional<User> findUserId = userRepository.findById(userId);
        if (findUserId.isPresent()){
            userRepository.deleteById(userId);
            return "Delete Complete";
        }
        return "ID Not Found";
    }
}
