import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UpdServer {
    public static void main(String[] args) throws Exception {

        System.out.println("接收方启动中...");
//         * 1、使用DatagramSocket 指定端口 创建接收端
        DatagramSocket server = new DatagramSocket(9999);


//         * 2、准备容器 封装成DatagramPacket 包裹,需要指定目的地
        byte[] container = new byte[1024 * 60];
        DatagramPacket packet = new DatagramPacket(container, 0, container.length);

//         * 3、阻塞式接收包裹receive(DatagramPacket p)
        server.receive(packet);

//         * 4、分析数据
        byte[] datas = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(datas, 0, len));

//         * 5、释放资源
        server.close();

    }
}
