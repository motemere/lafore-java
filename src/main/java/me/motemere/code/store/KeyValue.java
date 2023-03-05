package me.motemere.code.store;

/**
 * Key-value pair.
 */
public class KeyValue {

  /**
   * Key.
   */
  private String key;

  /**
   * Value.
   */
  private String value;

  /**
   * Create key-value pair with some key and value.
   *
   * @param s key
   * @param v value
   */
  public KeyValue(String s, String v) {
    this.key = s;
    this.value = v;
  }

  /**
   * Get key.
   *
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * Get value.
   *
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * Set key.
   *
   * @param s string key
   */
  public void setKey(String s) {
    this.key = s;
  }

  /**
   * Set value.
   *
   * @param v value
   */
  public void setValue(String v) {
    this.value = v;
  }

  /**
   * Get string representation of key-value pair.
   *
   * @return string representation of key-value pair
   */
  @Override
  public String toString() {
    return "KeyValue{"
        + "key='"
        + key
        + '\''
        + ", value='"
        + value
        + '\''
        + '}';
  }
}
