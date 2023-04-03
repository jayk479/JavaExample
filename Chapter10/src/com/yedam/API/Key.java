package com.yedam.API;

public class Key {

	public int key;
	
	public Key(int key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return this.key;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.key == compareKey.key) {
				return true;
			}
		}
		return false;
	}
	
	
}
