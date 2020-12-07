package ru.grandstep.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.grandstep.school.model.User;
import ru.grandstep.school.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User getById(Integer id){
        if(id == null || id <= 0){
            throw new RuntimeException("Wrong id");
        }
        return userRepository.getById(id);
    }
    public List<User> getAll(){
        return userRepository.getAll();
    }
    public User saveOrUpdate(User user){
        return userRepository.saveOrUpdate(user);
    }
}
