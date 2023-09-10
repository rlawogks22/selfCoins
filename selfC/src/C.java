import java.util.Scanner;

public class C {
    public void mod(int mode){
        String [] arr = {"평균","찬물","이불","헹굼","개인온도"};
        if(mode == 1){
            System.out.println(arr[0]);
        }
        else if(mode == 2){
            System.out.println(arr[1]);
        }
        else if(mode == 3){
            System.out.println(arr[2]);
        }
        else if (mode == 4) {
            System.out.println(arr[3]);
        }
        else if (mode == 5 ) {
            System.out.println(arr[4]);
        }
    }
}