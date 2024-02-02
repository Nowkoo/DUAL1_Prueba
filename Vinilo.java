public class Vinilo extends DispositivoAlmacenamiento implements Almacenable {
    public Vinilo(String nombre, float capacidad, int rpm) {
        super(nombre, capacidad, rpm);
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribo los datos realizando surcos en mi superficie.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leo los datos con una aguja.");
    }
}
