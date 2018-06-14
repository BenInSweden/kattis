import java.util.Scanner;

public class TrollHunt {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String[] params = input.split(" ");
	    int output;

        int bridges = Integer.parseInt(params[0])-1;
        int knights = Integer.parseInt(params[1]);
        int knightsPerGroup = Integer.parseInt(params[2]);

        if(bridges%(knights/knightsPerGroup)>0) {
            output = (bridges/(knights/knightsPerGroup))+1;
        }else output = bridges/(knights/knightsPerGroup);

        System.out.println(output);
    }
}
