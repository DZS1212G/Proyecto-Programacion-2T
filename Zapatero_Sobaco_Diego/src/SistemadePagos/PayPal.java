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
public class PayPal extends Pagos {

   
    private String correoElec;


    @Override
    public String obtenerComprobante() { //clase sobrescrita de la interface creando un date time formatter para mostrar la hora a?adiendo los datos del PayPal
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.getClass().getSimpleName() + "\nComprobante de Pago: \nFecha del pago: " + now.format(dtf) + "\nImporte Pagado: " + this.importe + "\nCorreo Destinatario: " + correoElec;
    }

    @Override
    public String get() {
        return correoElec;
    }

    @Override
    public void set(String cadena) {
        this.correoElec = cadena;
    }

}
