package principal;

public class Main {

	public static void main(String[] args) {
		
		// thread atual
		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		// nova thread
		MeuRunnable meuRunnable = new MeuRunnable();
		Thread t1 = new Thread(meuRunnable);
		

		// Runnable como lambda
		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Inscreva-se no canal!");
		});
		
		// t2.start(); // NAÕ FAÇA ISSO, lança IllegalThreadStateException

		// nova thread
		Thread t3 = new Thread(meuRunnable);
		
		t1.start(); // executando em uma nova thread
		t2.start(); // executando em uma nova thread
		t3.start(); // executando em uma nova thread
	}

}
