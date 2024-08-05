/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio;

/**
 *
 * @author sebas
 */
public class DatosFactura {
    private String nombreCliente;
    private int cedulaCliente;
    private int codigoFactura;
    private int montoFactura;
    private double bonoElectricos;
    private double bonoAutomotrices;
    private double bonoConstruccion;
    private double bonoMayor;
    private double bonoExtra;

    // Constructor
    public DatosFactura(String nombreCliente, int cedulaCliente, int codigoFactura, int montoFactura, 
                        double bonoElectricos, double bonoAutomotrices, double bonoConstruccion, 
                        double bonoMayor, double bonoExtra) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.bonoElectricos = bonoElectricos;
        this.bonoAutomotrices = bonoAutomotrices;
        this.bonoConstruccion = bonoConstruccion;
        this.bonoMayor = bonoMayor;
        this.bonoExtra = bonoExtra;
    }

    // Métodos getter y setter
    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public double getBonoElectricos() {
        return bonoElectricos;
    }

    public double getBonoAutomotrices() {
        return bonoAutomotrices;
    }

    public double getBonoConstruccion() {
        return bonoConstruccion;
    }

    public double getBonoMayor() {
        return bonoMayor;
    }

    public double getBonoExtra() {
        return bonoExtra;
    }
}