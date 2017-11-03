package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.helper.AuthenticationHelper;

public class SecurityCheckAspect {
	private AuthenticationHelper authenticationHelper;
	
	public void check(JoinPoint joinPoint) throws IllegalAccessException {
		if(authenticationHelper.authenticate() == false) {
			throw new IllegalAccessException("Invalid username/password");
		}
	}
	public void setAuthenticationHelper(AuthenticationHelper authenticationHelper) {
		this.authenticationHelper = authenticationHelper;
	}
	
	
	
	
	
}
