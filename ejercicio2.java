import java.util.*;
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Prueba de escritorio para el ejercicio: ");
        System.out.println("INICIO");
        System.out.println("SUMA=0");
        System.out.println("x=20");
        System.out.println("SUMA=SUMA+X");
        System.out.println("Y=40");
        System.out.println("X=X+Y**2");
        System.out.println("SUMA= SUMA+ X/Y");
        System.out.println();
        System.out.println(pruebaEscritorioSuma());
    }
    public static String pruebaEscritorioSuma(){
        double suma = 0, x = 20, y = 40;
        System.out.println("el valor actual de las variables es "+"suma="+suma+" x="+x+" y="+y);
        suma += x;
        System.out.println("el valor actual de las variables es "+"suma="+suma+" x="+x+" y="+y);
        x += y*y;
        System.out.println("el valor actual de las variables es "+"suma="+suma+" x="+x+" y="+y);
        suma += x/y;
        System.out.println("el valor actual de las variables es "+"suma="+suma+" x="+x+" y="+y);

        return "La suma es " + suma +"\n";
    }
}
