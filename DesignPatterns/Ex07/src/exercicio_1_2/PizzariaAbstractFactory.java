package exercicio_1_2;

import exercicio_1_2.Produto;

public interface PizzariaAbstractFactory {
	Produto getTypeInstance(String diaDaSemana);
}
