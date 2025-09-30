public class p082_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] muns = new String[10];
        muns[0] = "Apozol";
        muns[1] = "Apulco";
        muns[2] = "Cañitas";
        muns[3] = "Jerez";
        muns[4] = "Fresnillo";
        muns[5] = "Rio Grande";
        muns[6] = "Sain Alto";
        muns[7] = "sombrerete";
        muns[8] = "Teul";
        muns[9] = "Zacatecas";
        

        System.out.println("primer elemento : " + muns[0]);
        System.out.println("ultimo elemento " + muns[9]);

        System.out.println("todos los elementos del arreglo en base a su indice ");
        for(int j=0; j<10; j++)
        System.out.println(muns[j]);
       
        System.out.println("Todos los elementos del arreglo, sin usar el indice ");
        for(String mun : muns)
        System.out.println(mun);


        System.out.println("proceso terminado ");
    
    
    }
}
