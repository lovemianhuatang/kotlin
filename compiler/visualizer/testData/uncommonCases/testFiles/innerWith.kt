package p

class A {
    val aProp = 10
}

class B {
    val bProp = 1
}

fun foo(a: Int, b: Int): Int {
    with(A()) {
        aProp

        with(B()) {
            aProp
            bProp
            aProp
        }
    }

    with(A()) {
        aProp

        with(B()) {
            aProp
            bProp
        }

        with(B()) {
            aProp
            bProp
        }
    }
    return a
}