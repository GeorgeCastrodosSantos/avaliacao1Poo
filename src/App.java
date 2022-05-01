import java.util.InputMismatchException;
import java.util.Scanner;

import controleFrota.Impl.Aeronave;
import controleFrota.Impl.Piloto;
import controleFrota.Impl.Excecoes.PilotoNaoEncontradoException;

public class App {
    private final static int TAMANHO_INICIAL_LISTAS = 10;
    private static Scanner scanner = new Scanner(System.in);
    private static Piloto[] piloto = new Piloto[TAMANHO_INICIAL_LISTAS];
    private static int _numeropiloto = 0;
    private static Aeronave[] _aviao = new Aeronave[TAMANHO_INICIAL_LISTAS];
    private static int _numeroAviao = 0;

    public static void main(String[] args) throws Exception {
        boolean continuarExecutando = true;
        do {
            try {
                imprimirMenu();
                int opcao = lerOpcao();
                continuarExecutando = executarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro durante a operação: " + e.getMessage());
                continuarExecutando = true;
            }
        } while (continuarExecutando);
    }

    private static boolean executarOpcao(int opcao) throws Exception {
        switch (opcao) {
            case 1: {
                cadastrarPiloto();
                break;
            }
            case 2: {
                cadastrarAeronave();
                break;
            }
            case 7: {
                listarPiloto();
                break;
            }
            case 8: {
                listarAeronave();
                break;
            }
            case 9: {
                System.out.println("Saindo do sistema...");
                return false;
            }
            default: {
                System.out.println("Ainda não implementado!");
                break;
            }
        }

        return true;
    }

    private static void listarMotoristas() {
        System.out.println("Lista de piloto cadastrados:");
        for (int i = 0; i < _numerPiloto; i++) {
            System.out.println(_piloto[i]);
        }
    }

    private static void listarCarros() {
        System.out.println("Lista de aeronave cadastrados:");
        for (int i = 0; i < _numeroAeronave; i++) {
            System.out.println(_aeronave[i]);
        }
    }

    private static void cadastrarAeronave() throws PilotoNaoEncontradoException {
        System.out.println("Cadastro de aeronave");
        System.out.println("Digite o CPF do piloto:");
        String cpf = scanner.nextLine();
        Piloto motorista = buscarPilotocpf);

        Aeronave = new Aeronave(cpf, motorista);
        adicionarAeronaveNaLista(aviao);
    }

    private static void adicionarCarroNaLista(Aeronave) {
        if (_numeroCarros == _carros.length) {
            Aeronave[] novaLista = new Aeronave[_aeronave.length * 2];
            
            // Copio os elementos da lista antiga para a nova lista.
            for (int i = 0; i < _aeronave.length; i++) {
                novaLista[i] = _aeronave[i];
            }

            // Substituo a lista antiga pela nova.
            _aeronave = novaLista;
        }

        // Adiciono o carro a lista.
        _aeronave[_numeroAeronave] = aeronave;
        _numeroAeronave++;        
    }

    private static Piloto buscarMotorista(String cpf) throws PilotoNaoEncontradoException {
        for (Piloto: _piloto) {
            if (piloto != null && piloto.getCpf().equals(cpf)) {
                return piloto;
            }
        }

        throw new PilotoNaoEncontradoException(cpf);
    }

    private static void adicionar´PilotoNaLista(Piloto piloto) {
        if (_numeroPiloto == _piloto.length) {
            Piloto[] novaLista = new Piloto[_piloto.length * 2];
            
            // Copio os elementos da lista antiga para a nova lista.
            for (int i = 0; i < _piloto.length; i++) {
                novaLista[i] = _piloto[i];
            }

            // Substituo a lista antiga pela nova.
            _piloto = novaLista;
        }

        // Adiciono o motorista a lista.
        _piloto[_numeroPiloto] = piloto;
        _numeroPiloto++;
    }

    private static void cadastrarPiloto() throws InputMismatchException {
        System.out.println("Cadastro de piloto");
        System.out.println("Pessoa: ");
        String pessoa = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        Piloto piloto = new Piloto(pessoa, cadastro de piloto, cpf);
        adicionarPilotoNaLista(piloto);
    }

    private static void imprimirMenu() {
        System.out.println("Cadastro de piloto!");
        System.out.println("2 - Cadastrar aeronave");
        System.out.println("3 - Cadastrar pessoa");
        System.out.println("7 - Listar piloto");
        System.out.println("8 - Listar aeronave");
        System.out.println("9 - Sair");
    }

    private static boolean validarOpcaoMenu(int opcao) {
        return (opcao >= 1 && opcao <= 9);
    }

    private static int lerOpcao() {
        int opcao = 0;
        do {
            System.out.println("Selecione a opção desejada: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                if (!validarOpcaoMenu(opcao)) {
                    System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida!");
                scanner.nextLine();
            }
        } while (!validarOpcaoMenu(opcao));

        return opcao;
    }
}
