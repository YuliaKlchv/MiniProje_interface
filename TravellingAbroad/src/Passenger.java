import java.util.Scanner;

public class Passenger implements Rules{
    private int fee;
    private boolean politicalBan;
    private boolean visaStand;
    public Passenger() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much you paid as a fee");
        this.fee=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you have any political Ban ?(Yes:No)");
        String answer=scanner.nextLine();
        if(answer.equals("Yes")){
            this.politicalBan = true;
        }else {
            this.politicalBan=false;
        }
        System.out.println("Do you have a visa ?");
        String answer2=scanner.nextLine();
        if(answer2.equals("Yes")){
            this.visaStand=true;

        }else {
            this.visaStand=false;
        }
    }
    @Override
    public boolean departureFeeCheck() {
        if(fee < 150 ){
            System.out.println("Please pay the right amount of money");
            return false;
        }else{
            System.out.println("Your visa fee is paid successfully");
            return true;
        }

    }

    @Override
    public boolean politicalBanCheck() {
        if(politicalBan ==true){
            System.out.println("You cannot leave the country");
            return false;
        }else {
            System.out.println("You have no political ban");
            return true;
        }

    }

    @Override
    public boolean visaSituationCheck() {
        if(visaStand==true){
            System.out.println("You have your visa");
            return true;
            }else{
            System.out.println("You cannot leva the country with no visa");
            return false;
        }
    }
}
