import java.util.Scanner;
import java.util.ArrayList;
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
      ArrayList newSentence = new ArrayList <>();
      Random random = new Random();
      int index = random.nextInt(replyStrings.length);
      System.out.println(replyStrings[index]);
      
      if (newSentence.contains("I")){
        
      }


      // for (int w = 0; w < words.length; w++){
      //   if (words[w] != "I" && words[w] != "me" && words[w] != "am" && words[w] != "you" && words[w] != "my" && words[w] != "your"){
      //     String word = words[w];
      //     newSentence.add(words[w]);
      //   }
      //   else if (words[w] == "me"){
      //     String word = words[w].replace("me", "you");
      //     newSentence.add(word);
      //   }
      //   else if (words[w] == "am"){
      //     String word = words[w].replace("am", "are");
      //     newSentence.add(word);
      //   }
      //   else if (words[w] == "you"){
      //     String word = words[w].replace("you", "I");
      //     newSentence.add(word);
      //   }
      //   else if (words[w] == "my"){
      //     String word = words[w].replace("my", "your");
      //     newSentence.add(word);
      //   }
      //   else if (words[w] == "your"){
      //     String word = words[w].replace("your", "my");
      //     newSentence.add(word);
      //   }
      //   else if (words[w] == "I"){
      //     String word = words[w].replace("I", "you");
      //     newSentence.add(word);
    
      // }
      // String responseString = String.join(" ", newSentence);
      // System.out.println(responseString);
      
    // }
    System.out.println("Goodbye!");
    
  }
}
}
