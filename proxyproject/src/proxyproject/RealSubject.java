package proxyproject;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println(" RealSubject request \n");
	}

}
