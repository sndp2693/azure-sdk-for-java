package com.microsoft.rest.v2;

import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.http.NettyClient;
import com.microsoft.rest.v2.policy.RequestPolicy;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Collections;

public class RestProxyWithHttpProxyNettyTests extends RestProxyTests {
    private static NettyClient.Factory nettyClientFactory = new NettyClient.Factory();

    @Override
    protected HttpClient createHttpClient() {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8888);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
        return nettyClientFactory.create(new HttpClient.Configuration(Collections.<RequestPolicy.Factory>emptyList(), proxy));
    }
}
