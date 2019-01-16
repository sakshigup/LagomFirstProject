package org.knoldus
import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import scala.concurrent.Future


class GreetingsServiceImpl extends GreetingsService {

  override def greet(name: String): ServiceCall[NotUsed, String] = ServiceCall{
    _ => Future.successful(s"Hi! $name")
  }

}
