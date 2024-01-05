import java.util.HashMap;

/**
 * An abstract password generator class that stores the types of valid password
 * characters and contains
 * all the abstract methods to be implemented in custom password generators.
 * 
 * @author Saqlain Anjum
 * @version 1.0.0
 * @since 01/01/2024
 */
public abstract class SimplePasswordGenerator {
        /**
         * Field variables for the letter, character, and number data in a password.
         */
        protected final static Character[] VALID_ENGLISH_LETTERS = {
                        'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g',
                        'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O',
                        'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v',
                        'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'
        };
        protected final static Character[] VALID_SPECIAL_CHARACTERS = {
                        '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', '|',
                        ';', ':', '\'', '"', ',', '.', '<', '>', '/', '?', ' '
        };
        protected final static Character[] VALID_NUMBERS = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        /**
         * Used to generate random probabilities for the given Valid Character Arrays in
         * this class.
         * 
         * @param chosenArray a chosen array from the ones defined in this class.
         * @return A Hash Map of characters as keys and random probabilities as values.
         */
        protected abstract HashMap<Character, Double> generateProbabilities(Character[] chosenArray);

        /**
         * Used to generate an ArrayList of random letters given the number of random
         * letters desired in the final password.
         * 
         * @param size the number of random letters desired in the final password.
         * @return an ArrayList of random letters as characters.
         * @throws IllegalArgumentException if desired size of characters is larger than
         *                                  the ones available in the Array.
         */
        protected abstract ArrayList<Character> generateRandomLetters(int size) throws IllegalArgumentException;

        /**
         * Used to generate an ArrayList of random numbers given the amount of random
         * numbers desired in the final password.
         * 
         * @param size the number of random numbers desired in the final password.
         * @return an ArrayList of random numbers as characters.
         * @throws IllegalArgumentException if desired size of characters is larger than
         *                                  the ones available in the Array.
         */
        protected abstract ArrayList<Character> generateRandomNumbers(int size) throws IllegalArgumentException;

        /**
         * Used to generate an ArrayList of random special characters given the number
         * of random characters desired in the final password.
         * 
         * @param size the number of random special characters desired in the final
         *             password.
         * @return an ArrayList of random special characters.
         * @throws IllegalArgumentException if desired size of characters is larger than
         *                                  the ones available in the Array.
         */
        protected abstract ArrayList<Character> generateRandomSpecialCharacters(int size)
                        throws IllegalArgumentException;

        /**
         * Used to generate the final password using a specified size for letters,
         * integers, and special characters.
         * 
         * @param numLetters   number of letters desired for the password.
         * @param numInts      number of integers desired for the password.
         * @param numSpecChars number of special characters desired for the password.
         * @throws IllegalArgumentException if desired size of characters is larger than
         *                                  the ones available in the Array.
         * @return the finalized password as a String.
         */
        protected abstract String generatePassword(int numLetters, int numInts, int numSpecChars)
                        throws IllegalArgumentException;
}