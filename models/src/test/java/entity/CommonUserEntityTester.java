package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommonUserEntityTester {

    @Test
    void commonUserEntityTester() {
        CommonUserEntity commonUser = new CommonUserEntity();

        assertNotNull(commonUser);
    }
}
