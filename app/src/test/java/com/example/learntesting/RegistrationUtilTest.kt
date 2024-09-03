package com.example.learntesting



import org.junit.Test

import com.google.common.truth.Truth.assertThat

class RegistrationUtilTest {


    @Test
    fun emptyUserNameReturnFalse()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyUserPasswordORConfirmedReturnFalse()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "okName",
            "",
            ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun UserPasswordORConfirmedIsNotSameReturnsFalse()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "okName",
            "one",
            "two"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun UserPasswordIsShortReturnFalse()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "okName",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun UserNameIsTakenReturnFalse()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andrii",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }








    @Test
    fun validateRegistrationInput()
    {
        val result = RegistrationUtil.validateRegistrationInput(
            "okName",
            "veryStrongPass",
            "veryStrongPass"
        )
        assertThat(result).isTrue()
    }




}