import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Student Piotr=new Student();
          Student Kamil=new Student();
          Student Antek=new Student();
          Student[]tab=new Student[3];
          tab[0]=Piotr;
          tab[1]=Kamil;
          tab[2]=Antek;

        for(int i=0;i<tab.length;i++)
        {
            System.out.println(tab[i]);
        }
        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
    }
}
