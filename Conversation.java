import java.util.Scanner;
import java.lang.StringBuilder;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // static String[] reply = {"Shocking", "I'm shocked.", "Are you okay?", "Uh huh.", "Wow.", "Hmmm."};
    // static String[] transcript = 

    Scanner myObj = new Scanner(System.in);
    System.out.println("How many rounds?");
    String num = myObj.nextLine(); //reads user's input, stores in 'num' variable
    int rounds = Integer.valueOf(num);
    System.out.println("Hi. Give me your name now.");
    String userName = myObj.nextLine();
    for (int i = 0; i < rounds; i++){
      System.out.println("What's on your mind right now " + userName + "?");
      String s1 = myObj.nextLine();
      // I -> you
      // me -> you
      // am -> are
      // you -> I
      // my -> your
      // your -> my  
      
      String[] words = s1.split(" ");
      for (int w = 0; w < words.length; w++){
        if (words[w] == "I"){
          words[w].replace("I", "you");
          
        }
        if (words[w] == "me"){
          words[w].replace("me", "you");
          
        }
        if (words[w] == "am"){
          words[w].replace("am", "are");
          
        }
        if (words[w] == "you"){
          words[w].replace("you", "I");
          
        }
        if (words[w] == "my"){
          words[w].replace("my", "your");
          
        }
        if (words[w] == "your"){
          words[w].replace("your", "my");
          
        }
        else{
          
        }
      }
      System.out.println();
      
    }
    System.out.println("Goodbye!");
    
  }
}
