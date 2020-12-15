package com.tddmonkey.lignin.core

import reactor.core.publisher.Mono
import reactor.util.function.*

fun <INPUT, OUTPUT> Mono<INPUT>.mapCapture(op: (INPUT) -> OUTPUT): Mono<Tuple2<INPUT, OUTPUT>> =
    map { input -> Tuples.of(input, op(input)) }

@JvmName("mapCapture2")
fun <INPUT1, INPUT2, OUTPUT> Mono<Tuple2<INPUT1, INPUT2>>.mapCapture(op: (Tuple2<INPUT1, INPUT2>) -> OUTPUT): Mono<Tuple3<INPUT1, INPUT2, OUTPUT>> =
    map { input -> Tuples.of(input.t1, input.t2, op(input)) }

@JvmName("mapCapture3")
fun <INPUT1, INPUT2, INPUT3, OUTPUT> Mono<Tuple3<INPUT1, INPUT2, INPUT3>>.mapCapture(op: (Tuple3<INPUT1, INPUT2, INPUT3>) -> OUTPUT): Mono<Tuple4<INPUT1, INPUT2, INPUT3, OUTPUT>> =
     map { input -> Tuples.of(input.t1, input.t2, input.t3, op(input)) }

@JvmName("mapCapture4")
fun <INPUT1, INPUT2, INPUT3, INPUT4, OUTPUT> Mono<Tuple4<INPUT1, INPUT2, INPUT3, INPUT4>>.mapCapture(op: (Tuple4<INPUT1, INPUT2, INPUT3, INPUT4>) -> OUTPUT): Mono<Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, OUTPUT>> =
    map { input -> Tuples.of(input.t1, input.t2, input.t3, input.t4, op(input)) }

@JvmName("mapCapture5")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, OUTPUT> Mono<Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5>>.mapCapture(op: (Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5>) -> OUTPUT): Mono<Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, OUTPUT>> =
    map { input -> Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, op(input)) }

@JvmName("mapCapture6")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, OUTPUT> Mono<Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6>>.mapCapture(op: (Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6>) -> OUTPUT): Mono<Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, OUTPUT>> =
    map { input -> Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, input.t6, op(input)) }

@JvmName("mapCapture7")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7, OUTPUT> Mono<Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7>>.mapCapture(op: (Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7>) -> OUTPUT): Mono<Tuple8<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7, OUTPUT>> =
    map { input -> Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, input.t6, input.t7, op(input)) }
