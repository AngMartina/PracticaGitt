
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author bertoa
 */
public class GitAux {
    public void metodoAlumno1(){
    	System.out.println("metodo 1");
	System.out.println("modificado por el alumno1"); // alumno1
}
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modificado por alumno 2");// alumno2
    }
    

    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	//modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
    	//modificaciones alumno1
	System.out.println("Alumno 1 inserta esta sentencia");
    }


    public void testGitAux(){
	// metodo rama testing

	System.out.println("Metodo de testing");    
    
    }


}
