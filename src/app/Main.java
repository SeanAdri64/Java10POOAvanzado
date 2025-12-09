package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BÁSICO DE RESERVAS - INICIO ===");

        SistemaReservas sistema = new SistemaReservas();
        // Crear al menos dos reservas
        Reserva r1 = new Reserva(1, "Empresa ABC", "2025-12-15 09:00", 2);
        Reserva r2 = new Reserva(2, "Colegio XYZ", "2025-12-16 14:00", 3);
        // Agregarlas al sistema
        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);
        System.out.println();
        // Usar al menos un setter para modificar datos de una reserva
        System.out.println(">> Usando setter: cambiando nombre del cliente de la reserva ID=1");
        r1.setCliente("Empresa ABC - Departamento TI");
        System.out.println();
        // Listar las reservas
        sistema.listarReservas();
        System.out.println();
        // Mostrar el total de reservas
        System.out.printf("Total de reservas: %d%n", sistema.contarReservas());
        System.out.println();
        // Eliminar una reserva por ID usando try/catch para capturar errores
        try {
            System.out.println("Intentando eliminar reserva con ID=2...");
            sistema.eliminarReserva(2); // eliminación existente
        } catch (Exception ex) {
            System.out.println("ERROR al eliminar: " + ex.getMessage());
        }
        System.out.println();
        // Intento de eliminar una reserva que NO existe para demostrar manejo de errores
        try {
            System.out.println("Intentando eliminar reserva con ID=999 (no existe)...");
            sistema.eliminarReserva(999);
        } catch (Exception ex) {
            System.out.println("ERROR al eliminar: " + ex.getMessage());
        }
        System.out.println();
        // Volver a listar reservas
        sistema.listarReservas();
        System.out.println();
        // Conteo final
        System.out.printf("Conteo final de reservas: %d%n", sistema.contarReservas());
        System.out.println("=== SISTEMA BÁSICO DE RESERVAS - FIN ===");
    }
}
