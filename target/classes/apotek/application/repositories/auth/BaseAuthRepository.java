/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apotek.application.repositories.auth;

import apotek.models.User;
import java.util.List;

/**
 *
 * @author Dukhaan
 */
public interface BaseAuthRepository {
    public User login(String username, String password) throws Exception;
    public void register(String username, String password, String role) throws Exception;
    public void updateUser(int index, User user) throws Exception;
    public void deleteUser(int index);
    public List<User> getAllUsers();
}
