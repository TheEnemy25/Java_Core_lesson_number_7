package com.company;
import java.util.Random;

public class PlaneControl {

    private int randomnumber;
    private Random planeControl;

    public PlaneControl(int randomnumber) {
        this.randomnumber = randomnumber;
        planeControl = new Random();
    }

    public void MoveUp(){
        int int_random = planeControl.nextInt(randomnumber);
        System.out.println("Рух вверх: " + int_random);
    }

    public void MoveDown(){
        int int_random = planeControl.nextInt(randomnumber);
        System.out.println("Рух вниз: " + int_random);
    }

    public void MoveLeft(){
        int int_random = planeControl.nextInt(randomnumber);
        System.out.println("Рух вліво: " + int_random);
    }

    public void MoveRight(){
        int int_random = planeControl.nextInt(randomnumber);
        System.out.println("Рух вправо: " + int_random);
    }


    @Override
    public String toString() {
        return "randomnumber=" + randomnumber;
    }
}
