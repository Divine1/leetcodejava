import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HttpServMain {

    public static void main(String[] args) throws IOException {

        startServer();
    }

    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
        server.createContext("/search",new WordCountHandler());
        Executor executor = Executors.newFixedThreadPool(3);
        server.setExecutor(executor);
        server.start();
    }

    private static class WordCountHandler implements HttpHandler{

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            System.out.printf("query %s\n ",query);

            if(query.contains("quit")){
                exchange.sendResponseHeaders(400,0);
                exchange.close();
                return;
            }
            double count = Math.random();
            System.out.println("count "+count);
            byte[] response = Double.toString(count).getBytes();
            exchange.sendResponseHeaders(200,response.length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();

        }
    }
}
