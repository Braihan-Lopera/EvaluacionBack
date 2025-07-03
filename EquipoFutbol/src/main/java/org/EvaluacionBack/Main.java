package org.EvaluacionBack;
import com.sun.jdi.request.InvalidRequestStateException;
import org.EvaluacionBack.GestorJugadores.GestorJugadores;
import org.EvaluacionBack.Jugadores.Jugador;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Colores
        String Reset = "\u001B[0m";
        String Rojo = "\u001B[31m";
        String Azul = "\u001B[34m";
        String Verde = "\u001B[32m";
       //gestor de jugadores
        GestorJugadores gestor = new GestorJugadores();
        while (true) {
            System.out.println(Rojo + "BIENVENIDO" + Reset);
            System.out.println("1. Registrar jugador");
            System.out.println("2. Mostrar todos los jugadores");
            System.out.println("3. Buscar por número de camiseta");
            System.out.println("4. Salir");
            System.out.print(Azul + "TU opcion:" + Reset);

            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    // Pedir datos y registrar
                    System.out.print("Ingrese ID del jugador: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre completo: ");
                    String nombreCompleto = sc.nextLine();
                    System.out.print("Ingrese número de camiseta: ");
                    int numeroCamiseta = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese posición: ");
                    String posicion = sc.nextLine();
                    System.out.print("Ingrese equipos anteriores (separados por comas): ");
                    String equiposTexto = sc.nextLine();
                    List<String> equiposAnteriores = Arrays.asList(equiposTexto.split(",\\s*"));
                    System.out.print("Ingrese número de lesiones: ");
                    int numeroLesiones = sc.nextInt();
                    sc.nextLine();
                    LocalDate fechaRegistro = LocalDate.now();
                    Jugador jugador = new Jugador(id, nombreCompleto, equiposAnteriores, numeroCamiseta, posicion, numeroLesiones, fechaRegistro);
                    gestor.registrarJugador(jugador);
                    System.out.println("Jugador registrado:");
                    System.out.println(jugador);
                    System.out.print("¿Desea volver al menú? (s/n): ");
                    String continuar = sc.nextLine();
                    if (!continuar.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo...");
                        return;
                    }
                    break;
                case 2:
                    // Mostrar todos
                    gestor.mostrarTodos();
                    System.out.print("¿Desea volver al menú? (s/n): ");
                    continuar = sc.nextLine();
                    if (!continuar.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo...");
                        return;
                    }
                    break;
                case 3:
                    // Buscar por camiseta
                    System.out.print("Ingrese número de camiseta a buscar: ");
                    int numeroBuscado = sc.nextInt();
                    sc.nextLine();
                    Jugador encontrado = gestor.buscarPorCamiseta(numeroBuscado);

                    if (encontrado != null) {
                        System.out.println("Jugador encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró un jugador con esa camiseta.");
                    }
                    System.out.print("¿Desea volver al menú? (s/n): ");
                    continuar = sc.nextLine();
                    if (!continuar.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo...");
                        return;
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
    }
