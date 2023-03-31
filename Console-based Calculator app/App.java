import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, m, r;
       
        boolean f = true;

        while (f) {
            System.out.println("Calculation Functionality List - ");
            System.out.println("Please Select any one  operation: ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5. Percentage");
            System.out.println("6.Factorial");
            System.out.println("7.Square");
            System.out.println("8.Cube");
             System.out.println("9.Square Root");
              System.out.println("10.a Power b");
               System.out.println("11.a Root b");
       

            

            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Addition");
                    System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                    r= n+m;
                    System.out.println(r);
                    break;
                case 2:
                   System.out.println("Subtraction");
                    System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                    r= n-m;
                    System.out.println(r);
                    break;
                case 3:
                    System.out.println("Multiplication");
                      System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                    r= n*m;
                    System.out.println(r);
                    break;
                    
                case 4:
                    System.out.println("Division ");
                     System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                    r= n/m;
                    System.out.println(r);
                    break;
                case 5:
                System.out.println("Percentage");
                System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                    double per = (n /m) * 100;
                    System.out.println(per);
                    break;

             case 6:
             System.out.println("factorial");
                int aa=sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <=aa; i++) {
                       fact=fact*i;
                    }
                    System.out.println(fact);
                    break;
             case 7:
             System.out.println("7.Square");
             int aaa=sc.nextInt();
             int ans=aaa*aaa;
             System.out.println(ans);
             break;
             case 8:
             System.out.println("8.Cube");
             int aaaa=sc.nextInt();
             int ans1=aaaa*aaaa*aaaa;
             System.out.println(ans1);
             break;
             case 9:
             System.out.println("9.Square Root");
             int aaaaa=sc.nextInt();
             int ans2=(int)Math.sqrt(aaaaa);
             System.out.println(ans2);
             break;

             case 10:
             System.out.println("10.a Power b");
             System.out.print("Enter n: ");
                    n= sc.nextDouble();
                    System.out.print("Enter m ");
                    m = sc.nextDouble();
                double ans3=Math.pow(n,m);
                System.out.println(ans3);
             case 11:
             System.out.println("11.a Root b");
             System.out.print("Enter n: ");
              n = sc.nextDouble();
             System.out.print("Enter m: ");
             m = sc.nextDouble();
             double ans4 = Math.pow(n, 1/m);
             System.out.println(ans4);
             break;
             default:
             System.out.println("Invalid selection");    
            }
        }

        sc.close();
    }
}
