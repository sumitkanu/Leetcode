class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(list)

        for s in strs:
            val = [0]*26
            for ch in s:
                val[(ord(ch) - ord('a'))] += 1
            groups[tuple(val)].append(s)

        return list(groups.values())