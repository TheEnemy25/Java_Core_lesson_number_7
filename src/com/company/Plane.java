package com.company;

public abstract class Plane {

    private static final int minInt = 22;
    private static final int maxInt = 88;
    private static final float minFloat = 0;
    private static final float maxFloat = 1000;
    private String length;
    private String width;
    private String weight;


    public Plane(String length, String width, String weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void StartingEngines(){
        int random_int = (int)Math.floor(Math.random()*(maxInt-minInt+1)+minInt);
        System.out.println("Запускаємо двигуни літака " + random_int + " секунд залишилось до готовності влетіти");
    }

    public void TakeOffPlane(){
        float random_int = (float)(Math.random()*(maxFloat-minFloat+1)+minFloat);
        System.out.println("Проводимо взліт літака " + random_int + " - кілометрів проїде літак");
    }

    public void LandingOfPlane() {
        System.out.println("Літак іде на посадку");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", weight='" + weight + '\'' ;
    }

}
