package practica1;
import java.util.Scanner;

/**
 * @author Talmac
 * @version version 1.0
 * @since 24-03-2024
 */
/**
 * @see notas
 * Esta clase representa un programa para calcular las notas
 */
public class notas {

	
	//declaramos la variables que nos hacen falta
	/**
     * Nota de la primera unidad formativa uno 
     */
    double uni1;
    /**
     * Nota de la segunda unidad formativa dos 
     */
    double uni2;
    /**
     * Nota de la tercera unidad formativa tres 
     */
    double uni3;
    /**
     * Acumulado de la primera unidad formativa uno
     */
    double acu1;
    /**
     * Acumulado de la segunda unidad formativa dos
     */
    double acu2;
    /**
     * Acumulado de la tercera unidad formativa tres
     */
    double acu3;
    /**
     * Nota definitiva
     */
    double def;
		//utilizames ecaner para poder introducir datos
		Scanner entrada = new Scanner(System.in);
		
		//vamos ha crear un metodo para ingresar 
		/**
	     * Este metodo permite ingresar las notas
	     */
		public void IngresaNotas() {
			//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
			System.out.println("ingrese las notas del estudiante");
			
			System.out.print("ingrese nota 1: ");
			
			uni1= entrada.nextDouble();

			
			
			System.out.print("ingrese nota 2: ");
			
			uni2= entrada.nextDouble();
			System.out.print("ingrese nota 3: ");
			
			uni3= entrada.nextDouble();
			
		
		}
		
		// metodo para comprobar bien entroduccion de notas
		/**
	     * Este metodo comprueba si las notas estan bien introducidas
	     */
		public void comprobarcion(){
			
			if (uni1>10) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (uni2>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uni3>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}
			
				
			
			
		}
		// metodo para calcular nota
		 /**
	     * Este metodo calcula la nota definitiva
	     */
		public void Calculonotas() {
			acu1= uni1*0.7;
			acu2 = uni2 * 0.7;
			acu3 = uni3 * 0.6;
			
			def = acu1 + acu2+ acu3;
			//cambio la formula para auqe calcule la nota sobre 20
			//antes la calculaba sobre 10
			//hasta aqui la tenemos calculada peor no la mostramos
		}
		/**
	     * Este metodo muestra las notas introducidas y la nota definitiva
	     */
		public void Mostrar() {
			//print ln lo que hace es que al terminar el print baja la linea
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uni1);
			System.out.println(" nota2 = " + uni2);
			System.out.println(" nota3 = " + uni3);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ def);
			System.out.println(" NOTA ACTUALIZADA SOBRE 20 ");
			
			
		}
		/**
	     * Este metodo indica si la nota esta aprobada o suspendida
	     */
		public void aprobado() {
				
				if(def<10 && def>=0) {
					System.out.println("suspendio");
				}else {
					if (def>=10 && def<=20 ) {
					System.out.println("aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}
			
		 /**
	     * Metodo principal que llama a demas metodos de la clase
	     */
		public static void main(String[] args) {
			// creamos mecanimos para llamar a cualquier metodo fuero de la clase
			notas fc= new notas();
			
			fc.IngresaNotas();
			
			fc.comprobarcion();
			

			fc.Calculonotas();
			
			fc.Mostrar();
			
			fc.aprobado();
			
		}

	}

