package in.sangitaIT.interf;

import in.sangitaIT.entity.Email;
import jakarta.mail.MessagingException;

public interface EmailSeviceIntef {
	
	  public void sendEmail(Email email) throws MessagingException;
}
