class Solution:
    def canPartitionKSubsets(self, nums: List[int], k: int) -> bool:
        target = sum(nums)

        if target % k != 0:
            return False

        target = target // k

        nums.sort(reverse = True)

        if nums[0] > target:
            return False

        buckets = [0] * k

        def bt(idx):
            if idx == len(nums):
                return True

            for i in range(k):
                if i > 0 and buckets[i] == buckets[i - 1]:
                    continue

                if buckets[i] + nums[idx] > target:
                    continue

                buckets[i] += nums[idx]

                if bt(idx + 1):
                    return True

                buckets[i] -= nums[idx]

            return False

        return bt(0)
