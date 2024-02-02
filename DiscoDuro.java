public class DiscoDuro extends DispositivoAlmacenamiento {
    public DiscoDuro(String nombre, float capacidad, int rpm) {
        super(nombre, capacidad, rpm);
    }

    @Override
    public void girar() {
        System.out.println("Estoy girando a " + getRpm() + "rpm.");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribo los datos con un cabezal magnético.");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leo los datos con un cabezal magnético.");
    }
}
