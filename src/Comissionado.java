import java.util.Scanner;

public class Comissionado {

    public static Scanner ler = new Scanner(System.in);

    private PerfilEmpregado perfil = new PerfilEmpregado();
    private ResultadoVenda venda = new ResultadoVenda();
    private String dataPagamento;

    public PerfilEmpregado getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEmpregado perfil) {
        this.perfil = perfil;
    }

    public ResultadoVenda getVenda() {
        return venda;
    }

    public void setVenda(ResultadoVenda venda) {
        this.venda = venda;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public void MudarTipoComissionado(Funcionarios lista, Comissionado funcionario){

        String limpar;

    if(funcionario.getPerfil().getTipo().equals("Horista")){
        Horista novo = new Horista();
        novo.getPerfil().setNome(funcionario.getPerfil().getNome());
        novo.getPerfil().setEndereco(funcionario.getPerfil().getEndereco());
        novo.getPerfil().setTipo(funcionario.getPerfil().getTipo());
        novo.getPerfil().setMetodoPagamento(funcionario.getPerfil().getMetodoPagamento());
        novo.getPerfil().setSindicato(funcionario.getPerfil().getSindicato());
        novo.getPerfil().setTaxaSindical(funcionario.getPerfil().getTaxaSindical());
        novo.getPerfil().setTipoSalario(funcionario.getPerfil().getTipoSalario());
        novo.getPerfil().setID_sindicato(funcionario.getPerfil().getID_sindicato());
        novo.getPerfil().setID(funcionario.getPerfil().getID());
        novo.getPerfil().setDia(funcionario.getPerfil().getDia());
        novo.getPerfil().setMes(funcionario.getPerfil().getMes());
        novo.getPerfil().setAno(funcionario.getPerfil().getAno());

        System.out.println("Informe o salario horario do novo Horista: ");
        novo.getPerfil().setTipoSalario(ler.nextDouble());
        limpar = ler.nextLine();

        lista.setListaHorista(novo);
        lista.getListaComissionado().remove(funcionario);
    }else{
        Assalariado novo = new Assalariado();
        novo.getPerfil().setNome(funcionario.getPerfil().getNome());
        novo.getPerfil().setEndereco(funcionario.getPerfil().getEndereco());
        novo.getPerfil().setTipo(funcionario.getPerfil().getTipo());
        novo.getPerfil().setMetodoPagamento(funcionario.getPerfil().getMetodoPagamento());
        novo.getPerfil().setSindicato(funcionario.getPerfil().getSindicato());
        novo.getPerfil().setTaxaSindical(funcionario.getPerfil().getTaxaSindical());
        novo.getPerfil().setTipoSalario(funcionario.getPerfil().getTipoSalario());
        novo.getPerfil().setID_sindicato(funcionario.getPerfil().getID_sindicato());
        novo.getPerfil().setID(funcionario.getPerfil().getID());
        novo.getPerfil().setDia(funcionario.getPerfil().getDia());
        novo.getPerfil().setMes(funcionario.getPerfil().getMes());
        novo.getPerfil().setAno(funcionario.getPerfil().getAno());

        System.out.println("Informe o salario mensal do novo Assalariado: ");
        novo.getPerfil().setTipoSalario(ler.nextDouble());
        limpar = ler.nextLine();

        lista.setListaAssalariado(novo);
        lista.getListaComissionado().remove(funcionario);
    }
}

public Comissionado EditarComissionado(Funcionarios lista, Comissionado funcionario, int opcao){
    String limpar;

    switch (opcao){
        case 1:
            System.out.println("Informe o novo nome: ");
            funcionario.getPerfil().setNome( ler.nextLine());
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 2:
            System.out.println("Informe o novo endereco: ");
            funcionario.getPerfil().setEndereco(ler.nextLine());
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 3:
            System.out.println("Informe o novo tipo(Horista, Assalariado ou Comissionado: ");
            funcionario.getPerfil().setTipo( ler.nextLine());
            funcionario.MudarTipoComissionado(lista, funcionario);
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 4:
            System.out.println("Informe o novo metodo de pagamento: ");
            funcionario.getPerfil().setMetodoPagamento( ler.nextLine());
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 5:
            System.out.println("Informe true/false para vincular/desvincular o funcionario ao sindicato: ");
            funcionario.getPerfil().setSindicato( ler.nextBoolean());
            limpar = ler.nextLine();
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 6:
            System.out.println("Informe o novo ID do Sindicato: ");
            funcionario.getPerfil().setID_sindicato(ler.nextInt());
            limpar = ler.nextLine();
            System.out.println("Informacao alterado com sucesso!");
            break;
        case 7:
            System.out.println("Informe a nova taxa Sindical: ");
            funcionario.getPerfil().setTaxaSindical(ler.nextDouble());
            limpar = ler.nextLine();
            System.out.println("Informacao alterado com sucesso!");
            break;
    }

    return funcionario;
}
}
