package dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonUserDTOTest {

    @Test
    void commonUserDTOTester() {
        CommonUserDTO commonUserDTO = new CommonUserDTO();
        assertNotNull(commonUserDTO);
    }
}
