package model;

import java.util.ArrayList;
import java.util.List;

public class AlbumDeMusica {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();
    private Musica musicaSelecionada;

    public AlbumDeMusica(String nome, Musica musica){
        this.nome = nome;
        addMusica(musica);
        selecionarMusica(1);
    }

    public String getNome(){
        return nome;
    }
    public String getMusicaSelecionada(){
        return musicaSelecionada.getNome();
    }
    public void addMusica(Musica musica){
        musicas.add(musica);
    }

    public void selecionarMusica(int indice){
        if(indice - 1 >= musicas.size() || (indice - 1) < 0){
            selecionarMusica(1);
        }
        else{
            musicaSelecionada =  musicas.get(indice - 1);
        }
    }

    public void mostrarMusicas(){
        StringBuilder sb = new StringBuilder();
        int indice = 1;

        for(Musica musica: musicas) {
            sb.append(indice);
            if(musica.getNome().equals(musicaSelecionada.getNome())){
                sb.append(" (x): ");
            }else{
                sb.append(" ( ): ");
            }
            sb.append(musica.getNome());
            sb.append("\n");
            indice++;
        }

        System.out.println(sb);
    }
}