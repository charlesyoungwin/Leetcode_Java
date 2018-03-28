class Solution {
    // brute force solution
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1; j < height.length; j++){
                int area = Math.min(height[i], height[j]) * (j - i);
                if(area > max){
                    max = area;
                }
            }
        } 
        return max;    
    }

    //solution2 O(n)
    public int maxArea2(int[] height){
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Solution solu = new Solution();
        int[] height = {2, 4, 3, 1, 5};
        System.out.println(solu.maxArea(height));
        System.out.println(solu.maxArea2(height));
    }
}