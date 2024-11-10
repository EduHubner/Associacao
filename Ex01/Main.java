package assiciacao;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico eqEle = new EquipamentoEletronico();
		
		eqEle.setConsumo(100);
		eqEle.setTensao(1200);
		
		System.out.println(eqEle);
		
		SistemaDeSom ss = new SistemaDeSom();
		
		ss.setConsumo(100);
		ss.setTensao(1200);
		ss.setMarca("LG");
		ss.setModelo("PBM");
		ss.setPotencia(300);
		
		System.out.println(ss);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		
		sv.setConsumo(100);
		sv.setTensao(1200);
		sv.setMarca("Sony");
		sv.setModelo("AAAAD");
		sv.setResolucao("1080p");
		sv.setTipo("LED");
		
		System.out.println(sv);
		
		HomeTheater ht = new HomeTheater();
		
		ht.som.setConsumo(100);
		ht.som.setTensao(1200);
		ht.som.setMarca("LG");
		ht.som.setModelo("PBM");
		ht.som.setPotencia(300);
		
		ht.video.setConsumo(100);
		ht.video.setTensao(1200);
		ht.video.setMarca("Sony");
		ht.video.setModelo("AAAAD");
		ht.video.setResolucao("1080p");
		ht.video.setTipo("LED");
		
		
		System.out.println(ht);
		
		//Outro jeito de fazer
		
		ht.setSom(ss);
		ht.setVideo(sv);
		
		ht.video.setModelo("BBBBBBBB");
		
		System.out.println(ht);
		
		System.out.println(sv);

	}

}
