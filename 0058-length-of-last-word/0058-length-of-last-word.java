import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int lengthOfLastWord(String s) {
        
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(s);
        
        String[] words = matcher.replaceAll(" ").trim().split(" ");
        
        String lastWord = words[words.length-1];
        
        return lastWord.length();
        
    }
}