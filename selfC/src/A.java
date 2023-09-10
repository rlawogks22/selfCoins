import java.util.Scanner;

public class A { // 건조기
    private int mode;

    public A(int mode){
        this.mode = mode;
    }
    public void mod(C c){
        c.mod(mode);
    }
    public void run(B b){
        C d = new C();
        b.run(mode);
        System.out.println("건조를 시작하시겠습니까?");
        System.out.println("1. 건조 시작 / 2. 세탁 종료");
        Scanner sc = new Scanner(System.in);
        int gun = sc.nextInt();
        if(gun == 1 ){
            System.out.print("건조 코스 : ");
            d.mod(mode);
        } else if (gun == 2){
            System.out.println("세탁 종료");
        } else {
            System.out.println("잘못 선택하셨습니다.");
        }
    }

}
