//Ejemplifica la conversion de tipo de datos en Java
public class p020_ConversionTipos {

    public static void main(String[] args) {
        int var1 = 9;
        double var2 = var1;
        float var3 = 123456.789f; 
        double var4 = var3;
        
        System.out.println("\033[H\033[2J");
        System.out.printf("\nImplicita de int a double : %d  %f", var1, var2);
        System.out.printf("\nImplicita de float a double : %f  %f", var3, var4);

        //conversion explicita 
        long var5 = 1234567890123456l;
        int var6 = (int) var5; //explicita de long a int (casting), se pierden datos 
        int var7 = 21448364;
        short var8 = (short) var7; //explicita de int a short (casting), se pierden datos
        System.out.println(String.format("manual con casting de long a int : %d %d", var6, var7));
        System.out.println(String.format("manual con casting de int a short : %d %d", var7, var8));

 


    }
}