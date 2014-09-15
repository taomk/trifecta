package com.ldaniels528.verify.support.messaging.logic

import com.ldaniels528.verify.support.messaging.logic.Operations._

/**
 * Message Evaluation
 * @author Lawrence Daniels <lawrence.daniels@gmail.com>
 */
trait MessageEvaluation {

  /**
   * Compiles the given operation into a condition
   * @param operation the given operation
   * @return a condition
   */
  def compile(operation: Operation): Condition

}