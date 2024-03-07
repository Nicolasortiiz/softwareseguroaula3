import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, Pessoa artista, ArrayList<Musica> musicas) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void mostrarTodosOsDados(){
        System.out.println("Genero: "+this.genero+"\n"+
                "Ano: "+this.ano+"\n"+
                "Nome: "+this.nome+"\n"+
                "Nome Artista: "+this.artista.getNome()+"\n"+
                "Idade Artista: "+this.artista.getIdade());
        for(int i=0;i<this.musicas.size();i++){
            System.out.println("Nome da Musica: "+this.musicas.get(i).getTitulo()+"\n"+
                    "Duracao da musica: "+this.musicas.get(i).getDuracao()+"\n"+
                    "Nome Compositor: "+this.musicas.get(i).getCompositor().getNome()+"\n"+
                    "Idade Compositor: "+this.musicas.get(i).getCompositor().getIdade());
        }
    }
}
