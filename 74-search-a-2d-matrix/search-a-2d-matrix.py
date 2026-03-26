class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        start = 0
        end = m - 1

        while start <= end:
            mid = (start + end) // 2

            if matrix[mid][0] == target:
                return True
            elif matrix[mid][0] < target:
                start = mid + 1
            else:
                end = mid - 1

        i = end
        start = 0
        end = n - 1
        while start <= end:
            mid = (start + end) // 2

            if matrix[i][mid] == target:
                return True
            if matrix[i][mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        
        return False
