package com.example.mailsenderdemo.response;

import com.example.mailsenderdemo.pojo.Mail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailSenderResponse {
	private boolean error;
	private String message;
	private Mail mail;
}
