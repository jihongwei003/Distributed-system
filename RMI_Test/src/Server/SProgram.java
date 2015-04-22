package Server;

/**
 *	1.�ȴ���Զ�̽ӿڼ�����Զ�̷���������ʵ��˫��ͨѶ�Ľӿڣ���Ҫ�̳�Remote
 *	2.����һ������ʵ��Զ�̽ӿڼ�Զ�̷�����ֵ��ע�����ʵ������Ҫ�̳�UnicastRemoteObject
 *	3.���ͻ��˲���Զ�̶��󣬲�����Զ�̷��� 
 */

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PersonService personService = new PersonServiceImpl();
			
			// ע��ͨѶ�˿�
			LocateRegistry.createRegistry(6600);
			
			// ע��ͨѶ·��
			Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService);
			
			System.out.println("Service Start!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
