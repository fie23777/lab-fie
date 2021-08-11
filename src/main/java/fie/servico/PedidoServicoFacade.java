package fie.servico;

import org.springframework.stereotype.Service;

import fie.dto.PedidoDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PedidoServicoFacade {
	
	private final PedidoServico servico;
	private final PedidoMapper mapper;

	public PedidoDto getPedido() {
		// TODO Auto-generated method stub
		
		return mapper.mapperToApi(servico.getPedido(1));
	}

}
