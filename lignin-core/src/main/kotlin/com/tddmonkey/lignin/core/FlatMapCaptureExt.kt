package com.tddmonkey.lignin.core

import reactor.core.publisher.Mono
import reactor.util.function.*

fun <INPUT, OUTPUT> Mono<INPUT>.flatMapCapture(op: (INPUT) -> Mono<OUTPUT>): Mono<Tuple2<INPUT, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input, it) }}

@JvmName("flatMapCapture2")
fun <INPUT1, INPUT2, OUTPUT> Mono<Tuple2<INPUT1, INPUT2>>.flatMapCapture(op: (Tuple2<INPUT1, INPUT2>) -> Mono<OUTPUT>): Mono<Tuple3<INPUT1, INPUT2, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, it) }}

@JvmName("flatMapCapture3")
fun <INPUT1, INPUT2, INPUT3, OUTPUT> Mono<Tuple3<INPUT1, INPUT2, INPUT3>>.flatMapCapture(op: (Tuple3<INPUT1, INPUT2, INPUT3>) -> Mono<OUTPUT>): Mono<Tuple4<INPUT1, INPUT2, INPUT3, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, input.t3, it) }}

@JvmName("flatMapCapture4")
fun <INPUT1, INPUT2, INPUT3, INPUT4, OUTPUT> Mono<Tuple4<INPUT1, INPUT2, INPUT3, INPUT4>>.flatMapCapture(op: (Tuple4<INPUT1, INPUT2, INPUT3, INPUT4>) -> Mono<OUTPUT>): Mono<Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, input.t3, input.t4, it) }}

@JvmName("flatMapCapture5")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, OUTPUT> Mono<Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5>>.flatMapCapture(op: (Tuple5<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5>) -> Mono<OUTPUT>): Mono<Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, it) }}

@JvmName("flatMapCapture6")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, OUTPUT> Mono<Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6>>.flatMapCapture(op: (Tuple6<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6>) -> Mono<OUTPUT>): Mono<Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, input.t6, it) }}

@JvmName("flatMapCapture7")
fun <INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7, OUTPUT> Mono<Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7>>.flatMapCapture(op: (Tuple7<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7>) -> Mono<OUTPUT>): Mono<Tuple8<INPUT1, INPUT2, INPUT3, INPUT4, INPUT5, INPUT6, INPUT7, OUTPUT>> =
    flatMap { input -> op(input).map { Tuples.of(input.t1, input.t2, input.t3, input.t4, input.t5, input.t6, input.t7, it) }}
