import java.util.HashSet;

public class Revista extends Item {

	private int edicao;
	private Periodicidade periodicidade;
	
	public Revista(String titulo, String editora, int ano,
			FaixaEtaria faixaEtaria, int edicao, Periodicidade periodicidade)
	{
		super(titulo, editora, ano, faixaEtaria);
		this.edicao = edicao;
		this.periodicidade = periodicidade;
	}
	

	



}
