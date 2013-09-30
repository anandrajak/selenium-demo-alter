package com.hp.utility;

import java.net.InetAddress;

import org.apache.log4j.Logger;

import java.net.UnknownHostException;


public class HostUtils {

	
	private static Logger logger=Logger.getLogger(HostUtils.class);
	
	/**
	 * get the current host name
	 * @return String host name
	 */
	public static String getShortHostName() {

		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hostname;
	}

	/**
	 * get the host IP address
	 * @return string host ip address
	 */
	public static String getHostIP() {
		String hostip = null;
		try {
			hostip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return hostip;
	}

	/**
	 * get the host name with domain name ,like pdeauto17.fc.hp.com
	 * @return
	 */
	public static String getFQDN() {
		String fqdn = null;
		try {
			fqdn = InetAddress.getLocalHost().getCanonicalHostName().trim();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fqdn;
	}
	
   /**
    * get the current JAVA version in the host
 * @return
 */
public static String getJREType(){
	   String jretype=System.getProperty("os.arch");
	   logger.info("The JRE architecture is: "+jretype);
	   return jretype;
   }
   
   /**
    * get the os type ,like 32 bit or 64 bit
 * @return
 */
public static String getOSType(){
	  // SystemEnvironment env =SystemEnvironment.getSystemEnvironment();
		 //   final String envArch = env.getOsArchitecture();
	   String ostype=System.getenv("PROCESSOR_ARCHITEW6432");
	   logger.info("The os original type is : "+ostype);
	   if(ostype.contains("64")){
		   return "64bit";
	   }
	   else{
		   return "32bit";
	   }
	
   }
   
   /**
    * get the operating system version
 * @return
 */
public static String getOperatingSystemName(){
	   String osname=System.getProperty("os.name");
	   logger.info("the Operating system name is:"+osname);
	   return osname;
   }
   
   /**
    * get the operation system os core version
 * @return
 */
public static String getOperatingSystemVersion(){
	   String osversion=System.getProperty("os.version");
	   logger.info("the Operating system version:"+osversion);
	   return osversion;
   }
}
