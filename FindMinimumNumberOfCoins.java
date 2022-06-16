public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int answer = 0;
        for(int i = coins.length-1; i>=0; i--){
            if(coins[i] <= amount){
                int c = (int) Math.floor(amount/coins[i]);
                answer += c;
                amount = amount - c*coins[i];
            }
            if(amount == 0){
                break;
            }
        }
        return answer;
    
    }
}

