package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonItemEntityTest {

    @Test
    void commonItemEntityTester() {
        CommonItemEntity commonItem = new CommonItemEntity();
        assertNotNull(commonItem);
    }
}
