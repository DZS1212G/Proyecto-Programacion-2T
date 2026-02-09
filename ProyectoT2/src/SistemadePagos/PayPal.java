/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author zapsobdi
 */
public class PayPal implements MetodoPago {

    private double importe;
    private String correoElec;

    public PayPal(String correoElec) {
        this.correoElec = correoElec;
    }

    @Override
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public String obtenerComprobante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

}
