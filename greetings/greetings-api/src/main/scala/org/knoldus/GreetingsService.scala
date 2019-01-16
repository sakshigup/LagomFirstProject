package org.knoldus

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}

trait GreetingsService extends Service {

  def greet(name: String): ServiceCall[NotUsed, String]

  override final def descriptor = {
    import Service._
    // @formatter:off
    named("greetings")
      .withCalls(
        pathCall("/api/greetings/:name", greet _)
      ).withAutoAcl(true)
  }
}

