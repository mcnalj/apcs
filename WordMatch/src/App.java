public class App {
    public static void main(String[] args) throws Exception {
        WordMatch game = new WordMatch("mississippi");
        System.out.println(game.scoreGuess("iss"));
    }
}
