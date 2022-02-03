package com.example.mailsenderdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailsenderdemo.pojo.Mail;
import com.example.mailsenderdemo.response.MailSenderResponse;
import com.example.mailsenderdemo.service.MailSenderService;

@RestController
@RequestMapping("/api/v1/")
public class MailSenderController {
	@Autowired
	private MailSenderService mailService;

	@PostMapping("sendMail")
	public ResponseEntity<MailSenderResponse> sendMail(@RequestBody Mail mail) {
		if (mailService.sendMail(mail))
			return new ResponseEntity<MailSenderResponse>(new MailSenderResponse(false, "Mail Sent", mail),
					HttpStatus.OK);
		else
			return new ResponseEntity<MailSenderResponse>(new MailSenderResponse(true, "Mail not Sent", mail),
					HttpStatus.BAD_REQUEST);
	}
}
