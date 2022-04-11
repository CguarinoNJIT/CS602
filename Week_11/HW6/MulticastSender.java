import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSender {
    private static final String multi_ip = "225.4.5.6";
    private static final int multi_port = 1200;
    InetAddress ip_address;
    MulticastSocket socket;
    DatagramPacket packet;

    
    public void sendMessage(String ip, int port, String message) throws IOException {
        ip_address = InetAddress.getByName(multi_ip);
        socket = new MulticastSocket();
        socket.joinGroup(ip_address);
        byte[] byteBuffer=message.getBytes();
        packet = new DatagramPacket(byteBuffer,message.length(),ip_address,port); 
        socket.send(packet);
    }
    public static void main(String[] args) throws IOException {
        MulticastSender ms=new MulticastSender();
        ms.sendMessage(multi_ip, multi_port,"Yoyo!!! Multicasting Yehaaa!");
    }
}