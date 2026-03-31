class Solution:
    def maxArea(self, height: list[int]) -> int:
        left = 0
        right = len(height) - 1
        max_water = 0
        
        while left < right:
            # Calculate width and current height (limited by the shorter side)
            width = right - left
            current_height = min(height[left], height[right])
            
            # Update max_water if current area is larger
            max_water = max(max_water, width * current_height)
            
            # Move the pointer pointing to the shorter line
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return max_water
