package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	    
		var nome ="Israel";
		var sobrenome = "Lima";
		var idade = 31;
		var salario = 12345.987;

		System.out.println(" Nome " + nome + " Sobrenome " + sobrenome + " Idade" + idade + " Salario " + salario);
				
		
	}

}
