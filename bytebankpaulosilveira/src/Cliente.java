public class Cliente {
    private String nome;
    private String cpf;
    private String profissão;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissão() {
        return profissão;
    }

    public String getCpf() {
        return cpf;
    }

}
