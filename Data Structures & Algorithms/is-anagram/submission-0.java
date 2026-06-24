class Solution {
    public boolean isAnagram(String s, String t) {
        //Define a hashmap
        Map<Character,Integer> str1 = new HashMap<>();
        Map<Character,Integer> str2 = new HashMap<>();

        if (s.length()!=t.length())
            return false;
        //Itertate through the String 1 and String 2 and fill the hashmp
        int i=0, j=0;
        for (char c: s.toCharArray()){
            str1.put(c,str1.getOrDefault(c, 0)+1);
        }
        for (char c:t.toCharArray())
            str2.put(c,str2.getOrDefault(c, 0)+1);

        // Compare the hashtables
        return str1.equals(str2);

    }
}
