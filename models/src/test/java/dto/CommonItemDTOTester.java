package dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonItemDTOTester {

    @Test
    void commonItemDTOTest() {
        CommonItemDTO commonItemDTO = new CommonItemDTO();

        assertNotNull(commonItemDTO);
    }
}
