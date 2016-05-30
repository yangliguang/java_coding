package leetcode;

import java.util.Iterator;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月30日上午10:03:33
 */
public class NO_284 implements Iterator<Integer>{
	Iterator<Integer> it;
	Integer peek;
	
	public NO_284(Iterator<Integer> iterator) {
	    it = iterator;
	    peek = it.hasNext() ? it.next() : null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(peek == null)
			throw new java.util.NoSuchElementException();
		Integer ret = peek;
		peek = it.hasNext() ? it.next() : null;
		return ret;
	}

	@Override
	public boolean hasNext() {
		return peek != null;
	}

	//add by Young
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
