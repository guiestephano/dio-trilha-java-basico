package model;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private List<Contato> contatos = new ArrayList<>();
    private Contato contatoSelecionado;

    public Phone (){}
    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public void mostrarContatos(){
        StringBuilder sb = new StringBuilder();
        int indice = 1;

        for(Contato contato : contatos) {
            sb.append(indice);
            sb.append(" ( ): ");
            sb.append(contato.getNome());
            sb.append("\n");
            indice++;
        }

        System.out.println(sb);
    }
    public void selecionarContato(int indice){
        if(indice - 1 >= contatos.size() || (indice - 1) < 0){
            selecionarContato(1);
        }
        else{
            contatoSelecionado =  contatos.get(indice - 1);
        }
    }
    public void ligar(){
        System.out.println("\nLigando para: " + contatoSelecionado.getNome());
        desligar();
    }

    public void atender(){
        System.out.println("\nAtentendo a chamada\n");
    }
    public void desligar(){
        System.out.println("\nchamada desligada\n");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("\nIniciando Correio de voz\n");
    }
}