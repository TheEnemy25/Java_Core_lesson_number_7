package com.company;

public class Cy27 extends Plane implements Airplanable {

    private static final int maxSpeed = 100;
    private String color;
    private PlaneControl planeControl = new PlaneControl(100);

    public Cy27(String length, String width, String weight, String color) {
        super(length,width,weight);
        this.color = color;
    }

    public void completeOperation(){
        super.StartingEngines();
        super.TakeOffPlane();
        planeControl.MoveUp();
        planeControl.MoveDown();
        planeControl.MoveLeft();
        planeControl.MoveRight();
        StealthTechnology();
        NuclearStrike();
        TurboAcceleration();
        super.LandingOfPlane();
    }

    @Override
    public void TurboAcceleration() {
        int minTurboSpeed = 10;
        int maxTurboSpeed = 20;
        int speedTurbo = maxSpeed + (int)Math.floor(Math.random()*(maxTurboSpeed-minTurboSpeed+1)+minTurboSpeed);
        System.out.println("Включаємо турбоприскорення і тікаємо " + speedTurbo + "км/год - наша швидкість");
    }

    @Override
    public void StealthTechnology() {
        int minSec = 5;
        int maxSec = 50;
        int noVision = (int)Math.floor(Math.random()*(maxSec-minSec+1)+minSec);
        System.out.println("Включаємо технологію стелс на " + noVision + " секунд");
    }

    @Override
    public void NuclearStrike() {
        int minBomb = 1;
        int maxBomb = 10;
        int dropBomb = (int)Math.floor(Math.random()*(maxBomb-minBomb+1)+minBomb);
        System.out.println("Проводимо ядерний удар " + dropBomb + " бомб скинуто");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color='" + color + '\'' +
                ", planeControl=" + planeControl +
                '}' ;
    }
}
