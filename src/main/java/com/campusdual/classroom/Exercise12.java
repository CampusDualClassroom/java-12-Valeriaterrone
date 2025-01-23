package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car();

        // Comprobamos si el tacómetro es cero y, si es así, arrancamos el coche
        System.out.println("¿Tacómetro igual a cero? " + myCar.isTachometerEqualToZero());
        if (myCar.isTachometerEqualToZero()) {
            myCar.start();
        }

        // Intentamos arrancar el coche cuando ya está encendido
        if (myCar.isTachometerGreaterThanZero()) {
            System.out.println("El coche ya está encendido.");
            myCar.start();
        }

        // Detenemos el coche
        myCar.stop();
        System.out.println("¿Tacómetro igual a cero después de apagar? " + myCar.isTachometerEqualToZero());

        // Arrancamos el coche nuevamente y aceleramos
        myCar.start();
        myCar.accelerate();  // aumentar la velocidad

        // Intentamos detener el coche mientras está en movimiento
        myCar.stop();  // No debería detenerse ya que está en movimiento

        // Frenamos el coche hasta que esté detenido por completo
        myCar.accelerate();
        myCar.brake();  //reducir la velocidad
        myCar.speedometer = 120;
        myCar.accelerate();  // Intentamos superar la velocidad máxima
        myCar.brake();  // Frenamos

        // Giramos el volante
        myCar.turnAngleOfWheels(20);  //cambia el ángulo
        myCar.turnAngleOfWheels(200); // Debería quedar en 45 (máximo)
        myCar.turnAngleOfWheels(-200); // Debería quedar en -45 (máximo)

        // Ponemos el coche en reversa
        myCar.setReverse(true);  //cambiar la marcha a reversa

        // Intentamos ponerlo en reversa mientras está en movimiento
        myCar.speedometer = 20;
        myCar.setReverse(true);  // No debería cambiar a reversa

        // Mostraremos los detalles del coche
        myCar.showDetails();
    }

}