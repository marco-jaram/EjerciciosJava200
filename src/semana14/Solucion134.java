package semana14;

public class Solucion134 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche();
        vehiculos[1] = new Motocicleta();
        vehiculos[2] = new Avion();

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
        }
    }
}

class Vehiculo {
    public void arrancar() {
        System.out.println("Vehículo arrancando...");
    }
}

class Coche extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El coche arranca girando la llave.");
    }
}

class Motocicleta extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La motocicleta arranca presionando el botón de encendido.");
    }
}

class Avion extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El avión arranca al encender los motores.");
    }
}
