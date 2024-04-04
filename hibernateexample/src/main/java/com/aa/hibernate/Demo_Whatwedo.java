package com.aa.hibernate;

public class Demo_Whatwedo {
	/*
	 * 1. we have to change system library - go build path - library- then change
	 * jre to 18

	 */

	/*
	 * Exception in thread "main"
	 * org.hibernate.internal.util.config.ConfigurationException: Could not locate
	 * cfg.xml resource [hibernate.cfg.xml] at
	 * org.hibernate.boot.cfgxml.internal.ConfigLoader.loadConfigXmlResource(
	 * ConfigLoader.java:53) ---------------
	 * 
	 * solution - -------give hibernate.cfg.xml ka pacakge location dena hoga
	 * 
	 *   like ---- /com/aa/hibernate/hibernate.cfg.xml
	 */
	/*
	 * Caused by: java.lang.ClassNotFoundException: Could not load requested class :
	 * org.hibernate.dialect.MYSQLDialect
	 * 
	 * ----- change MYSQLDialect -- to - MySQLDialect
	 * 
	 */
}

