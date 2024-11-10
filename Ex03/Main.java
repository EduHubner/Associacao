package exAss03;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setEndereco("Rua A");
		pessoa.setNome("Roger");
		
		System.out.println(pessoa);
		
		Banco banco = new Banco();
		
		banco.setCodigo(123);
		banco.setNome("Itau");
		banco.setNumeroAgencias(3);
		
		System.out.println(banco);
		
		ContaBancaria contBanc = new ContaBancaria();
		
		contBanc.setAgencia(123500);
		contBanc.setNumeroConta(123456);
		contBanc.setSaldo(500000);
		contBanc.banco.setCodigo(123);
		contBanc.banco.setNome("Itau");
		contBanc.banco.setNumeroAgencias(3);
		contBanc.correntista.setEndereco("Rua B");
		contBanc.correntista.setNome("Jorge");
		
		System.out.println(contBanc);
		
		ContaSimples cSimples = new ContaSimples();
		
		cSimples.setSaldoPoupanca(1000);
		cSimples.setAgencia(12351400);
		cSimples.setNumeroConta(789456);
		cSimples.setSaldo(3000);
		cSimples.banco.setCodigo(321);
		cSimples.banco.setNome("Bradesco");
		cSimples.banco.setNumeroAgencias(3);
		cSimples.correntista.setEndereco("Rua C");
		cSimples.correntista.setNome("Milton");
		
		boolean p = cSimples.depositoPoupanca(40);
		
		System.out.println(p);
		System.out.println(cSimples);
		
		CartaoCredito cc = new CartaoCredito();
		
		cc.setLimite(1300);
		cc.setNumero(123);
		cc.setOperadora("ABB");
		cc.setTipoCartao("GOld");
		
		ContaEspecial cEspecial = new ContaEspecial();
		
		cEspecial.setDiasSemJuro(10);
		cEspecial.setLimite(12000);
		cEspecial.setAgencia(00000000);
		cEspecial.setNumeroConta(4651456);
		cEspecial.setSaldo(1000000);
		cEspecial.banco.setCodigo(789);
		cEspecial.banco.setNome("Banco do Brasil");
		cEspecial.banco.setNumeroAgencias(9);
		cEspecial.correntista.setEndereco("Rua E");
		cEspecial.correntista.setNome("Cleber");
		cEspecial.cartao.setLimite(1000);
		cEspecial.cartao.setNumero(12379);
		cEspecial.cartao.setOperadora("CCC");
		cEspecial.cartao.setTipoCartao("Black");
		
		System.out.println(cEspecial);
		
		

	}

}
