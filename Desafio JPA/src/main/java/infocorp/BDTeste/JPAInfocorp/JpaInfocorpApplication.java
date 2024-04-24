package infocorp.BDTeste.JPAInfocorp;


import infocorp.BDTeste.JPAInfocorp.Models.Categoria;
import infocorp.BDTeste.JPAInfocorp.Models.Cliente;
import infocorp.BDTeste.JPAInfocorp.Models.ProdutoCategoria;
import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
/*Candidato: Pedro Vitor Da Cruz Silva
*
* CONFIGURADO PARA POSTGRES NA PORTA 5434 BASE DE DADOS NOMEADA 'teste'
*
* */
@SpringBootApplication
public class JpaInfocorpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaInfocorpApplication.class, args);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_NAME");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		// Exemplo de criação de um novo Cliente
		transaction.begin();
		Cliente cliente = new Cliente();
		cliente.setId(3);
		cliente.setNome("Novo Cliente");
		cliente.setEndereco("Rua C, 789");
		cliente.setTelefone("555-1234");
		cliente.setTelefone("555-1234");
		entityManager.merge(cliente);
		transaction.commit();

		transaction.begin();
		cliente.setId(4);
		cliente.setNome("Teste de delete");
		entityManager.merge(cliente);
		transaction.commit();
		// Exemplo de leitura de todos os Clientes
		TypedQuery<Cliente> query = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class);
		List<Cliente> clientes = query.getResultList();
		for (Cliente c : clientes) {
			System.out.println(c.getNome());
		}

		// Exemplo de atualização de um Cliente
		transaction.begin();
		Cliente clienteToUpdate = entityManager.find(Cliente.class, 1);
		clienteToUpdate.setNome("Cliente Atualizado");
		entityManager.merge(clienteToUpdate);
		transaction.commit();

		// Exemplo de exclusão de um Cliente
		transaction.begin();
		Cliente clienteToDelete = entityManager.find(Cliente.class, 4);
		entityManager.remove(clienteToDelete);
		transaction.commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}

