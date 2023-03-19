import java.time.LocalDate;
public class Segway extends VehiculoAlquiler {
    private double autonomiaKm;
    private double alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomiaKm, double alturaMinima) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
        this.alturaMinima = alturaMinima;
    }

    @Override
    public double getTarifa() {
        return 18.90;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    @Override
    public String toString() {
        return "- Segway " + super.toString() + " " + autonomiaKm + " km de autonomía\t" + getTarifa() + "€/hora";
    }
}
