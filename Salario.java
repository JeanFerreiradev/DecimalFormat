package beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Salario {
	static Scanner input = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("0.00");

	public static void main(String[] args) {
		String nomeVendedor = "";
		double salarioFixo = 0.0;
		double vendas = 0.0;
		System.out.print("Digite o nome do vendedor: ");
		nomeVendedor = input.nextLine();
		System.out.print("Digite o salario fixo do vendedor: ");
		salarioFixo = input.nextDouble();
		System.out.print("Digite o total das vendas: ");
		vendas = input.nextDouble();
		double pagamento = salarioFixo + (vendas * 15/ 100);
		System.out.println("Total a receber: " + format.format(pagamento));
		
	}

}
