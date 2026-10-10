package alnicolas27;

import java.util.ArrayList;
import java.util.List;

public class GestorCapacitacion {
    private final List<Curso> cursos = new ArrayList<>();

    public void registrar(Curso cursoR) {
        if (cursoR == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo.");
        }
        cursos.add(cursoR);
        System.out.println(cursoR.getCodigo() + " registrado correctamente.");
    }

    public List<Curso> buscar(String codigoDeBusqueda) {
        System.out.println("=== BUSQUEDA POR CODIGO " + codigoDeBusqueda + " ===");
        List<Curso> cursosEncontrados = new ArrayList<>();

        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoDeBusqueda)) {
                cursosEncontrados.add(curso);
                System.out.println(curso.calcularInfo());
            }
        }

        if (cursosEncontrados.isEmpty()) {
            System.out.println("No se encontraron cursos con ese codigo.");
        }

        return cursosEncontrados;
    }
}
