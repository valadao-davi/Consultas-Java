public class Consultas{
    
    //variaveis de instancia
    private String paciente;
    private String medico;
    private String data;

    //construtor
    public Consultas(String paciente, String medico, String data){
        //referenciando de variaveis de ambiente (this)
        //usando variaveis identicas
        this.paciente= paciente;
        this.medico= medico;
        this.data= data; 
    }

    //representação textual
    @Override //sobrescreve um método existente
    public String toString(){
        return "Consulta: [Paciente "+ paciente+ " , Médico: " + medico + ", Data:" + data + "]";
    }

}