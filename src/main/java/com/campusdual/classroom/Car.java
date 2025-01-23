package com.campusdual.classroom;

public class Car {

    public static final int MAX_SPEED = 120;

    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    // Constructor vacío
    public Car() {
    }

    // Constructor con parámetros
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    // Inicia el coche, si no está encendido!!
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;  // Cuando se enciende, se coloca un valor distinto de cero
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    // Detiene el coche, si está detenido
    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;  // Cuando se apaga el coche, el tacómetro vuelve a cero
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo mientras está en movimiento");
        }
    }

    // Acelera el coche, sin exceder la velocidad máxima.
    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
            System.out.println("Acelerando. Nueva velocidad: " + this.speedometer);
        } else {
            System.out.println("Velocímetro al máximo: " + MAX_SPEED);
        }
    }

    // Frena el coche, sin pasar de velocidad negativa
    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            System.out.println("Frenando. Nueva velocidad: " + this.speedometer);
        } else {
            System.out.println("El coche ya está detenido");
        }
    }

    // Cambia el ángulo de las ruedas
    public void turnAngleOfWheels(int angle) {
        int newAngle = this.wheelsAngle + angle;
        if (newAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println("El volante ya está al máximo giro a la derecha: " + wheelsAngle);
        } else if (newAngle < -45) {
            this.wheelsAngle = -45;
            System.out.println("El volante ya está al máximo giro a la izquierda: " + wheelsAngle);
        } else {
            this.wheelsAngle = newAngle;
            System.out.println("Nuevo ángulo del volante: " + this.wheelsAngle);
        }
    }

    // Verifica si el tacómetro es mayor que 0
    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    // Verifica si el tacómetro es igual a 0
    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

    // Pone el coche en reversa
    public void setReverse(boolean reverse) {
        if (this.speedometer == 0 && this.tachometer > 0) {
            if (this.reverse != reverse) {
                this.reverse = reverse;
                this.gear = reverse ? "R" : "N";
                System.out.println("El coche está en marcha " + this.gear);
            }
        } else {
            System.out.println("No se puede cambiar a reversa mientras el coche está en movimiento o apagado");
        }
    }

    // Muestramos los detalles del coche
    public void showDetails() {
        System.out.println("Coche: " + this.brand + " " + this.model);
        System.out.println("Velocidad: " + this.speedometer);
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle);
    }
}
