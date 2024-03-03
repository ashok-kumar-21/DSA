class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        left_array = []
        right_array = []
        stack = []
        for i in range(len(heights)):
            while len(stack) > 0 and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if len(stack) > 0:
                left_array.append(stack[-1] + 1)
            else:
                left_array.append(0)
            stack.append(i)
        stack = [-1]*len(heights)
        for i in range(len(heights)-1, -1, -1):
            while len(stack) > 0 and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if len(stack) > 0:
                right_array.append(stack[-1] - 1)
            else:
                right_array.append(len(heights) - 1)
            stack.append(i)
        maximum = -999999
        for i in range(len(heights)):
            maximum = max(maximum, (right_array[len(heights)-i-1] - left_array[i] + 1) * heights[i])
        print(left_array, right_array)
        return maximum
# (rightsmaller[i] - leftsmaller[i] + 1)* height[i]
