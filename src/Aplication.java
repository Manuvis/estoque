import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolhaMenu;
        do {
            System.out.println("Bem vindo ao sistema do estoque!!");
            System.out.println("Selecione a opção que deseja seguir:\n" +
                    "1 - Produto\n" +
                    "2 - Fornecedor\n" +
                    "3 - Estoque\n" +
                    "0 - Sair do sistema");
            escolhaMenu = scanner.nextInt();
            switch (escolhaMenu){
                case 1:
                    int escolhaMenuProduto;
                    do {
                        System.out.println("Bem vindo a área do produto!!");
                        System.out.println("Selecione a opção que deseja seguir:\n" +
                                "1 - Cadastrar Produto\n" +
                                "2 - Buscar Produto\n" +
                                "3 - Listar Produto(s)\n" +
                                "4 - Deletar Produto\n" +
                                "0 - Voltar ao Menu anterior");
                        escolhaMenuProduto = scanner.nextInt();
                    }while(escolhaMenuProduto != 0);
                    break;
                case 2:
                    int escolhaMenuFornecedor;
                    do {
                        System.out.println("Bem vindo a área do Fornecedor!!");
                        System.out.println("Selecione a opção que deseja seguir:\n" +
                                "1 - Cadastrar Fornecedor\n" +
                                "2 - Buscar Fornecedor por Nome\n" +
                                "3 - Listar Fornecedor(s)\n" +
                                "4 - Deletar Fornecedor\n" +
                                "0 - Voltar ao Menu anterior");
                        escolhaMenuFornecedor = scanner.nextInt();
                    }while(escolhaMenuFornecedor != 0);
                    break;
                case 3:
                    int escolhaMenuEstoque;
                    do {
                        System.out.println("Bem vindo a área do Estoque!!");
                        System.out.println("Selecione a opção que deseja seguir:\n" +
                                "1 - Atualizar Estoque\n" +
                                "2 - Adicionar Estoque Produtos\n" +
                                "3 - Listar Produtos Disponíveis(s)\n" +
                                "4 - Remover Estoque\n" +
                                "0 - Voltar ao Menu anterior");
                        escolhaMenuEstoque = scanner.nextInt();
                    }while(escolhaMenuEstoque != 0);
                    break;
                case 0:
                    System.out.println("Até mais! Espero que tenha tido uma boa experiência em nosso sistema");
                    break;
                default:
                    System.out.println("Número incorreto, favor digitar número que aparece no menu!!\n\n");
                    break;
            }
        }while(escolhaMenu != 0);

        scanner.close();
    }

}
