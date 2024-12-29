package in.sangitaIT.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import in.sangitaIT.entity.Email;
import in.sangitaIT.interf.EmailSeviceIntef;
import in.sangitaIT.repo.EmailRepo;
import jakarta.mail.MessagingException;

@Service
public class EmailSeviceImpl implements EmailSeviceIntef {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailRepo emailRepo;

    @Override
    public void sendEmail(Email email) throws MessagingException {
        // Save the message to the database
        emailRepo.save(email);

        // Send email
        var mimeMessage = mailSender.createMimeMessage();
        var helper = new MimeMessageHelper(mimeMessage, "utf-8");

        helper.setTo(email.getEmail());
        helper.setSubject(email.getSubject());
        helper.setText("Dear " + email.getName() + ",\n\n" + email.getMessage(), false);

        mailSender.send(mimeMessage);  // Send the email
    }
}
