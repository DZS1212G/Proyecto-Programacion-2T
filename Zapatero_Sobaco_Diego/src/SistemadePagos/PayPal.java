/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadePagos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author zapsobdi
 */
public class PayPal implements MetodoPago {

    private double importe;
    private String correoElec;

    @Override
    public void pagar(double cantidad) {
        this.importe = cantidad;
    }

    @Override
    public String obtenerComprobante() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Comprobante de Pago: \nFecha del pago: " + now.format(dtf) + "\nImporte Pagado: " + this.importe + "\nCorreo Destinatario: " + correoElec;
    }

    public String get() {
        return correoElec;
    }


    @Override
    public void set(String cadena) {
         this.correoElec = cadena;
    }

   

}
