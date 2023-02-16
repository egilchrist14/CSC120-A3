import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    String[] replyStrings = {"Shocking", "I'm shocked.", "Are you okay?", "Uh huh.", "Wow.", "Hmmm."};
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
      // ArrayList newSentence = new ArrayList <>();
      Random random = new Random();
      int index = random.nextInt(replyStrings.length);
      
      // System.out.println(replyStrings[index]); //for canned response
      
      for (int w = 0; w < words.length; w++){
        if (words[w].equals("me")){
              words[w] = "you";
              
            }
            else if (words[w].equals("am")){
              words[w] = "are";
              
            }
            else if (words[w].equals("you")){
              words[w] = "I";
              
            }
            else if (words[w].equals("my")){
              words[w] = "your";
              
            }
            else if (words[w].equals("your")){
              words[w] = "my";
              
            }
            else if (words[w].equals("I")){
              words[w] = "you";
            
              
            
      }
    
    
  }
  System.out.println(String.join(" ", words));

}
System.out.println("Goodbye!");
}
}
