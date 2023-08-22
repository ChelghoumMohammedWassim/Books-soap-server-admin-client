package server;

import service.*;

import javax.xml.ws.Endpoint;

public class booksServer {
    public static void main(String[] args) {
        String url="http://localhost:8180/";
        Endpoint.publish(url, new books());
        System.out.println(url);
        //new table().setAuteursList();
        //new Frame().setVisible(true);
        //http://localhost:8180/?wsdl
    }
}

