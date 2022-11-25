package com.innotium.npouch.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class AccountRole {
	private int accountIdx;
	private int roleIdx;
	private int createAccountIdx;
	@JsonFormat
	(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private Date createDatetime;
}