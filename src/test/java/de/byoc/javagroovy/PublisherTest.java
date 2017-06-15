package de.byoc.javagroovy;

import javax.inject.Inject;

import de.byoc.javagroogy.Publisher;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)

public class PublisherTest {

  @Inject
  private Publisher cut;
  
  @Test
  public void test() {
    cut.publish();
    
    System.out.println(cut.sayHello());
  }
  
}
