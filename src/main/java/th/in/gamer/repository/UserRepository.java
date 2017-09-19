package th.in.gamer.repository;

import org.springframework.data.repository.CrudRepository;
import th.in.gamer.domain.UserEntity;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findAll();
    UserEntity findById(int id);
    UserEntity save(UserEntity entity);
    int deleteByid(int id);
}
