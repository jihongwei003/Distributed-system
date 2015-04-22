package Server;

/**
 *	1.先创建远程接口及声明远程方法，这是实现双方通讯的接口，需要继承Remote
 *	2.开发一个类来实现远程接口及远程方法，值得注意的是实现类需要继承UnicastRemoteObject
 *	3.最后客户端查找远程对象，并调用远程方法 
 */

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PersonService personService = new PersonServiceImpl();
			
			// 注册通讯端口
			LocateRegistry.createRegistry(6600);
			
			// 注册通讯路径
			Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService);
			
			System.out.println("Service Start!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
