import java.util.HashSet;

public abstract class Item {

	private int codigo;
	private String titulo;
	private String editora;
	private int ano;
	private HashSet<IExemplar> exemplares = new HashSet<>();
	private static int codigoAtual = 0;
	private FaixaEtaria faixaEtaria;


	public Exemplar getExemplar(Item item) {
		for(IExemplar exemplar : exemplares)
		{
			
		}
		return null;
	}

	public Item(String titulo, String editora, int ano, FaixaEtaria faixaEtaria)
	{
		super();
		this.setCodigo(codigoAtual);
		this.setTitulo(titulo);
		this.setEditora(editora);
		this.setAno(ano);
		this.faixaEtaria = faixaEtaria;
		codigoAtual++;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo()
	{
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo()
	{
		return titulo;
	}
	
	public static int getCodigoAtual()
	{
		return codigoAtual;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	/**
	 * @return the editora
	 */
	public String getEditora()
	{
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(String editora)
	{
		this.editora = editora;
	}

	/**
	 * @return the ano
	 */
	public int getAno()
	{
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano)
	{
		this.ano = ano;
	}

	/**
	 * @return the faixaEtaria
	 */
	public FaixaEtaria getFaixaEtaria()
	{
		return faixaEtaria;
	}

	/**
	 * @param faixaEtaria the faixaEtaria to set
	 */
	public void setFaixaEtaria(FaixaEtaria faixaEtaria)
	{
		this.faixaEtaria = faixaEtaria;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero()
	{
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero)
	{
		this.genero = genero;
	}
	
	

}
