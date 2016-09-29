public class Association implements Map.Entry {
	protected Object theKey;
	protected Object theValue;

	public Association(Object key, Object value) {
		Assert.pre(key != null, "Key must not be null.");
		theKey = key;
		theValue = value;
	}

	public Association(Object key) {
		this(key, null);
	}

	public Object getValue() {
		return theValue;
	}

	public Object getKey() {
		return theKey;
	}

	public Object setValue(Object value) {
		Object oldValue = theValue;
		theValue = value;
		return oldValue;
	}

}