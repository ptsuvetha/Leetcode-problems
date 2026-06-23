class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String sent[] = sentence.split(" ");
        int count = 1; // Start at 1 so the first word gets one 'a'
        
        for (String word : sent) {
            char ch = word.charAt(0);
           
            // Fixed vowel logic: append full word + "ma"
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(word).append("ma"); 
            } else {
                sb.append(word.substring(1)).append(ch).append("ma");
            }
            
            // Append the correct number of 'a's
            for (int ind = 0; ind < count; ind++) {
                sb.append("a");
            }
            
            sb.append(" "); // Append space after every word
            count++;
        }
        
        // Remove the trailing space at the end
        return sb.toString().trim();
    }
}