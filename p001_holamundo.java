//Envia un saludo a la pantalla 

public class p001_holamundo {
    // Método principal
    public static void main(String[] args) {
        // Declaración de variables
        String amigo = "adrian";
        String hermano = "reynaldo";
        String mensaje = String.format("tanto %s como %s desean aprender java", amigo, hermano);
        // Imprimir mensajes en pantalla
        System.out.println("¡Hola mundo desde Java");
        //imprime el hola mundo 
        System.out.println("hola amigo "  +  amigo  + " bienvenido a java ");
        System.out.println("hola amigo "  +  amigo  +  " mi hermano es " + hermano);
        //imprime el mensaje mas las variables seleccionadas 
        System.out.println(mensaje);

    }
}
