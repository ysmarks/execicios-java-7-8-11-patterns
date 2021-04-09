package br.com.javacore.zcolecoes.classes;

public class Celular {

    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }
    //Metodo equals
    //reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //simetrico para x e y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    //transitividade para x, y, z difetentes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) == true
    //Consistente x.equals(y) deve retornar sempre o mesmo valor
    //Para x difetente de null x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return  false;
        if(this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    //Se x.equals(y) == true y.hashCode() == x.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true
    //x.equals(y) == false retorna false
    //y.hashCode() == x.hashCode() x.equals(y) deverá retornar false

    @Override
    public int hashCode() {
        return IMEI.hashCode();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Celular{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", IMEI='").append(IMEI).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
