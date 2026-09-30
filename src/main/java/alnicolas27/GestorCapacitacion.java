package alnicolas27;

import java.util.ArrayList;
import java.util.List;

public class GestorCapacitacion {
    private List<Curso> cursos = new ArrayList<>();

    //registrar un curso
    public void registrar(Curso cursoR) {
        cursos.add(cursoR);
        System.out.println(cursoR.getCodigo() + " registrado correctamente.");
    }

    //buscar y retornar cursos
    public List<Curso> buscar(String codigoDeBusqueda){
        System.out.println("=== BUSQUEDA POR CODIGO " + codigoDeBusqueda + "  ===");
        List<Curso> cursosEncontrados = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoDeBusqueda)) {
                System.out.println(curso.calcularInfo());
            }
        }
        return cursosEncontrados;
    }

}
