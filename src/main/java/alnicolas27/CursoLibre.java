package alnicolas27;

public class CursoLibre extends Curso {
    private int cantidadInscritos;

    public CursoLibre(String codigo, double duracion, int cupoMaximo, int cantidadInscritos) {
        super(codigo, duracion, cupoMaximo);
        setCantidadInscritos(cantidadInscritos);
    }

    public CursoLibre(String codigo, double duracion, int cantidadInscritos) {
        this(codigo, duracion, 30, cantidadInscritos);
    }

    public int getCantidadInscritos() {
        return cantidadInscritos;
    }

    public void setCantidadInscritos(int cantidadInscritos) {
        if (cantidadInscritos < 0) {
            throw new IllegalArgumentException("La cantidad de inscritos no puede ser negativa.");
        }
        this.cantidadInscritos = cantidadInscritos;
    }

    @Override
    public double calcularCosto() {
        double costoBase = 45000.0;
        if (this.cantidadInscritos > 20) {
            costoBase += costoBase * 0.1;
        }
        return costoBase;
    }

    @Override
    public String calcularInfo() {
        return "Codigo: " + getCodigo() + " | Duracion: " + getDuracion() + " | CupoMaximo: " + getCupoMaximo()
                + " | Inscritos: " + cantidadInscritos + " | Costo: $" + calcularCosto();
    }
}
