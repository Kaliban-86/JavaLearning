package com.company;

public class SettersAndGetters {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel(-125);
        car1.setName("Ласточка");
        car1.showCarParam(car1.getName(), car1.getModel());

        Car car2 = new Car();
        car2.setModel(125);
        car2.setName("Волна");
        car2.showCarParam(car2.getName(), car2.getModel());


    }
}

class Car {
    private int model;
    private String name;

    void setModel(int model) {

        if (model > 0) {
            this.model = model;
        } else System.out.println("Некорректный номер модели!!!!");

    }

    int getModel() {
        return model;
    }

    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Некорректное название модели!!!");
        } else this.name = name;
    }

    String getName() {
        return name;
    }

    void showCarParam(String nameVar, int modelVar) {
        System.out.println("Вам представлена: " + nameVar + " " + modelVar + " модель");
    }
}