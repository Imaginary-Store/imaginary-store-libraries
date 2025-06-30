package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonUserEntityTest {

    @Test
    void commonUserEntityTester() {
        CommonUserEntity commonUser = new CommonUserEntity();
        assertNotNull(commonUser);
    }
}
