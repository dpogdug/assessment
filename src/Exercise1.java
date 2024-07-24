public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("***************************Play Card Busters***************************");

        //Player One wins Scenario
        int[] playerOne = {10, 6, 8, 9, 7, 12, 7};
        int[] playerTwo = {7, 6, 9, 5, 2, 8, 11};

//        Player Two wins Scenario
//        int[] playerOne = {6, 6, 8, 4, 7, 7, 7};
//        int[] playerTwo = {7, 6, 9, 5, 8, 8, 11};


//        Tie Scenario
//        int[] playerOne = {4, 6, 9, 5, 2, 8, 11};
//        int[] playerTwo = {4, 6, 9, 5, 2, 8, 11};


        int playerOneCount=0;
        int playerTwoCount=0;

        String winningPlayer;
        String losingPlayer;

        for(int x=0; x<playerOne.length; x++){
            if(playerOne[x]>playerTwo[x]){
                System.out.println("Round No: " + (x+1) + "- Player 1 wins the round: " +playerOne[x]+" beats "+playerTwo[x]);
                playerOneCount++;
            }
            else if (playerOne[x]<playerTwo[x]){
                System.out.println("Round No: " + (x+1) + "- Player 2 wins the round: " +playerTwo[x]+" beats "+playerOne[x]);
                playerTwoCount++;
            }
            else{
                System.out.println("Round No: " + (x+1) + "- Tie! " +playerOne[x]+" ties with "+playerTwo[x]);
            }
        }
        if (playerOneCount>playerTwoCount){
            winningPlayer ="One";
            losingPlayer ="Two";
            System.out.println(
                    "Player " + winningPlayer + " wins!! He won "
                            + playerOneCount + " rounds beating player "
                            + losingPlayer + " who won "
                            + playerTwoCount + " rounds!");
        }
        else if (playerOneCount<playerTwoCount){
            winningPlayer ="Two";
            losingPlayer ="One";
            System.out.println(
                    "Player " + winningPlayer + " wins!! He won "
                            + playerTwoCount + " rounds beating player "
                            + losingPlayer + " who won "
                            + playerOneCount + " rounds!");
        }
        else{
            System.out.println(
                    "Tie, Player One won "
                            + playerOneCount + " rounds which Ties player Two who also won "
                            + playerTwoCount + " rounds!");
        }
    System.out.println("Goodbye!");
    }
}
