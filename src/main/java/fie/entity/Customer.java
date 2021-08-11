package fie.entity;

import java.util.List;

import fie.utils.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
	
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	private Status status; // é um enum


}
