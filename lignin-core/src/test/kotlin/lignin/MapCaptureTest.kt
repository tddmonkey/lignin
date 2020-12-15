package lignin

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.tddmonkey.lignin.core.mapCapture
import org.junit.jupiter.api.Test
import reactor.core.publisher.Mono
import reactor.util.function.*

class MapCaptureTest {
    @Test
    fun mapsInputIntoTuple2() {
        val output: Tuple2<Int, Int> = Mono.just(1)
            .mapCapture(add(2))
            .fetchValue()
        assertThat(output, equalTo(Tuples.of(1, 2)))
    }

    @Test
    fun mapsTuple2InputIntoTuple3() {
        val output: Tuple3<String, Int, String> = Mono.just("First String")
            .mapCapture(add(1))
            .mapCapture(add("Second String"))
            .fetchValue()
        assertThat(output, equalTo(Tuples.of("First String", 1, "Second String")))
    }

    @Test
    fun mapsTuple3InputIntoTuple4() {
        val output: Tuple4<Int, String, Int, String> = Mono.just(1)
            .mapCapture(add("First String"))
            .mapCapture(add(2))
            .mapCapture(add("Second String"))
            .fetchValue()

        assertThat(output, equalTo(Tuples.of(1, "First String", 2, "Second String")))
    }

    @Test
    fun mapsTuple4InputIntoTuple5() {
        val output: Tuple5<Int, Int, Int, String, User> = Mono.just(1)
            .mapCapture(add(2))
            .mapCapture(add(3))
            .mapCapture(add("First String"))
            .mapCapture(add(user("Bob")))
            .fetchValue()

        assertThat(output, equalTo(Tuples.of(1, 2, 3, "First String", user("Bob"))))
    }

    @Test
    fun mapsTuple5InputIntoTuple6() {
        val output: Tuple6<Int, Int, Int, String, User, Int> = Mono.just(1)
            .mapCapture(add(2))
            .mapCapture(add(3))
            .mapCapture(add("First String"))
            .mapCapture(add(user("Bob")))
            .mapCapture(add(4))
            .fetchValue()

        assertThat(output, equalTo(Tuples.of(1, 2, 3, "First String", user("Bob"), 4)))
    }

    @Test
    fun mapsTuple6InputIntoTuple7() {
        val output: Tuple7<Int, Int, Int, String, User, Int, String> = Mono.just(1)
            .mapCapture(add(2))
            .mapCapture(add(3))
            .mapCapture(add("First String"))
            .mapCapture(add(user("Bob")))
            .mapCapture(add(4))
            .mapCapture(add("7th String of a 7th String"))
            .fetchValue()

        assertThat(output, equalTo(Tuples.of(1, 2, 3, "First String", user("Bob"), 4, "7th String of a 7th String")))
    }

    @Test
    fun mapsTuple7InputIntoTuple8() {
        val output: Tuple8<Int, Int, Int, String, User, Int, String, User> = Mono.just(1)
            .mapCapture(add(2))
            .mapCapture(add(3))
            .mapCapture(add("First String"))
            .mapCapture(add(user("Bob")))
            .mapCapture(add(4))
            .mapCapture(add("7th String of a 7th String"))
            .mapCapture(add(user("Mary")))
            .fetchValue()

        assertThat(output, equalTo(Tuples.of(1, 2, 3, "First String", user("Bob"), 4, "7th String of a 7th String", user("Mary"))))
    }

    fun <T> add(value: T): (Any) -> T = { value }
}