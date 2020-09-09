package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test", "test1", "TEST", "t_eSt", "te-s.T"})
    public void username_shouldReturnTrueIfStringHasAllowedCharacters(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {" ", "te", "t e", ","})
    public void username_shouldReturnFalseIfNotEnoughCharactersOrNotAllowed(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@gmail.com", "yest27@gmail.com.pl"})
    public void email_shouldReturnTrueIfStringMatchesRegex(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"test ", "#", ",", "@gmail", "test@gmail", "test@", "test@gmail.plplpl"})
    public void email_shouldReturnFalseIfNotEnoughCharactersOrNotAllowed(String email) {
        assertFalse(validator.validateEmail(email));
    }
}