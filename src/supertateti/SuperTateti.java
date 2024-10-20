package supertateti;

import java.util.Scanner;
public class SuperTateti {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        //Animación
        String bienvenidos = "BIENVENIDOS AL GRAN TATETI"; 
        for(int i = 0 ; i < bienvenidos.length() ; i++){
            System.out.print("\u001B[31m" + bienvenidos.charAt(i) + "\u001B[0m");
            sistema.sleep(250);
            //Va imprimiendo caracter por caracter con un intervalo de 0.25 seg
        }
        System.out.println("");//salto de linea
        sistema.sleep(2000);//2 seg de sleep
        sistema.limpiarConsola();
        Scanner entrada = new Scanner(System.in);
        sistema.mainMenu();

    }
}
