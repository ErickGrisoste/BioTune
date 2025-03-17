package erick.biotune.BioTune.principal;

import erick.biotune.BioTune.model.Artista;
import erick.biotune.BioTune.model.TipoArtista;
import erick.biotune.BioTune.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {
    private final ArtistaRepository repository;
    private Scanner scan = new Scanner(System.in);

    public Principal(ArtistaRepository repository) {
        this.repository = repository;
    }

    public void exibeMenu(){
        var opcao = -1;

        while (opcao!= 0) {
            var menu = """
                    --------------------------------------------
                                       BIO TUNE                    
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                                    
                    0 - Sair
                    --------------------------------------------
                    """;

            System.out.println(menu);
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void pesquisarDadosDoArtista() {
    }

    private void buscarMusicasPorArtista() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtistas() {
        System.out.println("Informe o nome do artista");
        var nome = scan.nextLine();
        System.out.println("Informe o tipo desse artista: (SOLO, DUPLA, BANDA)");
        var tipo = scan.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
        Artista artista = new Artista(nome, tipoArtista);
        repository.save(artista);
        System.out.println("Artista salvo com sucesso!");
    }
}

