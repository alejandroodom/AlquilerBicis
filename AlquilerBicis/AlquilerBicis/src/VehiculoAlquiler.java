import java.time.LocalDate;

public abstract class VehiculoAlquiler {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public VehiculoAlquiler(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public abstract double getTarifa();

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + LocalDate.now().getYear() + ")";
    }
}

