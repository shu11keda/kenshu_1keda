import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //　ここから
        if(!sc.hasNextInt()){
                // 入力エラー防ぐ                
            System.out.println("入力されていません");
            return;
        }
        int score = sc.nextInt();
        int age = sc.nextInt();
        
        if(score == 100){
            System.out.println("特待生");
        }else if(score >= 99 && score <= 70){
            System.out.println("合格");
        }else if(score >= 69){
            System.out.println("不合格");
        }

        if(age < 0 || age > 120){
            System.out.println("正しい年齢を入力して下さい");
        }else if(age <= 3){
            System.out.println("入場料は無料です");
        }else if(age <= 12){
            System.out.println("入場料は子供料金の５００円です");
        }else if(age <= 64){
            System.out.println("入場料は子供料金の１０００円です");
        }else if(age <= 120){
            System.out.println("入場料は高齢者料金の８００円です");
        }
        //　ここまでifMan

        // ここから

        System.out.println("★ 九九表(1~9) ★");
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= 9; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        for(int a = 1;a <= 100;a++){
            a += a;
        }
        System.out.println(a);
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
            // えらーはじく
                System.out.println("入力エラー");
                break;
        } 

        switch(2){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("その他");
                break;
        }
        // ここまでswitchMan
    }
}