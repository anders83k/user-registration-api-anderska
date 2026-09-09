package se.testkurs.userapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {
    @Test
    void constructorSetUserfields(){
        User user= new User("anna", "anna@example.com", "password123");

        assertNotNull(user);
        assertEquals("anna", user.getUsername());
        assertEquals("anna@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());

    }
}
