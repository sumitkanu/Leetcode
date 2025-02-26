class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int wordCnt = 0;
        while(i < s.length()) {
            if(s.charAt(i) == ' ') {
                wordCnt = wordCnt == 0 ? 0 : wordCnt + 1;
                i++;
                continue;
            } else {
                StringBuilder sttrt = new StringBuilder();
                while(i < s.length() && s.charAt(i) != ' ') {
                    sttrt.append(s.charAt(i));
                    i++;
                }
                list.add(sttrt.toString());
            }
        }

        StringBuilder stt = new StringBuilder();
        stt.append(list.get(list.size() - 1));
        for(int j = list.size() - 1; j>0; j--) {
            stt.append(" ").append(list.get(j-1));
        }

        return stt.toString();
    }
}