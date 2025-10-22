package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppPassageiro {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Quantos passageiros quer cadastrar? ");
        int qtdPassageiro = scanner.nextInt();
        scanner.nextLine();

        List<Passageiro> passageiros = new ArrayList<>(qtdPassageiro);

        for(int i = 0; i<qtdPassageiro; i++){
            System.out.print("Informe o id do passageiro: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Informe o seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Informe o seu email: ");
            String email = scanner.nextLine();
            System.out.print("Informe o seu telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Informe a sua data de nascimento: ");
            Date dataNascimento = sdf.parse(scanner.nextLine());
            System.out.print("Informe o seu nome de usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Informe a sua senha: ");
            String senha = scanner.nextLine();
            System.out.print("Informe o seu cep: ");
            String cep = scanner.nextLine();
            System.out.print("Informe o seu logradouro: ");
            String logradouro = scanner.nextLine();
            System.out.print("Informe o seu bairro: ");
            String bairro = scanner.nextLine();
            System.out.print("Informe a sua cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Informe o seu estado: ");
            String estado = scanner.nextLine();
            System.out.print("Informe o seu país: ");
            String pais = scanner.nextLine();
            System.out.print("Informe o número da sua casa: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Informe o número do cartão: ");
            String numeroCartao = scanner.nextLine();
            System.out.print("Informe o seu documento: ");
            String documento = scanner.nextLine();

            Endereco endereco= new Endereco(cep, logradouro, bairro, cidade, estado, pais, numero);
            Passageiro passageiro = new Passageiro(id, nome, email, telefone, dataNascimento, usuario, senha, endereco, numeroCartao, documento);
            passageiros.add(passageiro);
        }

        listarPassageiro(passageiros);

        System.out.print("Digite o nome do passageiro que quer buscar: ");
        String nome = scanner.nextLine();
        buscarPassageiro(passageiros, nome);


        System.out.print("Digite o documento do passageiro que quer remover: ");
        String documento = scanner.nextLine();
        
        Passageiro removido = removerPorDocumento(passageiros, documento);
        if(removerPorDocumento(passageiros, documento) != null){
            System.out.println("Passageiro removido: " + removido.getNome());
        } else {
            System.out.println("Passageiro não encontrado");
        }
    }

    public static void listarPassageiro(List<Passageiro> passageiros){
        for(Passageiro p : passageiros){
            System.out.println("\nNome: " + p.getNome() + "\nDocumento: " + p.getDocumento());
        }
    }

    public static List<Passageiro> buscarPassageiro(List<Passageiro> passageiros, String nome){
        List<Passageiro> passageiroEncontrado = new ArrayList<>();
        for(Passageiro p : passageiros){
            if(p.getNome().equalsIgnoreCase(nome)){
                passageiroEncontrado.add(p);
                System.out.println("Passageiro encontrado: " + p.getNome());
            }
        }
        return passageiroEncontrado;
    }

    public static Passageiro removerPorDocumento(List<Passageiro> passageiros, String documento){
        for(Passageiro p : passageiros){
            if(p.getDocumento().equalsIgnoreCase(documento)){
                passageiros.remove(documento);
                return p;
            }
        }
        return null;
    }
}
