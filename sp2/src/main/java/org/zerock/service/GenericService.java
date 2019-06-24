package org.zerock.service;

//VO타입과 KEY타입은 나중에 결정하는 것
public interface GenericService<VO, K> {
	
	public void register(VO vo);
	
	public VO get(K key);
	
	public int modify(VO vo);
	
	public int remove(K key);
	
}
