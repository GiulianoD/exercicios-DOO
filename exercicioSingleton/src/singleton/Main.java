package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getProxNumero());

		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getProxNumero());

		s1.close();
		
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3.getProxNumero());

		s2.close();
		s3.close();
	}

}
