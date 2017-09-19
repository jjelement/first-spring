package th.in.gamer.service;

import th.in.gamer.web.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findAll();
    UserDTO findById(int id);

    boolean saveUser(UserDTO user);
    UserDTO updateUser(UserDTO user);

    boolean deleteById(int id);
}
