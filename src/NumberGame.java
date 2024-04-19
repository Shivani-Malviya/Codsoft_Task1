import java.util.Scanner;
class rangen{
    public int generate(int max,int min){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempt = 0;
        int win = 0;




        while(true){
            System.out.println("Enter the maximum number :");
            int max = sc.nextInt();
            System.out.println("Enter the minimum number :");
            int min = sc.nextInt();
            sc.nextLine();





            int cnum = rg.generate(max,min);
            int attempts = 0;



            while(true){
                System.out.println("Guess a number between "+max+" and "+min);
                int gnum = sc.nextInt();
                attempts++;
                if(gnum > cnum){
                    System.out.println("Its greater");
                }else if(gnum<cnum){
                    System.out.println("Its lower");
                }else{
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
            totalAttempt += attempts;
            System.out.println("Attempts = "+attempts);
            System.out.println("wins = "+win);
            double winrate = (double)win / totalAttempt*100;
            System.out.printf("your winrate is %.2f%%\n ",winrate);


            System.out.println("Do you want to play again(yes/No)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")) {
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}

