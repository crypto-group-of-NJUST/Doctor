package com.lilin.client.utils;

import com.lilin.client.connection.ConnectionWithServer;

/**
 * @author lilin
 * @date 2019/10/10  -  9:13 下午
 */
public class ConnectionWithServerFactory {
    private static ConnectionWithServer connectionWithServer=null;
    private ConnectionWithServerFactory(){

    }
    public static ConnectionWithServer getConnectionWithServer() throws Exception {
        if (connectionWithServer==null) {
            connectionWithServer=new ConnectionWithServer();
            connectionWithServer.connect();
            return connectionWithServer;
        }else {
            return connectionWithServer;
        }

    }
}
