package com.hashtable.collision.linearopenaddressing;


public class Executer {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(6,new ModHash());
		
		table.put(1700, "alaa");
		table.put(1211, "walaa");
		table.put(545, "alaa");
		table.put(879, "walaa");
		table.put(845, "alaa");
		System.out.println(table.put(474, "walaa"));
		System.out.println(table.put(454, "walaa"));// full
		System.out.println(table.get(474));

	}

}
