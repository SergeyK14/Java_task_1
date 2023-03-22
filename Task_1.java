import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class Task_1 {
    public static void main(String[] args) {
       System.out.println("Введите число: ");
       Scanner iScanner = new Scanner(System.in);
       Integer number = iScanner.nextInt();
       int sum = 0;
       int fr = 1;
       for (int i = 1; i <= number; i++){
           sum = sum + i; 
           fr = fr * i;
       }
    System.out.printf("Сумма: %s; Факториал: %s ", sum, fr);
    iScanner.close();
    }
}