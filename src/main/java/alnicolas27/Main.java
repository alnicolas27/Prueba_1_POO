package alnicolas27;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorCapacitacion gestor = new GestorCapacitacion();

        // Registro exitoso de cursos con datos válidos
        System.out.println("\n=== REGISTRANDO CURSOS ===");
        try {
            Curso certificado1 = new CursoCertificado("CUR-C01", 40, 25, "SENCE", false, false);
            gestor.registrar(certificado1);

            Curso certificado2 = new CursoCertificado("CUR-C02", 60, 20, "ChileValora", true, true);
            gestor.registrar(certificado2);

            Curso libre1 = new CursoLibre("CUR-L01", 20, 30, 25);
            gestor.registrar(libre1);

            Curso libre2 = new CursoLibre("CUR-L02", 16, 15, 10);
            gestor.registrar(libre2);

            System.out.println("\n=== LISTADO DE TODOS LOS CURSOS ===");
            List<Curso> todos = gestor.obtenerTodos();
            for (Curso curso : todos) {
                System.out.println(curso.calcularInfo());
            }

            // Búsqueda exitosa
            System.out.println("\n=== BUSCANDO CURSO CUR-C01 ===");
            List<Curso> encontrados = gestor.buscar("CUR-C01");
            System.out.println("Total de cursos encontrados: " + encontrados.size());

            // Prueba de emisión de diploma
            System.out.println("\n=== EMISIÓN DE DIPLOMAS ===");
            CursoCertificado cursoAlDia = (CursoCertificado) certificado2;
            System.out.println("Diploma emitido antes: " + cursoAlDia.tieneDiplomaEmitido());
            cursoAlDia.emitirDiploma();
            System.out.println("Diploma emitido después: " + cursoAlDia.tieneDiplomaEmitido());

            // Intentar emitir diploma para curso no al día
            System.out.println("\nIntentando emitir diploma para curso no al día:");
            CursoCertificado cursoAtrasado = (CursoCertificado) certificado1;
            cursoAtrasado.emitirDiploma();

            System.out.println("\n=== COSTO TOTAL ===");
            System.out.println("Costo total de todos los cursos: $" + gestor.calcularCostoTotal());

        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }

        // Prueba de validación con datos inválidos
        System.out.println("\n=== PRUEBAS DE VALIDACIÓN ===");
        try {
            System.out.println("\nIntentando crear curso con código vacío:");
            Curso invalido1 = new CursoLibre("", 20, 30, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Excepción capturada: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando crear curso con duración fuera de rango:");
            Curso invalido2 = new CursoLibre("CUR-INV", 500, 30, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Excepción capturada: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando crear curso con cupo máximo negativo:");
            Curso invalido3 = new CursoLibre("CUR-INV", 20, -5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Excepción capturada: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando crear certificado sin entidad certificadora:");
            Curso invalido4 = new CursoCertificado("CUR-INV", 40, 25, "", true, false);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Excepción capturada: " + e.getMessage());
        }

        System.out.println("\n=== PROGRAMA FINALIZADO ===");
    }
}
