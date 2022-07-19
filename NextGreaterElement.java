//Next Greater Element – I (LeetCode)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length-1; i>=0; i--){
            while(!stack.empty() && nums2[i]>stack.peek()){
                stack.pop();
            }
            map.put(nums2[i], (stack.empty())? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        for(int i = 0; i<nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1; 
    }
}


//Next Greater Element (CodeStudio)

import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		Stack<Integer> stack = new Stack<>();
        int[] answer = new int[n];
        for(int i =n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i%n]){
                stack.pop();
            }
            
            if(i < n){
                if(!stack.isEmpty()){
                    answer[i] = stack.peek();
                }
                else{
                    answer[i] = -1;
                }
            }
            stack.push(arr[i%n]);
        }
        return answer;
	}

}


//Next Greater Element – II (LeetCode)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        for(int i = 2*n -1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(i < n){
                if(!stack.isEmpty()){
                    answer[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]); 
            
        }
        return answer;
    }
}
