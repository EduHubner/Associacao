package exAss03;

public class ContaEspecial extends ContaBancaria {
	
	private int diasSemJuro;
	private double limite;
	protected CartaoCredito cartao;
	
	public ContaEspecial() {
		cartao = new CartaoCredito();
	}

	public int getDiasSemJuro() {
		return diasSemJuro;
	}

	public void setDiasSemJuro(int diasSemJuro) {
		this.diasSemJuro = diasSemJuro;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public CartaoCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuro=");
		builder.append(diasSemJuro);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
