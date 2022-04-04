public class RecursionHelper {
    /** Self Explanation - Remember to detail your base and recursive cases.
     * 
     * 
     * 
     */
    public String reverseString(String str) {
        if(str.length() <= 1) return str;

        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length()-1));
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     * 
     * 
     * 
     */
    public int armstrongNumber(int num, int total) {
        if(num != 0) {
            int remainder = num % 10;
            total += Math.pow(remainder, 3);
            num /= 10;
            return armstrongNumber(num, total);
        }

        return total;
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     * 
     * 
     * 
     */
    public boolean palindromeChecker(String str) {
        if(str.length() <= 1) return true;
        if(str.charAt(0) != str.charAt(str.length() - 1)) return false;
        else return palindromeChecker(str.substring(1, str.length() - 1));
    }
}
