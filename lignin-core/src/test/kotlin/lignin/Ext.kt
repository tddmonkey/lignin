package lignin

import reactor.core.publisher.Mono

internal fun <T> Mono<T>.fetchValue() = block() ?: error("No value extracted from stream")
