package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

 

        //Ödev :Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner inp = new Scanner(System.in);
        int k ;
        double sum=0,count=0;

        System.out.println("Bir sayı giriniz:");
        k = inp.nextInt();

        for(int i=1;i<=k;i++){
            if(i%3==0 && i%4 == 0){
                sum = sum+i;
                count++;


            }
        }
        double average = (sum/count);
        System.out.println("Girilen sayıya kadar olan kısımda 3 ve 4 e bölünen sayıların ortalaması:");
        System.out.println(average);


            }
        }