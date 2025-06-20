package validator.tests;

import org.junit.jupiter.api.Test;
import validator.utils.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void testValidPassword(){
        assertTrue(PasswordValidator.isStrong("Qwerty0!"));
        assertTrue(PasswordValidator.isStrong("Qwerty0?"));
        assertTrue(PasswordValidator.isStrong("Qwerty0@"));
        assertTrue(PasswordValidator.isStrong("Qwerty0#"));

    }


    @Test
    void testSymbolsLessThen8(){
        assertFalse(PasswordValidator.isStrong("Qwerty0!"));

    }
    @Test
    void testInvalidSpecSymbol(){
        assertFalse(PasswordValidator.isStrong("Qwerty0 "));
        assertFalse(PasswordValidator.isStrong("Qwer^ty0"));
        assertFalse(PasswordValidator.isStrong("*Qwerty0"));
    }
    @Test
    void testNoUpperCase(){
        assertFalse(PasswordValidator.isStrong("qwerty2!"));
    }



}
