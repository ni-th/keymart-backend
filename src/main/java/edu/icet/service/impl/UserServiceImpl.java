package edu.icet.service.impl;

import edu.icet.entity.UserEntity;
import edu.icet.dto.User;
import edu.icet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserEntity regiterUser(User user){
        UserEntity save = userRepository.save(modelMapper.map(user, UserEntity.class));
        return  save;
    }
    public UserEntity updateUser(UserEntity updatedUser) {
        return userRepository.save(modelMapper.map(updatedUser, UserEntity.class));
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
