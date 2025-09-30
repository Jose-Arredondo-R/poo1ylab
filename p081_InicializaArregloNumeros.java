public class p081_InicializaArregloNumeros {
    public static void main(String[] args) {
        double[] nums = new double[7];
        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;

        System.out.println("primer elemento : " + nums[0]);
        System.out.println("ultimo elemento " + nums[6]);

        System.out.println("todos los elementos del arreglo, segun su indice ");
        for(int i=0; i<7; i++)
        System.out.print(nums[i]);
        System.out.println("proceso terminado ");
    
    
    }
}
