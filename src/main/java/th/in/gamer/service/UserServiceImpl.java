package th.in.gamer.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.in.gamer.domain.UserEntity;
import th.in.gamer.mapper.UserMapper;
import th.in.gamer.repository.UserRepository;
import th.in.gamer.web.dto.UserDTO;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public List<UserDTO> findAll() {
        List<UserEntity> entities = userRepository.findAll();
        List<UserDTO> users = mapper.toDTOs(entities);
        return users;
    }

    @Override
    public UserDTO findById(int id) {
        UserEntity entity = userRepository.findById(id);
        UserDTO user = mapper.toDTO(entity);
        return user;
    }

    @Override
    public boolean saveUser(UserDTO user) {
        UserEntity entity = mapper.toEntity(user);
        entity = userRepository.save(entity);
        return entity != null;
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        UserEntity entity = mapper.toEntity(user);
        entity = userRepository.save(entity);
        user = mapper.toDTO(entity);
        return user;
    }

    @Override
    public boolean deleteById(int id) {
        int result = userRepository.deleteByid(id);
        return result > 0;
    }
}
