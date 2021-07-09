package NestedClass;

public class TestClass {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(38);
        electroCar.startCar();

        //ElectroCar.Motor motor = new ElectroCar.Motor(77);  всвязи с тем, что класс не static  не получается...

        ElectroCar.Battery battery = new ElectroCar.Battery();
        battery.charging();
    }
}
