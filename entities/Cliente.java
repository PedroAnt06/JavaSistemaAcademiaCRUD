package entities;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private Plano plano;
    private boolean ativo;
    private boolean mensalidadePaga;

    public Cliente(int id, String nome, String telefone, Plano plano) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.plano = plano;
        this.ativo = true;
        this.mensalidadePaga = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Plano getPlano() {
        return plano;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isMensalidadePaga() {
        return mensalidadePaga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public void inativar() {
        this.ativo = false;
    }

    public void marcarPago(){
        this.mensalidadePaga = true;
    }

    public void marcarNaoPago(){
        this.mensalidadePaga = false;
    }


    public void setMensalidadePaga(boolean mensalidadePaga) {
        this.mensalidadePaga = mensalidadePaga;
    }

    @Override
    public String toString() {
        return "CLIENTE:" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", telefone: '" + telefone + '\'' +
                ", plano: " + plano +
                ", ativo: " + ativo +
                ", mensalidadePaga: " + mensalidadePaga;
    }
}
