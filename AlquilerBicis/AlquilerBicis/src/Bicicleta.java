import java.time.LocalDate;
public class Bicicleta extends VehiculoAlquiler {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    @Override
    public double getTarifa() {
        return 4.90;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public void setNumVelocidades(int numVelocidades) {
        this.numVelocidades = numVelocidades;
    }

    @Override
    public String toString() {
        return "- Bicis " + super.toString() + " " + numVelocidades + " velocidades\t\t" + getTarifa() + "€/hora";
    }
}