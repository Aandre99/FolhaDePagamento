
import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        Funcionarios lista = new Funcionarios();

        int opcao;
        boolean gerarHora = false;
        String getchar;

        while(true)
        {
            MenuPrincipal();
            opcao = ler.nextInt();
            //getchar = ler.nextLine();

            if(opcao == 0){
                break;
            }

            switch (opcao)
            {
                case 1:
                    lista.AdicionarFuncionario(lista);
                    break;
                case 2:

                    if(!lista.ListaVazia(lista)){
                        lista.RemoverFuncionario(lista);
                    }else{
                        System.out.println("Nenhum funcionario cadastrado!");
                    }
                    break;
                case 3:

                    if(!lista.ListaVazia(lista)){
                        EditarDados(lista);
                    }else{
                        System.out.println("Nenhum funcionario cadastrado!");
                    }
                    break;
                case 4:
                    Imprimir(lista);
                    break;
            }
            if(gerarHora == false){
                lista = ContagemDeDias(lista, gerarHora);
                System.out.println("Data: ");
                System.out.println(lista.getDia() +" "+ lista.getMes() +" "+ lista.getAno());
            }else{
                gerarHora = false;
            }
        }
    }

    /*Função que mostra o menu das opções principais */

    public static  void MenuPrincipal(){

        System.out.println("\n------------MENU----------------");
        System.out.println("Informe a opcao desejada: \n");
        System.out.println("1 - Cadastrar novo funcionario;");
        System.out.println("2 - Remover ");
        System.out.println("3 - Editar funcionario: ");
        System.out.println("4 - Mostrar todos os funcionarios cadastrados");
        System.out.println("0 - Sair");
        System.out.println("\n--------------------------------");
    }
    /* Função que Adiciona Funcionarios ao sistema */
    /* Função que remove o funcionário de nome especificado*/


    /*Função responsavel por editar os dados de um funcionario*/

    public static void EditarDados(Funcionarios lista){

        Horista func_horista = null;
        Assalariado func_assalariado = null;
        Comissionado func_comissinado = null;


        String nome, limpar;
        int opcao;

        System.out.println("Informe o nome do funcionario a ser editado: ");
        nome = ler.nextLine();
        limpar = ler.nextLine();

        func_horista = lista.BuscaFuncionarioHorista(nome);

        if(func_horista == null){

            func_assalariado = lista.BuscaFuncionarioAssalariado(nome);
            if(func_assalariado == null){
                func_comissinado = lista.BuscaFuncionarioComissionado(nome);
            }
        }

        do {

            MenuEdicoes();
            opcao = ler.nextInt();
            limpar = ler.nextLine();

            if(opcao == 0)break;

            if(func_horista != null){
                func_horista.EditarHorista(lista, func_horista,opcao );
                for(Horista item : lista.getListaHorista())
                {
                    if(item.getPerfil().getNome().equals(nome)){
                        item = func_horista;
                        break;
                    }
                }
            }else{

                if(func_assalariado != null){

                    func_assalariado.EditarAssalariado(lista, func_assalariado,opcao );
                    for(Assalariado item : lista.getListaAssalariado())
                    {
                        if(item.getPerfil().getNome().equals(nome)){
                            item = func_assalariado;
                            break;
                        }
                    }
                }else{
                        func_comissinado.EditarComissionado(lista, func_comissinado, opcao);
                        for (Comissionado item : lista.getListaComissionado()) {
                            if (item.getPerfil().getNome().equals(nome)) {
                                item = func_comissinado;
                                break;
                            }
                        }
                    }
                }

        }while(true);
    }
    public static void MenuEdicoes(){

        System.out.println("\n------------------------------------\n");
        System.out.println("Informe a opcao desejada: ");
        System.out.println("1 - Nome");
        System.out.println("2 - Endereco");
        System.out.println("3 - Tipo");
        System.out.println("4 - Metodo de Pagamento");
        System.out.println("5 - Vinculo com o Sindicato");
        System.out.println("6 - Identificacao com o sindicato");
        System.out.println("7 - Taxa Sindical");
        System.out.println("0 - Sair");
        System.out.println("------------------------------------");
    }

    public static void Imprimir(Funcionarios lista){

        System.out.println("Assalariados: \n");

        for (Assalariado Auxiliar : lista.getListaAssalariado()) {
            System.out.println("Nome: " + Auxiliar.getPerfil().getNome());
            System.out.println("Endereco: " + Auxiliar.getPerfil().getEndereco());
            System.out.println("Tipo: " + Auxiliar.getPerfil().getTipo());
            System.out.println("Saldo salarial: " + Auxiliar.getPerfil().getTipoSalario());
            System.out.println("Data de Adicao: " + Auxiliar.getPerfil().getDia()+"|"+Auxiliar.getPerfil().getMes()+"|"+Auxiliar.getPerfil().getAno());
            System.out.println("ID: " + Auxiliar.getPerfil().getID() + "\n");
        }

        System.out.println("Horistas: \n");

        for (Horista Auxiliar1 : lista.getListaHorista()) {
            System.out.println("Nome: " + Auxiliar1.getPerfil().getNome());
            System.out.println("Endereco: " + Auxiliar1.getPerfil().getEndereco());
            System.out.println("Tipo: " + Auxiliar1.getPerfil().getTipo());
            System.out.println("Saldo salarial: " + Auxiliar1.getPerfil().getTipoSalario());
            System.out.println("Data de Adicao: " + Auxiliar1.getPerfil().getDia()+"|"+Auxiliar1.getPerfil().getMes()+"|"+Auxiliar1.getPerfil().getAno());
            System.out.println("ID: " + Auxiliar1.getPerfil().getID() + "\n");
        }

        System.out.println("Comissionado: \n");

        for (Comissionado Auxiliar2 : lista.getListaComissionado()) {
            System.out.println("Nome: " + Auxiliar2.getPerfil().getNome());
            System.out.println("Endereco: " + Auxiliar2.getPerfil().getEndereco());
            System.out.println("Tipo: " + Auxiliar2.getPerfil().getTipo());
            System.out.println("Saldo salarial: " + Auxiliar2.getPerfil().getTipoSalario());
            System.out.println("Data de Adicao: " + Auxiliar2.getPerfil().getDia()+"|"+Auxiliar2.getPerfil().getMes()+"|"+Auxiliar2.getPerfil().getAno());
            System.out.println("ID: " + Auxiliar2.getPerfil().getID() + "\n");
        }
    }
    /* Função que faz a contagem dos dias/meses/anos para o pagamento correto dos funcionarios */

    public static Funcionarios ContagemDeDias(Funcionarios lista, boolean rodarFolhaPag){

            lista.setDia(lista.getDia()+1);

            if(lista.getDia() == 30){
                lista.setDia(0);
                lista.setMes(lista.getMes()+1);
            }
            if(lista.getMes() == 12){
                lista.setAno(lista.getAno()+1);
            }

        return lista;
    }
}
