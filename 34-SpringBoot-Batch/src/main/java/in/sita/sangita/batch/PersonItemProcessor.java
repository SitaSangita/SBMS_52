package in.sita.sangita.batch;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import in.sita.sangita.rcord.Person;
@Component
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

  private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

  @Override
  public Person process(final Person person) {
    final String firstName = person.firstName().toUpperCase();
    final String lastName = person.lastName().toUpperCase();

    final Person transformedPerson = new Person(firstName, lastName);

    log.info("Converting ({}) into ({})", person, transformedPerson);

    return transformedPerson;
  }
  

}