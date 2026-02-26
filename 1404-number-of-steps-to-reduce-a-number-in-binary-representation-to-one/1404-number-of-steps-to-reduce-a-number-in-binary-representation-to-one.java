class Solution {
    public int numSteps(String s) {
       int steps = 0;
        int carry = 0;

        // Traverse from right to left (ignore MSB initially)
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';

            if (bit + carry == 1) {
                // Odd case
                steps += 2; 
                carry = 1;
            } else {
                // Even case
                steps += 1;
                // carry remains same
            }
        }
        return steps+carry;
 
    }
}