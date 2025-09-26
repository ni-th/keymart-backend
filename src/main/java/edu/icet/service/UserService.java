package edu.icet.service;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface UserService {
    User registerUser(User user);
    User updateUser(Integer id, User updatedUser);
    void deleteUser(Integer id);
    List<User> findAllUsers();
}
