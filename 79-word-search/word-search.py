class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows, cols = len(board), len(board[0])

        def bt(idx, row, col):
            if idx == len(word):
                return True

            if row < 0 or row >= rows or col < 0 or col >= cols:
                return False

            if board[row][col] != word[idx]:
                return False

            temp = board[row][col]
            board[row][col] = "#"

            found = (
                bt(idx + 1, row + 1, col) or
                bt(idx + 1, row - 1, col) or
                bt(idx + 1, row, col + 1) or
                bt(idx + 1, row, col - 1)
            )

            board[row][col] = temp

            return found

        for i in range(rows):
            for j in range(cols):
                if bt(0, i, j):
                    return True

        return False
