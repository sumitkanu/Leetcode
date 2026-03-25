class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1c = [0] * 26

        for i in range(len(s1)):
            s1c[ord(s1[i]) - ord("a")] += 1

        def compare(s1c, s2c):
            for i in range(26):
                if s1c[i] != s2c[i]:
                    return False
            return True

        for i in range(len(s2) - len(s1) + 1):
            s2c = [0] * 26

            for j in range(len(s1)):
                s2c[ord(s2[i + j]) - ord("a")] += 1

            if compare(s1c, s2c):
                return True

        return False