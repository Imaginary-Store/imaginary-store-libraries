package classes;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressTest {

    @Test
    void addressTester() {
        Address address = Instancio.of(Address.class).create();

        assertNotNull(address.getHouseNo());
        assertNotNull(address.getStreet());
        assertNotNull(address.getVillageOrCity());
        assertNotNull(address.getLandmark());
        assertNotNull(address.getDistrict());
        assertNotNull(address.getState());
        assertNotNull(address.getPostalCode());
    }
}
