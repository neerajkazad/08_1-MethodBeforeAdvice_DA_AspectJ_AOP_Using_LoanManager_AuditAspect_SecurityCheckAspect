package com.mba.notes;

public class Notes {
	/**
	 * In this example you are writing two aspect class
	 * 1) AuditAspect
	 * 2) Security
	 * 
	 * and in the SpringBeanConfigurationFile(xml fle) we are writing two aspect tag like the below code:
	 * 
	 *  <aop:aspect ref="auditAspect">
	 *   	<aop:before method="audit" pointcut="execution(* com.mba.beans.*.*(..))"/>
	 *  </aop:aspect>
	 *	
	 *	<aop:aspect ref="securityCheckAspect">
	 *		<aop:before method="check" pointcut="execution(* com.mba.beans.*.*(..))"/>
	 *	</aop:aspect>
	 *	
	 *  So if we want we can write the both the aspect class advice method in one single aspect if you notice that
	 *  AuditAspect and SecurityCheckAspect both are the part of Security only so in the next example we are just 
	 *  combining the both aspect and give the name "SecurityAspect" that contains two advice method
	 *  1) audit
	 *  2) check/varify
	 *	
		
	 */
}
