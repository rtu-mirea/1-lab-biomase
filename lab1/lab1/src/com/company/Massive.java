package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Massive {

    int length;
    long [] array;

    // создание класса
    Massive(int length){
        this.length = length;
        array = new long[this.length];
    }

    // ручной ввод
    public void mInput(){
        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Вводите числа массива: ");
        for (int i = 0; i<array.length; i++){
            array[i] = inp.nextLong();
        }
    }

    // ввод случайными числами
    public void rInput(){
        for (int i=0; i<length; i++){
            array[i] = 1 + (long)(Math.random() * 1000);
        }
    }

    // вывод слева направо
    public void lOut(){
        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // вывод справа налево
    public void rOut(){
        for (int i = length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // задание №1
    public void task_1(){
        System.out.println("Введите необходимое число: ");
        Scanner inp = new Scanner(System.in);
        long num = inp.nextLong();
        boolean Roma = false;
        for (int i =0; i<length; i++){
           if (num == array[i]){
               Roma = true;
           break;}
            }
        if (Roma==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    // задание №2
   public void task_2(){
        long temp;
        for (int i = 0; i<this.length-1; i++){
            for (int j=0; j<this.length-i-1; j++){
                if(array[j]>array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;}
            }
        }
   }


}