package com.luizjacomn.optionals.app;

import com.luizjacomn.optionals.bo.MotoristaBO;
import com.luizjacomn.optionals.model.Caminhao;
import com.luizjacomn.optionals.model.Motorista;
import com.luizjacomn.optionals.model.Seguro;

public class Main {

	public static void main(String[] args) {
		MotoristaBO bo = new MotoristaBO();
		String cobertura = bo.porNome("João")
								.flatMap(Motorista::getCaminhao)
								.flatMap(Caminhao::getSeguro)
								.map(Seguro::getCobertura).orElse("Sem seguro");
		System.out.println(cobertura);
		
		double mediaIdade = bo.getMotoristas().stream().mapToInt(Motorista::getIdade).average().orElse(0.0);
		System.out.println(mediaIdade);
	}

}