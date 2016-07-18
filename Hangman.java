public class Hangman {
  public static void main(String[] args) {
      //Code goes here:
      Game game = new Game("treehouse");
      Prompter prompter = new Prompter(game);
      prompter.play();
  }
}
