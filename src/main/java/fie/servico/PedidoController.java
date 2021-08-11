package fie.servico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fie.dto.PedidoDto;
import fie.entity.Pedido;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PedidoController {

	private final PedidoServicoFacade pedido;
	
	@GetMapping("/pedido")
	public PedidoDto getPedido() {
		return pedido.getPedido();
	}
	
}
