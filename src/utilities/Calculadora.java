package utilities;

import entities.Pessoa;

public class Calculadora {

	Pessoa pessoa;
	
	public double calculoIMC(Pessoa pessoa) { 
		int peso = pessoa.getKilos();
		double altura = pessoa.getAltura();
		
		if (altura <= 0) {
			throw new IllegalArgumentException("A altura deve ser maior que 0");
		}
		
		return peso / (altura * altura);
	}
		
	public String determinarGrauObesidade(double imc) {
		if (imc < 16) {
			return "Magreza grave";
        } else if (imc < 17) {
            return "Magreza moderada";
        } else if (imc < 18.5) {
            return "Magreza leve";
        } else if (imc < 25) {
            return "Saudável";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau I";
        } else if (imc < 40) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
		}
	}

	@Override
	public String toString() {
		return "Seu IMC é: " + calculoIMC(pessoa);
	}	
}
