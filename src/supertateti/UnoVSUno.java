/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertateti;

/**
 *
 * @author marti
 */
public class UnoVSUno extends GranTateti {
    public UnoVSUno() { super(); }
    
    public Usuario[] usuariosEnUso = new Usuario[2];
    private Usuario jugadorActual;
    private boolean jugadaMagicaDisp1 = true;
    private boolean jugadaMagicaDisp2 = true;
    
    public Usuario getJugadorActual() {
        return this.jugadorActual;
    }
    
    public void setJugadorActual(Usuario jugador) {
        this.jugadorActual = jugador;
    }
    
    public boolean getJugadaMagica1() {
        return this.jugadaMagicaDisp1;
    }
    
    public void setJugadaMagica1(boolean valor) {
        this.jugadaMagicaDisp1 = valor;
    }
    
    public boolean getJugadaMagica2() {
        return this.jugadaMagicaDisp2;
    }
    
    public void setJugadaMagica2(boolean valor) {
        this.jugadaMagicaDisp2 = valor;
    }
    
    public void alternarTurno() {
        // Arreglamos el simbolo a jugar
        if (this.getJugadorActivo().equals("X")) {
            this.setJugadorActivo("O");
        } else {
            this.setJugadorActivo("X");
        }
        
        // Arreglamos el usuario que esta jugando
        if (this.getJugadorActual() == this.usuariosEnUso[0]) {
            this.setJugadorActual(this.usuariosEnUso[1]);
        } else {
            this.setJugadorActual(this.usuariosEnUso[0]);
        }
    }
    
    public Usuario declararGanador() {
        return this.getJugadorActual();
    }
}
