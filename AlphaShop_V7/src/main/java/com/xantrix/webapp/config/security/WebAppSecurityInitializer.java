package com.xantrix.webapp.config.security;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.multipart.support.MultipartFilter;

public class WebAppSecurityInitializer extends AbstractSecurityWebApplicationInitializer
{
	/*
	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) 
	{
		insertFilters(servletContext, new MultipartFilter());
	}
	*/

}
