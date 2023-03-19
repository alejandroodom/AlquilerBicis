import java.time.LocalDate;
public class Giroscopio extends VehiculoAlquiler {
    private double autonomiaKm;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomiaKm) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double getTarifa() {
        return 29.90;
    }

    //Getter and setter methods
    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public String toString() {
        return "- Giroscopio " + super.toString() + " " + autonomiaKm + " km de autonomía\t" + getTarifa() + "€/hora";
    }
}