import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method3();

    }
    public static void method1(int[]array){
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(1,50);
        sum+=array[i];
        System.out.println(array[i]);
        }
        System.out.println("Сумма="+sum+" "+"Арифметикалык орточо саны:"+(sum/12d));
    }
    public static void method2() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        while (age != 0) {
            if (age <= 18) {
                System.out.println("Унаа айдаганга болбойт!");
            } else if (age > 18 && age < 60) {
                System.out.println("Унаа айдаганга болот");
            } else if (age > 60) {
                System.out.println("Унаа айдаганга такыр болбойт!");
            } else {

            }
            age = scanner.nextInt();
        }
        
        }
        public static void method3 () {

        int [] massiv = new int[12];
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==1){
            method1(massiv);
        }else if (a==2){
            method2();
        }else {
            System.out.println("ERROR!");
        }

        }

}