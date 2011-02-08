package com.postneo.protocols
package echo

import org.jboss.netty.buffer.ChannelBuffer
import org.jboss.netty.channel.{ChannelHandlerContext, ExceptionEvent, MessageEvent, SimpleChannelUpstreamHandler}

/**
 * A simple Netty handler.
 *
 * Ported from http://docs.jboss.org/netty/3.2/xref/org/jboss/netty/example/echo/EchoServerHandler.html
 */
class EchoHandler extends SimpleChannelUpstreamHandler {

    override def messageReceived(context: ChannelHandlerContext, e: MessageEvent): Unit = {
        e.getChannel().write(e.getMessage())
    }
    
    override def exceptionCaught(context: ChannelHandlerContext, e: ExceptionEvent): Unit =  {
        e.getChannel().close()
    }

}
