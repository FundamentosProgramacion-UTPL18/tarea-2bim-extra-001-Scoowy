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
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        
        double total_ventas = 0;

        /**
         * Estructura de columnas 1 Col1 Col2 Col3 Col4 Col5 Col6 %-15s %-15s
         * %-15s %-15s %-15s %-15s
         */
        String reporteGeneral = String.format("Reporte\n\n%-15s%-15s%-15s%-15s%-15s%-15s\n\n", "", meses[0], meses[1], meses[2], "Total", "Promedio");

        for (int i = 0; i < sucursales.length; i++) {
            // Calculamos el total de cada sucursal
            venta_total_sucursal[i] = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i];
            // Calculamos el promedio de cada sucursal
            venta_promedio_sucursal[i] = venta_total_sucursal[i] / meses.length;
            /**
             * Estructura de columnas 2
             * Col1  Col2    Col3    Col4    Col5    Col6
             * %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f
             */
            reporteGeneral = String.format("%s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", reporteGeneral, sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);
        }
        // Calculamos el total de ventas de tosas las sucursales
        for (int i = 0; i < venta_total_sucursal.length; i++) {
            total_ventas += venta_total_sucursal[i];
        }

        reporteGeneral = String.format("%s\nTotales de ventas de todas la sucursales es: %.2f", reporteGeneral, total_ventas);
        
        // Imprimimos el reporte final
        System.out.println(reporteGeneral);
    }

}
