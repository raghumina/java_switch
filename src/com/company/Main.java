//import java.util.Scanner;
class Main {
    public static void main(String[] args){
      //  Scanner input = new Scanner(System.in);
     //   int dia =input.nextInt();
        System.out.println("Please enter a number");
        int week = 5;
        String day ;

        // dia = day in spanish
      //String day ;
        // using switch statement to check the day
        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thrusday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
            case 8:
                day = "INVALID DAY";
                break;
        }
        System.out.println("The day is" );
        System.out.println(day);



    }
}