import java.util.Scanner;
public class buclesCond {
    Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("ESTRUCTURA DE CONTROL");
     System.out.println("INGRESA EL NUMERO A EVALUAR");
     int numero= sc.nextInt();
     if (numero>0){
         //aca se cumple la condicion de positivo ya que solo admite num >0
         System.out.println("el numero " + numero+ " es positivo");
     }
     //caso contrario se verifica si es igual a 0
     else if(numero==0){
         System.out.println("el numero es igual a : "+numero);
     }
     //si no se cumplen ambas condicionales entonces es negativo
     else{
         System.out.println("el numero: "+numero+" es negativo");
     }


     //    BUCLE WHILE

     System.out.println("BUCLE WHILE");
     System.out.println("este bucle consiste en un contador hasta el numero 3");
     int numeroWhile=0;
     while(numeroWhile<3){
         System.out.print(numeroWhile+" ,");
         numeroWhile++;
     }

     // DO WHILE
     System.out.println("");
     System.out.println("BUCLE DO WHILE");
     do{
         System.out.print(numeroWhile+ ", ");
         numeroWhile++;
     }while(numeroWhile<3);

     //BUCLE FOR
     System.out.println("");
     System.out.println("BUCLE FOR");
     for(int numeroFor=0;numeroFor<=3;numeroFor++){
         System.out.print(numeroFor+", ");

     }
    //caso switch
     var estacion = "invierno";

     switch (estacion){
         case "invierno":
             System.out.println("es invierno");
             break;
         case "verano":
             System.out.println("es verano");
             break;
         case "otoño":
             System.out.println("es otoño");
             break;
         case "primavera":
             System.out.println("es primavera");
             break;



     }

 }

}
