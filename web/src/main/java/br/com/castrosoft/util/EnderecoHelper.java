package br.com.castrosoft.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.castrosoft.commons.dto.EnderecoDto;
import br.com.castrosoft.entities.Endereco;

public class EnderecoHelper {
	
	public static List<EnderecoDto> convertToEnderecosDtos(List<Endereco> enderecos) {
		if (Objects.nonNull(enderecos)) {
			ArrayList<EnderecoDto> end = new ArrayList<>();
			enderecos.forEach(e -> {
				EnderecoDto eTemp = new EnderecoDto();
				eTemp.setBairro(e.getBairro());
				eTemp.setCep(e.getCep());
				eTemp.setCidade(e.getCidade());
				eTemp.setId(e.getId());
				eTemp.setLogradouro(e.getLogradouro());
				eTemp.setNumero(e.getNumero());
				eTemp.setUf(e.getUf());
				end.add(eTemp);
			});
			return end;
		}
		return null;
	}
	
	public static List<Endereco> convertToEnderecosEntidade(List<EnderecoDto> enderecos) {
		if (Objects.nonNull(enderecos)) {
			ArrayList<Endereco> end = new ArrayList<>();
			
			enderecos.forEach(e -> {
				Endereco eTemp = new Endereco();
				eTemp.setBairro(e.getBairro());
				eTemp.setCep(e.getCep());
				eTemp.setCidade(e.getCidade());
				eTemp.setId(e.getId());
				eTemp.setLogradouro(e.getLogradouro());
				eTemp.setNumero(e.getNumero());
				eTemp.setUf(e.getUf());
				end.add(eTemp);
			});
			return end;
		}
		return null;
	}
}
