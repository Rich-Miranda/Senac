package senac;

public class TesteCod {

	
	//Atribuido que esta se relacionado com carro
	private String cor;
	private int velocidadeAtual;
	
	//Variavel da classe do carro 
	private String marca ="Ford";
	
	private String modelo;
	
	public Carro() {
		this.cor="preto";
	}
	
	/*public void Carro(String nomeModelo) {
		this.cor = "preto";
		this.modelo = nomeModelo;
	}*/
	
	public void acelerar() {
		this.velocidadeAtual+=10;
	}
	public void frear() {
	this.velocidadeAtual-=10;
	}
	
	public void acelerar(int numVelocidade) {
		this.velocidadeAtual += numVelocidade;
	}
	
	public void acelerar(int numVelocidade, int ValorMaximo) {
		if(numVelocidade < ValorMaximo) {
			this.velocidadeAtual+=numVelocidade;
			
		}
		
		public boolean isCarroParado() {
			return(velocidadeAtual==0);	
		}
		
	}
}
