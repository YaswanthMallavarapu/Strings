class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            String str = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = str;
        }
        return String.join(" ", words);
    }
}