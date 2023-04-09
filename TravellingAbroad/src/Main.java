public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Vienna International Airport");
        String conditions = "Please check all the requirements to leave the country\n"+
                "1.You should pay the departure fee 150.0 Euro\n"+
                "You should have no Political Ban"+
                "You should have your visa with";
        String message ="You should fulfill all the requirements";

        while(true){
            System.out.println("******************");
            System.out.println(conditions);
            System.out.println("******************");
            System.out.println(message);


            Passenger passenger= new Passenger();
            System.out.println("Departure fee is being controlled");
            Thread.sleep(3000);
            if(passenger.departureFeeCheck()== false){
                System.out.println(message);
                continue;
            }

            System.out.println("Political Ban is being controlled");
            Thread.sleep(3000);
            if(passenger.politicalBanCheck()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Visa Stand is being controlled");
            if(passenger.visaSituationCheck()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Check is done successfully ! Have a good journey !");
            break;
        }
    }
}
