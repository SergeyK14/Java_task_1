import java.util.Scanner;

// Создать простой калькулятор

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner iScanner = new Scanner(System.in);
        Double number_1 = iScanner.nextDouble();
        
        Scanner iScanner_z = new Scanner(System.in);
        System.out.println("Введите знак: ");
        char znak = iScanner.next().charAt(0);
        
        Scanner iScanner_2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        Double number_2 = iScanner.nextDouble();
        
        double rez = 0;
        if (znak == '+'){
            rez = number_1 + number_2;
            System.out.println(rez);
        }
        if (znak == '-'){
            rez = number_1 - number_2;
            System.out.println(rez);
        }    
        if (znak == '*'){
            rez = number_1 / number_2;
            System.out.println(rez);
        }
        if (znak == '/'){
            rez = number_1 / number_2;
            System.out.println(rez);
        }     
        iScanner.close();
        iScanner_z.close();
        iScanner_2.close();
    }
}
