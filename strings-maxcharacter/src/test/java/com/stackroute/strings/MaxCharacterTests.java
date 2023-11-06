package com.stackroute.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxCharacterTests {
    private MaxCharacter maxCharacter;
    @BeforeEach
    public void setUp(){
        maxCharacter=new MaxCharacter();
    }
    @AfterEach
    public void tearDown(){
        maxCharacter=null;
    }
    @Test
    public void isAlphabeticString(){
        String input = "hello world";
        char expectedMaxCharacter = 'l';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isSpecialCharacterString(){
        String input = "!@#$%^&*";
        char expectedMaxCharacter = '!';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isDigitString(){
        String input = "123445555";
        char expectedMaxCharacter = '5';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isAlphabeticString1(){
        String input = "hello rahul";
        char expectedMaxCharacter = 'l';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isSpecialCharacterString1(){
        String input = "!@#$%^&*&&";
        char expectedMaxCharacter = '&';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isDigitString1(){
        String input = "44872766666";
        char expectedMaxCharacter = '6';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isAlphabeticString2(){
        String input = "java se";
        char expectedMaxCharacter = 'a';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isSpecialCharacterString2(){
        String input = "!@#$%^&**";
        char expectedMaxCharacter = '*';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
    @Test
    public void isDigitString2(){
        String input = "34622355233";
        char expectedMaxCharacter = '3';

        char actualMaxCharacter = maxCharacter.findMaxCharacterCount(input);

        assertEquals(expectedMaxCharacter, actualMaxCharacter);
    }
}
