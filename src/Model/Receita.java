package Model;

public class Receita {
	private String fonte;
	private Socio socio;
	private double quantidade;
	private String mes;
	
	public Receita(){
		
	}
	
	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Receita(String fonte, Socio socio, double quantidade, String mes) {
		super();
		this.fonte = fonte;
		this.socio = socio;
		this.quantidade = quantidade;
		this.mes = mes;
	}
}
