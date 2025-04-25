package noTeach;

import teach.Persona;
import teach.Trabajador;

public class testTeach {
   
    

    public static void main(String[] args) {
        Persona luis = new Persona("luis","topete", 18);
       // System.out.println(luis.getName());
        

        //Trabajador javier = new Trabajador( 2000, 8, "dev", "javier", "topete", 18 );
        Trabajador javier = new Trabajador( 2000, 8, "dev", luis);

        System.out.println(javier.getSalario());
    }
}
