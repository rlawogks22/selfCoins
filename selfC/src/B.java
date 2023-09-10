import java.util.Scanner;

public class B { // 세탁기

    public void run(int mode){
      //  String [] arr = {"평균","찬물","이불","헹굼","개인온도"};
        C d = new C();
        System.out.print("세탁 코스 : ");
        d.mod(mode);
        if(mode == 1){
        //    System.out.println(arr[0]);
            System.out.println("물온도 : 3 / 헹굼횟수 : 3 / 탈수횟수 : 3");
        }
        else if(mode == 2){
          //  System.out.println(arr[1]);
            System.out.println("물온도 : 1 / 헹굼횟수 : 3 / 탈수횟수 : 3");
        }
        else if(mode == 3){
            //System.out.println(arr[2]);
            System.out.println("물온도 : 5 / 헹굼횟수 : 5 / 탈수횟수 : 5");
        }
        else if (mode == 4) {
        //    System.out.println(arr[3]);
            System.out.println("물온도 : 1 / 헹굼횟수 : 8 / 탈수횟수 : 5");
        }
        else if (mode == 5 ) {
            //System.out.println(arr[4]);
            System.out.print("물온도 / 헹굼횟수 / 탈수 횟수를 입력해 주세요 : ");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            System.out.printf("물온도 : %d / 헹굼횟수 : %d / 탈수횟수 : %d",a,b,c);
        }
        else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}


