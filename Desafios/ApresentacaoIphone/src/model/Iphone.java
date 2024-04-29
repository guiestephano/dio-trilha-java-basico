package model;

import java.util.Scanner;

public class Iphone {
    private Ipod ipod;
    private Phone phone;
    private Safari safari;
    private Scanner scanner;
    private String modelo;
    private String senha;

    public Iphone(Ipod ipod, Phone phone, Safari safari, Scanner scanner, String modelo, String senha){
        this.ipod = ipod;
        this.phone = phone;
        this.safari = safari;
        this.scanner = scanner;
        this.modelo = modelo;
        this.senha = senha;
    }

    public String getModelo() {
        return modelo;
    }

    public void roteiroIpod(){
        System.out.println("\n-------Iniciando o aplicativo Ipod-------");
        boolean continuarRoteiro = false;

        do{
            System.out.println("Selecione um album de musica: ");
            ipod.mostrarAlbumDeMusicas();
            ipod.selecionarAlbumDeMusica(escolhaDoIndice());
            System.out.println("Selecione uma musica no album: ");
            ipod.mostrarMusicasDoAlbum();
            ipod.selecionarMusicaDoAlbum(escolhaDoIndice());
            System.out.println("Vai querer tocar essa musica? (s/n)");
            if(simOuNao()){
                ipod.tocarMusica();
            }
            System.out.println("Vai querer pausar essa musica? (s/n)");
            if(simOuNao()){
                ipod.pausarMusica();
            }
            System.out.println("Vai continuar no Ipod? (s/n)");
            if(simOuNao()){
                continuarRoteiro = true;
            }
            else{
                continuarRoteiro = false;
            }
        }while(continuarRoteiro);
        System.out.println("-------Fechando o aplicativo Ipod-------");

    }

    public void roteiroPhone(){
        System.out.println("\n-------Iniciando o aplicativo Phone-------");
        boolean continuarRoteiro = false;

        do{
            System.out.println("Selecione um contato: ");
            phone.mostrarContatos();
            phone.selecionarContato(escolhaDoIndice());
            System.out.println("Vai querer ligar para ele? (s/n)");
            if(simOuNao()){
                phone.ligar();
            }
            System.out.println("Numero desconhecido ligando...");
            System.out.println("Vai querer atender? (s/n)");
            if(simOuNao()){
                phone.atender();
            }
            else{
                phone.desligar();
            }
            System.out.println("Vai querer iniciar um correio de voz? (s/n)");
            if(simOuNao()){
                phone.iniciarCorreioDeVoz();
            }
            System.out.println("Vai continuar no Phone? (s/n)");
            if(simOuNao()){
                continuarRoteiro = true;
            }
            else{
                continuarRoteiro = false;
            }
        }while(continuarRoteiro);
        System.out.println("-------Fechando o aplicativo Phone-------");
    }

    public void roteiroSafari(){
        System.out.println("\n-------Iniciando o aplicativo Safari-------");
        boolean continuarRoteiro = false;

        do{
            System.out.println("Selecione uma aba: ");
            safari.mostrarAbas();
            safari.selecionarAba(escolhaDoIndice());
            safari.exibirPagina();
            System.out.println("\nVai querer acessar um site? (s/n)");
            if(simOuNao()){
                safari.acessarSite(urlInserido());
                safari.exibirPagina();
            }
            System.out.println("\nVai querer abrir uma nova aba? (s/n)");
            if(simOuNao()){
                safari.abrirNovaAba();
            }
            System.out.println("Vai querer atualizar a pagina? (s/n)");
            if(simOuNao()){
                safari.atualizarPagina();
            }
            System.out.println("\nVai continuar no Safari? (s/n)");
            if(simOuNao()){
                continuarRoteiro = true;
            }
            else{
                continuarRoteiro = false;
            }
        }while(continuarRoteiro);
        System.out.println("-------Fechando o aplicativo Safari-------");

    }

    private Integer escolhaDoIndice(){
        System.out.print("Numero escolhido: ");
        return scanner.nextInt();
    }

    private Boolean simOuNao(){
        System.out.print("Escolha: ");
        switch (scanner.next().toLowerCase().charAt(0)){
            case 's':
                return true;
            case 'n':
                return false;
            default:
                System.out.println("Escolha invalida!");
                return false;
        }
    }

    private String urlInserido(){
        System.out.print("Url escolhida: ");
        return scanner.next();
    }
}
