import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        /*Todos los ciclos que se ofrecen en alquiler se almacenan en una tabla.

                A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las bicis:

        Estos son los ciclos que ofrecemos en alquiler:

        - Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora
                - Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora
                - Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora
                - Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora
                - Segways Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora
                - Segways Segway Ninebot One E+ (0 años)
        30 km de autonomía                                              18,90€/hora*/

        VehiculoAlquiler[] vehiculos = new VehiculoAlquiler[6];
        vehiculos[0] = new Bicicleta("Lapierre", "speed 400", LocalDate.of(2019, 1, 1), 27);
        vehiculos[1] = new Bicicleta("Btwin", "riverside 900", LocalDate.now(), 10);
        vehiculos[2] = new Giroscopio("Segway", "Nine", LocalDate.now(), 40);
        vehiculos[3] = new Giroscopio("Weebot", "Echo", LocalDate.of(2019, 1, 1), 35);
        vehiculos[4] = new Segway("Immotion", "v8", LocalDate.now(), 40, 1.5);
        vehiculos[5] = new Segway("Segway", "Ninebot One E+", LocalDate.now(), 30, 1.5);

        System.out.println("Estos son los ciclos que ofrecemos en alquiler: ");
        for (VehiculoAlquiler vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}