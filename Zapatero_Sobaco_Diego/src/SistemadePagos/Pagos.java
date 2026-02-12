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
//Padre de todos los metodos de pagos en el cual creamos el metodo pagar y el atributo protected para que accedan a el

    protected double importe;
//creo metodo get y set para poder acceder desde cada hijo y usar polimorfismo

    abstract void set(String cadena);

    abstract String get();

    @Override //
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public abstract String obtenerComprobante();
}
