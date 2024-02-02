public class main {
    public static void main(String[] args) {
        pruebas();
    }

    static void pruebas() {
        pruebasCD();
        pruebasDiscoDuro();
        pruebasBlueRay();
        pruebasVinilo();
        pruebasFrisbee();
        pruebasRueda();
    }

    static void pruebasCD() {
        DispositivoAlmacenamiento cd = new CD("Películas Inglés", 4.7f, 7200);
        System.out.println(cd);
        cd.girar();
        cd.escribirDatos();
        cd.leerDatos();
        System.out.println();
    }

    static void pruebasDiscoDuro() {
        DispositivoAlmacenamiento discoDuro = new DiscoDuro("Disco de Mar", 500, 7200);
        System.out.println(discoDuro);
        discoDuro.girar();
        discoDuro.escribirDatos();
        discoDuro.leerDatos();
        System.out.println();
    }

    static void pruebasBlueRay() {
        DispositivoAlmacenamiento blueRay = new BlueRay("El rey león", 12, 500);
        System.out.println(blueRay);
        blueRay.girar();
        blueRay.escribirDatos();
        blueRay.leerDatos();
        System.out.println();
    }

    static void pruebasVinilo() {
        DispositivoAlmacenamiento vinilo = new Vinilo("Abbey Road", 0.5f,33);
        System.out.println(vinilo);
        vinilo.girar();
        vinilo.escribirDatos();
        vinilo.leerDatos();
        System.out.println();
    }

    static void pruebasRueda() {
        ObjetoGiratorio rueda = new Rueda();
        System.out.println(rueda);
        rueda.girar();
    }

    static void pruebasFrisbee() {
        ObjetoGiratorio frisbee = new Frisbee();
        System.out.println(frisbee);
        frisbee.girar();
    }
}
