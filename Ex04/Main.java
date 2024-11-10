package exAss04;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		
		ee.setConsumo(50);
		ee.setTensao(220);
		
		System.out.println(ee);
		
		Memoria memoria = new Memoria();
		
		memoria.setCapacidade(1000000);
		memoria.setMarca("Kingstone");
		memoria.setModelo("M2");
		memoria.setVelocidade(130);
		
		System.out.println(memoria);
		
		PlacaMae pm = new PlacaMae();
		
		pm.setMarca("MSN");
		pm.setModelo("O00");
		pm.processador.setCache(130);
		pm.processador.setClock(1000000);
		pm.processador.setMarca("Intel");
		pm.processador.setModelo("i9");
		pm.setMemoria(memoria);
		pm.hd.setCapacidade(60000000);
		pm.hd.setMarca("Kiiss");
		pm.hd.setModelo("assa");
		pm.hd.setRpm(1202);
		
		System.out.println(pm);
		
		Monitor mon = new Monitor();
		
		mon.setModelo("xxs");
		mon.setResolucao("16x9");
		mon.setTipo("B4");
		
		System.out.println(mon);
		
		Mouse mouse = new Mouse();
		
		mouse.setModelo("X67");
		mouse.setTipo("Normal");
		
		System.out.println(mouse);
		
		Computador pc = new Computador();
		
		pc.setMarca("PC bom");
		pc.setModelo("Melhor");
		pc.setConsumo(1000);
		pc.setTensao(110);
		pc.gabinete.setBaias(4);
		pc.gabinete.setModelo("AAA");
		pc.gabinete.setTipo("Quadrador");
		pc.gabinete.setPlacamae(pm);
		pc.teclado.setModelo("Razer");
		pc.teclado.setTipo("Inteiro");
		pc.setMouse(mouse);
		pc.setMonitor(mon);
		
		System.out.println(pc);
	}

}
