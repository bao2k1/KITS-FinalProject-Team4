package kits.edu.final_project.service.imp;

import kits.edu.final_project.entity.UserEntity;
import kits.edu.final_project.payload.request.SignupRequest;
import kits.edu.final_project.payload.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface UserServiceImp {
    boolean addUser(SignupRequest request);
    List<UserResponse> getAllUsers();
    UserEntity addNewUser(@RequestBody UserEntity userEntity);
    UserEntity replaceUserById(@RequestBody UserEntity userEntity, @PathVariable int id);
}
