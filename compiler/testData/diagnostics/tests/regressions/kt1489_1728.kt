package kt606_dependents

//KT-1489 Code analyzer fails with assertion
trait AutoCloseable{
    fun close()
}

class C {
    class Resource : AutoCloseable {
        override fun close() {
            throw UnsupportedOperationException()
        }
    }

    fun foo<X : AutoCloseable>(<!UNUSED_PARAMETER!>x<!> : X, <!UNUSED_PARAMETER!>body<!> : (X) -> Unit) {
    }

    fun p() : Resource? = null

    fun bar() {
        <!TYPE_INFERENCE_FAILED!>foo(<!TYPE_MISMATCH!>p()<!>) {

        }<!>
    }
}

//KT-1728 Can't invoke extension property as a function

val Int.ext : () -> Int = { 5 }
val x = 1.ext()