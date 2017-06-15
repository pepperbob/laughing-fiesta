package de.byoc.javagroogy

import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes
import javax.inject.Inject

@ApplicationScoped
class BuilderOfMyMap {
	
  def map = [innermap:[type:'dunno']];
  
  def buildMap(@Observes SomeEvent e) {
    map << 
      [name: e.name()]
  }
  
  def falls(@Observes SomeOtherEvent event) {
    map.get('innermap') << 
      [intern: [thisis: "a new map"], language: event.type(), type: 'stfu']
  }
  
}

