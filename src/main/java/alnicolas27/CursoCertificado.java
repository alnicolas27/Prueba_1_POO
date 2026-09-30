package alnicolas27;

public class CursoCertificado extends Curso implements ConDiploma {

    private String entidadCertificadora;
    private boolean estaAlDia;
    private boolean estaEmitido;

    //constructor
    public CursoCertificado(String codigo, double duracion, int cupoMaximo, String entidadCertificadora, boolean estaAlDia, boolean estaEmitido) {
        super(codigo, duracion, cupoMaximo);
        this.entidadCertificadora = entidadCertificadora;
        this.estaAlDia = estaAlDia;
        this.estaEmitido = estaEmitido;
    }

    //getters y setters
    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }
    public void setEntidadCertificadora(String entidadCertificadora) {
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


    //Metodos y comportamiento interfaces
    @Override
    public double calcularCosto() {
        double costoBase = 85000.0;
        if (!this.estaAlDia) {
            costoBase = costoBase + costoBase * 0.2;
        }return costoBase;
    }

    @Override
    public String calcularInfo() {
        String detalle = "";
        detalle = "Codigo: " + getCodigo() + " | Duracion: " + getDuracion() + " | CupoMaximo: " + getCupoMaximo()
                + " | Entidad certificadora: " + getEntidadCertificadora() + " | Evaluación final al día: " + isEstaAlDia();
        return detalle;}

    @Override
    public boolean tieneDiplomaEmitido() {
        if (!estaEmitido) {
            System.out.println("Emitir Diploma");
        }
        return true;
    }


    @Override
    public boolean EmitirDiploma(){
        if(this.estaAlDia == false){
            System.out.println("Emitir Diploma");
        }
        return true;
    }
    @Override
    public boolean emitirDiploma() {
        if (this.estaAlDia == false) {
            System.out.println("Emitir Diploma");
            return true;
        }
        return false;
    }

}
