package supertateti;

public class Tateti {
    public String[][] tablero = new String[3][3];
    private String posicionTablero = "";
    private boolean ganado = false;
    private String ganador = "N";
    
    public String getPosicion() {
        return this.posicionTablero;
    }
    
    public void setPosicion(String pos) {
        this.posicionTablero = pos;
    }
    
    public boolean getGanado() {
        return this.ganado;
    }
    
    public void setGanado(boolean estado) {
        this.ganado = estado;
    }
    
    public String getGanador() {
        return this.ganador;
    }
    
    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
    public void victoriaParcial() {
        boolean gano = false;
        
        // Chequeamos si es posible ganar con una diagonal
        if (tablero[0][0] == "X" || tablero[0][0] == "O" || 
            tablero[0][2] == "X" || tablero[0][2] == "O") {
        // Chequeamos las diagonales
            if ((tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) ||
                (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])) {
                    gano = true;
            }
        }
            
        // Chequeamos si es posible ganar con una fila/columna
        
        // Chequeamos todas las filas y columnas
        for (int i=0 ; i<tablero.length && !gano ; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]
                && (tablero[i][0] == "X" || tablero[i][0] == "O")) {
                    gano = true;
            }
            if (tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]
                && (tablero[0][i] == "X" || tablero[0][i] == "X")) {
                    gano = true;
            }
        }
        
        // Actualizamos el estado de ganado
        if (gano) {
            this.ganado = true;
        }
    }
}

