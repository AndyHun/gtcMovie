/**
 * AbstractBaseService.java Nov 7, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.service.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;

import com.gtc.core.povo.PO;
import com.gtc.core.povo.VO;
import com.gtc.core.service.BaseService;

/**
 * @description
 * 
 * @author AndyHun
 * @version 1.0
 */
public class AbstractBaseService implements BaseService {

	protected Log log = LogFactory.getLog(getClass());

	@Override
	public void copyVO2PO(VO vo, PO po) {
		BeanUtils.copyProperties(vo, po);
	}
	
	@Override
	public void copyPO2VO(PO po, VO vo) {
		BeanUtils.copyProperties(po, vo);
		/*BeanCopier copy = BeanCopier.create(Bean.class, Bean2.class, false); 
	       Bean source = new Bean(); 
	       Bean2 target = new Bean2(); */
		// BeanUtils.copyProperties(vo, po);
	}
}
