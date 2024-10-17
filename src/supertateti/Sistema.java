package supertateti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public Scanner entrada = new Scanner(System.in);
    public void pushUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    public void agregarUsuario(Usuario usuario){
        Iterator<Usuario> it = listaUsuarios.iterator();
        boolean esta = false;
        while(it.hasNext()){
            Usuario a = it.next();
            if(a.getAlias().equals(usuario.getAlias())){
                esta = true;
            }
        }
        if(!esta){
            pushUsuario(usuario);
            this.mainMenu();
        }
        else{
            System.out.println("Alias ya ingresado, intente nuevamente");
            this.darAltaUsuario();
        }
    }
    public void imprimirJugadores(){
        Iterator<Usuario> it = listaUsuarios.iterator();
        int pos = 1;
        while (it.hasNext()){
            Usuario a = it.next();
            System.out.println(pos + "-> " + a.toString());
            pos++;
        }
    }
    
    public Usuario obtenerUsuario(){
        this.imprimirJugadores();
        int numero = entrada.nextInt();
        while(numero <= 0){
            System.out.println("Usuario no válido, ingrese nuevamente");
            this.imprimirJugadores();
            numero = entrada.nextInt();
        }
        return listaUsuarios.get(numero-1);
    }
    
    public void mainMenu(){
        System.out.println("1- Registrar un Jugador");
        System.out.println("2- Jugar al Gran Tateti");
        System.out.println("3- Ranking");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                this.darAltaUsuario();
                break;
            case 2:
                this.jugarMenu();
                break;
            case 3:
        }
                
        
    }
    
    public void jugarMenu(){
        System.out.println("1- Jugar entre 2 personas");
        System.out.println("2- Jugar vs la Computadora");
        System.out.println("3- Volver atrás");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                this.jugarEntreDos();
                break;
            case 2:
                this.jugarContraPc();
                break;
            case 3:
                this.mainMenu();
                break;
        }
    }
    
    public void jugarEntreDos(){
        System.out.println("SELECCIONE JUGADOR 1");
        Usuario jugador1 = this.obtenerUsuario();
        System.out.println("Usuario seleccionado: " + jugador1.getAlias());
        System.out.println("SELECCIONE JUGADOR 2:");
        Usuario jugador2 = this.obtenerUsuario();
        System.out.println("Usuario seleccionado: " + jugador2.getAlias());
    }
    
    public void jugarContraPc(){
        System.out.println("SELECCIONE JUGADOR");
        Usuario jugador1 = this.obtenerUsuario();
        System.out.println("Usuario seleccionado: " + jugador1.getAlias());
    }
    
    public void darAltaUsuario(){
        entrada.nextLine();
        Usuario usuario = new Usuario();
        System.out.println("INGRESE NOMBRE");
        usuario.setNombre(entrada.nextLine());
        
        System.out.println("INGRESE ALIAS");
        usuario.setAlias(entrada.nextLine());
        
        System.out.println("INGRESE EDAD");
        usuario.setEdad(entrada.nextInt());
        usuario.setGanados(0);
        this.agregarUsuario(usuario);
    }
}
