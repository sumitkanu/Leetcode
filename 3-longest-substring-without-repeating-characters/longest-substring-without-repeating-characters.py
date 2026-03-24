class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = []
        start = 0
        end = 0
        size = 0

        while end < len(s):
            while s[end] in seen and start <= end:
                seen.remove(s[start])
                start += 1
            size = max(size, end - start + 1)
            seen.append(s[end])
            end += 1

        return size
