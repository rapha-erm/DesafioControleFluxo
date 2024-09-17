import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException msg) {
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;
            for(int i = 1 ; i <= contagem ; i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
        else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
