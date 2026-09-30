package alnicolas27;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso Certificado = new CursoCertificado("CUR-C01", 40,25,"SENCE", false, false);
        Curso Certificado2 = new CursoCertificado("CUR-C02", 60,20,"ChileValora", true, true);
        Curso Libre1 = new CursoLibre("CUR-L01", 20,30,25);
        Curso Libre2 = new CursoLibre("CUR-L02", 16,15,10);


        GestorCapacitacion gestorCapacitacion = new GestorCapacitacion();

        gestorCapacitacion.registrar(Certificado);
        gestorCapacitacion.registrar(Certificado2);
        gestorCapacitacion.registrar(Libre1);
        gestorCapacitacion.registrar(Libre2);

       for (Curso impreso : gestorCapacitacion.buscar("CUR-C01")) {
           System.out.println(impreso.calcularInfo());
        }


    }
}