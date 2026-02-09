/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author zapsobdi
 */
public class Web {

    public static void main(String[] args) {
        MetodoPago pg;
        Bizum bz = new Bizum(12);
        PayPal pp = new PayPal("12");
        Tarjeta tj = new Tarjeta("125");
        pg = bz;
        try {
            System.out.println(pg.obtenerComprobante());
        } catch (Exception e) {
            System.out.println("ERROR No se ha elegido metodo");
        }

    }
}
