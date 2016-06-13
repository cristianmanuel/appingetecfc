package Ingetec.Util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Util {

	public static HttpSession getSession(){
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}
	
	public static HttpServletRequest getRequest(){
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
	}
	
	
	public static void enviarCorreo(String nombreUsuario){
		
		final String username = "ingetec20@gmail.com";
		final String password = "peru2016";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
		
		try {

			Message message = new MimeMessage(session);
		//	message.setFrom(new InternetAddress("cristianmanuel.21@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(nombreUsuario));
			message.setSubject("Correo de prueba");
			message.setText("Hola buenas noches,"
				+ "\n\n por favor baje de peso");

			Transport.send(message);

			System.out.println("Correo enviado...");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	
	
	
}
