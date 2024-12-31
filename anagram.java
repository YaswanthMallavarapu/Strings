class Solution {
    public boolean isAnagram(String s, String t) {
        /*
         * HashMap<Character,Integer>chars=new HashMap<>();
         * HashMap<Character,Integer>chars1=new HashMap<>();
         * for(int i=0;i<s.length();i++){
         * char ch=s.charAt(i);
         * if(chars.containsKey(ch))
         * chars.put(ch,chars.get(ch)+1);
         * else{
         * chars.put(ch,1);
         * }
         * }
         * 
         * for(int i=0;i<t.length();i++){
         * char ch=t.charAt(i);
         * if(chars1.containsKey(ch))
         * chars1.put(ch,chars1.get(ch)+1);
         * else{
         * chars1.put(ch,1);
         * }
         * 
         * }
         * Set<Character>keyset=chars.keySet();
         * for(char key:keyset){
         * if(chars.get(key)!=chars1.get(key)) return false;
         * }
         * Set<Character>keyset1=chars1.keySet();
         * for(char key:keyset1){
         * if(chars.get(key)!=chars1.get(key)) return false;
         * }
         * return true;
         */

        /*
         * HashMap<Character,Integer>chars=new HashMap<>();
         * for(int i=0;i<s.length();i++){
         * char ch=s.charAt(i);
         * chars.put(ch,chars.getOrDefault(ch,0)+1);
         * }
         * for(int i=0;i<t.length();i++){
         * char ch=t.charAt(i);
         * if(!chars.containsKey(ch)) return false;
         * else{
         * chars.put(ch,chars.get(ch)-1);
         * if(chars.get(ch)==0)
         * chars.remove(ch);
         * }
         * }
         * 
         * return chars.isEmpty();
         */
        int s1 = s.length();
        int s2 = t.length();
        if (s1 != s2) {
            return false;
        }
        int chars[] = new int[26];
        for (int i = 0; i < s1; i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s2; j++) {
            chars[t.charAt(j) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0) {
                return false;
            }
        }
        return true;

    }
}