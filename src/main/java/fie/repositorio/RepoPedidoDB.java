package fie.repositorio;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import fie.entity.Customer;
import fie.entity.Pedido;
import fie.entity.Produto;
import fie.utils.Status;
import fie.utils.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RepoPedidoDB {
	
	Produto ps5 = new Produto().builder().nome("Playstation 5").valor(new BigDecimal(5.000)).build();
	Produto pc = new Produto().builder().nome("pc dell ").valor(new BigDecimal(5.000)).build();
	
	Customer joao = new Customer().builder().nome("joao").email("fie2377@gmail.com").id(1).status(Status.ATIVO).build();
	
	Pedido pedido1 = Pedido.builder()
			.id(1)
			.codigo("5")
			.custumer(joao)
			.status(StatusPedido.ANDAMENTO)
			.valorTotal(new BigDecimal(200.00))
			.produtos(Arrays.asList(ps5, pc))
			.build();
	
	public Pedido getPedido() {
		return this.pedido1;
	}

}
