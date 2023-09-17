import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
           System.out.println("O parâmetro 2 deverá ser maior que o parâmetro 1");

        }
        
    }

    static void contar( int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if ( parametroDois > parametroUm ){
            System.out.println("Contando do parâmetro "+parametroUm+" até o parâmetro "+parametroDois+"\n");
             int contagem = parametroDois - parametroUm;
            for ( int i = parametroUm;i <= parametroDois;i++) {
                System.out.println("Contando..."+i);
            } 
        }else{
            throw new ParametrosInvalidosException();
        }

    }
}

