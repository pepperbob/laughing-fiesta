
package de.byoc.javagroogy;

import java.util.UUID;

import javax.enterprise.event.Event;
import javax.inject.Inject;


public class Publisher {
  
  @Inject
  private Event<Object> event;
  
  @Inject
  private BuilderOfMyMap mapper;
  
  public void publish() {
    event.fire(new SomeEvent(UUID.randomUUID().toString()));
    event.fire(new SomeOtherEvent("UNPAINTED"));
  }
  
  public String sayHello() {
    return "Hello " + mapper.getMap();
  }
    
}
