import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int answer = 0;
        char[] charArray = input.toCharArray();
        
        for(int i = 0; i<charArray.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j<charArray.length; j++){
                if(set.contains(charArray[j])){
                    break;
                }
                else{
                    set.add(charArray[j]);
                }
            }
            answer = Math.max(answer, set.size());
        }
        return answer;
	}
}

