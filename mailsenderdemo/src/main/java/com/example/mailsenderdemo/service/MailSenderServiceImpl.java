package com.example.mailsenderdemo.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.mailsenderdemo.pojo.Mail;

@Service
public class MailSenderServiceImpl implements MailSenderService {
	@Autowired
	JavaMailSender mailSender;

	@Override
	public boolean sendMail(Mail mail) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		try {
			helper.setSubject(mail.getMailSubject());
			helper.setFrom(mail.getMailFrom());
			helper.setTo(mail.getMailTo());
			helper.setText(mail.getMailContent());
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		try {
			mailSender.send(mimeMessage);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}

	}

}
