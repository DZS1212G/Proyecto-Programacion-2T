/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author DZS1212
 */
public abstract class Pagos implements MetodoPago {

    abstract void set(String cadena);

    abstract String get();

    @Override
    public abstract void pagar(double cantidad);

    @Override
    public abstract String obtenerComprobante();
}
