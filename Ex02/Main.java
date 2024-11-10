package exAss02;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		
		motor.setCilindros(4);
		motor.setCombustivel("Gasolina");
		motor.setMarca("ABBA");
		motor.setPotencia(160);
		
		System.out.println(motor);
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setEndereco("Rua A");
		pessoa.setNome("Roger");
		
		System.out.println(pessoa);
		
		Carro carro = new Carro();
		
		carro.setAno(1998);
		carro.setCor("Preto");
		carro.setFabricante("Mercedes");
		carro.setModelo("X6");
		//carro.setDono(pessoa);
		//carro.setMotor(motor);
		carro.motor.setCilindros(4);
		carro.motor.setCombustivel("Gasolina");
		carro.motor.setMarca("ABBA");
		carro.motor.setPotencia(160);
		carro.dono.setEndereco("Rua A");
		carro.dono.setNome("Roger");
		
		
		System.out.println(carro);
		
		carro.dono.setNome("Pedro");
		
		System.out.println(carro);
	}

}
