package com.example.mailsenderdemo.service;

import com.example.mailsenderdemo.pojo.Mail;

public interface MailSenderService {
	boolean sendMail(Mail mail);
}
