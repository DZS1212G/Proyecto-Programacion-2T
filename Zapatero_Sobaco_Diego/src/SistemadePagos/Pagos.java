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

    protected double importe;

    abstract void set(String cadena);

    abstract String get();

    @Override
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public abstract String obtenerComprobante();
}
