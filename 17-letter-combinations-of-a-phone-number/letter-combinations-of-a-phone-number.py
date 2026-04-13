class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        mapping = {
            "2" : ["a", "b", "c"],
            "3" : ["d", "e", "f"],
            "4" : ["g", "h", "i"],
            "5" : ["j", "k", "l"],
            "6" : ["m", "n", "o"],
            "7" : ["p", "q", "r", "s"],
            "8" : ["t", "u", "v"],
            "9" : ["w", "x", "y", "z"]
        }

        ans = []

        def bt(curr, idx):
            if idx == len(digits):
                ans.append(curr)
                return

            dig = digits[idx]
            for char in mapping[dig]:
                bt(curr + char, idx + 1)
        
        bt("", 0)
        return ans