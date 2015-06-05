import java.util.HashSet;

public class Livro extends Item {

	private HashSet<String> autores = new HashSet<>();
	private int edicao;
	private Genero genero;
	
	public Livro(String titulo, String editora, int ano,
			FaixaEtaria faixaEtaria, HashSet<String> autores, int edicao,
			Genero genero)
	{
		super(titulo, editora, ano, faixaEtaria);
		this.autores = autores;
		this.edicao = edicao;
		this.genero = genero;
	}
	

	

	


}

