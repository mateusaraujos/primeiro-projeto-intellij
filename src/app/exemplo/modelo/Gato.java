package app.exemplo.modelo;

import java.util.Objects;

public class Gato {

    /**
     * Variáveis locais privadas.
     */
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {}

    /**
     * Construtor da classe
     */
    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCor() {return cor;}

    public void setCor(String cor) {this.cor = cor;}

    public Integer getIdade() {return idade;}

    public void setIdade(Integer idade) {this.idade = idade;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gato gato = (Gato) obj;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{Nome = " + nome + ", Cor = " + cor + ", Idade = " + idade + "}";
    }

}
