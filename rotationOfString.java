class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (n != m) {
            return false;
        }
        String newStr = s + s;
        if (newStr.contains(goal)) {
            return true;
        }
        return false;
    }
}