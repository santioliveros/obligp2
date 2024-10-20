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
    public GranTateti() { this.inicializarTablero(); }
    
    public Tateti[][] tableroGrande = new Tateti[3][3];
    
    private void inicializarTablero() {
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
                if (this.getTableroEnUso().equals(this.tableroGrande[i][j].getPosicion())) {
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
    
    
    public void hacerJugadaMagica(String jugada) {
        // Buscamos el tablero
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
        
        // Recorremos el tablero y lo vaciamos
        for (int i=0 ; i<this.tableroGrande[fil][col].tablero.length ; i++) {
            for (int j=0 ; j<this.tableroGrande[fil][col].tablero[0].length ; j++) {
                this.tableroGrande[fil][col].tablero[i][j] = "";
            }
        }
        
        // Setteamos ganado a falso para el tablero y sacamos al ganador
        this.tableroGrande[fil][col].setGanado(false);
        this.tableroGrande[fil][col].setGanador("");
        
        // Hacemos la jugada
        this.hacerJugada(jugada);
    }
    
    
    public boolean comprobarVictoria() {
        boolean gano = false;
        
        // Chequeamos las diagonales
        if (this.tableroGrande[0][0].getGanado() && 
            this.tableroGrande[0][0].getGanador().equals(this.tableroGrande[1][1].getGanador()) &&
            this.tableroGrande[0][0].getGanador().equals(this.tableroGrande[2][2].getGanador())) {
                gano = true;
        }
        if (!gano && this.tableroGrande[0][2].getGanado() && 
            this.tableroGrande[0][2].getGanador().equals(this.tableroGrande[1][1].getGanador()) &&
            this.tableroGrande[0][2].getGanador().equals(this.tableroGrande[2][0].getGanador())) {
                gano = true;
        }
        
        // Chequeamos las filas y columnas
        if (!gano) {
            for (int i=0 ; i<this.tableroGrande.length && !gano ; i++) {
                if (this.tableroGrande[i][0].getGanado()) {
                    if (this.tableroGrande[i][0].getGanador().equals(this.tableroGrande[i][1].getGanador()) &&
                        this.tableroGrande[i][0].getGanador().equals(this.tableroGrande[i][2].getGanador())) {
                            gano = true;
                    }
                    if (this.tableroGrande[0][i].getGanador().equals(this.tableroGrande[1][i].getGanador()) &&
                        this.tableroGrande[0][i].getGanador().equals(this.tableroGrande[2][i].getGanador())) {
                            gano = true;
                    }
                }
            }
        }
                        
        return gano;
    }
    
    
    public void imprimirTablero() {
        // Declaramos los colores a usar en el siguiente metodo
        String YELLOW_BACKGROUND = "\033[43m";
        String GREEN_BACKGROUND = "\033[42m";
        String RED = "\033[0;31m";
        String BLUE = "\033[0;34m";
        String ANSI_RESET = "\u001B[0m";
        
        // Recorremos todas las filas
        for (int i=0 ; i<19 ; i++) {
            
            // Nos fijamos si estamos en una fila separador, y si estamos en una imprimimos lo correspondiente
            
            // Declaramos una variable que nos diga si la fila fue impresa o no
            boolean imprimio = false;
            
            // Primer separador
            if (i == 0) {
                // Caso A1 tablero activo
                imprimio = this.filaSeparador("A1", "A1", 7, -1);
                // Caso A2 tablero activo
                imprimio = this.filaSeparador("A2", "A2", 13, 5);
                // Caso A3 tablero activo
                imprimio = this.filaSeparador("A3", "A3", 20, 11);
                // Si no es ninguna de las anteriores, imprimimos una cadena de fondo solo verde
                if (!imprimio) {
                    this.filaSeparadorVerde();
                }
                // Salto de linea
                System.out.println();
            
            // Segundo separador
            } else if (i == 6) {
                imprimio = false;
                // Caso A1/B1 tablero activo
                this.filaSeparador("A1", "B1", 7, -1);
                // Caso A2/B2 tablero activo
                this.filaSeparador("A2", "B2", 13, 5);
                // Caso A3/B3 tablero activo
                this.filaSeparador("A3", "B3", 20, 11);
                // Si no es ninguna de las anteriores, imprimimos una cadena de fondo solo verde
                if (!imprimio) {
                    this.filaSeparadorVerde();
                }
                // Salto de linea
                System.out.println();

            // Tercer separador
            } else if (i == 12) {
                imprimio = false;
                // Caso B1/C1 tablero activo
                this.filaSeparador("C1", "B1", 7, -1);
                // Caso B2/C2 tablero activo
                this.filaSeparador("B2", "C2", 13, 5);
                // Caso B3/C3 tablero activo
                this.filaSeparador("C3", "B3", 20, 11);
                // Si no es ninguna de las anteriores, imprimimos una cadena de fondo solo verde
                if (!imprimio) {
                    this.filaSeparadorVerde();
                }
                // Salto de linea
                System.out.println();
                
            // Cuarto separador
            } else if (i == 19) {
                imprimio = false;
                // Caso C1 tablero activo
                this.filaSeparador("C1", "C1", 7, -1);
                // Caso C2 tablero activo
                this.filaSeparador("C2", "C2", 13, 5);
                // Caso C3 tablero activo
                this.filaSeparador("C3", "C3", 20, 11);
                // Si no es ninguna de las anteriores, imprimimos una cadena de fondo solo verde
                if (!imprimio) {
                    this.filaSeparadorVerde();
                }
                // Salto de linea
                System.out.println();
                
            // Casos de filas que corresponden a un tablero
            
            // Filas separadoras, primera fila de matrices
            } else if (i == 2 || i == 4) {
                // Primer separador
                this.filaTatetiSepExterno("A1", "A1");                
                // Primera matriz
                this.filaTatetiSepInterno(0, 0);              
                // Segundo separador
                this.filaTatetiSepExterno("A1", "A2");                
                // Segunda matriz
                this.filaTatetiSepInterno(0, 1);                
                // Tercer separador
                this.filaTatetiSepExterno("A2", "A3");                
                // Tercera matriz
                this.filaTatetiSepInterno(0, 2);                
                // Cuarto separador
                this.filaTatetiSepExterno("A3", "A3");
                // Salto de linea
                System.out.println();
                
            // Filas separadoras, segunda fila de matrices
            } else if (i == 8 || i == 10) {
                // Primer separador
                this.filaTatetiSepExterno("B1", "B1");                
                // Primera matriz
                this.filaTatetiSepInterno(1, 0);              
                // Segundo separador
                this.filaTatetiSepExterno("B1", "B2");                
                // Segunda matriz
                this.filaTatetiSepInterno(1, 1);                
                // Tercer separador
                this.filaTatetiSepExterno("B2", "B3");                
                // Tercera matriz
                this.filaTatetiSepInterno(1, 2);                
                // Cuarto separador
                this.filaTatetiSepExterno("B3", "B3");
                // Salto de linea
                System.out.println();
            
            // Filas separadoras, tercera fila de matrices
            } else if (i == 14 || i == 16) {
                // Primer separador
                this.filaTatetiSepExterno("C1", "C1");                
                // Primera matriz
                this.filaTatetiSepInterno(0, 0);              
                // Segundo separador
                this.filaTatetiSepExterno("C1", "C2");                
                // Segunda matriz
                this.filaTatetiSepInterno(0, 1);                
                // Tercer separador
                this.filaTatetiSepExterno("C2", "C3");                
                // Tercera matriz
                this.filaTatetiSepInterno(0, 2);                
                // Cuarto separador
                this.filaTatetiSepExterno("C3", "C3");
                // Salto de linea
                System.out.println();
            }
            
            // Filas de la forma *O| |X*X| |O* | |X*
            switch (i) {
                case 1:
                    // Primer separador
                    this.filaTatetiSepExterno("A1", "A1");
                    // Primer fila, matriz A1
                    this.filaTateti(0, 0, 0);
                    // Segundo separador
                    this.filaTatetiSepExterno("A1", "A2");
                    // Primer fila, matriz A2
                    this.filaTateti(0, 1, 0);
                    // Tercer separador
                    this.filaTatetiSepExterno("A2", "A3");
                    // Primer fila, matriz A3
                    this.filaTateti(0, 2, 0);
                    // Cuarto separador
                    this.filaTatetiSepExterno("A3", "A3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 3:
                    // Primer separador
                    this.filaTatetiSepExterno("A1", "A1");
                    // Segunda fila, matriz A1
                    this.filaTateti(0, 0, 1);
                    // Segundo separador
                    this.filaTatetiSepExterno("A1", "A2");
                    // Segunda fila, matriz A2
                    this.filaTateti(0, 1, 1);
                    // Tercer separador
                    this.filaTatetiSepExterno("A2", "A3");
                    // Segunda fila, matriz A3
                    this.filaTateti(0, 2, 1);
                    // Cuarto separador
                    this.filaTatetiSepExterno("A3", "A3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 5:
                    // Primer separador
                    this.filaTatetiSepExterno("A1", "A1");
                    // Tercera fila, matriz A1
                    this.filaTateti(0, 0, 2);
                    // Segundo separador
                    this.filaTatetiSepExterno("A1", "A2");
                    // Tercera fila, matriz A2
                    this.filaTateti(0, 1, 2);
                    // Tercer separador
                    this.filaTatetiSepExterno("A2", "A3");
                    // Tercera fila, matriz A3
                    this.filaTateti(0, 2, 2);
                    // Cuarto separador
                    this.filaTatetiSepExterno("A3", "A3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 7:
                    // Primer separador
                    this.filaTatetiSepExterno("B1", "B1");
                    // Primera fila, matriz B1
                    this.filaTateti(1, 0, 0);
                    // Segundo separador
                    this.filaTatetiSepExterno("B1", "B2");
                    // Primera fila, matriz B2
                    this.filaTateti(1, 1, 0);
                    // Tercer separador
                    this.filaTatetiSepExterno("B2", "B3");
                    // Primera fila, matriz B3
                    this.filaTateti(1, 2, 0);
                    // Cuarto separador
                    this.filaTatetiSepExterno("B3", "B3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 9:
                    // Primer separador
                    this.filaTatetiSepExterno("B1", "B1");
                    // Segunda fila, matriz B1
                    this.filaTateti(1, 0, 1);
                    // Segundo separador
                    this.filaTatetiSepExterno("B1", "B2");
                    // Segunda fila, matriz B2
                    this.filaTateti(1, 1, 1);
                    // Tercer separador
                    this.filaTatetiSepExterno("B2", "B3");
                    // Segunda fila, matriz B3
                    this.filaTateti(1, 2, 1);
                    // Cuarto separador
                    this.filaTatetiSepExterno("B3", "B3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 11:
                    // Primer separador
                    this.filaTatetiSepExterno("B1", "B1");
                    // Tercera fila, matriz B1
                    this.filaTateti(1, 0, 2);
                    // Segundo separador
                    this.filaTatetiSepExterno("B1", "B2");
                    // Tercera fila, matriz B2
                    this.filaTateti(1, 1, 2);
                    // Tercer separador
                    this.filaTatetiSepExterno("B2", "B3");
                    // Tercera fila, matriz B3
                    this.filaTateti(1, 2, 2);
                    // Cuarto separador
                    this.filaTatetiSepExterno("B3", "B3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 13:
                    // Primer separador
                    this.filaTatetiSepExterno("C1", "C1");
                    // Primera fila, matriz C1
                    this.filaTateti(2, 0, 0);
                    // Segundo separador
                    this.filaTatetiSepExterno("C1", "C2");
                    // Primera fila, matriz C2
                    this.filaTateti(2, 1, 0);
                    // Tercer separador
                    this.filaTatetiSepExterno("C2", "C3");
                    // Primera fila, matriz C3
                    this.filaTateti(2, 2, 0);
                    // Cuarto separador
                    this.filaTatetiSepExterno("C3", "C3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 15:
                    // Primer separador
                    this.filaTatetiSepExterno("C1", "C1");
                    // Segunda fila, matriz C1
                    this.filaTateti(2, 0, 1);
                    // Segundo separador
                    this.filaTatetiSepExterno("C1", "C2");
                    // Segunda fila, matriz C2
                    this.filaTateti(2, 1, 1);
                    // Tercer separador
                    this.filaTatetiSepExterno("C2", "C3");
                    // Segunda fila, matriz C3
                    this.filaTateti(2, 2, 1);
                    // Cuarto separador
                    this.filaTatetiSepExterno("C3", "C3");
                    // Salto de linea
                    System.out.println();
                    break;
                case 18:
                    // Primer separador
                    this.filaTatetiSepExterno("C1", "C1");
                    // Tercera fila, matriz C1
                    this.filaTateti(2, 0, 2);
                    // Segundo separador
                    this.filaTatetiSepExterno("C1", "C2");
                    // Tercera fila, matriz C2
                    this.filaTateti(2, 1, 2);
                    // Tercer separador
                    this.filaTatetiSepExterno("C2", "C3");
                    // Tercera fila, matriz C3
                    this.filaTateti(2, 2, 2);
                    // Cuarto separador
                    this.filaTatetiSepExterno("C3", "C3");
                    // Salto de linea
                    System.out.println();
                    break;
            }
        }
    }
    
    // Nos imprime las filas que solo tienen * con fondo de color
    private boolean filaSeparador(String tablero1, String tablero2, int maximo, int minimo) {
        String YELLOW_BACKGROUND = "\033[43m";
        String GREEN_BACKGROUND = "\033[42m";
        String ANSI_RESET = "\u001B[0m";
        
        boolean imprimio = false;
        
        if (this.getTableroEnUso().equals(tablero1) || this.getTableroEnUso().equals(tablero2)) {
            for (int j=0 ; j<19 ; j++) {
                if (j<maximo && j>minimo) {
                    System.out.print(YELLOW_BACKGROUND + "*" + ANSI_RESET);
                } else {
                    System.out.print(GREEN_BACKGROUND + "*" + ANSI_RESET);
                }
            }
            imprimio = true;
        } 
        
        return imprimio;
    }
    
    // Nos imprime las filas que solo tienen * con fondo verde
    private void filaSeparadorVerde() {
        String GREEN_BACKGROUND = "\033[42m";
        String ANSI_RESET = "\u001B[0m";
        
        for (int j=0 ; j<19 ; j++) {
            System.out.print(GREEN_BACKGROUND + "*" + ANSI_RESET);
        }
    }
    
    // Nos imprime los separadores * que se encuentran entre los tatetis
    private void filaTatetiSepExterno(String tablero1, String tablero2) {
        String YELLOW_BACKGROUND = "\033[43m";
        String GREEN_BACKGROUND = "\033[42m";
        String ANSI_RESET = "\u001B[0m";
        
        if (this.getTableroEnUso().equals(tablero1) || this.getTableroEnUso().equals(tablero2)) {
            System.out.print(YELLOW_BACKGROUND + "*" + ANSI_RESET);
        } else {
            System.out.print(GREEN_BACKGROUND + "*" + ANSI_RESET);
        }
    }
    
    // Nos imprime las filas internas de los tatetis de forma -+-+-
    private void filaTatetiSepInterno(int fila, int columna) {
        String RED = "\033[0;31m";
        String BLUE = "\033[0;34m";
        String ANSI_RESET = "\u001B[0m";
        
        for (int j=0 ; j<5 ; j++) {
            // Tablero ganado
            if (this.tableroGrande[fila][columna].getGanado()) {
                // Ganador X
                if (this.tableroGrande[fila][columna].getGanador().equals("X")) {
                    // Ponemos los -
                    if (j == 0 || j == 2 || j == 4) {
                        System.out.print(RED + "-" + ANSI_RESET);
                    // Ponemos los +
                    } else {
                        System.out.print(RED + "+" + ANSI_RESET);
                    }
                // Ganador O
                } else {
                    // Ponemos los -
                    if (j == 0 || j == 2 || j == 4) {
                        System.out.print(BLUE + "-" + ANSI_RESET);
                    // Ponemos los +
                    } else {
                        System.out.print(BLUE + "+" + ANSI_RESET);
                    }
                }
            // Tablero sin ganar
            } else {
                // Ponemos los -
                if (j == 0 || j == 2 || j == 4) {
                    System.out.print("-");
                // Ponemos los +
                } else {
                    System.out.print("+");
                }
            }
        }
    }
    
    // Nos imprime las filas de los tatetis de forma O|X|O, X| |O, etc...
    private void filaTateti(int fila, int columna, int numFila) {
        String RED = "\033[0;31m";
        String BLUE = "\033[0;34m";
        String ANSI_RESET = "\u001B[0m";
        
        // Decidimos si el tablero fue ganado o no
        boolean ganado = this.tableroGrande[fila][columna].getGanado();
        
        if (ganado) {
            switch (this.tableroGrande[fila][columna].getGanador()) {
                // Caso en que ganó la X
                case "X":
                    for (int j=0 ; j<5 ; j++) {
                        switch (j) {
                            case 0:
                                if (this.tableroGrande[fila][columna].tablero[numFila][0].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][0].equals("O")) {
                                        System.out.print(RED + this.tableroGrande[fila][columna].tablero[numFila][0] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            case 2:
                                if (this.tableroGrande[fila][columna].tablero[numFila][1].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][1].equals("O")) {
                                        System.out.print(RED + this.tableroGrande[fila][columna].tablero[numFila][1] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            case 4:
                                if (this.tableroGrande[fila][columna].tablero[numFila][2].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][2].equals("O")) {
                                        System.out.print(RED + this.tableroGrande[fila][columna].tablero[numFila][2] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            default:
                                System.out.print(RED + "|" + ANSI_RESET);
                                break;
                        }
                    }
                    break;
                // Caso en que ganó el O
                case "O":
                    for (int j=0 ; j<5 ; j++) {
                        switch (j) {
                            case 0:
                                if (this.tableroGrande[fila][columna].tablero[numFila][0].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][0].equals("O")) {
                                        System.out.print(BLUE + this.tableroGrande[fila][columna].tablero[numFila][0] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            case 2:
                                if (this.tableroGrande[fila][columna].tablero[numFila][1].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][1].equals("O")) {
                                        System.out.print(BLUE + this.tableroGrande[fila][columna].tablero[numFila][1] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            case 4:
                                if (this.tableroGrande[fila][columna].tablero[numFila][2].equals("X") || 
                                    this.tableroGrande[fila][columna].tablero[numFila][2].equals("O")) {
                                        System.out.print(BLUE + this.tableroGrande[fila][columna].tablero[numFila][2] + ANSI_RESET);
                                } else {
                                    System.out.print(" ");
                                }
                                break;
                            default:
                                System.out.print(BLUE + "|" + ANSI_RESET);
                                break;
                        }
                    }
                    break;
            }
        // Caso en que aun no gano nadie
        } else {
            for (int j=0 ; j<5 ; j++) {
                switch (j) {
                    case 0:
                        if (this.tableroGrande[fila][columna].tablero[numFila][0].equals("X")) {
                            System.out.print(RED + "X" + ANSI_RESET);
                        } else if (this.tableroGrande[fila][columna].tablero[numFila][0].equals("O")) {
                            System.out.print(BLUE + "O" + ANSI_RESET);
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 2:
                        if (this.tableroGrande[fila][columna].tablero[numFila][1].equals("X")) {
                            System.out.print(RED + "X" + ANSI_RESET);
                        } else if (this.tableroGrande[fila][columna].tablero[numFila][1].equals("O")) {
                            System.out.print(BLUE + "O" + ANSI_RESET);
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 4:
                        if (this.tableroGrande[fila][columna].tablero[numFila][2].equals("X")) {
                            System.out.print(RED + "X" + ANSI_RESET);
                        } else if (this.tableroGrande[fila][columna].tablero[numFila][2].equals("O")) {
                            System.out.print(BLUE + "O" + ANSI_RESET);
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    default:
                        System.out.print("|");
                        break;
                }
            }
        }
    }
}
