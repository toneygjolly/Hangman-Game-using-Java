import java.util.Scanner;

public class Game{

  Player player;
  private Scanner scanner;
  public Game()
  {

  }   
  private void printMenu()
  {
    System.out.println("1. Sports");
    System.out.println("2. Movie");
    System.out.println("3. Exit");


  }
  private void createPlayer()
  {
   System.out.println("What is your name: ");
   try (Scanner scanner = new Scanner(System.in)) {
    String playerName = scanner.next();
     this.player =new Player(playerName);
  }

  }  
  public void start()
  {
    createPlayer();
    while(true)
    {
        System.out.println("Welcome to this Game:: please choose the option");
        printMenu();
        int choice =scanner.nextInt();
        if(choice==1){
        break;
        }
        else if(choice==2){
        break;
        
        }
        else
        {
         System.out.println("Take the correct option");
         continue;
        }

    }
  }
}