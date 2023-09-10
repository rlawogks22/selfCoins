//세탁방


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("세탁 코스를 선택하십시오. 1.평균/ 2.찬물/ 3.이불/ 4.헹굼/ 5.개인설정");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        A a = new A(number);
        B b = new B();
        C c = new C();


        a.run(b);




    }
}