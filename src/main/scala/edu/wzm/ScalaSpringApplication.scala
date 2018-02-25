package edu.wzm

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.ComponentScan

/**
 * Hello world!
 *
 */
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
class Config

object ScalaSpringApplication extends App {
    SpringApplication.run(classOf[Config])
}
