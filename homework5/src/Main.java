public class Main {
    public static void main(String[] args) {

       int a = 99;
       int b = 12;
       int c = 11;
       int d = 7;

       int sum1 = a + c;
       int sum2 = b + d;
       boolean compare1 = sum1 > sum2;
       System.out.println(compare1);
       sum1 = ++sum1;
       System.out.println(sum1);
       sum2 = sum2-2;
       System.out.println(sum2);
       boolean compare2 = sum1 > sum2;
       System.out.println(compare2);


       boolean isEven = sum1%2 == 0 || sum2%2 == 0;

       System.out.println(isEven);


    }
}