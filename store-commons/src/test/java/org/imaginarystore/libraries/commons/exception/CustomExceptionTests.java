package org.imaginarystore.libraries.commons.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomExceptionTests {

    @Test
    void DuplicateInsertionExceptionTest() {
        DuplicateUserInsertionException exception = new DuplicateUserInsertionException("Duplicate user found.");

        assertEquals("Duplicate user found.", exception.getMessage());
    }
}
