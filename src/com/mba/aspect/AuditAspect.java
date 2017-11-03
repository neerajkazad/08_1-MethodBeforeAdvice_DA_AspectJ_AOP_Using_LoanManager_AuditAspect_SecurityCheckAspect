package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.helper.AuthenticationHelper;

public class AuditAspect {
	private AuthenticationHelper authenticationHelper;
	
	public void audit(JoinPoint joinPoint) {
		String methodName = null;
		Object[] args = null;
		args = joinPoint.getArgs();
		
		methodName = joinPoint.getSignature().getName();
		/*System.out.println(AuthenticationHelper.getInstance().getLoggedInUser()+" has accessed "+methodName+ " with loanNo "+args[0]);*/
		System.out.println(authenticationHelper.getLoggedInUser()+" has accessed "+methodName+ " with loanNo "+args[0]);
	}
	
	public void setAuthenticationHelper(AuthenticationHelper authenticationHelper) {
		this.authenticationHelper = authenticationHelper;
	}
}
