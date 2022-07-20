public class Solution {	
	public static String longestPalinSubstring(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];
        String res = "";
        
        for(int g = 0; g < s.length(); g++){
            for(int i = 0, j = g+i; j<dp.length; i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true && j-i+1 > res.length()){
                    res = s.substring(i, j+1);
                }
            }
        }
        return res;
	}
}

