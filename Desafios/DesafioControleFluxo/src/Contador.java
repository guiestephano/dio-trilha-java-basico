import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Insira o valor do primeiro parâmetro: ");
            int parametroUm = sc.nextInt();
            System.out.print("Insira o valor do segundo parâmetro: ");
            int parametroDois = sc.nextInt();
            sc.close();
            contar(parametroUm,parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Erro: O valor dos parâmetros devem ser do tipo inteiro!");
        }
        catch (Exception e){
            System.out.println("Erro: inesperado!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Erro: O segundo parâmetro deve ser maior que o primeiro!");
        }

        int valorContagem = parametroDois - parametroUm;
        System.out.println("Iniciando Contagem:");
        for(int i = 1; i <= valorContagem; i++){
            System.out.println(i);
        }
    }
}
