package one.digitalinnovation.gof;

import br.com.padroes.facade.Facade;
import br.com.padroes.singleton.SingletonEager;
import br.com.padroes.singleton.SingletonLazy;
import br.com.padroes.singleton.SingletonLazyHolder;
import br.com.padroes.strategy.Comportamento;
import br.com.padroes.strategy.ComportamentoAgressivo;
import br.com.padroes.strategy.ComportamentoDefensivo;
import br.com.padroes.strategy.ComportamentoNormal;
import br.com.padroes.strategy.Robo;

public class _Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
