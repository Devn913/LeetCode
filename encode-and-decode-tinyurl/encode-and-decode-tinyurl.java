public class Codec {
    
    public static HashMap <String, String> map =  new HashMap<>();
    public static int counter = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String res = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        result.append("http://tinyurl.com/");
        int temp = counter;
        int index;
        while(temp!=0){
            index = temp%62;
            result.append(res.charAt(index));
            temp = temp/62;
        }
        counter++;
        map.put(result.toString(),longUrl);
        return result.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));