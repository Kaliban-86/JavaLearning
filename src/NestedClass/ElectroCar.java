package NestedClass;

public class ElectroCar {
    int id;
    static int idToBattery = 77;

    ElectroCar(int id) {
        this.id = id;
    }

    // Вложенные нестатитеческие классы - имеет доступ к нестатическим полям класса
    class Motor {
        void startMotor() {
            System.out.println("Motor of electroCar number " + id + " is starting...");
        }
    }

    //  вложенный статический класс...
    static class Battery {
        void charging() {
            System.out.println("Battery number " + idToBattery + " is charging...");
        }
    }


    void startCar() {
        final String SOND_OF_MOTOR = "RRRRRRRRRR";
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("ElectroCar number " + id + " is starting...");


        class MotorSound {
            void soundRRR() {
                System.out.println("Car number " + id + " Motor sound is " + SOND_OF_MOTOR); // имеет доступ к переменным метода и к переменным класса
            }
        }
        MotorSound motorSound = new MotorSound();
        motorSound.soundRRR();
    }
}
