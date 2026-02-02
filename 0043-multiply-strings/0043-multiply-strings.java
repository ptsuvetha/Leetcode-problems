class Solution {
    public String multiply(String num1, String num2) {

        // Edge case
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        // Result can have at most n + m digits
        int[] result = new int[n + m];

        // Multiply from right to left
        for (int i = n - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';

            for (int j = m - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int mul = d1 * d2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert result array to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
