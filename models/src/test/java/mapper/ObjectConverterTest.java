package mapper;

import dto.CommonUserDTO;
import entity.CommonUserEntity;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

class ObjectConverterTest {

    @Test
    void objectConverterTester() {
        CommonUserEntity commonUser = Instancio.of(CommonUserEntity.class).create();
        CommonUserDTO commonUserDTO = Instancio.of(CommonUserDTO.class).create();
    }
}
