package com.shyding.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shimizukenta.secs.SecsException;
import com.shimizukenta.secs.SecsMessage;
import com.shimizukenta.secs.ext.annotation.SecsMsgListener;
import com.shimizukenta.secs.ext.annotation.Sf;
import com.shimizukenta.secs.ext.config.AbstractSecsMsgListener;
import com.shimizukenta.secs.secs2.Secs2;

@SecsMsgListener

public class HsmsMessageHandler extends AbstractSecsMsgListener {

	private final Logger logger = LoggerFactory.getLogger(HsmsMessageHandler.class);

	
	@Sf(s = 1 , f = 1)
	public  void  receive(SecsMessage msg) {
		
		logger.info( "{}" ,msg);
		logger.info( "{}" ,msg);
		logger.info( "{}" ,msg);
		logger.info( "{}" ,msg);
		logger.info( "{}" ,msg);
		
		try {
			reply(msg, false, Secs2.ascii("helloword"));
		} catch (SecsException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
