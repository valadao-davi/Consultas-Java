import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeConsultas {
    //Lista do tipo de consultas
    private List<Consultas> consultar; //recebe os parametros da classe Consultas

    //construtor que ao ser chamado atribui um array a minha lista
    public GerenciadorDeConsultas(){
        consultar = new ArrayList<>();
    }

    //método para cadastrar uma consulta
    //void não possui retorno
    public void cadastrarConsulta(String paciente, String medico, String data){
        Consultas consulta = new Consultas(paciente, medico, data);
        consultar.add(consulta);
    }

    //listar consultas
    public void listarConsulta(){
        if (consultar.isEmpty()){
            System.out.println("Não tem consultas");
        }else{
            //percorre a lista e imprime cada item
            for (Consultas consultas : consultar) {
                System.out.println(consultas);
            }
        }
    }
    
    //metodo remover consultas
    public void removerConsulta(int numero){
        consultar.remove(numero);
    }

    public static void main(String[] args){
        //cria o objeto gerenciador
        GerenciadorDeConsultas gerenciador = new GerenciadorDeConsultas();
        gerenciador.cadastrarConsulta("Kaian", "Luiz Fernando", "18/05");
        gerenciador.cadastrarConsulta("Kaique", "Luiz Fernando", "18/05");
        gerenciador.removerConsulta(0);
        gerenciador.listarConsulta();
    }
}
