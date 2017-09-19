package th.in.gamer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import th.in.gamer.domain.UserEntity;
import th.in.gamer.web.dto.UserDTO;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserEntity> toEntities(List<UserDTO> users);
    List<UserDTO> toDTOs(List<UserEntity> entities);

    UserEntity toEntity(UserDTO user);
    UserDTO toDTO(UserEntity entity);
}
