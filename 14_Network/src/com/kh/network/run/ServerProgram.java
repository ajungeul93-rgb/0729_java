package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		/*
		 * ����� �ϱ� ���ؼ��� ������ ���� ������ ������ Ŭ���̾�Ʈ�� ������ �ʿ���
		 * 
		 * ServerScoket
		 * - ��Ʈ��ȣ�� ����(Bind)�ؼ� �ܺ��� �����û�� ��ٸ��ٰ� �����û�� ������ �������� �뵵
		 * - �����ϴ� ���� ������ Scoket��ü ����
		 * 
		 * Soket
		 * - Process���� ����� ���
		 * - Socket��ü�� �̿��ؼ� ����� ���� ��ݽ�Ʈ�� InputStream / OutputStream�� ��������
		 * - ��ݽ�Ʈ�������δ� ������ ������ ������Ʈ���� ����� ��
		 * 
		 * -- ������ſ� ������ ���α׷� �ۼ� ����
		 * 
		 * 1) ��Ʈ��ȣ ����(���������� �� �� ��Ʈ�� ����� ������)
		 * 2) ServerSocket��ü ���� => ������ ���ڰ��� ��Ʈ��ȣ ����(��Ʈ���� / Biding)
		 * 3) ������
		 * 4) Ŭ���̾�Ʈ�� �����û�� �ϸ� ���� �� ��Ű����� Socket��ü�� ��ȯ����
		 * 5) Socket��ü�� �̿��ؼ� �� / ��¿� ��Ʈ���� �����ֱ�
		 * 6) ������Ʈ���� �߰��Ͽ� ���� ����
		 * 7) ������ �ְ�ޱ�
		 * 8) �ڿ��ݳ�
		 */
		
		// ������ ���α׷�
		
		// 0) �ʿ��� ���� ����
		Scanner sc = new Scanner(System.in);
		
		// �ڿ��ݳ��� ���� �̸� �������� ���� �� null������ �ʱ�ȭ
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) ��Ʈ��ȣ ���� 80 443 8080
		int portNumber = 1024;
		
		try {
		    // 2) ServerSocket��ü ����
		    server = new ServerSocket(portNumber);
		    
		    // �׻� ������ Ŭ���̾�Ʈ�� �����û�� �� ������ �Ͽ����� ��ٸ�
		    // 3) ������
		    System.out.println("���� �Ͽ����� ��ٸ���****");
		    
		    // 4) �����û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ Socket��ü ����
		    // ServerSocketŬ������ �޼ҵ�� accept() : Socket��ü ��ȯ
		    Socket socket = server.accept();
		    
		    System.out.println("Ŭ���̾�Ʈ���� ���� ����!");
		    // socket��ü�� �ֿ��ؼ� Client�� ������ ��ȯ������ ������
		    System.out.println(socket.getInetAddress().getHostName());
		    
		    // 5) Ŭ���̾�Ʈ�� ����� �� �ִ� ��/��¿� ��Ʈ�� ����
		    // 6) ������Ʈ���� �߰��ؼ� ���� ����
		    br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    // socket���� �����ϴ� �Է��� ����ѽ�Ʈ�� => 1Byte
		    // ����Ʈ��Ʈ���� ���ڽ�Ʈ���� ȣȯ���� �� �ִ� ������Ʈ�� => InputStreamReader
		    // �ӵ���� , �ѱ����޵� ���� �Է¿� ������Ʒ�� => BufferedReader => 2Byte
		    
		    // ��¿� ��Ʈ��(������ Ŭ���Ʈ���� �����͸� �����ϱ� ���� ��Ʈ��)
		    pw = new PrintWriter(socket.getOutputStream());
		    // PrintWriter�� 2Byte¥�� ���ڿ������� 1Byte¥���� �ÿ��ϰ� ��밡��
		    
		    
		    // 7) ������ �ְ�ޱ�
		    // Client�� �����͸� �ְŴ� �ްŴ� �ϵ��� ����
		    while(true) {
		    	
		    	// 7_1) �Է¹ޱ�
		    String message = br.readLine();
		    System.out.println("Ŭ���̾�Ʈ�� ���� ���� �޼��� : " + message);
		    
		       // 7_2) ����ϱ�
		    System.out.println("Ŭ���̾�Ʈ���� ���� �޼��� > ");
		    String sendMessage = sc.nextLine();
		    pw.println(sendMessage);
		    
		    // ��Ʈ���� �ִ� �����͸� ������ �������� �޼ҵ�
		    pw.flush();
		    	
		    }
		    
		    
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {
					sc.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(server != null) {
					server.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
