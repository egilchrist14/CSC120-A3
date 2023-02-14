import java.util.Scanner

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    static String[] responses = 

    Scanner myObj = new Scanner(System.in);
    System.out.println("How many rounds?");
    String rounds = myObj.nextLine(); //reads user's input, stores in 'rounds' variable
    
    for (int i = 0; i < rounds; i++){
      System.out.println("Hi. Give me your name now.");
      String userName = myObj.nextLine();
      System.out.println("What's on your mind today", userName, "?");
      String s1 = myObj.nextLine();
    }
    
  }
}
