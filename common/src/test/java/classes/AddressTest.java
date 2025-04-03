package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressTest {

    @Test
    void addressTester() {
        Address address = new Address();
        assertNotNull(address);
    }
}
