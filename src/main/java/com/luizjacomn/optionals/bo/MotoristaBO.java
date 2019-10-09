package com.luizjacomn.optionals.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.luizjacomn.optionals.model.Caminhao;
import com.luizjacomn.optionals.model.Motorista;
import com.luizjacomn.optionals.model.Seguro;

public class MotoristaBO {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
    
    public MotoristaBO() {
        Seguro seguro = new Seguro("Parcial - não cobre roubo", "5000");
        Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
        Optional<Motorista> motoristaJoao = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
        Optional<Motorista> motoristaJose = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));
         
        motoristas.put("João", motoristaJoao);
        motoristas.put("José", motoristaJose);
    }
     
    public Optional<Motorista> porNome(String nome) {
        return motoristas.get(nome);
    }
    
    public List<Motorista> getMotoristas() {
		return motoristas.values().stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
	}
}