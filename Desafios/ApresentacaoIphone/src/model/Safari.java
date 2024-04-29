package model;

import java.util.ArrayList;
import java.util.List;

public class Safari {
    List<PaginaWeb> paginasWeb = new ArrayList<>();
    PaginaWeb paginaSelecionada;

    public Safari(){}

    public void addPagina(PaginaWeb paginaWeb){
        paginasWeb.add(paginaWeb);
    }

    public PaginaWeb getPaginaSelecionada() {
        return paginaSelecionada;
    }

    public void selecionarAba(int indice){
        if(indice - 1 >= paginasWeb.size() || (indice - 1) < 0){
            selecionarAba(1);
        }
        else{
            paginaSelecionada = paginasWeb.get(indice - 1);
        }
    }

    public void mostrarAbas(){
        StringBuilder sb = new StringBuilder();
        int indice = 1;

        for(PaginaWeb paginaWeb : paginasWeb) {
            sb.append(indice);
            sb.append(" ( ): ");
            sb.append(paginaWeb.getUrl());
            sb.append("\n");
            indice++;
        }

        System.out.println(sb);
    }

    public void exibirPagina(){
        System.out.println("\nExibindo a pagina: " + paginaSelecionada.getUrl());
    }

    public void abrirNovaAba(){
        System.out.println("\nAbrindo uma nova aba\n");
        PaginaWeb paginaWeb = new PaginaWeb();
        addPagina(paginaWeb);
        paginaSelecionada = paginaWeb;
    }

    public void atualizarPagina(){
        System.out.println("\nAtualizando página: " + paginaSelecionada.getUrl());
    }

    public void acessarSite(String url){
        if(url != null){
            PaginaWeb paginaWeb = new PaginaWeb(url);
            addPagina(paginaWeb);
            paginaSelecionada = paginaWeb;
        }
        else{
            PaginaWeb paginaWeb = new PaginaWeb();
            addPagina(paginaWeb);
            paginaSelecionada = paginaWeb;
        }
        System.out.println("\nAcessando o site: " + paginaSelecionada.getUrl());
    }


}