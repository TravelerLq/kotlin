package test

actual class C {
    actual fun foo(/*rename*/n: Int) {

    }
}

fun test(c: C) {
    c.foo(1)
    c.foo(n = 1)
}