package domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Program {

  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    EntityManager manager = factory.createEntityManager();

    EntityTransaction tx = manager.getTransaction();

    Scanner scanner = new Scanner(System.in);
    int value = 0;

    while (value != -1) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Guardar 3 Empleados");
      System.out.println("2. Modificar Primer empleado");
      System.out.println("3. Eliminar Primer empleado");
      System.out.println("4. Buscar empleado con id 3");
      System.out.println("-1. Salir");

      value = scanner.nextInt();
      scanner.nextLine(); // Consumir la nueva línea

      switch (value) {
        case 1:
          // Guardar
          tx.begin();
          Empleado empleado = new Empleado("Chiclla", "Fuentes", "Jean");
          manager.persist(empleado);

          Empleado empleado5 = new Empleado("Rivera", "Castro", "Pedro", 0, 5000.00, LocalDate.of(1996, 01, 20));
          manager.persist(empleado5);

          Empleado empleado6 = new Empleado("Manrique", "Quispe", "Esteban", 0, 7000.00, LocalDate.of(1990, 12, 15));
          manager.persist(empleado6);

          tx.commit();

          listarEmpleados(manager);

          break;
        case 2:
          // Modificar
          tx.begin();
          Empleado empleado2 = new Empleado("Cáceres", "Rivera", "Javier José");
          empleado2.setId(1L);
          manager.merge(empleado2);
          tx.commit();

          listarEmpleados(manager);
          break;
        case 3:
          // Eliminar
          tx.begin();
          Empleado empleado3 = manager.getReference(Empleado.class, 1L);
          manager.remove(empleado3);
          tx.commit();

          listarEmpleados(manager);
          break;
        case 4:
          // Buscar
          Empleado empleado4 = manager.find(Empleado.class, 3L);
          System.out.println(empleado4);
          break;
        case -1:
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opción no válida. Intente de nuevo.");
          break;
      }

    }

    // Cerrar el EntityManager y el Scanner
    manager.close();
    factory.close();
    scanner.close();

  }

  static void listarEmpleados(EntityManager manager) {
    List<Empleado> lista = manager.createNamedQuery("listaEmpleados",
        Empleado.class).getResultList();
    for (Empleado e : lista) {
      System.out.println(e);
    }
  }

}
