import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

//Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите положительное целое число: ");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        Integer number = iScanner.nextInt();
        SortedSet <Integer> resulSort = new TreeSet<>();
        if (number == 1){
            System.out.println(" ");
        }
        if (number == 2){
            resulSort.add (2);
        }
        if (number == 3){
            resulSort.add (2);
            resulSort.add (3);
        }
        if (number > 3){
            resulSort.add (2);
            resulSort.add (3);
            for (int i = 4; i <= number; i++){
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                       break;
                    }
                    else {
                        resulSort.add(i);
                    }
                } 
            }   
        }            
        System.out.println(resulSort);
        iScanner.close();
    }
}
        
      
        
        
        
        
        
        
        
        
//         int s = 4;
//         if (number>0 && number<=3){
//             for(int i = 1; i <= number; i++){
//                 resultList.add(i);
//             }
//         }
//         else {
//             resultList.add(1);
//             resultList.add(2);
//             resultList.add(3);
//             while (s <= number){
//                 //System.out.println(s);
//                 if (s % s == 0 && (s%2==0 || s%3==0)){
//                     resultList.add(0);
//                 }
//                 else{
//                     resultList.add(s);
//                 }
//                 s++;
//             }
//         }    
//         System.out.println(resultList);
//         iScanner.close();
//     }
// }
