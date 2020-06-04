package com.home.studentmgmt.services;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Not Found")  // 404
public class NotFoundException extends RuntimeException {


}
