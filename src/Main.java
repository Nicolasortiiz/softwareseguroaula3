import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do compositor: ");
        String nome = input.nextLine();
        System.out.println("Idade do compositor: ");
        int idade = input.nextInt();
        Pessoa compositor = new Pessoa(nome, idade);

        ArrayList<Musica> lista_musicas = new ArrayList<Musica>();

        for(int i=0;i<4;i++){
            input = new Scanner(System.in);
            System.out.println("Digite o titulo da musica: ");
            String titulo = input.nextLine();
            System.out.println("Digite a duracao da musica: ");
            int duracao = input.nextInt();
            lista_musicas.add(new Musica(titulo,duracao,compositor));
        }

        input = new Scanner(System.in);
        System.out.println("Digite o genero do album: ");
        String genero_album = input.nextLine();
        System.out.println("Digite o ano do album: ");
        int ano_album = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Digite o nome do album: ");
        String nome_album = input.nextLine();

        input = new Scanner(System.in);
        System.out.println("Digite o nome do artista do album: ");
        String nome_artista = input.nextLine();
        System.out.println("Digite a idade do artista do album: ");
        int idade_artista = input.nextInt();
        Pessoa artista = new Pessoa(nome_artista, idade_artista);

        Album album = new Album(genero_album, ano_album, nome_album, artista, lista_musicas);

        album.mostrarTodosOsDados();

    }
}