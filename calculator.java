import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu, n1, n2;
        System.out.println("MENU:");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");

        System.out.println("enter your choice(1-4):");
         menu=sc.nextInt();
        System.out.println("enter a number n1:");
        n1=sc.nextInt();
        System.out.println("enter a number n2:");
        n2=sc.nextInt();
        switch (menu) {
            case 1:
            System.out.println("your answer is:"+(n1+n2));
            break;
            case 2:
            System.out.println("your answer is:"+(n1-n2));
            break;
            case 3:
            System.out.println("your answer is:"+(n1*n2));
            break;
            case 4:
            System.out.println("your answer is:"+(n1/n2));
            break;
        
            default:
            System.out.println("error");
            break;
        }

    }
}
