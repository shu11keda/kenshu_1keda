import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //　ここから
        if(!sc.hasNextInt()){
                
            System.out.println("入力されていません");
            return;
        }
        int score = sc.nextInt();
        
        if(score == 100){
            System.out.println("特待生");
        }else if(score >= 99 && score <= 70){
            System.out.println("合格");
        }else if(score >= 69){
            System.out.println("不合格");
        }
        //　ここまでifMan

        // ここから
            System.out.println("★ 九九表(1~9) ★\n");

            for(int i = 1;i <= 9;i++){
                for(int j = 1;j <= 9; j++){
                    System.out.println(i * j + "\t");
                }
                System.out.println();
            }
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