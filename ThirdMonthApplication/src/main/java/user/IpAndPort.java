package user;

import java.util.Scanner;

public class IpAndPort {

    public static String[] arr = new String[2];

    public static void IpAndPort() {
        System.out.println("Enter ip and port you want sending to(localhost:5678):");
        Scanner sc2 = new Scanner(System.in);
        String ipAndPort = sc2.nextLine();

        arr = ipAndPort.split(":");
    }

    public static String getIp() {
        String ip = arr[0];
        return ip;
    }

    public static int getPort() {
        int port = Integer.parseInt(arr[1]);
        return port;
    }

    public static String fileLocation() {
        System.out.println("Enter the location of file which you want to send: ");
        Scanner sc = new Scanner(System.in);
        String fileLocation = sc.nextLine();
        return fileLocation;
    }
}
