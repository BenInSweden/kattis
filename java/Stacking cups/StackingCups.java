import java.util.*;

public class StackingCups {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberCups = sc.nextInt();
        sc.nextLine();

        List<Cup> cups = new ArrayList<>();

        for(int i=1; i<=numberCups; i++) {
            String[] input = sc.nextLine().split(" ");
            if(input[0].matches("\\d+")) {
                cups.add(new Cup(input[1], Integer.parseInt(input[0])/2));
            }
            else cups.add((new Cup(input[0], Integer.parseInt(input[1]))));
        }
        Collections.sort(cups, (Cup o1, Cup o2)->Integer.compare(o1.radius, o2.radius));

        cups.forEach((o) -> System.out.println(o.colour));
    }

    public static class Cup {
        String colour;
        int radius;

        Cup(String colour, int radius) {
            this.colour = colour;
            this.radius = radius;
        }
    }
}
