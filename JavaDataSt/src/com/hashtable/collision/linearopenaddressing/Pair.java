package com.hashtable.collision.linearopenaddressing;

public class Pair <K,V>{
	
	private K k;
	private V v;
	public Pair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	public boolean keyEquals(Object o) {
		K key=(K) o;
		if(k.equals(key))return true;
		
		return false;
		
		
		
	}
	

}