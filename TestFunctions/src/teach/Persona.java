package teach;

public class Persona {
    /***
     * 
     * pojo, modelo
     * 
     * Persona
     * nombre
     * apellido
     * edad
     */
    // Persona luis = new Persona( "luis","topete", 18 )
    // luis.name 

    //modificadores acceso: private,protected,public, -------> package
     private String name;//variables de instancia
     private String apellido;
     private int edad;


    // pilares de la programacion OO 
    /*  1.-Encapsulacion
        2.-Herencia
        3.-Polimorfismo
        4.-Abstraccion
    */

     public Persona(String name, String apellido, int edad) {

        this.name = name;// this.name = variable de instancia , name  = variable de metodo ( parametros)
        this.apellido = apellido;
        this.edad = edad;
     }

     public String getApellido() {
         return apellido;
     }
     public int getEdad() {
         return edad;
     }
     public String getName() {

         return name ; 
        }
     


}
