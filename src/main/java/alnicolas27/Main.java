package alnicolas27;

public class Main {
    public static void main(String[] args) {
        Curso certificado = new CursoCertificado("CUR-C01", 40, 25, "SENCE", false, false);
        Curso certificado2 = new CursoCertificado("CUR-C02", 60, 20, "ChileValora", true, true);
        Curso libre1 = new CursoLibre("CUR-L01", 20, 30, 25);
        Curso libre2 = new CursoLibre("CUR-L02", 16, 15, 10);

        GestorCapacitacion gestorCapacitacion = new GestorCapacitacion();

        gestorCapacitacion.registrar(certificado);
        gestorCapacitacion.registrar(certificado2);
        gestorCapacitacion.registrar(libre1);
        gestorCapacitacion.registrar(libre2);

        for (Curso curso : gestorCapacitacion.buscar("CUR-C01")) {
            System.out.println(curso.calcularInfo());
        }
    }
}
