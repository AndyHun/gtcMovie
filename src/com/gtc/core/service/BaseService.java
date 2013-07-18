/**
 * BaseService.java Nov 7, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.service;

import com.gtc.core.povo.PO;
import com.gtc.core.povo.VO;


/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public interface BaseService {
	/**
	 * Copy property values from the VO to the PO for all cases where the
	 * property names are the same
	 * 
	 * @param vo VO
	 * @param po PO
	 */
	public void copyVO2PO(VO vo, PO po);
	
	/**
	 * Copy property values from the PO to the VO for all cases where the
	 * property names are the same
	 * 
	 * @param po
	 *            PO
	 * @param vo
	 *            VO
	 */
	public void copyPO2VO(PO po, VO vo);
}
