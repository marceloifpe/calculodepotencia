/*Programa que calcula potência dos Números solicitados pelo usuário.
obs: sem usar do operador de multiplicação ou sem usar função mathpow*/

import java.util.Scanner;   

public class App {
    public static double potcalc(double n1, double e2)
    { //n1 base e e2 expoente
        /*condição se que avalia se a base é positiva ou negativa tanto do numero base quanto do expoente
        caso não retorna a potência negativa.*/
            if(n1<0){
                if(e2%2 == 0){
                    return potcalc(-n1,e2);
                }
                else {
                    return -potcalc(-n1,e2);
                }
            }
            if (e2==0){
                return 1;
            }
            else if (e2<0){
                e2 = -e2;
                return 1/potcalc(n1,e2);
            }
            else if (e2 == 1){
                return n1;
            }
            else{
                return somapot(n1, potcalc(n1,e2-1));
            }
            
        }

        public static double somapot(double h1, double h2)
        {//h2 expoente do número
            //o g vai somand através das comparações e no for atraves do t que serve como contador até retornar o g na função.
            double g = 0;
            if (h2 == 0){
                return g = 0;
            }
            else if (h2 == 1){
                return g = h1;
            }
            for (int t = 0; t < h2; t++){
                g +=  h1;
            }
             return g;
        }
         
        public static void main(String[] args) 
        { //metodo main estático principal
            Scanner in = new Scanner(System.in); //Leitor de variável
        /*Nessa parte é solicitado ao usuário para digitar a base da potência e o expoente, 
        retornado o resultado do cálculo no final*/
            System.out.println("Calculadora de Potência. Digite o número da potência que deseja calcular: ");
            double n = in.nextDouble();
            System.out.println("digite o número do expoente: ");
            double e = in.nextDouble();
        
            double metfinal = potcalc(n, e); //variável que recebe o metodo criado.
        
            System.out.println("\n valor do número base da potência é=> " + n +
                               "\n o valor elevado é=> " +e +
                               "\n o resultado final é=> "  + metfinal);
        
                               in.close(); //fecha programa
        }
        }
        
    
    
    


    



