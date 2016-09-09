import java.util.Random;
import java.util.Scanner;

public class VanillaJack {

        //*Shuffle Function. http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array    
    static void shuffleArray(int[] deckCards){
    
        //*Throwing a card left in the card deck
        Random rnd = new Random();
        for (int i = deckCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Swap
            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
    }
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //* Number Cards = 11; Picture cards = 10; As = 4.
        int[] newCard = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11};

        //*Shuffle Cards
                shuffleArray(newCard);

        //* Start VanillaJack.
        System.out.println("Welcome to VanillaJack! \n" );
        
        int playerTotal = newCard[0] + newCard[1];   
          
        System.out.println("You get a " + newCard[0] + " and a " + newCard[1]);
        
        System.out.println("Your total is \n" + playerTotal);
   

        //*Player can get VanillaJack in the 1st deal
        if (playerTotal == 21){
            System.out.println("VanillaJack, You win");
       
        }
        if (playerTotal > 21){
            System.out.println("You lose");
    
        }
        //* Dealer cards
        System.out.println("The dealer has a " + newCard[2] + " showing, and a hidden card \n");
        int dealerTotal = newCard[2] + newCard[3];
        if (dealerTotal > 21){ 
            
            System.out.println("Dealer's total is " + dealerTotal);
            System.out.println("Dealer is out, you win!\n");
 
        }
        
        //*Dealer can get VanillaJack in the 1st deal
        if (dealerTotal == 21){   
 
            System.out.println("Dealers total is \n" + dealerTotal);
            System.out.println("Dealer has VanillaJack, you lose");
        }
        
        System.out.println("His total is hidden \n");

        //* Hit or Stay for player.
        System.out.print("Would you like to \"hit\" or \"stay\"? ");
        String hitStay = keyboard.next();

        //* cc = card count
        int cc = 4; 
 
        cc++;  // Dealer will stay on 16+ and hit if below.


        // final win sequence.
        System.out.println("Dealer total is " + dealerTotal);
        System.out.println("Your total is " + playerTotal);

        if (dealerTotal > playerTotal){
            System.out.println("Dealer wins");
        } 
        if (dealerTotal == playerTotal){
            System.out.println("You both draw");
        }
        if (dealerTotal < playerTotal){
            System.out.println("You win");
        }
    }

}