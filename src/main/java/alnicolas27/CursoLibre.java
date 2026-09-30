package alnicolas27;

public class CursoLibre extends Curso {
    private int cantidadInscritos;

    //constructor
    public CursoLibre(String codigo, double duracion, int cupoMaximo, int cantidadInscritos) {
        super(codigo, duracion, cupoMaximo);
        this.cantidadInscritos = cantidadInscritos;
    }

    //getters y setters

    public int getCantidadInscritos() {
        return cantidadInscritos;
    }

    public void setCantidadInscritos(int cantidadInscritos) {
        this.cantidadInscritos = cantidadInscritos;
    }

    //metodos de comportamiento


    @Override
    public double calcularCosto() {
        double costoBase = 45000.0;
        if (this.getCantidadInscritos() > 20) {
            costoBase = costoBase + costoBase * 0.1;
        }return costoBase;
    }

    @Override
    public String calcularInfo() {
        String detalle = "";
        detalle = "Codigo: " + getCodigo() + " | Duracion: " + getDuracion() + " | CupoMaximo: " + getCupoMaximo();
        return detalle;}

    @Override
    public boolean tieneDiplomaEmitido() {
        return false;
    }

    @Override
    public boolean EmitirDiploma() {
        return false;
    }

}
