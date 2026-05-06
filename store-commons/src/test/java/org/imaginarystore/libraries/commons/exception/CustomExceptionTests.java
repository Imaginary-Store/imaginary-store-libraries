package org.imaginarystore.libraries.commons.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomExceptionTests {

    @Test
    void DuplicateInsertionExceptionTest() {
        String message = "Duplicate user found.";
        DuplicateUserInsertionException exception = assertThrows(
                DuplicateUserInsertionException.class,
                () -> {
                    throw new DuplicateUserInsertionException(message);
                }
        );

        assertEquals("Duplicate user found.", exception.getMessage());
    }
}
