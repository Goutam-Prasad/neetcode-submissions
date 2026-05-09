public class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottomIndex = stack.pop();
                
                if (stack.isEmpty()) break;
                
                int width = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[bottomIndex];
                water += width * boundedHeight;
            }
            stack.push(i);
        }
        
        return water;
    }
}