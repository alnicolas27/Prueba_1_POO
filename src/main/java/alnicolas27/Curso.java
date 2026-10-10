package alnicolas27;

public abstract class Curso {
    protected String codigo;
    protected double duracion;
    protected int cupoMaximo;

    public Curso(String codigo, double duracion, int cupoMaximo) {
        setCodigo(codigo);
        setDuracion(duracion);
        setCupoMaximo(cupoMaximo);
    }

    public Curso(String codigo, double duracion) {
        this(codigo, duracion, 30);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser nulo ni vacio.");
        }
        this.codigo = codigo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        if (duracion < 4 || duracion > 200) {
            throw new IllegalArgumentException("El curso debe durar entre 4 y 200 horas.");
        }
        this.duracion = duracion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo <= 0) {
            throw new IllegalArgumentException("El cupo maximo debe ser mayor a cero.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public abstract double calcularCosto();
    public abstract String calcularInfo();

    @Override
    public String toString() {
        return "Curso: " + getCodigo() + " | Duracion: " + getDuracion() + " horas.";
    }
}
