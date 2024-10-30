package com.diasdelasemana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiasDeLaSemanaManager {

    private List<String> diasDeLaSemana;

    // Método para crear la lista de días de la semana
    public DiasDeLaSemanaManager() {
        diasDeLaSemana = new ArrayList<>();
        Collections.addAll(diasDeLaSemana, "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    }

    // Método que retorna los días de la semana
    public List<String> obtenerDias() {
        return new ArrayList<>(diasDeLaSemana);
    }

    // Método que retorna el largo de la lista
    public int obtenerLargo() {
        return diasDeLaSemana.size();
    }

    // Método para eliminar un día de la semana
    public boolean eliminarDia(String dia) {
        return diasDeLaSemana.remove(dia);
    }

    // Método que retorna el día de la semana solicitado
    public String obtenerDia(int indice) {
        if (indice >= 0 && indice < diasDeLaSemana.size()) {
            return diasDeLaSemana.get(indice);
        }
        return null;
    }

    // Método que retorna si el día solicitado existe en la lista
    public boolean existeDia(String dia) {
        return diasDeLaSemana.contains(dia);
    }

    // Método para ordenar la lista de días por orden alfabético
    public void ordenarDiasAlfabeticamente() {
        Collections.sort(diasDeLaSemana);
    }

    // Método para vaciar la lista
    public void vaciarLista() {
        diasDeLaSemana.clear();
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        DiasDeLaSemanaManager manager = new DiasDeLaSemanaManager();

        // Ejemplo de uso de los métodos
        System.out.println("Días de la semana: " + manager.obtenerDias());
        System.out.println("Número de días: " + manager.obtenerLargo());

        // Eliminar un día y mostrar la lista actualizada
        manager.eliminarDia("Miércoles");
        System.out.println("Después de eliminar Miércoles: " + manager.obtenerDias());

        // Comprobar si un día existe
        System.out.println("¿Existe Lunes? " + manager.existeDia("Lunes"));
    }
}


