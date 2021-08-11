package fie.servico;

import org.springframework.stereotype.Service;

import fie.entity.Pedido;
import fie.repositorio.RepoPedidoDB;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PedidoServicoImpl implements PedidoServico {
	
	private final RepoPedidoDB rep;

	public Pedido getPedido(Integer id) {
		// TODO Auto-generated method stub
		return rep.getPedido();
	}

}
