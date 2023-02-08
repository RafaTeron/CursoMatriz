package ExercicioFixacao;

import java.util.Scanner;

/*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
exemplo.*/


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] matriz = new int[N][M];
		
		for (int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		int x = sc.nextInt();
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posi��o = " + i + ", " + j);
					
					if(j > 0) {					
					System.out.println("Esquerdo : " + matriz[i][j - 1]);
					}
					if(j < matriz[i].length-1) {					
					System.out.println("Direito : " + matriz[i][j + 1]);
					}
					if(i > 0) {					
					System.out.println("Cima : " +  matriz[i - 1][j]);
					}
					if(i < matriz.length-1) {					
					System.out.println("Baixo : " +  matriz[1 + i][j]);
					}
				}
			}
		}
		sc.close();

	}

}
