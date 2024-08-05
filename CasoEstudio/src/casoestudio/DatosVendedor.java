/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio;

/**
 *
 * @author sebas
 */
public class DatosVendedor {
    private String NombreSucursal;
    private String NombreVendedor;
    private String CodigoVendedor;
    private int CedulaVendedor;
    
    public DatosVendedor(String NombreSucursal, String NombreVendedor, String CodigoVendedor, int CedulaVendedor) {
        this.NombreSucursal = NombreSucursal;
        this.NombreVendedor = NombreVendedor;
        this.CodigoVendedor = CodigoVendedor;
        this.CedulaVendedor = CedulaVendedor;
    }

    // Getters y Setters
    public String getNombreSucursal() {
        return NombreSucursal;
    }

    public void setNombreSucursal(String NombreSucursal) {
        this.NombreSucursal = NombreSucursal;
    }

    public String getNombreVendedor() {
        return NombreVendedor;
    }

    public void setNombreVendedor(String NombreVendedor) {
        this.NombreVendedor = NombreVendedor;
    }

    public String getCodigoVendedor() {
        return CodigoVendedor;
    }

    public void setCodigoVendedor(String CodigoVendedor) {
        this.CodigoVendedor = CodigoVendedor;
    }

    public int getCedulaVendedor() {
        return CedulaVendedor;
    }

    public void setCedulaVendedor(int CedulaVendedor) {
        this.CedulaVendedor = CedulaVendedor;
    }
}
