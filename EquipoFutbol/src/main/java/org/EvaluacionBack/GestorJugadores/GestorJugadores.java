package org.EvaluacionBack.GestorJugadores;
import org.EvaluacionBack.Jugadores.Jugador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GestorJugadores {
    //ArtrayList
    private List<Jugador> listaJugadores = new ArrayList<>();
    //HashMap
    private Map<Integer, Jugador> mapaJugadores = new HashMap<>();
    public void registrarJugador(Jugador jugador){
        listaJugadores.add(jugador);
        mapaJugadores.put(jugador.getNumeroCamiseta(), jugador);
    }
    public void mostrarTodos(){
        if (listaJugadores.isEmpty()){
            System.out.println("No hay jugadores registrados.");
        }else{
            for(Jugador j : listaJugadores){
                System.out.println(j);
            }
        }
    }
    public Jugador buscarPorCamiseta(int numero) {
        return mapaJugadores.get(numero);
    }
}


