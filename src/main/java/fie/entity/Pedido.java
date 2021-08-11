package fie.entity;

import java.math.BigDecimal;
import java.util.List;

import fie.utils.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

	private Integer id;
	private String codigo;
	private BigDecimal valorTotal;
	private Customer custumer;
	private List<Produto> produtos;
	private StatusPedido status;
}
