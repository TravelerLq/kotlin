// "Replace with 'B<N>'" "true"
// WITH_RUNTIME

@Deprecated(message = "renamed", replaceWith = ReplaceWith("B<N>"))
typealias A<E> = List<E>

abstract class B<T> : List<T>
class F<G>

fun test() {
    var x: <caret>A<F<Int>>
}