package br.com.castrosoft.entities;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ORG_HIBERNATE_ID_UUID_GENERATOR = "org.hibernate.id.UUIDGenerator";
	public static final String UUID = "UUID";
	
}
