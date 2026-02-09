/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author zapsobdi
 */
public class Bizum implements MetodoPago {

    private int numTel;
    private double importe;

    public Bizum(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public String obtenerComprobante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

}
