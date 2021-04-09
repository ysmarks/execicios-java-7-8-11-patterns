package br.com.javacore.hherenca.classes;

public class ClasseFilha extends ClassePai{

    private String rg;

    @Override
    public void test() {
        System.out.println("Dentro do metodo teste: " + this.getClass().getName().toString());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
