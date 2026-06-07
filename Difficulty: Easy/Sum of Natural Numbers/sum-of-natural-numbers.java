import java.util.Scanner;

class GFG {
    static int sumOfNatural(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return n+sumOfNatural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        System.out.println(sumOfNatural(n));
    }
}