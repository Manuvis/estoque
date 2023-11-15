import java.util.Date;
import java.text.SimpleDateFormat;

public class Fornecedor extends Pessoa {

    private int idFornecedor;
    private String cnpj;

    public Fornecedor(String nome) {
        super(nome);
    }

    public Fornecedor(String rg, int telefone, String email, Date dataNascimento, Date dataCadastro, String nome, Endereco endereco, String cpf, int idFornecedor, String cnpj) {
        super(rg, telefone, email, dataNascimento, dataCadastro, endereco, nome, cpf);
        this.idFornecedor = idFornecedor;
        this.cnpj = cnpj;
    }

    public void cadastrarFornecedor(String nome) {

    }

    public String buscarFornecedorPorNome(String nome) {
        return ;
    }

    public String listarFornecedor() {
        return ;
    }

    public void deletarFornecedor(String cnpj) {

    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                "rg='" + getRg() + '\'' +
                ", telefone=" + getTelefone() +
                ", email='" + getEmail() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", nome='" + getNome() + '\'' +
                ", endereco=" + getEndereco() +
                ", cpf='" + getCpf() + '\'' +
                ", dataCadastro=" + getDataCadastro() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
