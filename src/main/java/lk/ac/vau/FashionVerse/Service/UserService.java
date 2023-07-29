package lk.ac.vau.FashionVerse.Service;

import java.util.List;

import lk.ac.vau.FashionVerse.Model.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByEmail(String email); 
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);

    
    User loginUser(String email, String password);
}
