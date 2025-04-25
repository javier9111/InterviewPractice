package teach;

public class Trabajador extends Persona{
    
    private int salario;
    private int horas;
    private String cargo;
   public Trabajador(int salario, int horas, String cargo, String name, String apellido, int edad){
        super(name, apellido, edad);
        this.salario = salario;
        this.cargo = cargo;
        this.horas = horas;
    }
    public Trabajador(int salario, int horas, String cargo, Persona persona){
        super(persona.getName(), persona.getApellido(), persona.getEdad());
        this.salario = salario;
        this.cargo = cargo;
        this.horas = horas;
    }


    public int getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }
    public int getHoras() {
        return horas;
    }
}
