package granulej.lang;

import gui.constant.ContextConstant;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.InetAddress;
import java.net.Socket;

/*
	连接服务器修改上下文
 */
public class ContextModify implements Runnable {
	// con_seq 格式：上下文名字：上下文的值
	private String con_seq;
	public ContextModify(String con_seq) {
		this.con_seq = con_seq;
	}
	
	public void run() {
		if("".equals(con_seq))
		return ;
	    Socket socket = null;
    	OutputStream socketPut;
    	PrintWriter socketWriter;
    	  try{
    	  		// 连接本地上下文服务器
				socket = new Socket(InetAddress.getLocalHost(), ContextConstant.CONTEXT_CLIENT_PORT);
				socketPut = socket.getOutputStream();
				socketWriter = new PrintWriter(socketPut);
				socketWriter.println(ContextConstant.CONTEXT_UPDATE);
				socketWriter.println(ContextConstant.CONTEXT_UPDATE_FROM_LOCAL);
				//System.out.println("current context is : "+ con_seq);
				socketWriter.println(con_seq);
				socketWriter.flush();
				//System.out.println("Context value update information is sending ...");
				socketPut.close();
				socketWriter.close();
				socket.close();
    	    } catch (BindException e) {
    			    e.printStackTrace();
    		} catch (IOException e) {
    				e.printStackTrace();
    		}
	}
}
