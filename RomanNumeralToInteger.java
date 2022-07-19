public class Solution {
    public static int romanToInt(String s) {
        int length = s.length();
        int count = 0;
        int[] nums = new int[length];
        for(int i =0; i<length; i++){
            if(s.charAt(i) == 'I'){
                nums[i] = 1;
            }
            else if(s.charAt(i) == 'V'){
                nums[i] = 5;
            }
            else if(s.charAt(i) == 'X'){
                nums[i] = 10;
            }
            else if(s.charAt(i) == 'L'){
                nums[i] = 50;
            }
            else if(s.charAt(i) == 'C'){
                nums[i] = 100;
            }
            else if(s.charAt(i) == 'D'){
                nums[i] = 500;
            }
            else if(s.charAt(i) == 'M'){
                nums[i] = 1000;
            }
        }
        for(int i = 0; i < length - 1; i++){
            if(nums[i] < nums[i+1]){
                count -= nums[i];
            }
            else{
                count += nums[i];
            }
        }
        return count + nums[length -1];
    }
}
