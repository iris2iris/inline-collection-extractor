@file:Suppress("UNCHECKED_CAST")

/**
 * @author [Ivan Ivanov](https://vk.com/irisism)
 */

package iris.collections

inline fun <E, R> Iterable<E>.extract(
		filter: (item: E) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, @Suppress("UNCHECKED_CAST") map: (it: E) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <E, R> Array<E>.extract(
		filter: (item: E) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: E) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> IntArray.extract(
		filter: (item: Int) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Int) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> LongArray.extract(
		filter: (item: Long) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Long) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> CharArray.extract(
		filter: (item: Char) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Char) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> DoubleArray.extract(
		filter: (item: Double) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Double) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> FloatArray.extract(
		filter: (item: Float) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Float) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> ByteArray.extract(
		filter: (item: Byte) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Byte) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}

inline fun <R> ShortArray.extract(
		filter: (item: Short) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Short) -> R = { it as R }
		, destination: MutableCollection<R> = mutableListOf()
): Collection<R> {
	for (item in this) {
		if (!filter(item))
			continue
		destination += map(item)
		if (breakIfResult(destination))
			return destination
	}
	return destination
}