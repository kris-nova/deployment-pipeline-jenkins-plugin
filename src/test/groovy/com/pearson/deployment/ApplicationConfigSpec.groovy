package com.pearson.deployment

import spock.lang.*
import groovy.mock.interceptor.MockFor

class ApplicationConfigSpec extends Specification {

  def "test validation" () {
    def config = """
    applications:
      - name: something
    """
    // missing version
  }
}