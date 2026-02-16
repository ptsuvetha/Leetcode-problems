class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || s.length() == 0 || words == null || words.length == 0)
            return result;
        
        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;
        
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int count = 0;
            Map<String, Integer> seenMap = new HashMap<>();
            
            for (int right = i; right + wordLength <= s.length(); right += wordLength) {
                String sub = s.substring(right, right + wordLength);
                
                if (wordMap.containsKey(sub)) {
                    seenMap.put(sub, seenMap.getOrDefault(sub, 0) + 1);
                    count++;
                    
                    while (seenMap.get(sub) > wordMap.get(sub)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seenMap.put(leftWord, seenMap.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }
                    
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    seenMap.clear();
                    count = 0;
                    left = right + wordLength;
                }
            }
        }
        
        return result;
    }
}
