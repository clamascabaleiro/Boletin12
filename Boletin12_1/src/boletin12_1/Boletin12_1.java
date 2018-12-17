package boletin12_1;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin12_1 {

    public static void main(String[] args) {
        Garaje vigo = new Garaje();
        vigo.setCoche("AAA1213", "ford");
        Garaje vigo2 = new Garaje();
        vigo2.setCoche("AAA1213", "seat");
        vigo.comprobacionPlazas();
        vigo2.comprobacionPlazas();
        vigo2.calcularPrecio();
        vigo.calcularPrecio();
    }
}
