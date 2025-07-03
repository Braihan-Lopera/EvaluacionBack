package org.EvaluacionBack.Jugadores;
import java.util.List;
import java.time.LocalDate;

public class Jugador {
    Integer id;
    String nombreCompleto;
    List<String>equiposAnteriores;
    int numeroCamiseta;
    String posicion;
    int numeroLesiones;
    LocalDate fechaRegistro;

    public Jugador(Integer id, String nombreCompleto, List<String> equiposAnteriores, int numeroCamiseta, String posicion, int numeroLesiones, LocalDate fechaRegistro) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.equiposAnteriores = equiposAnteriores;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.numeroLesiones = numeroLesiones;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", equiposAnteriores=" + equiposAnteriores +
                ", numeroCamiseta=" + numeroCamiseta +
                ", posicion='" + posicion + '\'' +
                ", numeroLesiones=" + numeroLesiones +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
    public int getNumeroCamiseta(){
        return numeroCamiseta;
    }
}
