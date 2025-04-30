class Solution {
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of(
        '2',
        "abc",
        '3',
        "def",
        '4',
        "ghi",
        '5',
        "jkl",
        '6',
        "mno",
        '7',
        "pqrs",
        '8',
        "tuv",
        '9',
        "wxyz"
    );
    private String phoneDigits;
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return combinations;

        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private void backtrack(int i, StringBuilder str) {
        if (str.length() == phoneDigits.length()) {
            combinations.add(str.toString());
            return;
        }

        String possLet = letters.get(phoneDigits.charAt(i));
        for(char letter : possLet.toCharArray()) {
            str.append(letter);
            backtrack(i+1, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}