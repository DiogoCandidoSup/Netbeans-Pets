
package br.ulbra.classes;

/**
 *
 * @author s.lucas
 */
public class Animal implements Comparable <Animal>//variaveis
{
    private String nome;
    private String raca;
    private String sexo;
    private String cor;
    private String tipo;
    private int ano;
    
    public Animal() //construtor
    {
        this.nome = "Bob";
        this.raca = "Ararauna";
        this.sexo = "M";
        this.cor = "Azul-amarela";
        this.tipo = "PASSARO";
        this.ano = 2015;
    }
    
    public Animal(String nome, String raca, String sexo, String cor, String tipo, int ano)
    {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.tipo = tipo;
        this.ano = ano;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public String getRaca() 
    {
        return raca;
    }

    public void setRaca(String raca) 
    {
        this.raca = raca;
    }
       
    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
      
    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }
       
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
    
    public int getAno() 
    {
        return ano;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Animal " + "Nome: " + nome + ", Raca: " + raca + ", Sexo: " + sexo + ", Cor: " + cor + ", Tipo: " + tipo + ", Data de nascimento: " + ano;
    }
    
    @Override
    public int compareTo(Animal p) {
        return this.getNome().compareTo(p.getNome());
    }
}
