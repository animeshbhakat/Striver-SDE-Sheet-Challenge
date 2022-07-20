public class Solution {
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] answer = new int[26];
        for(int i = 0; i<str1.length(); i++){
            answer[str1.charAt(i) - 'a']++;
            answer[str2.charAt(i) - 'a']--;
        }
        for(int i =0; i<answer.length; i++){
            if(answer[i] != 0){
                return false;
            }
        }
        return true;
    }
}
