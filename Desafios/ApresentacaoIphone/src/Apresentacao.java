import model.*;

import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica musica1 = new Musica("Numb");
        Musica musica2 = new Musica("Faint");
        Musica musica3 = new Musica("House of Memories");
        Musica musica4 = new Musica("Emperor's new Clothes");
        Musica musica5 = new Musica("Victorious");

        AlbumDeMusica album1 = new AlbumDeMusica("Death of a Bachelor", musica3);
        album1.addMusica(musica4);
        album1.addMusica(musica5);
        AlbumDeMusica album2 = new AlbumDeMusica("Meteora", musica1);
        album2.addMusica(musica2);

        Ipod ipod = new Ipod();
        ipod.addAlbumDeMusica(album1);
        ipod.addAlbumDeMusica(album2);

        Contato contato1 = new Contato("Steve Jobs","1111-2222");
        Contato contato2 = new Contato("Bill Gates", "3333-4444");

        Phone phone = new Phone();
        phone.addContato(contato1);
        phone.addContato(contato2);

        PaginaWeb pagina1 = new PaginaWeb();

        Safari safari = new Safari();
        safari.addPagina(pagina1);

        Iphone iphone = new Iphone(ipod,phone,safari,scanner,"primeira geracao", "1234567");
        System.out.println("\n-----Atencao caso seja selecionado algum numero fora da lista, o primeiro elemento sera selecionado!-----\n");
        System.out.println("Lingando o iphone: " + iphone.getModelo());
        iphone.roteiroIpod();
        iphone.roteiroPhone();
        iphone.roteiroSafari();
        System.out.println("\n-----Apresentacao encerrada-----");
        System.out.println("Deslingando o iphone: " + iphone.getModelo());

        scanner.close();
    }
}
