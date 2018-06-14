import java.util.Scanner;

public class ToiletSeat {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int inputLength = input.length();

        int seatUp = 0;
        int seatDown = 0;
        int seatPref = 0;


        if (input.charAt(0) == 'U' && input.charAt(1) == 'D') {
            seatUp += 2;
            seatDown++;
            seatPref++;
        }
        if (input.charAt(0) == 'D' && input.charAt(1) == 'U') {
            seatUp++;
            seatDown += 2;
            seatPref++;
        }
        if (input.charAt(0) == 'D' && input.charAt(1) == 'D') {
            seatUp++;
        }
        if (input.charAt(0) == 'U' && input.charAt(1) == 'U') {
            seatDown++;
        }

            for (int i = 2; i < inputLength; i++) {

                if (input.charAt(i) == 'U') {
                    seatDown += 2;
                if (input.charAt(i - 1) == 'D')
                        seatPref++;
                } else {
                    seatUp += 2;
                    if (input.charAt(i - 1) == 'U')
                        seatPref++;
                }
            }

        
        System.out.println(seatUp);
        System.out.println(seatDown);
        System.out.println(seatPref);
    }
}
