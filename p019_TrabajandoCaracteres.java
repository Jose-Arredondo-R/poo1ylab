public class p019_TrabajandoCaracteres {
    public static void main(String[] args) {
        //agrega variabees de tipo carcater y sus valores que se ejecutaran  
        Character c1= 'A', c2= 'B';
        Character numero = '9';
        Character arroba = '@';
        Character pesos = 36;
        Character corazon = '\u2665';
        Character letraw = 119;
        Character espacio = ' ';
        //imprime los valores de los caracteres dados  
    System.out.print("\033[H\033[2J"); System.out.flush();
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(numero);
    System.out.println(arroba);
    System.out.println(pesos);
    System.out.println(corazon);
    System.out.println(letraw);
    System.out.println();
    //ejecuta los dos caracteres seleccionados 
    c1++; c2++; numero--;
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(numero);
    System.out.println(Character.isLetter(c1));
    System.out.println(Character.isDigit(numero)); 
    System.out.println(Character.isAlphabetic(pesos)); 
    System.out.println(Character.isSpaceChar(espacio)); 
    
    }
}