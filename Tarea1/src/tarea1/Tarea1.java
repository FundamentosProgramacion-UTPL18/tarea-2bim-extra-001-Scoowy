package tarea1;

/**
 *
 * @author Juan Gahona - Scoowy
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventasMes1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventasMes2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventasMes3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] ventaTotalSucursal = new double[4];
        double[] ventaPromSucursal = new double[4];

        double totalVentas = 0;

        /**
         * Estructura de columnas 1 
         * Col1  Col2  Col3  Col4  Col5  Col6 
         * %-15s %-15s %-15s %-15s %-15s %-15s
         */
        String reporteGeneral = String.format("Reporte\n\n%-15s%-15s%-15s%-15s%-15s%-15s\n\n", "", meses[0], meses[1], meses[2], "Total", "Promedio");

        for (int i = 0; i < sucursales.length; i++) {
            // Calculamos el total de cada sucursal
            ventaTotalSucursal[i] = ventasMes1[i] + ventasMes2[i] + ventasMes3[i];
            // Calculamos el promedio de cada sucursal
            ventaPromSucursal[i] = ventaTotalSucursal[i] / meses.length;
            /**
             * Estructura de columnas 2
             * Col1  Col2    Col3    Col4    Col5    Col6
             * %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f
             */
            reporteGeneral = String.format("%s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", reporteGeneral, sucursales[i], ventasMes1[i], ventasMes2[i], ventasMes3[i], ventaTotalSucursal[i], ventaPromSucursal[i]);
        }
        // Calculamos el total de ventas de tosas las sucursales
        for (int i = 0; i < ventaTotalSucursal.length; i++) {
            totalVentas += ventaTotalSucursal[i];
        }

        reporteGeneral = String.format("%s\nTotales de ventas de todas la sucursales es: %.2f", reporteGeneral, totalVentas);

        // Imprimimos el reporte final
        System.out.println(reporteGeneral);
    }

}
