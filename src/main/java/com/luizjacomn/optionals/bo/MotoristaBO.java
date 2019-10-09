package com.luizjacomn.optionals.bo;

import java.util.HashMap;
import java.util.Map;

import com.luizjacomn.optionals.model.Caminhao;
import com.luizjacomn.optionals.model.Motorista;
import com.luizjacomn.optionals.model.Seguro;

public class MotoristaBO {

	private Map<String, Motorista> motoristas = new HashMap<>();
    
    public MotoristaBO() {
        Seguro seguro = new Seguro("Parcial - não cobre roubo", "5000");
        Caminhao caminhao = new Caminhao("Mercedes Atron", seguro);
        Motorista motoristaJoao = new Motorista("João", 40, caminhao);
         
        Motorista motoristaJose = new Motorista("José", 25, null); // Não tem caminhão
         
        motoristas.put("João", motoristaJoao);
        motoristas.put("José", motoristaJose);
    }
     
    public Motorista porNome(String nome) {
        return motoristas.get(nome);
    }
}