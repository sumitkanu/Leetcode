class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ana = {}
        ans = []

        for s in strs:
            key = "".join(sorted(s))
            if key in ana.keys():
                ana[key].append(s)
            else:
                ana[key] = [s]

        for k in ana.keys():
            ans.append(ana[k])

        return ans