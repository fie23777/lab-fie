package fie.servico;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fie.dto.PedidoDto;
import fie.entity.Pedido;

@Component

public class PedidoMapper {
	
	ModelMapper moderMapper = new ModelMapper();
	public PedidoDto mapperToApi(Pedido pedido) {
		PedidoDto pedidoDto = moderMapper.map(pedido, PedidoDto.class);
		
		return pedidoDto;
	}


}
