import java.util.Scanner;
import java.io.IOException;
import java.lang.*; //导入包
/*
 *@param args
 @return void
 */
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");//将输入的字符串以空格分割
        System.out.println(Float.valueOf(str[0]));//将字符串转换为浮点数
        switch(Integer.valueOf(str[1])){
            case 1:
                System.out.println("January");
                break;
        }
    }

}



