public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] nouns = {
          "bird", "dog", "house", "bench", "apple", "duck", "mouse", "key", "pencil", "bug"
        };
        String[] adj = {
          "bitter", "salty", "sweet", "sour", "silky", "greasy", "sharp", "bumpy", "fuzzy", "slimy"
        };
        int ran =(int) (Math.random() * nouns.length);
        System.out.printf("Here is your server name: %n %s-%s", adj[ran], nouns[ran]);
    }
}
