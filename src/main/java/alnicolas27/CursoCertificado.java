package alnicolas27;

public class CursoCertificado extends Curso implements ConDiploma {

    private String entidadCertificadora;
    private boolean estaAlDia;
    private boolean estaEmitido;

    public CursoCertificado(String codigo, double duracion, int cupoMaximo, String entidadCertificadora, boolean estaAlDia, boolean estaEmitido) {
        super(codigo, duracion, cupoMaximo);
        setEntidadCertificadora(entidadCertificadora);
        this.estaAlDia = estaAlDia;
        this.estaEmitido = estaEmitido;
    }

    public CursoCertificado(String codigo, double duracion, String entidadCertificadora, boolean estaAlDia) {
        this(codigo, duracion, 30, entidadCertificadora, estaAlDia, false);
    }

    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }

    public void setEntidadCertificadora(String entidadCertificadora) {
        if (entidadCertificadora == null || entidadCertificadora.trim().isEmpty()) {
            throw new IllegalArgumentException("La entidad certificadora no puede ser nula ni vacia.");
        }
        this.entidadCertificadora = entidadCertificadora;
    }

    public boolean isEstaAlDia() {
        return estaAlDia;
    }

    public void setEstaAlDia(boolean estaAlDia) {
        this.estaAlDia = estaAlDia;
    }

    public boolean isEstaEmitido() {
        return estaEmitido;
    }

    public void setEstaEmitido(boolean estaEmitido) {
        this.estaEmitido = estaEmitido;
    }

    @Override
    public double calcularCosto() {
        double costoBase = 85000.0;
        if (!this.estaAlDia) {
            costoBase += costoBase * 0.2;
        }
        return costoBase;
    }

    @Override
    public String calcularInfo() {
        return "Codigo: " + getCodigo() + " | Duracion: " + getDuracion() + " | CupoMaximo: " + getCupoMaximo()
                + " | Entidad certificadora: " + getEntidadCertificadora() + " | Evaluación al día: " + isEstaAlDia()
                + " | Diploma emitido: " + isEstaEmitido() + " | Costo: $" + calcularCosto();
    }

    @Override
    public boolean tieneDiplomaEmitido() {
        return estaEmitido;
    }

    @Override
    public boolean emitirDiploma() {
        if (!this.estaAlDia) {
            System.out.println("No se puede emitir el diploma porque la evaluación final no está al día.");
            return false;
        }
        this.estaEmitido = true;
        System.out.println("Diploma emitido correctamente para el curso " + getCodigo());
        return true;
    }
}
