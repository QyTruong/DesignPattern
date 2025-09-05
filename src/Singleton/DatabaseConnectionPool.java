package Singleton;

import java.util.LinkedList;
import java.util.Queue;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private Queue<Connection> conns;
    private int quantity = 3; // Have 3 connections in 1 pool

    private DatabaseConnectionPool(){
        conns = new LinkedList<>();
        for (int i = 1; i <= this.quantity; i++){
            conns.add(new Connection("number " + i));
        }
    }

    public static DatabaseConnectionPool getInstance(){
        if (instance == null){
            synchronized (DatabaseConnectionPool.class){
                if (instance == null)
                    instance = new DatabaseConnectionPool();
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if (conns.isEmpty())
            throw new RuntimeException("No available connections");

        return conns.poll();
    }

    public void releaseConnection(Connection c){
        conns.add(c);
    }
}
