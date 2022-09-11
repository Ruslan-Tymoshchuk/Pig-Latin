package pl.com.piglatin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

    private PigLatin pigLatin = new PigLatin();

    @Test
    void givenEmptyString_whenCreateSentence_thenEmptyString() {
        assertEquals("", pigLatin.createSentence(""));
    }

    @Test
    void givenTextBeginsVowel_whenCreateSentence_thenPigLatinText() {
        assertEquals("oohgtin-way", pigLatin.createSentence("oohgtin"));
    }

    @Test
    void givenTextBeginsConsonant_whenCreateSentence_thenPigLatinText() {
        assertEquals("oligg-mmay", pigLatin.createSentence("mmoligg"));
    }

    @Test
    void givenTextBeginsExclamationAndConsonant_whenCreateSentence_thenPigLatinText() {
        assertEquals("!!oligg-mmay", pigLatin.createSentence("!!mmoligg"));
    }

    @Test
    void givenTextBeginsConsonantAndExclamation_whenCreateSentence_thenPigLatinText() {
        assertEquals("!!oligg-mmay", pigLatin.createSentence("mm!!oligg"));
    }

    @Test
    void givenTextBeginsExclamationAndVowel_whenCreateSentence_thenPigLatinText() {
        assertEquals("!!oligg-way", pigLatin.createSentence("!!oligg"));
    }

    @Test
    void givenNull_whenCreateSentence_thenException() {
        assertThrows(NullPointerException.class, () -> pigLatin.createSentence(null));
    }
}