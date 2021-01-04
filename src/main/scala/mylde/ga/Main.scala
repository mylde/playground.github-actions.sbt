package mylde.ga

import com.google.inject.{AbstractModule, Guice}

/**
 */
object Main extends App {{
  println(Guice.createInjector(new Module).getInstance(classOf[Main]).run())
}}

/**
 */
class Main {
  def run(): String = {
    "Hello"
  }
}

/**
 */
class Module extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[Main]).toInstance(new Main)
  }
}
