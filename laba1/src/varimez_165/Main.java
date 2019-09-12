package varimez_165;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int a=0;//Объявляние и инициализация переменной,считающей количество "отклонений" от задачи.
        System.out.println("Enter size of yor array.");
        Scanner sc = new Scanner(System.in);//Ввод размера массива.
        int size = sc.nextInt();
        System.out.println("Size of your array is " + size);
        int[] mas = new int[size];
        System.out.println("Enter " + size + " elements of array.");


        for (int i = 0; i < size; i++) {
            mas[i] = sc.nextInt();
        }//Заполнение массива элементами.

        System.out.println("The array is full.");//Сообщении о конце заполнения массива.

        System.out.println("Your array.");
        for (int i = 0; i < size; i++) {
            System.out.println(mas[i]);
        }//Вывод массива для проверки.

        for (int i = 0; i < size-1; i++)
        {
            if(mas[i]>mas[i+1])//Проверка условия.
            {
                a=a+1;//Инкрементация "проверочной" переменной.
            }
        }
        System.out.println("inconsistencies=" +a);//Вывод количества "отклонений от условия"

        if(a>0)//Если "отклоение от условия" произошло хоть раз,то будет выведено "false"
        {
            System.out.println("false");
        }
        else// В другом случае выводится"true"
        {
            System.out.println("true");
        }

    }
}










