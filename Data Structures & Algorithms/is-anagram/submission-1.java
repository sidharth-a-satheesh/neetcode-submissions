class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();
        if(s.length()>t.length()){
            s = s + t;
            t = s.substring(0,s.length()-t.length());
            s = s.substring(t.length());
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(charMap.containsKey(ch)){
                charMap.replace(ch, charMap.get(ch)+1);
            }
            else {
                charMap.put(ch, 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(charMap.containsKey(ch) && charMap.get(ch)>0){
                charMap.replace(ch, charMap.get(ch)-1);
            } else {
                return false;
            }
        }
        return true;
    }
}
