/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author zapsobdi
 */
public class AppPagos {

    public static void main(String[] args) {
        Tarjeta tj1 = new Tarjeta("2012121202325658");
        System.out.println(tj1.obtenerComprobante());
    }
}
