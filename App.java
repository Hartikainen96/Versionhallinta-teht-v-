import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner in = new Scanner(System.in);
   String oikeaarvaus = "Teemu";
   String kayttajanarvaus = "";
   String ending = "stop";
   int arvaukset = 0;

   do {
    System.out.println("Guess my name (type stop to exit)");
    
    kayttajanarvaus = in.nextLine();

    if (kayttajanarvaus.equals(ending))
    {
      System.out.println("You guessed " + ending +  " times.");
      break;
    }
    arvaukset++;

    if (kayttajanarvaus.equals(oikeaarvaus))
    {
      System.out.println("Congratulations!");
      System.out.println("You guessed " + ending + " times. ");
      break;
    }
   }
   while (true);
    }
  }
