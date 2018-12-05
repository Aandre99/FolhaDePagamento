
import java.util.Random;

public class PerfilEmpregado {

    Random gerador = new Random();

    private String Nome;
    private String Endereco;
    private String Tipo;
    private double salario;
    private String metodoPagamento;
    private boolean Sindicato;
    private int Dia;
    private int Mes;
    private int Ano;
    private int ID;
    private int ID_sindicato;
    private double taxaSindical;


    public String getNome() {

        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    public double getTipoSalario() {
        return salario;
    }
    public void setTipoSalario(double valor) {
        this.salario = valor;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = gerador.nextInt(1000);
    }
    public boolean getSindicato(){
        return Sindicato;
    }
    public void setSindicato(boolean sindicato){
        this.Sindicato = sindicato;
    }
    public void setMetodoPagamento(String metodo){
        this.metodoPagamento = metodo;
    }
    public String getMetodoPagamento(){
        return metodoPagamento;
    }
    public void setID_sindicato(int sindicato){
        this.ID_sindicato = sindicato;
    }
    public int getID_sindicato(){
        return ID_sindicato;
    }
    public void setTaxaSindical(double novaTaxa){
        this.taxaSindical = novaTaxa;
    }
    public double getTaxaSindical(){
        return taxaSindical;
    }
    public int getDia() {
        return Dia;
    }
    public void setDia(int dia) {
        Dia = dia;
    }
    public int getMes() {
        return Mes;
    }
    public void setMes(int mes) {
        Mes = mes;
    }
    public int getAno() {
        return Ano;
    }
    public void setAno(int ano) {
        Ano = ano;
    }
}
