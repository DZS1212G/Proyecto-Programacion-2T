/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemadePagos;

/**
 *
 * @author zapsobdi
 */
public interface MetodoPago {

    void pagar(double cantidad);

    String obtenerComprobante();
}
