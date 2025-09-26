package edu.icet.service;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;

public interface UserService {
    UserEntity registerUser(User user);
}
