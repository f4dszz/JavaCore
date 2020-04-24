package com.demo.code;

class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0){
            return;
        }
        
        int N = nums.length;
        
        int[] array = new int[N];
        
        for(int i = 0; i< N; i++){
            array[(i + k) % N] = nums[i];
        }
        
        //if out of bounds
        
        for(int i = 0; i < N; i++){
            nums[i] = array[i];
        }
    }
}
