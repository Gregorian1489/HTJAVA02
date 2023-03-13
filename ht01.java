/**Дано четное число N (>0) и символы c1 и c2. Написать метод, 
 * который вернет строку длины N, которая состоит из чередующихся 
 * символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab" */
import java.util.Scanner;
public class ht01 {

    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину строки N: ");
        int x = sc.nextInt();
        System.out.println("Введите первый символ: ");
        //char y = (char) System.in.read (); оставил для себя)))
        char y = sc.next().charAt(0);
        System.out.println("Введите второй символ: ");
        char z = sc.next().charAt(0); 
        //char z = reader.nextChar(); аналогично 
        sc.close();  

        System.out.println(buildString(x , y , z));


        
    }
    static String buildString(int n, char c1, char c2){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            res.append(c1).append(c2);
        }
        return res.toString();
    }

 }