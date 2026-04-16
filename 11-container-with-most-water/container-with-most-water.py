class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        start = 0
        end = len(height) - 1

        max_area = (end - start) * min(height[start], height[end])

        while start < end:
            if height[end] <= height[start]:
                end -= 1
                max_area = max(max_area, (end - start) * min(height[start], height[end]))
            else:
                start += 1
                max_area = max(max_area, (end - start) * min(height[start], height[end]))

        return max_area
