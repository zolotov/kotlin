package kotlin.test

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: IntArray, block: ()-> IntArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: IntArray, message: String, block: ()-> IntArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: LongArray, block: ()-> LongArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: LongArray, message: String, block: ()-> LongArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: ShortArray, block: ()-> ShortArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: ShortArray, message: String, block: ()-> ShortArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: ByteArray, block: ()-> ByteArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: ByteArray, message: String, block: ()-> ByteArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: FloatArray, block: ()-> FloatArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: FloatArray, message: String, block: ()-> FloatArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: DoubleArray, block: ()-> DoubleArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: DoubleArray, message: String, block: ()-> DoubleArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: BooleanArray, block: ()-> BooleanArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: BooleanArray, message: String, block: ()-> BooleanArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}

/** Asserts that given function block returns the given expected array */
public inline fun expect(expected: CharArray, block: ()-> CharArray) {
    expect(expected, block.toString(), block)
}

/** Asserts that given function block returns the given expected array and use the given message if it fails */
public inline fun expect(expected: CharArray, message: String, block: ()-> CharArray) {
    val actual = block()
    assertTrue(java.util.Arrays.equals(expected, actual), message)
}
