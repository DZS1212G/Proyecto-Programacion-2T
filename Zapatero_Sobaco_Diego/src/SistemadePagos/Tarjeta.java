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
public class Tarjeta extends Pagos {

    private String numTarjeta;

    @Override
    public String obtenerComprobante() {
        String ultimosNum = "";
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (int i = 11; i < 15; i++) {
            ultimosNum += numTarjeta.charAt(i);
        }
        return this.getClass().getSimpleName() + "\nComprobante de Pago: \nFecha del pago: " + now.format(dtf) + "\nImporte Pagado: " + this.importe + "\nNumero de Tarjeta: ************" + ultimosNum;
    }

    @Override
    public String get() {
        return numTarjeta;
    }

    @Override
    public void set(String cadena) {
        this.numTarjeta = cadena;
    }

}
