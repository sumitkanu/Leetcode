class TimeMap:

    def __init__(self):
        self.data = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.data:
            self.data[key] = []

        self.data[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.data:
            return ""

        arr = self.data[key]

        start = 0
        end = len(arr) - 1
        res = ""

        while start <= end:
            mid = (start + end) // 2

            if arr[mid][0] <= timestamp:
                res = arr[mid][1]
                start = mid + 1
            else:
                end = mid - 1

        return res


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)