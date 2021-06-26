package com.company;

public class SettersAndGetters {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel(-125);
        car1.setName("Ласточка");
        car1.showCarParam(car1.getName(), car1.getModel());

    }
}

class Car {
    private int model;
    private String name;

    void setModel(int modelNumber) {

        if (modelNumber > 0) {
            model = modelNumber;
        } else System.out.println("Некорректный номер модели!!!!");

    }

    int getModel() {
        return model;
    }

    void setName(String modelName) {
        if (modelName.isEmpty()) {
            System.out.println("Некорректное название модели!!!");
        } else name = modelName;
    }

    String getName() {
        return name;
    }

    void showCarParam(String nameVar, int modelVar) {
        System.out.println("Вам представлена: " + nameVar + " " + modelVar + " модель");
    }
}