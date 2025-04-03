package mapper;

import dto.CommonUserDTO;
import entity.CommonUserEntity;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.instancio.Select.field;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ObjectConverterImpl.class})
class ObjectConverterTest {

    ObjectConverter objectConverter = Mappers.getMapper(ObjectConverter.class);

    @Test
    void objectConverterNullTest() {
        CommonUserDTO exportedUserDTO = objectConverter.exportDto(null);
        CommonUserEntity exportedUser = objectConverter.exportEntity(null);

        assertNull(exportedUser);
        assertNull(exportedUserDTO);
    }

    @Test
    void objectConverterTester() {
        CommonUserEntity commonUser = Instancio.of(CommonUserEntity.class)
                .set(field(CommonUserEntity::getUserId),"1000")
                .set(field(CommonUserEntity::getFirstName), "John")
                .set(field(CommonUserEntity::getLastName), "Doe")
                .create();

        CommonUserDTO commonUserDTO = Instancio.of(CommonUserDTO.class)
                .set(field(CommonUserDTO::getUserId), "1000")
                .set(field(CommonUserDTO::getFirstName), "John")
                .set(field(CommonUserDTO::getLastName), "Doe")
                .create();

        CommonUserDTO exportedUserDTO = objectConverter.exportDto(commonUser);
        CommonUserEntity exportedUser = objectConverter.exportEntity(commonUserDTO);

        assertEquals(commonUser.getUserId(), exportedUserDTO.getUserId());
        assertEquals(commonUser.getFirstName(), exportedUserDTO.getFirstName());
        assertEquals(commonUser.getLastName(), exportedUserDTO.getLastName());
        assertEquals(commonUserDTO.getUserId(), exportedUser.getUserId());
        assertEquals(commonUserDTO.getFirstName(), exportedUser.getFirstName());
        assertEquals(commonUserDTO.getLastName(), exportedUser.getLastName());
    }
}
