import java.util.Scanner;

class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        if(N%2==0) {
            System.out.print("Bob");
        }
        else System.out.print("Alice");
    }
}
