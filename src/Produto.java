import java.util.Date;

public class Produto {

    private int id_produto;
    private int codigoProduto;
    private String nomeProduto;
    private String descricao;
    private Date dataCadastro;
    private Fornecedor fornecedor;

    public Produto(int id_produto, int codigoProduto, String nomeProduto, String descricao, Date dataCadastro, Fornecedor fornecedor) {
        this.id_produto = id_produto;
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_produto=" + id_produto +
                ", codigoProduto=" + codigoProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date data_cadastro) {
        this.dataCadastro = data_cadastro;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
