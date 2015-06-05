import java.util.Scanner;
import java.util.HashSet;


public class TelaItem {
	
	Scanner sc = new Scanner(System.in);
	public int iniciar(){
		
		System.out.println("SISTEMA DE GERENCIAMENTO DE ITENS.");
		System.out.println("SELECIONE A OP��O DESEJADA:");
		System.out.println("1: Cadastrar novo item.");
		System.out.println("2: Remover item.");
		System.out.println("3: Procurar item.");
		System.out.println("4: Cadastrar um exemplar.");
		System.out.println("5: remover um exemplar.");
		System.out.println("6: Procurar por um exemplar.");
		System.out.println("7: Sair.");
		return sc.nextInt();
	}
	
	public int opcaoItemACriar()
	{
		System.out.println("1: cadastrar livro");
		System.out.println("2: cadastrar revista");
		return sc.nextInt();
	}
	
	public Item cadastrarLivro()
	{
		HashSet<String> autores = new HashSet<>();
		System.out.println("entre com o primeiro autor:");  //criar op�ao de adicionar mais autores depois
		autores.add(sc.next());
		
		System.out.println("entre com o titulo:");
		System.out.println("entre com a editora:");
		System.out.println("entre com o ano:");
		System.out.println("faixa etaria :(INFANTIL, JUVENIL, ADULTO)");
		System.out.println("entre com a edicao");
		System.out.println("entre com o genero: (COMEDIA, DRAMA, POLICIAL");
		Livro livro = new Livro(sc.next(), sc.next(), sc.nextInt(), (FaixaEtaria)sc.nextInt(), autores, sc.nextInt(), (Genero)sc.next());  //enum est� incorreto
		return livro;
	}
	
	public Item cadastrarRevista()
	{
		System.out.println("entre com o titulo da revista:");
		System.out.println("entre com a editora:");
		System.out.println("entre com o ano de publicacao:");
		System.out.println("faixa etaria :(INFANTIL, JUVENIL, ADULTO)");
		System.out.println("entre com a edicao");
		System.out.println("entre com a periodicidade");
		Revista revista = new Revista(sc.next(), sc.next(), sc.nextInt(), (FaixaEtaria)sc.nextInt(), sc.nextInt(), (Periodicidade)sc.next());   //enum est� incorreto
		return revista;		
	}
	
	
	public int procurarItem()
	{
		System.out.println("1: produrar o codigo por titulo");
		System.out.println("2: produrar o titulo pelo c�digo");
		return sc.nextInt();		
	}
	
	public String pegaTituloParaProcurar()
	{
		System.out.println("entre com o titulo: ");
		return sc.next();
	}
	
	public int pegaCodigoParaProcurar()
	{
		System.out.println("entre com o codigo: ");
		return sc.nextInt();
	}
	
	public void sair(){
		System.out.println("Obrigado por usar o nosso sistema.");
		System.out.println("Saindo...");
	}
	
	public void entradaInvalida(){
		System.out.println("Entrada invalida!");
	}


}
