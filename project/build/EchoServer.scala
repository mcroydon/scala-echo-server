import sbt._

class Finger(info: ProjectInfo) extends DefaultProject(info)
{
    val nettyRepo = "repository.jboss.org" at "http://repository.jboss.org/nexus/content/groups/public/"
    val netty = "org.jboss.netty" % "netty" % "3.2.3.Final"
    override def mainClass = Some("com.postneo.protocols.echo.EchoServer")
}
