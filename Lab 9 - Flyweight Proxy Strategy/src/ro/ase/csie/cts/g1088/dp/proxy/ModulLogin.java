package ro.ase.csie.cts.g1088.dp.proxy;

public class ModulLogin implements InterfataLogin {

	String ipServer;
	
	public ModulLogin(String ipServer) {
		super();
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String user, String pass) {
		return user.equals("admin") && pass.equals("root1234");
	}

	@Override
	public boolean verificaStatusServer() {
		// TODO Auto-generated method stub
		return false;
	}

}
