/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokedexhibernate;

import java.util.Iterator;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Usuario
 */
public class PokedexHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            SessionFactory instancia = (SessionFactory) new Configuration().configure("hibernatePokedex.cfg.xml").buildSessionFactory(); 
            Session session = instancia.openSession();
            System.out.println("Conexión correcta");
            
            int accion;
            
            do{
            session.beginTransaction();
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Consultar");
                System.out.println("2. Insertar");
                System.out.println("3. Actualizar");
                System.out.println("4. Borrar");
                System.out.println("5. Salir");
                
                accion=sc.nextInt();
                switch (accion) {
                    case 1:
                System.out.println("¿En que tabla quieres insertar un registro?");
                System.out.println("1. Entrenador");
                System.out.println("2. Generacion");
                System.out.println("3. Gimnasio");
                System.out.println("4. Lider");
                System.out.println("5. Movimiento");
                System.out.println("6. Objeto");
                System.out.println("7. Pokemon");
                System.out.println("8. Profesor");
                
                //int tabla
                
                    break;
                    case 2:
                        
                    break;
                    case 3:
                        
                    break;
                    case 4:
                        
                    break;
                    case 5:
                       
                    break; 
                }
                session.getTransaction().commit(); 
            
            }while(accion != 5);
                
        }catch(HibernateException e){
            
        }
        
   }
}
