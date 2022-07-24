class Solution {
    public char repeatedCharacter(String s) {
        
        int[] arr = new int[26];
        
        for(char ch : s.toCharArray()){
            if(++arr[ch-'a'] == 2)
                return ch;
        }
        
        return 0;
            
    }
}