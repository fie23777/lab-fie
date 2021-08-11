package fie.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoDto {

	private Integer id;
	private String codigo;
	private String status;
	private BigDecimal valorTotal;
	private CustomerDto custumer;
	private List<ProdutoDto> produtos;
	
}
