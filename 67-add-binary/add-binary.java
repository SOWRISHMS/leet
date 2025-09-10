import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger objects
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        // Add the two numbers
        BigInteger sum = bigA.add(bigB);

        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}