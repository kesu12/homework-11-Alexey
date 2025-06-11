public class UniqueChars {

    boolean hasAllUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (currentChar == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
