public class BlueRay extends DispositivoAlmacenamiento implements Almacenable {
    public BlueRay(String nombre, float capacidad, int rpm) {
        super(nombre, capacidad, rpm);
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribo los datos con un láser.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leo los datos con un láser.");
    }
}
