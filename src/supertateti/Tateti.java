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
        if (this.tablero[0][0].equals("X") || this.tablero[0][0].equals("O") || 
            this.tablero[0][2].equals("X") || this.tablero[0][2].equals("O")) {
        // Chequeamos las diagonales
            if ((this.tablero[0][0].equals(this.tablero[1][1]) && this.tablero[0][0].equals(this.tablero[2][2])) ||
                (this.tablero[0][2].equals(this.tablero[1][1]) && this.tablero[0][2].equals(this.tablero[2][0]))) {
                    gano = true;
            }
        }
            
        // Chequeamos si es posible ganar con una fila/columna
        
        // Chequeamos todas las filas y columnas
        for (int i=0 ; i<this.tablero.length && !gano ; i++) {
            if (this.tablero[i][0].equals(this.tablero[i][1]) && this.tablero[i][0].equals(this.tablero[i][2])
                && (this.tablero[i][0].equals("X") || this.tablero[i][0].equals("O"))) {
                    gano = true;
            }
            if (this.tablero[0][i].equals(this.tablero[1][i]) && this.tablero[0][i].equals(this.tablero[2][i])
                && (this.tablero[0][i].equals("X") || this.tablero[0][i].equals("X"))) {
                    gano = true;
            }
        }
        
        // Actualizamos el estado de ganado
        if (gano) {
            this.ganado = true;
        }
    }
}