package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

//1.��ΪԶ�̶�����õĽӿڣ�����̳�Remote��  
public interface PersonService extends Remote {
	public List<PersonEntity> GetList() throws RemoteException;
}
