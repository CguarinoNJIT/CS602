import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {
    private static final int multi_port = 1200;
    private static final String multi_ip = "225.4.5.6";
    MulticastSocket socket;
    DatagramPacket packet;
    InetAddress address;  


    private String receiveMessage(String ip, int port) throws IOException{
        address = InetAddress.getByName(multi_ip);
        socket = new MulticastSocket(port);
        socket. joinGroup( address);
        byte[] data = new byte[1450];
        packet = new DatagramPacket(data, data.length);
        socket.receive(packet);
        String message = new String(packet.getData());
        String packetAddress = packet.getAddress().getHostAddress();
        int packetPort = packet.getPort();
        int messageLength = packet.getLength();
        String str = "\n Message Received : " + message + "\n Address : " + packet.getAddress().toString() + "\n Port : " + packet.getPort() + "\n Length of Message : " + packet.getLength();
        return str;
    }
    public static void main(String[] args) throws IOException {
    MulticastReceiver mr = new MulticastReceiver();
    System.out.println(mr.receiveMessage(multi_ip, multi_port));
    }
}
