package mapper;

import dto.CommonUserDTO;
import entity.CommonUserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ObjectConverter {
    CommonUserDTO exportDto(CommonUserEntity entity);
    CommonUserEntity exportEntity(CommonUserDTO commonUserDTO);
}