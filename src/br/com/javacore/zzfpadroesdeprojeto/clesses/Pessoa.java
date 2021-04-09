package br.com.javacore.zzfpadroesdeprojeto.clesses;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;

    private Pessoa(String nome, String sobreNome, String cpf, String rg, String telefone, String email) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobreNome='").append(sobreNome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", rg='").append(rg).append('\'');
        sb.append(", telefone='").append(telefone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String nome;
        private String sobreNome;
        private String cpf;
        private String rg;
        private String telefone;
        private String email;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder sobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder rg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, sobreNome, cpf, rg, telefone, email);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
