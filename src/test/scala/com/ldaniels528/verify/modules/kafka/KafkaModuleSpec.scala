package com.ldaniels528.verify.modules.kafka

import org.mockito.Mockito.{when => when$}
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterEach, FeatureSpec, GivenWhenThen}

/**
 * Kafka Module Specification
 * @author Lawrence Daniels <lawrence.daniels@gmail.com>
 */
class KafkaModuleSpec() extends FeatureSpec with BeforeAndAfterEach with GivenWhenThen with MockitoSugar {
  /*
private val config = new VxConfig()
private val zk = mock[ZKProxy]
private val rt = new VxRuntimeContext(config, zk)

when$(zk.getChildren("")).thenAnswer(Seq[String](), Nil:_*)


info("As a Kafka Module")
info("I want to be able to execute Kafka Module commands")

feature("The 'kbrokers' command provides a list of brokers from Zookeeper") {
  scenario("The command executes without parameters") {
    Given("a Kafka Module")
    val module = new KafkaModule(rt)

    And("a Zookeeper environment")
    val ctx = new Object()
    val data = """{"controller_epoch":3,"leader":1,"version":1,"leader_epoch":0,"isr":[1]}""".getBytes("UTF-8")
    val paths = (0 to 4).map(n => s"/brokers/topics/test2.Shocktrade.quotes.avro/partitions/$n/state")


    When("the 'brokers' command is executed")
    val result = module.getBrokers(UnixLikeArgs(Some("brokers"), Nil))

    Then("The tokens are transformed into Unix-style parameters")
    result.isEmpty shouldBe false
  }
}


feature("Ability to perform a recursive delete of a path in Zookeeper (zrm -r))") {
  scenario("Recursively delete a path from Zookeeper") {
    Given("The initial Zookeeper environment")
    if (zk.exists("/consumers").isEmpty) {
      zk.ensurePath("/consumers/otherTestId")
      zk.ensurePath("/consumers/myTestId/someSubPath")
    }
    if (zk.exists("/brokers").isEmpty) zk.ensurePath("/brokers/ids")

    Given("A Verify Run-time Context")
    val rt = VxRuntimeContext(zk)

    Given("A Zookeeper key/path")
    val module = new ZookeeperModule(rt)

    When("Executing the recursive delete function")
    module.delete(UnixLikeArgs(Nil, Map("-r" -> Option("/consumers/myTestId"))))

    And("The path (and its children) should no longer exist")
    val results = rt.zkProxy.getChildren("/consumers")
    assert(results sameElements Seq("otherTestId"))
    rt.zkProxy.close()
  }
}

  // all tests are complete, close resources
  Try(zk.close())    */

}
