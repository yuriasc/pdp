public class TesteIncremental {

public static void main(String[] args) {		
		for(int i = 0; i < 10; i++){
			Incremental inc = Incremental.getInstancia();
			inc.incrementar();
			System.out.println(inc);
		}
	}

}
