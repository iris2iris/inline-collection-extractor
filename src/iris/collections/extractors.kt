@file:Suppress("UNCHECKED_CAST")

/**
 * @author [Ivan Ivanov](https://vk.com/irisism)
 */

package iris.collections

inline fun <E, R> Iterable<E>.extract(
		filter: (item: E) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, @Suppress("UNCHECKED_CAST") map: (it: E) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <E, R> Array<E>.extract(
		filter: (item: E) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: E) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> IntArray.extract(
		filter: (item: Int) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Int) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> LongArray.extract(
		filter: (item: Long) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Long) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> CharArray.extract(
		filter: (item: Char) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Char) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> DoubleArray.extract(
		filter: (item: Double) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Double) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> FloatArray.extract(
		filter: (item: Float) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Float) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> ByteArray.extract(
		filter: (item: Byte) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Byte) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}

inline fun <R> ShortArray.extract(
		filter: (item: Short) -> Boolean = { true }
		, breakIfResult: (it: Collection<R>) -> Boolean = { false }
		, map: (it: Short) -> R = { it as R }): Collection<R>
{
	val result = mutableListOf<R>()
	for (item in this) {
		if (!filter(item))
			continue
		result += map(item)
		if (breakIfResult(result))
			return result
	}
	return result
}