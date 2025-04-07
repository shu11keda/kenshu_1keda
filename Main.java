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

        // ここまでforMan

        //　ここから

        // ここまでswitchMan
    }
}