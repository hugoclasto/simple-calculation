package calculonn;

import java.util.Scanner;

public class CalculoNN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double value;
		double inss = 3.50;
		double caucao = 5.00;
		double alqaprox = 13.71;
		double valueLiq, valuealqaprox, valueinss, valuecaucao;
		
		System.out.println("Insira o valor do cálculo:");
		value = sc.nextDouble();
		valueinss = value * (inss/100);
		valuecaucao = value * (caucao/100);
		valueLiq = value - valueinss - valuecaucao;
		valuealqaprox = valueLiq * (alqaprox/100);
		System.out.printf("Valor: R$ %.2f%nValor do INSS: R$ %.2f%nValor do CAUÇÃO: R$ %.2f%nValor Líquido: R$ %.2f%nValor Aproximado: R$ %.2f", value, valueinss, valuecaucao, valueLiq, valuealqaprox);
		sc.close();

	}

}
