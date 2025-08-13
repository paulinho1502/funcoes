import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// exercicio 1
//    public static void mostrarMensagem (){
//        System.out.println("Bem-vindo(a) ao programa");
//    }


//exercicio2
//    public static void mostrarDobro(int num){
//        int resultado = num * 2;
//        System.out.println(resultado);
//    }


    //exercicio3
//    public static int dividir(int num1, int num2){
//      int resultado = num1  / num2;
//      return resultado;
//    }


//     exercicio4
//    public static boolean ehPar(int num1){
//        boolean resultado = (num1 % 2 == 0);
//        return resultado;
//    }

//     exercicio5
//    public static double celsiusParaFahrenheit(double graus){
//        double resultado = (graus * 1.8 + 32);
//        return resultado;
//    }


    // exercicio6
//    public static double calcularAreaRetangulo(double num1,double num2){
//        double resultado = num1 * num2;
//        return resultado;
//    }


    // exercicio7
//    public static double calcularMedia (double num1, double num2, double num3){
//        double resultado = num1 + num2 + num3 / 3;
//        return resultado;
//    }

//    // exercicio8
//    public static boolean ehMultiploDe3(int num1){
//        boolean resultado = num1 % 3 == 0 == true;
//        return resultado;
//    }


    //exercicio9

    public static int somaArray(int[] numeros) {

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = numeros[i] + soma;

        }
        return soma;
    }




    public static void main(String[] args) {


//       (1)
//        mostrarMensagem();

//       (2)
//        mostrarDobro(5);

//       (3)
//        int resultado = dividir(10, 2 );
//
//        System.out.println(resultado);

//        (4)
//        boolean resultado = ehPar(6);
//        System.out.println(resultado);

        Scanner sc = new Scanner(System.in);
//        (5)
//        System.out.println("Digite a quantidade de graus: ");
//        double graus = sc.nextDouble();
//
//     double resultado = celsiusParaFahrenheit(graus);
//
//        System.out.println(graus + " e igual a: " + resultado + "F");


        // (6)

//        System.out.println("Digite a altura: ");
//        double num1 = sc.nextDouble();
//
//        System.out.println("Digite a largura: ");
//        double num2 = sc.nextDouble();
//
//        double resultado = calcularAreaRetangulo(num1,num2);
//
//        System.out.println("A area do retangulo e: " + resultado);


        // (7)

//        System.out.println("Digite a nota1: ");
//        double num1 = sc.nextDouble();
//
//        System.out.println("Digite a nota2: ");
//        double num2 = sc.nextDouble();
//
//        System.out.println("Digite a nota3: ");
//        double num3 = sc.nextDouble();
//
//        double resultado = calcularMedia(num1, num2,num3);
//        System.out.println("A media e:" +resultado);



        // 8

//        System.out.println("Digite o numero: ");
//
//        int num1 = sc.nextInt();
//
//        boolean resultado = ehMultiploDe3(num1);
//
//        System.out.println(resultado);





int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {

            numeros[i] = sc.nextInt();
        }
        int soma = somaArray(numeros);
        System.out.println(soma);






    }
}