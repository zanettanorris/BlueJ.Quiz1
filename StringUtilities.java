
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return null;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        for(int i = valueToBeReversed.length() - 1; i >= 0; i--) {
            reverse = (reverse + valueToBeReversed.charAt(i));}
            return reverse;
    }


    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int i = (word.length())/2;
        return word.charAt(i);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int i =0;
        int k = value.length();
        while (i<=k);{
        if (value.charAt(i))equals(charToRemove);
        {value.replace((value.charAt(i)), "");}}
        
    }//string is immutable. you have to make a new string.

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
