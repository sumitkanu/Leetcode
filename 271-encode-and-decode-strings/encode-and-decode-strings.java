public class Codec {
    StringBuilder str;
    String data;

    public Codec() {
        str = new StringBuilder();
    }

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        for(int i=0; i<strs.size(); i++) {
            str.append(strs.get(i));
            if(i != strs.size() - 1)
                str.append("π");
        }
        data = str.toString();
        return data;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return new ArrayList<>(Arrays.asList(data.split("π", -1)));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));