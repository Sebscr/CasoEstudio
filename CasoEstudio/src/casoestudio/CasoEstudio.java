/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio;

/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;
public class CasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int CantidadFacturas= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de facturas que desea generar: "));
       DatosVendedor [] arrDatosVendedor= new DatosVendedor[CantidadFacturas];
       DatosFactura [] arrDatosFactura= new DatosFactura[CantidadFacturas];
       
       Contador contador= new Contador();
       
       double totalVentas = 0.0;
       double totalBonos = 0.0;
       int puntosTotales = 0;
       
       for (int i=0; i < CantidadFacturas; i++){
           String NombreSucursal= JOptionPane.showInputDialog(null,"Ingrese el nombre de la sucursal: ");
           String NombreVendedor= JOptionPane.showInputDialog(null,"Ingrese el nombre del vendedor: ");
           int CedulaVendedor= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula del vendedor: "));
           String CodigoVendedor= JOptionPane.showInputDialog(null,"Ingrese el codigo del vendedor: ");
           arrDatosVendedor [i]= new DatosVendedor(NombreSucursal, NombreVendedor, CodigoVendedor, CedulaVendedor);
    }
     for (int x=0; x < CantidadFacturas; x++){
         String NombreCliente= JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente: ");
         int CedulaCliente= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula del cliente: "));
         int CodigoFactura= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la factura: "));
         int MontoFactura= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto de la factura: "));
         
         double bonoElectricos= 0.0;
         double bonoAutomotrices= 0.0;
         double bonoConstruccion= 0.0;
         double bonoMayor= 0.0;
         double bonoExtra= 0.0;
         
         
         String[] opciones = {"1.Enero","2.Febrero","3.Marzo","4.Abril","5.Mayo","6.Junio","7.Julio","8.Agosto","9.Septiembre","10.Octubre","11.Noviembre","12.Diciembre"};
             int opcion= JOptionPane.showOptionDialog(
                     null,
                     "Seleccione un Mes:",
                     "Meses",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.INFORMATION_MESSAGE,
                     null,
                     opciones,
                     opciones[0]
             );
         String Mes= opciones[opcion];
         String[] opcionesElectricos= {"Si","No"};
             int opcionElectricos= JOptionPane.showOptionDialog(
                     null,
                     "¿ La factura incluye productos electricos ?",
                     "Productos Electricos",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.INFORMATION_MESSAGE,
                     null,
                     opcionesElectricos,
                     opciones[0]     
             );
             boolean ProductosElectricos = opcionElectricos == 0;
         if (opcionElectricos == 0){
             double CantidadProductosElectricos= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos electricos: "));
             if (CantidadProductosElectricos >= 3){
                 contador.agregarPuntos(1);
                 bonoElectricos= MontoFactura * (0.04);
                 totalBonos += bonoElectricos;
             }
             else{
                contador.agregarPuntos(1);
                bonoElectricos= MontoFactura * (0.02);
                totalBonos += bonoElectricos;
             }
             }
         String[] opcionesAutomotrices= {"Si","No"};
             int opcionAutomotrices= JOptionPane.showOptionDialog(
                     null,
                     "¿ La factura incluye productos automotrices ?",
                     "Productos Automotrices",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.INFORMATION_MESSAGE,
                     null,
                     opcionesAutomotrices,
                     opciones[0]     
             );
             boolean ProductosAutomotrices = opcionAutomotrices == 0;
             if (opcionAutomotrices == 0){
             double CantidadProductosAutomotrices= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos automotrices: "));
             if (CantidadProductosAutomotrices >= 4){
                 contador.agregarPuntos(1);
                 bonoAutomotrices= MontoFactura * (0.04);
                 totalBonos += bonoAutomotrices;
             }
             else {
                 contador.agregarPuntos(1);
                 bonoAutomotrices= MontoFactura * (0.02);
                 totalBonos += bonoAutomotrices;
             }
             }
             String[] opcionesConstruccion= {"Si","No"};
             int opcionConstruccion= JOptionPane.showOptionDialog(
                     null,
                     "¿ La factura incluye productos de construccion ?",
                     "Productos de Construccion",
                     JOptionPane.DEFAULT_OPTION,
                     JOptionPane.INFORMATION_MESSAGE,
                     null,
                     opcionesConstruccion,
                     opciones[0]     
             );
             boolean ProductosConstruccion = opcionConstruccion == 0;
             if (opcionConstruccion == 0){
             double CantidadProductosConstruccion= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos de Construccion: "));
                 contador.agregarPuntos(1);
                 bonoConstruccion= MontoFactura * (0.08);
                 totalBonos += bonoConstruccion;
             
             }
             if (MontoFactura > 50000){
                 bonoMayor= MontoFactura * (0.05);
                 contador.agregarPuntos(1);
             }
             if (CantidadFacturas > 10 || MontoFactura > 300000){
                 bonoExtra= MontoFactura + (20000);
             }
              arrDatosFactura[x] = new DatosFactura(
                NombreCliente, 
                CedulaCliente, 
                CodigoFactura, 
                MontoFactura, 
                bonoElectricos, 
                bonoAutomotrices, 
                bonoConstruccion, 
                bonoMayor, 
                bonoExtra
            );
    totalVentas += MontoFactura;
    totalBonos += bonoElectricos + bonoAutomotrices + bonoConstruccion + bonoMayor + bonoExtra;
    puntosTotales = contador.obtenerPuntos(); 
     }
     DatosVendedor vendedor = arrDatosVendedor[0]; 
        JOptionPane.showMessageDialog(null,
            "El Agente Vendedor \"" + vendedor.getNombreVendedor() + "\" código: " + vendedor.getCodigoVendedor() + " en el mes de junio.\n" +
            "• Vendió un total de " + totalVentas + " en facturas\n" +
            "• Obtuvo un total en comisiones de " + totalBonos + "\n" +
            "• El agente vendedor " + (totalBonos >= 20000 ? "logró" : "no logró") + " el objetivo de llegar al BONO EXTRA.\n" +
            "• Puntos obtenidos por el vendedor: " + puntosTotales + "\n" +
            "• Sucursal: " + vendedor.getNombreSucursal()
        );
     
            
     
}
}
