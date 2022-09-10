package pl.com.piglatin;

public class PigLatin {

    public static final String TEXT_DELIMETER = " ";
    public static final String HIPHEN_DELIMETER = "-";
    public static final String VOWEL_END = "way";
    public static final String CONSONANT_END = "ay";

    public String createSentence(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(TEXT_DELIMETER);
        for (String word : words) {
            if (result.length() > 0) {
                result.append(TEXT_DELIMETER);
            }
            result.append(createPigLatinWord(word));
        }
        return result.toString();
    }

    private String createPigLatinWord(String word) {
        char[] chars = word.toCharArray();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < chars.length) {
            if (!Character.isLetter(chars[index])) {
                result.append(chars[index]);
                index++;
            } else if (checkIfTheVovel(chars[index])) {
                while (index < chars.length) {
                    result.append(chars[index]);
                    index++;
                }
                result.append(HIPHEN_DELIMETER);
                result.append(VOWEL_END);
            } else {
                StringBuilder ending = new StringBuilder();
                while (index < chars.length && !checkIfTheVovel(chars[index]) && Character.isLetter(chars[index])) {
                    ending.append(chars[index]);
                    index++;
                }
                ending.append(CONSONANT_END);
                while (index < chars.length) {
                    result.append(chars[index]);
                    index++;
                }
                result.append(HIPHEN_DELIMETER);
                result.append(ending);
            }
        }
        return result.toString();
    }

    private boolean checkIfTheVovel(char ch) {
        switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            return true;
        default:
            return false;
        }
    }
}