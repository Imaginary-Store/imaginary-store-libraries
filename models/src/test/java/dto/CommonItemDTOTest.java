package dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonItemDTOTest {

    @Test
    void commonItemDTOTester() {
        CommonItemDTO commonItemDTO = new CommonItemDTO();
        assertNotNull(commonItemDTO);
    }
}
