/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertateti;

/**
 *
 * @author marti
 */
public class UnoVSPc extends GranTateti {
    private Usuario usuarioEnUso;
    private boolean jugadaMagicaDisp = true;
    
    
    public Usuario getUsuarioEnUso() {
        return this.usuarioEnUso;
    }
    
    
    public void setUsuarioEnUso(Usuario user) {
        this.usuarioEnUso = user;
    }
    
    
    public boolean getJugadaMagicaDisp() {
        return this.jugadaMagicaDisp;
    }
    
    
    public void setJugadaMagicaDisp(boolean valor) {
        this.jugadaMagicaDisp = valor;
    }
    
    
    public void jugadaIA() {
        // Conseguimos el tablero en uso
        boolean encontrado = false;
        int fil = 0;
        int col = 0;
        for (int i=0 ; i<this.tableroGrande.length && !encontrado ; i++) {
            for (int j=0 ; j<this.tableroGrande.length && !encontrado ; j++) {
                if (this.getTableroEnUso().equals(this.tableroGrande[i][j].getPosicion())) {
                    fil = i;
                    col = j;
                    encontrado = true;
                }
            }
        }
        
        // Buscamos la primer casilla libre y la rellenamos, almacenando la fila y columna
        int filUsada = 0;
        int colUsada = 0;
        boolean yaJugado = false;
        for (int i = 0 ; i<this.tableroGrande[fil][col].tablero.length && !yaJugado ; i++) {
            for (int j = 0 ; j<this.tableroGrande[fil][col].tablero.length && !yaJugado ; j++) {
                if (!tableroGrande[fil][col].tablero[i][j].equals("X") && 
                    !tableroGrande[fil][col].tablero[i][j].equals("O")) {
                        tableroGrande[fil][col].tablero[i][j] = "O";
                        filUsada = i;
                        colUsada = j;
                        yaJugado = true;
                }
            }
        }
        
        // Cambiamos el tablero al necesario
        switch (filUsada) {
            case 0:
                switch (colUsada) {
                    case 0:
                        this.setTableroEnUso("A1");
                        break;
                    case 1:
                        this.setTableroEnUso("A2");
                        break;
                    case 2:
                        this.setTableroEnUso("A3");
                        break;
                }
                break;
            case 1:
                switch (colUsada) {
                    case 0:
                        this.setTableroEnUso("B1");
                        break;
                    case 1:
                        this.setTableroEnUso("B2");
                        break;
                    case 2:
                        this.setTableroEnUso("B3");
                        break;
                }
                break;
            case 2:
                switch (colUsada) {
                    case 0:
                        this.setTableroEnUso("C1");
                        break;
                    case 1:
                        this.setTableroEnUso("C2");
                        break;
                    case 2:
                        this.setTableroEnUso("C3");
                        break;
                }
                break;
        }
        
    }
    
    
    public String declaraGanador() {
        String ganador = "";
        String movGanador = "";
        boolean encontrado = false;
        
        // Chequeamos las diagonales
        if (this.tableroGrande[0][0].getGanado() && 
            this.tableroGrande[0][0].getGanador().equals(this.tableroGrande[1][1].getGanador()) &&
            this.tableroGrande[0][0].getGanador().equals(this.tableroGrande[2][2].getGanador())) {
                movGanador = this.tableroGrande[0][0].getGanador();
                encontrado = true;
        }
        if (!encontrado && this.tableroGrande[0][2].getGanado() && 
            this.tableroGrande[0][2].getGanador().equals(this.tableroGrande[1][1].getGanador()) &&
            this.tableroGrande[0][2].getGanador().equals(this.tableroGrande[2][0].getGanador())) {
                movGanador = this.tableroGrande[0][2].getGanador();
        }
        
        // Chequeamos las filas y columnas
        if (!encontrado) {
            for (int i=0 ; i<this.tableroGrande.length && !encontrado ; i++) {
                if (this.tableroGrande[i][0].getGanado()) {
                    if (this.tableroGrande[i][0].getGanador().equals(this.tableroGrande[i][1].getGanador()) &&
                        this.tableroGrande[i][0].getGanador().equals(this.tableroGrande[i][2].getGanador())) {
                            movGanador = this.tableroGrande[i][0].getGanador();
                    }
                    if (this.tableroGrande[0][i].getGanador().equals(this.tableroGrande[1][i].getGanador()) &&
                        this.tableroGrande[0][i].getGanador().equals(this.tableroGrande[2][i].getGanador())) {
                            movGanador = this.tableroGrande[0][i].getGanador();
                    }
                }
            }
        }
        
        // Definimos quien gano
        if (movGanador.equals("O")) {
            ganador = this.getUsuarioEnUso().getAlias();
        } else {
            ganador = "Jugador";
        }
        
        return ganador;
    }
}
