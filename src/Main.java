import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sair = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartão: ");
        double limiteDoCartao = scanner.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limiteDoCartao);

        while (sair !=0) {
            System.out.println("Informe o nome do produto: ");
            String nomeProduto = scanner.next();

            System.out.println("Valor do produto: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(nomeProduto, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada! ");
                System.out.println("Digite 0 para sair e 1 para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("COMPRA NÃO APROVADA!");
                sair = 0;
            }
        }

        System.out.println("********************************");
        System.out.println("Compras realizadas: ");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getNomeProduto() + "-" + c.getValor());

        }
        System.out.println("********************************");
        System.out.println("Saldo cartão: " + cartao.getSaldo());
    }
}