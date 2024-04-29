package model;

import java.util.ArrayList;
import java.util.List;

public class Ipod {
    private List<AlbumDeMusica> albunsDeMusicas = new ArrayList<>();
    private AlbumDeMusica albumSelecionado;

    public Ipod(){}

    public AlbumDeMusica getAlbumSelecionado(){
        return  albumSelecionado;
    }

    public void addAlbumDeMusica(AlbumDeMusica album){
        albunsDeMusicas.add(album);
    }

    public void selecionarAlbumDeMusica(int indice){
        if(indice - 1 >= albunsDeMusicas.size() || (indice - 1) < 0){
            selecionarAlbumDeMusica(1);
        }
        else{
            albumSelecionado = albunsDeMusicas.get(indice - 1);
        }
    }

    public void mostrarAlbumDeMusicas(){
        StringBuilder sb = new StringBuilder();
        int indice = 1;

        for(AlbumDeMusica album: albunsDeMusicas) {
            sb.append(indice);
            if(albumSelecionado != null){
                if(album.getNome().equals(albumSelecionado.getNome())){
                    sb.append(" (x): ");
                }
                else{
                    sb.append(" ( ): ");
                }
            }else{
                sb.append(" ( ): ");
            }
            sb.append(album.getNome());
            sb.append("\n");
            indice++;
        }

        System.out.println(sb);
    }

    public void mostrarMusicasDoAlbum(){
        albumSelecionado.mostrarMusicas();
    }

    public void selecionarMusicaDoAlbum(int indice){
        albumSelecionado.selecionarMusica(indice);
    }

    public void tocarMusica(){
        System.out.println("\nTocando: " + albumSelecionado.getMusicaSelecionada() + " ("+ albumSelecionado.getNome() + ")\n");
    }

    public void pausarMusica(){
        System.out.println("\nPausado: " + albumSelecionado.getMusicaSelecionada() + " ("+ albumSelecionado.getNome() + ")\n");
    }
}