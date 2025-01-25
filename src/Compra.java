public class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private Double valor;

    public Compra(String nomeProduto, Double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra{" + nomeProduto + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
