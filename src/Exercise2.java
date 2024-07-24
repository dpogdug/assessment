public class Exercise2 {
    public static void main(String[] args) {

        int[] loanRequests = {60,20,100,80,40,300,200,100};
        int currentAmount = 500;
        int x = 0;
        int j = 0;

        System.out.println("Cash in the pot: " + currentAmount);

        while(currentAmount!=0 && x<loanRequests.length) {

                if (loanRequests[x] <= currentAmount) {
                    System.out.println("Loan amount requested: " + loanRequests[x] + " - Loan amount granted!");
                    System.out.println();
                    System.out.print("Cash in the pot: ");
                    currentAmount = currentAmount - loanRequests[x];
                    System.out.println(currentAmount);

                } else {
                    System.out.println("Loan amount requested: " + loanRequests[x]);
                    System.out.println("The exact loan request cannot be processed in full (insufficient funds available). \nHowever, we will give you what we can... " + currentAmount);
                    System.out.println();
                    currentAmount = 0;
                    System.out.println("Cash remaining in the pot: " + currentAmount);
                    System.out.println();
                }
           x++;
        }
        System.out.println("The following loan requests could not be facilitated. ");
        for (j=x;j<loanRequests.length;j++){
            System.out.println(loanRequests[j]);
        }
    }
}