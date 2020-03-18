/*
Este es un CRUD educacional para entender algunas de las operaciones básicas
de la estructura de datos ArrayList
 */
package crudarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author davidmramirez
 */
public class CrudArrayList {

    ArrayList<String> listaStrings;
    
    public static void main(String[] args) {
    //creamos la variable inst (es decir, para instanciar o crear el objeto de la lista listaStrings)
    CrudArrayList inst = new CrudArrayList();
    inst.listaStrings = new ArrayList(); //creamos un objeto para ArrayList
    inst.leerOpcion(); // asi podemos invocar a los objetos que pertenecen a la clase EjemploLista3
    }
    
    public void leerOpcion(){
    Scanner teclado = new Scanner (System.in); //creamos un objeto llamado teclado
    int opc;
    do{
        System.out.println("\nSeleccione opción");
        System.out.println("[1] Crear elemento en la lista");
        System.out.println("[2] Leer elementos en lista");
        System.out.println("[3] Modificar elemento de la lista");
        System.out.println("[4] Eliminar elemento en la lista");
        System.out.println("[5] Salir");
    opc = teclado.nextInt();
    switch(opc){
        case 1:
            crear();
            break;
        case 2:
            leer();
            break;
        case 3:
            modificar();
            break;
        case 4:
            eliminar();
            break;
        case 5:
            
    }     
    }while(opc != 5);        
    }
    
    public void crear(){
    Scanner teclado = new Scanner(System.in);
    String cadena;
        System.out.println("Digite cadena a ingresar: ");
        cadena = teclado.nextLine(); //metodo de Scanner que permite capturar strings 
    listaStrings.add(cadena);
    }
    
    public void leer(){
    if(!listaStrings.isEmpty()){
        System.out.println("Elementos de la lista: ");
        for (int i = 0; i < listaStrings.size(); i++){
            System.out.println(listaStrings.get(i));
        }
    }else{
        System.out.println("La lista está vacía");
    }
    }
    
    public void modificar(){
    Scanner teclado = new Scanner(System.in);
    String cadena;
    String cadenaNueva;
    int indice = 0;
     System.out.println("Cadena a modificar: ");
        cadena = teclado.nextLine();
        indice = listaStrings.indexOf(cadena);
        if(indice != -1){
            System.out.println("Nueva cadena: ");
            cadenaNueva = teclado.nextLine();
            listaStrings.set(indice,cadenaNueva);
        }else{
            System.out.println("Cadena no encontrada en la lista.");
        }
    }
    
    public void eliminar(){
    Scanner teclado = new Scanner(System.in);
    String cadena;
    int indice = 0;
        System.out.println("Cadena a eliminar: ");
        cadena = teclado.nextLine();
        indice = listaStrings.indexOf(cadena);
        if(indice != -1){
        listaStrings.remove(indice);
            System.out.println("Cadena eliminada.");
        }else{
            System.out.println("Cadena no encontrada");
        }
    }
    
}