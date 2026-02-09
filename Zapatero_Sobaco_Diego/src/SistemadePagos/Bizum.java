/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

/**
 *
 * @author zapsobdi
 */
public class Bizum implements MetodoPago {

    private int numTel;
    private double importe;

    @Override
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public String obtenerComprobante() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.getClass().getSimpleName() + "\nComprobante de Pago: \nFecha del pago: " + now.format(dtf) + "\nImporte Pagado: " + this.importe + "\nTelefono Receptor: " + numTel;
    }

    public int getNumTel() {
        return numTel;
    }

    @Override
    public void set(String cadena) {
        this.numTel = Integer.parseInt(cadena);
    }

}
