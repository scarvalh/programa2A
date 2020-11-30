package programa2A;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		position mq = new position();
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.printf("Informe o número de andares do prédio:\n");
		
		n = ler.nextInt();
		
		int p[] = new int[n];
		
		System.out.printf("Informe o número de funcionários em cada andar:\n");
		
		for(int i=0;i<n;i++) {
			p[i] = ler.nextInt();
		}
		
		mq.pos(p, n);

	}

}
