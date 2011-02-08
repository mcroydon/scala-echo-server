package com.postneo.protocols
/**
 * Experimentation with Scala and Netty, implementing a very basic echo server using example
 * Java code from the Netty documentation.
 *
 * @author Matt Croydon
 * @version 0.2.1-SNAPSHOT
 */
package echo

import java.net.InetSocketAddress
import java.util.concurrent.Executors

import org.jboss.netty.bootstrap.ServerBootstrap
import org.jboss.netty.channel.{ChannelPipeline, ChannelPipelineFactory, Channels}
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory

/**
 * An echo server.
 *
 * Ported from http://docs.jboss.org/netty/3.2/xref/org/jboss/netty/example/echo/EchoServer.html
 */
object EchoServer {

    def main(args: Array[String]): Unit = {
        val executor = Executors.newCachedThreadPool()
        val factory = new NioServerSocketChannelFactory(executor, executor)
        val bootstrap = new ServerBootstrap(factory)
        val handler = new echo.EchoHandler()
        val pipeline = bootstrap.getPipeline()
        pipeline.addLast("handler", handler)
        bootstrap.bind(new InetSocketAddress(8888))
    }
}
