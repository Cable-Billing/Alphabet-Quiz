package club.thetachanka.alphabet_quiz;

import java.util.Random;

public class Alphabet {
    char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /**
     * Selects a random letter from the alphabet
     * @return a random letter
     */
    public char randomLetter() {
        return alphabet[new Random().nextInt(alphabet.length)];
    }
}
