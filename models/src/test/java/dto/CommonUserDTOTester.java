package dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonUserDTOTester {

    @Test
    void commonUserDTOTest() {
        CommonUserDTO commonUserDTO = new CommonUserDTO();

        assertNotNull(commonUserDTO);
    }
}
