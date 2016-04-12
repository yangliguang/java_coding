package test;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年3月23日上午10:04:55
 */
public class Entry<K,V> {
	final K key;
	V value;
	Entry<K,V> next; //next节点
	
	//构造函数
	public Entry(K k, V v, Entry<K,V> n){
		key = k;
		value = v;
		next = n;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Entry))
			return false;
		Entry<K,V> e = (Entry<K,V>)o;
		Object k = e.getKey();
		Object v = e.getValue();
		if(k == this.getKey() || (k != null && k.equals(this.getKey()))){
			if(v == this.getValue() || (k != null && k.equals(this.getValue())))
				return true;
		}
		return false;
	}
	
	public final int hashCode(){
		return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
	}
	
	
	
	public final V getValue() {
		return value;
	}

	public final void setValue(V value) {
		this.value = value;
	}

	public final Entry<K, V> getNext() {
		return next;
	}

	public final void setNext(Entry<K, V> next) {
		this.next = next;
	}

	public final K getKey() {
		return key;
	}

	
	
	
	
	

	
	
	
	
	
	
	
	
}
