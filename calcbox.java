/* 
 * Universidad Simón Bolívar | Ingeniería de Sistemas
 * Autor: Sebastián Pulido Lozano (Altercado)
 */
package sebastianp;
import java.util.Scanner;
public class Sebastianp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso1, peso2, peso3, peso4;
        double est1, est2, est3, est4;
        double stp, ste, pp, pe, sp1p2, psp1p2;
        
        // Ingreso de Peso
        System.out.println(" ------------------------------- ");
        System.out.println(" Ingrese el Peso de los Boxeador ");
        System.out.println(" ------------------------------- ");
        System.out.println(" 1. Ingrese Peso del Boxeador 1: ");
        peso1 = sc.nextInt();
        System.out.println(" 2. Ingrese Peso del Boxeador 2: ");
        peso2 = sc.nextInt();
        System.out.println(" 3. Ingrese Peso del Boxeador 3: ");
        peso3 = sc.nextInt();
        System.out.println(" 4. Ingrese Peso del Boxeador 4: ");
        peso4 = sc.nextInt();
        
        // Ingreso de Estatura
        System.out.println(" ----------------------------------- ");
        System.out.println(" Ingrese la Estatura de los Boxeador ");
        System.out.println(" ----------------------------------- ");
        System.out.println(" 1. Ingrese la Estatura del Boxeador 1: ");
        est1 = sc.nextDouble();
        System.out.println(" 1. Ingrese la Estatura del Boxeador 2: ");
        est2 = sc.nextDouble();
        System.out.println(" 1. Ingrese la Estatura del Boxeador 3: ");
        est3 = sc.nextDouble();
        System.out.println(" 1. Ingrese la Estatura del Boxeador 4: ");
        est4 = sc.nextDouble();
        
        // Operaciones
        stp = peso1 + peso2 + peso3 + peso4;
        ste = est1 + est2 + est3+ est4;
        pp = stp / 4;
        pe = ste / 4;
        sp1p2 = peso1 + peso2;
        psp1p2 = sp1p2/stp*100; 
        
        //Resultados
        System.out.println(" --------------------------------- ");
        System.out.println(" Resultado de los Datos Ingresados ");
        System.out.println(" --------------------------------- ");
        System.out.println(" 1. Suma total de los pesos de los boxeadores: " + stp);
        System.out.println(" 2. Suma total de la estatura de los boxeadores: " + ste);
        System.out.println(" 3. Promedio de los pesos de los boxeadores: " + pp);
        System.out.println(" 4. Promedio de la estatura de los boxeadores: " + pe);
        System.out.println(" 5. Porcentaje representado por la suma del peso total de los dos primeros boxeadores: " + psp1p2);
    }
    
}
