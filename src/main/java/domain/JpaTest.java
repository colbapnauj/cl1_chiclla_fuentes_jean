package domain;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		// Guardar
		Empleado empleado = new Empleado("Chiclla", "Fuentes", "Jean");
		manager.persist(empleado);
		tx.commit();

		// Modificar
		// Empleado empleado2 = new Empleado("Cáceres", "Rivera", "Javier José");
		// empleado2.setId(1L);
		// manager.merge(empleado2);
		// tx.commit();

		// Eliminar
		// Empleado empleado3 = manager.getReference(Empleado.class, 1L); // + eficiente
		// manager.remove(empleado3);
		// tx.commit();

		// Buscar
		Empleado empleado4 = manager.find(Empleado.class, 2L);
		System.out.println(empleado4);
		

		// Named Query
		// List<Empleado> lista = manager.createNamedQuery("listaEmpleados", Empleado.class).getResultList();
		// for (Empleado e : lista) {
		// 	System.out.println(e);
		// }

	}

}
