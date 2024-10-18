/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertateti;

/**
 *
 * @author satio
 */
public class GranTateti {
    public Tateti[][] tableroGrande = new Tateti[3][3];
    
    
    public void inicializarTablero() {
        this.tableroGrande[0][0].setPosicion("A1");
        this.tableroGrande[0][1].setPosicion("A2");
        this.tableroGrande[0][2].setPosicion("A3");
        this.tableroGrande[1][0].setPosicion("B1");
        this.tableroGrande[1][1].setPosicion("B2");
        this.tableroGrande[1][2].setPosicion("B3");
        this.tableroGrande[2][0].setPosicion("C1");
        this.tableroGrande[2][1].setPosicion("C2");
        this.tableroGrande[2][2].setPosicion("C3");
    }
    
    
    private String tableroEnUso = "B2";
    private String jugadorActivo = "X";
    
    
    public String getTableroEnUso() {
        return this.tableroEnUso;
    }
   
    
    public void setTableroEnUso(String tablero) {
        this.tableroEnUso = tablero;
    }
    
    
    public String getJugadorActivo() {
        return this.jugadorActivo;
    }
    
    
    public void setJugadorActivo(String jugador) {
        this.jugadorActivo = jugador;
    }
    
    
    public void hacerJugada(String jugada) {
        // Conseguimos el tablero en uso
        boolean encontrado = false;
        int fil = 0;
        int col = 0;
        for (int i=0 ; i<this.tableroGrande.length && !encontrado ; i++) {
            for (int j=0 ; j<this.tableroGrande.length && !encontrado ; j++) {
                if (this.tableroEnUso.equals(this.tableroGrande[i][j].getPosicion())) {
                    fil = i;
                    col = j;
                    encontrado = true;
                }
            }
        }
        
        // Realizamos la jugada
        switch (jugada.toUpperCase()) {
            case "A1":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "A2":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "A3":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "B1":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "B2":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "B3":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "C1":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "C2":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
            case "C3":
                this.tableroGrande[fil][col].tablero[0][0] = this.getJugadorActivo();
                break;
        }
        
        // Cambiamos el tablero activo
        this.setTableroEnUso(jugada);
        
        // Alternamos el jugador en uso al finalizar
        this.alternarJugador();
    }
    
    
    public void alternarJugador() {
        if (this.getJugadorActivo() == "O") {
            this.setJugadorActivo("X");
        } else {
            this.setJugadorActivo("O");
        }
    }
    
    
    public boolean verificarJugada(String jugada) {
        boolean esValida = false;
        String jugMayusc = jugada.toUpperCase();
        
        // Conseguimos el tablero en uso
        boolean encontrado = false;
        int fil = 0;
        int col = 0;
        for (int i=0 ; i<this.tableroGrande.length && !encontrado ; i++) {
            for (int j=0 ; j<this.tableroGrande.length && !encontrado ; j++) {
                if (this.tableroEnUso.equals(this.tableroGrande[i][j].getPosicion())) {
                    fil = i;
                    col = j;
                    encontrado = true;
                }
            }
        }
        
        // Verificamos si es posible que el valor sea valido
        boolean posible = false;
        String[] valoresPosibles = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};
        for (int i=0 ; i<valoresPosibles.length && !posible; i++) {
            if (valoresPosibles[i].equals(jugMayusc)) {
                posible = true;
            }
        }

        // Verificamos si la casilla no esta ocupada
        if (posible) {
            switch (jugMayusc) {
                case "A1":
                    if (!this.tableroGrande[fil][col].tablero[0][0].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[0][0].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "A2":
                    if (!this.tableroGrande[fil][col].tablero[0][1].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[0][1].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "A3":
                    if (!this.tableroGrande[fil][col].tablero[0][2].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[0][2].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "B1":
                    if (!this.tableroGrande[fil][col].tablero[1][0].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[1][0].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "B2":
                    if (!this.tableroGrande[fil][col].tablero[1][1].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[1][1].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "B3":
                    if (!this.tableroGrande[fil][col].tablero[1][2].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[1][2].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "C1":
                    if (!this.tableroGrande[fil][col].tablero[2][0].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[2][0].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "C2":
                    if (!this.tableroGrande[fil][col].tablero[2][1].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[2][1].equals("O")) {
                            esValida = true;
                    }
                    break;
                case "C3":
                    if (!this.tableroGrande[fil][col].tablero[2][2].equals("X") &&
                        !this.tableroGrande[fil][col].tablero[2][2].equals("O")) {
                            esValida = true;
                    }
                    break;
            }
        }
        
        return esValida;
    }
}
