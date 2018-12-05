import java.util.Scanner;

import static java.lang.System.out;

public class Horista {

    public static Scanner ler = new Scanner(System.in);

    private PerfilEmpregado Perfil = new PerfilEmpregado();
    private CartaoDePonto cartao = new CartaoDePonto();

    public PerfilEmpregado getPerfil(){
        return Perfil;
    }
    public CartaoDePonto getCartaoDePonto(){
        return  cartao;
    }
    public void MudarTipoHorista(Funcionarios lista, Horista funcionario)
    {

        if(funcionario.getPerfil().getTipo().equals("Assalariado")){
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

            System.out.println("Informe o salario mensal  do novo assalariado:");
            novo.getPerfil().setTipoSalario(ler.nextDouble());

            lista.setListaAssalariado(novo);
            lista.getListaHorista().remove(funcionario);
        }else{
            Comissionado novo = new Comissionado();
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

            System.out.println("Informe a comissao do novo Comissionado:");
            novo.getPerfil().setTipoSalario(ler.nextDouble());

            lista.setListaComissionado(novo);
            lista.getListaHorista().remove(funcionario);
        }
    }
public Horista EditarHorista(Funcionarios lista, Horista funcionario, int opcao){

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
            funcionario.MudarTipoHorista(lista,funcionario);
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
            System.out.println("Informe o novo ID do Sindicato:");
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
