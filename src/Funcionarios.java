import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {

    Scanner ler = new Scanner(System.in);

    private ArrayList<Horista> listaHorista = new ArrayList<>();
    private ArrayList<Assalariado> listaAssalariado = new ArrayList<>();
    private ArrayList<Comissionado> listaComissionado = new ArrayList<>();
    private int ano = 2018;
    private int dia = 01;
    private int mes = 01;

    public ArrayList<Horista> getListaHorista() {
        return listaHorista;
    }
    public void setListaHorista(Horista novo) {
        this.listaHorista.add(novo);
    }
    public ArrayList<Assalariado> getListaAssalariado() {
        return listaAssalariado;
    }
    public void setListaAssalariado(Assalariado novo) {
        this.listaAssalariado.add(novo);
    }
    public ArrayList<Comissionado> getListaComissionado(){
        return this.listaComissionado;
    }
    public void setListaComissionado(Comissionado novo){
        this.listaComissionado.add(novo);
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public boolean ListaVazia(Funcionarios lista){

        if(lista.getListaHorista().size() == 0){
            if(lista.getListaComissionado().size() == 0){
                if(lista.getListaAssalariado().size() == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public Horista BuscaFuncionarioHorista(String nome){

        Horista aux=null;

        for (Horista horista: this.listaHorista) {
            if (horista.getPerfil().getNome().equals(nome)) {
                aux = horista;
                break;
            }
        }
        return aux;
    }
    public Assalariado BuscaFuncionarioAssalariado(String nome){

        Assalariado aux = null;

        for (Assalariado assalariado: this.listaAssalariado) {
            if(assalariado.getPerfil().getNome().equals(nome)){
                aux = assalariado;
                break;
            }
        }
        return aux;
    }
    public Comissionado BuscaFuncionarioComissionado(String nome){

        Comissionado aux = null;
        for (Comissionado comissionado: this.listaComissionado) {
            if(comissionado.getPerfil().getNome().equals(nome)){
                aux = comissionado;
                break;
            }
        }
        return aux;
    }

    public  void AdicionarFuncionario(Funcionarios lista)
    {
        String nome, endereco, tipo;
        double salario;

        System.out.println("Informe as seguintes informacoes do novo Funcionario: ");
        System.out.println("Nome: ");
        nome = ler.nextLine();
        System.out.println("Endereco: ");
        endereco = ler.nextLine();
        System.out.println("Tipo (Horista, Assalariado ou Comissionado): ");
        tipo = ler.nextLine();

        switch (tipo)
        {
            case "Horista":
                System.out.println("Salario horario inicial: ");
                salario = ler.nextDouble();

                Horista novo = new Horista();
                novo.getPerfil().setNome(nome);
                novo.getPerfil().setEndereco(endereco);
                novo.getPerfil().setTipo(tipo);
                novo.getPerfil().setTipoSalario(salario);
                novo.getPerfil().setDia(lista.getDia());
                novo.getPerfil().setAno(lista.getAno());
                novo.getPerfil().setMes(lista.getMes());

                lista.setListaHorista(novo);
                break;
            case "Assalariado":
                System.out.println("Salario mensal incial: ");
                salario = ler.nextDouble();

                Assalariado novo1 = new Assalariado();
                novo1.getPerfil().setNome(nome);
                novo1.getPerfil().setEndereco(endereco);
                novo1.getPerfil().setTipo(tipo);
                novo1.getPerfil().setTipoSalario(salario);
                novo1.getPerfil().setDia(lista.getDia());
                novo1.getPerfil().setAno(lista.getAno());
                novo1.getPerfil().setMes(lista.getMes());

                lista.setListaAssalariado(novo1);
                break;
            case "Comissionado":
                System.out.println("comissao inicial:");
                salario = ler.nextDouble();

                Comissionado novo2 = new Comissionado();
                novo2.getPerfil().setNome(nome);
                novo2.getPerfil().setEndereco(endereco);
                novo2.getPerfil().setTipo(tipo);
                novo2.getPerfil().setTipoSalario(salario);
                novo2.getPerfil().setDia(lista.getDia());
                novo2.getPerfil().setAno(lista.getAno());
                novo2.getPerfil().setMes(lista.getMes());

                lista.setListaComissionado(novo2);
                break;
        }

        System.out.println("Funcionario adicionado com sucesso!");
    }
    public void RemoverFuncionario(Funcionarios lista) {

        String nome = null;
        System.out.println("Informe o nome do funcionario a ser removido: ");
        nome = ler.nextLine();
        nome = ler.nextLine();

        boolean verifca1  = false;
        boolean verifica2 = false;

        for (Horista funcionario : this.listaHorista) {

            if (funcionario.getPerfil().getNome().equals(nome)) {
                listaHorista.remove(funcionario);
                verifca1 = true;
                System.out.println("Funcioanrio removido com sucesso!");
            }
        }
        if(verifca1 == false){

            for (Assalariado funcionario : lista.getListaAssalariado()) {

                if (funcionario.getPerfil().getNome().equals(nome)) {
                    lista.getListaAssalariado().remove(funcionario);
                    verifica2 = true;
                    System.out.println("Funcioanrio removido com sucesso!");
                }
            }
            if(verifica2 == false) {

                for (Comissionado funcionario : lista.getListaComissionado()) {

                    if (funcionario.getPerfil().getNome().equals(nome)) {
                        lista.getListaComissionado().remove(funcionario);
                        System.out.println("Funcioanrio removido com sucesso!");
                    }
                }
            }
        }
    }

}
