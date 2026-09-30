package alnicolas27;

public abstract class Curso {
    protected String codigo;
    protected double duracion;
    protected int cupoMaximo;

    //constructor
    public Curso(String codigo, double duracion, int cupoMaximo) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.cupoMaximo = cupoMaximo;
    }

    //getters y setters

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser nulo ni vacio.");
        }
        this.codigo = codigo;
    }

    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        if (duracion < 4 || duracion > 200) {
            throw new IllegalArgumentException("El curso debe durar entre 4 a 200 horas.");
        }
        this.duracion = duracion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }
    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < 0) {
            throw new IllegalArgumentException("El curso no puede estar vacío.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    //metodos de comportamiento
    public abstract double calcularCosto();
    public abstract String calcularInfo();

    public String toString() {
        return "Curso: " + getCodigo() + " | Duracion: " + getDuracion() + " horas.";

    }

    public abstract boolean tieneDiplomaEmitido();

    public abstract boolean EmitirDiploma();
}
