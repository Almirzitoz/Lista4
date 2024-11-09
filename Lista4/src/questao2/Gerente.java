package questao2;

public class Gerente extends Empregado{
    private String departamento;
    public void setDepartamento(String dep){
        this.departamento =dep;
    }
    public String getDepartamento(){
        return(departamento);
    }

    @Override
    public String toString(){
        return(super.toString()+"\nDepartamento: "+departamento);
    }
}
