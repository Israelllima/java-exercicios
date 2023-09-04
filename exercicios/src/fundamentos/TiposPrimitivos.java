package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	 	// Informacoes do funcionario
		
		// Tipos nimericos inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 1_123_845_223;
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_911_797_103.041;
		
		// tipo booleano
		boolean EstaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		 // dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos /2);
		 
		// Pontos por   real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha -> " + salario);
		System.out.println("Ferias? " + EstaDeFerias);
		System.out.println("Status: " + status);
		
	}
	

}
