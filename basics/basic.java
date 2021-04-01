import java.util.*;
public class basic{

    public static void prime(int n){
        boolean flag =  true;
        for(int i=2; i*i<=n; i++){
            if( n%i == 0 ){
                flag = false;
                break;
            }
        } 
        if(flag){
            System.out.println("prime");
        } 
        else{
            System.out.println("not prime");
        }
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        // int number = Integer.parseInt(scn.nextLine());
        // String str = scn.nextLine();
        // int number1 = Integer.parseInt(scn.nextLine());
        // String str1 = scn.next();
        // System.out.println(number +" " + str + " " + number1 + " " + str1);

        // byte A = 'A';
        // byte a = 'a';
        // char b = 'A';
        // System.out.println(A + " " + a + " " + b);

        // // Switch case in java
        // int day = 2;
        // switch(day){
        //     case 1 : 
        //         System.out.println("monday");
        //         break;
        //     case 2 :
        //         System.out.println("tuesday");
        //         break;
        //     default : 
        //         System.out.println("inside default");
        //         break;
        // }
        // String day1 = (day > 1) ? "free" : "exam";
        // System.out.println(day1);
        prime(77);
    }
}