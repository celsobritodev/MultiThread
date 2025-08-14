package principal;

public class Main {

	public static void main(String[] args) {
		// thread atual
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		// nova thread
		Thread t1 = new Thread(new MeuRunnable());
		t1.start(); // executando em uma nova thread
		
		// Runnable como lambda
		Thread t2 = new Thread(() -> {
			System.out.println("Inscreva-se no canal!");
		});
		t2.start(); // executando em uma nova thread
		//t2.start(); // NAÕ FAÇA ISSO, lança IllegalThreadStateException
	}

}
