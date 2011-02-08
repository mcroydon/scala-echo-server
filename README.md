# scala-echo-server

This is a Scala port of [EchoServer](http://docs.jboss.org/netty/3.2/xref/org/jboss/netty/example/echo/EchoServer.html)
and [EchoServerHandler](http://docs.jboss.org/netty/3.2/xref/org/jboss/netty/example/echo/EchoServerHandler.html) from
the [Netty documentation](http://www.jboss.org/netty/documentation).

To run the example, make sure you have [Scala](http://www.scala-lang.org/) and [simple-build-tool](http://code.google.com/p/simple-build-tool/)
installed, then:

    $ sbt clean update compile run

This should download Netty, compile the code and start the echo server:

    [info] Building project echo 0.2.1-SNAPSHOT against Scala 2.8.1
    ...
    [info] Running com.postneo.protocols.echo.EchoServer

You can now telnet to the echo server and enter a line of text to be echoed back:

    $ telnet 127.0.0.1 8888
    Trying 127.0.0.1...
    Connected to localhost.
    Escape character is '^]'.
    hello?
    hello?

The server implementation can be found in `src/main/scala/com/postneo/protocols/echo/EchoServer.scala` and
the handler is in `src/main/scala/com/postneo/protocols/echo/EchoServer.scala`.
