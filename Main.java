import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //　ここから
        
        //　ここまでifMan

        // ここから

        // ここまでforMan

        //　ここから
        if(!sc.hasNextInt()){
            System.out.println("入力されていません");
            return;
        }
        int day = sc.nextInt();
        
        switch(day){
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                System.out.println("入力エラー");
                break;
        } 
        // ここまでswitchMan
    }
}