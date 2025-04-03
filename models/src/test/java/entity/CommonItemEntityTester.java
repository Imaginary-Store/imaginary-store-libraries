package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonItemEntityTester {

    @Test
    void commonItemEntityTester() {
        CommonItemEntity commonItem = new CommonItemEntity();

        assertNotNull(commonItem);
    }
}
