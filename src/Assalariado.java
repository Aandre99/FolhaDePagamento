import java.util.Scanner;

import static java.lang.System.*;

public class Assalariado {

    public static Scanner ler = new Scanner(System.in);

    private PerfilEmpregado Perfil = new PerfilEmpregado();

    public PerfilEmpregado getPerfil(){
        return Perfil;
    }

    public void EfetuarPagamento(){


    }
    public void MudarTipoAssalariado(Funcionarios lista, Assalariado funcionario)
    {
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

            out.println("Informe o salario horario do novo Horista:");
            novo.getPerfil().setTipoSalario(ler.nextDouble());
            limpar = ler.nextLine();
            lista.setListaHorista(novo);
            lista.getListaAssalariado().remove(funcionario);
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

            out.println("Informe a comissao incial do novo Comissionado: ");
            novo.getPerfil().setTipoSalario(ler.nextDouble());
            limpar = ler.nextLine();

            lista.setListaComissionado(novo);
            lista.getListaAssalariado().remove(funcionario);
        }

    }
public Assalariado EditarAssalariado(Funcionarios lista, Assalariado funcionario, int opcao){
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
            System.out.println("Informe o novo tipo(Horista, Assalariado ou Comissionado:");
            funcionario.getPerfil().setTipo( ler.nextLine());
            funcionario.MudarTipoAssalariado(lista,funcionario );
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
