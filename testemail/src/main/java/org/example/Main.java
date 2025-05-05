package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        final String username = "c52b494b621cb6";
        final String password = "8b34cdaa9fd5eb";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.mailtrap.io");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sender@example.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("testinbox@mailtrap.io"));
            message.setSubject("Test Email");
            message.setText("This is a test email to check Mailtrap integration.");

            Transport.send(message);
            System.out.println("✅ Test email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}