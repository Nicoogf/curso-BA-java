import java.util.Scanner;

public class TechLab {
    public static void main(String[] args) {
        double precioProducto = 5.50 ;
        int cantidadProducto = 15 ;

        var resultado =  precioProducto * cantidadProducto ;

        System.out.println(resultado);
        Scanner teclado = new Scanner(System.in) ;
        System.out.println("Ingresar nombre de usuario : ");
        String nombreUsuario =  teclado.nextLine() ;
        System.out.println("Ingresar cantidad de productos");
        String cantidadProductos =  teclado.nextLine() ;
        int cantidadProductosInt =  Integer.parseInt(cantidadProductos) ;
        double  precioFijo = 250.0 ;

        var resultadoCarrito = cantidadProductosInt * precioFijo ;

        if( cantidadProductosInt > 100) {
            double descuento = resultadoCarrito * 0.10 ;
            resultadoCarrito = resultadoCarrito * 0.90 ;
            System.out.println("Aplica descuento de " + descuento );
        }

        System.out.println("Hola " + nombreUsuario + " el total a pagar es $" + resultadoCarrito );

        System.out.println("Ciclo for");
        System.out.println("Ingresar hasta que valor repetir");
        int valorARepetir = Integer.parseInt(teclado.nextLine()) ;


        for ( int i = 0 ; i <= valorARepetir ; i ++) {
            System.out.println(i);
        }


        System.out.println("While : ");
        int contador = 0  ;
        while( valorARepetir >= contador ) {
            System.out.println(contador);
            contador++ ;
        }

        teclado.close(); 
    }


}
