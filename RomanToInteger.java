class Solution {
    public int romanToInt(String s) {

        int answer = 0;
        int n = s.length();
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int i = 0;
        for (; i < n - 1; i++) {
            char ch = s.charAt(i);
            char nxtCh = s.charAt(i + 1);
            if (values.get(ch) < values.get(nxtCh)) {
                answer -= values.get(ch);
            } else {
                answer += values.get(ch);
            }
        }
        answer += values.get(s.charAt(i));
        return answer;
    }
}