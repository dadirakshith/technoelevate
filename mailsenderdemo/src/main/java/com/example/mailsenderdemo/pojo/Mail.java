package com.example.mailsenderdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {
	private String mailFrom;
	private String mailTo;
	private String mailSubject;
	private String mailContent;

}
