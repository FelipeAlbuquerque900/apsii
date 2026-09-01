import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        Livro livro = new Livro();
	        CD cd = new CD();

	        System.out.println("Cadastro do Livro");
	        System.out.print("Digite o título do livro: ");
	        livro.setTitulo(scanner.nextLine());
	        System.out.print("Digite o autor do livro: ");
	        livro.setAutor(scanner.nextLine());
	        System.out.println("\nCadastro do CD");
	        System.out.print("Digite o título do CD: ");
	        cd.setTitulo(scanner.nextLine());
	        System.out.print("Digite o artista: ");
	        cd.setArtista(scanner.nextLine());
	        System.out.println("\nLivro cadastrado");
	        System.out.println("Título: " + livro.getTitulo());
	        System.out.println("Autor: " + livro.getAutor());
	        System.out.println("\nCD Cadastrado");
	        System.out.println("Título: " + cd.getTitulo());
	        System.out.println("Artista: " + cd.getArtista());

	        scanner.close();
	    }
	}
