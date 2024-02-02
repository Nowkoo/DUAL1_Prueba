public class main {
    public static void main(String[] args) {
        pruebasCD();
        System.out.println();
        pruebasDiscoDuro();
    }

    static void pruebasCD() {
        DispositivoAlmacenamiento cd = new CD("Películas Inglés", 4.7f, 7200);
        System.out.println(cd);
        cd.girar();
        cd.escribirDatos();
        cd.leerDatos();
    }

    static void pruebasDiscoDuro() {
        DispositivoAlmacenamiento discoDuro = new DiscoDuro("Disco de Mar", 500, 7200);
        System.out.println(discoDuro);
        discoDuro.girar();
        discoDuro.escribirDatos();
        discoDuro.leerDatos();
    }
}
