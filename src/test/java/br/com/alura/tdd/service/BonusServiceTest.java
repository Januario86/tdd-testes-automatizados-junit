package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusServiceTest {

	
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Felipe",LocalDate.now(), new BigDecimal("25000"))));		
	}
	
}
