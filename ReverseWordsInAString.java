//Type – I (LeetCode)

class Solution {
    public String reverseWords(String s) {
        String res= "";
        
        String[] words = s.trim().split("\\s+");
        
        res += words[words.length - 1];
        
        for(int i= words.length - 2; i>=0; i--){
            res = res + " " + words[i];
        }
        return res;
    }
}

//Type – II (CodeStudio)


public class Solution 
{
	public static String reverseString(String str) 
	{
		StringBuilder st = new StringBuilder();
        str.trim();
        String[] s = str.split(" ");
        int n = s.length;
        for(int i = n-1; i>=0; i--){
            String k  = s[i].trim();
            st.append(k + " ");
        }
        return st.toString();
	}
}
