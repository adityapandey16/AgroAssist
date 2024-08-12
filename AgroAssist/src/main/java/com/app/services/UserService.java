package com.app.services;

import java.util.List;
import com.app.entities.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
    // Other user-specific methods
}
