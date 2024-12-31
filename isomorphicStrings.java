class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
       int s1=t.length();
       HashMap<Character,Character>map=new HashMap<>();
       for(int i=0;i<s1;i++){
        char currChar=s.charAt(i);
        char mappedChar=t.charAt(i);
        if(map.containsKey(currChar)){
          
           if(map.get(currChar)!=mappedChar){
            return false;
           }
         }
         map.put(currChar,mappedChar);
       }
         
       map.clear();
       for(int i=0;i<s1;i++){
        char currChar=t.charAt(i);
        char mappedChar=s.charAt(i);
         if(map.containsKey(currChar)){
          
           if(map.get(currChar)!=mappedChar){
            return false;
           }
         }
         map.put(currChar,mappedChar);
       }
       return true;
    }
}