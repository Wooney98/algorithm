import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(a >= b){
            if(a >= c) { // a가 가장 크거가 모두 같은 경우,
                if(b >= c){
                    System.out.println(b);
                }else {
                    System.out.println(c);
                }
            }else{
                System.out.println(a);
            }
        }else { // (a <= b)
            if(c <= b){ // b가 가장 큰 경우,
                if(c <= a){
                    System.out.println(a);
                }else {
                    System.out.println(c);
                }
            }else{
                System.out.println(b);
            }
        }
    }
}
