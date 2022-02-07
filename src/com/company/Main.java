package com.company;

public class Main {

    public static void main(String[] args) {

      Cy27 planeControl = new Cy27("Довжина літака 20 метрів","Ширина літака 10 метрів","Вага літака 10 тонн","Літак білого кольору");
      System.out.println(planeControl);
      planeControl.completeOperation();
    }
}
