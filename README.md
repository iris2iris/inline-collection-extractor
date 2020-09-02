# Iris: Inline Collection Extractors

**Iris: Inline Collection Extractors** is a set of inline extension functions for primitive type arrays, collections and iterables in common.

It allows you to iterate through array only once and create only one result collection.

## Problem posed

Example of code:

```kotlin
val result = collection
    .filter{ it.name.contains("duck") }
    .map{ it.name }
    .take(10)
```

On this code there will be generated 3 lists, by one for each step.

## Solution and benefits over Sequence realization

Most of experienced programmers could say that problem can be solved with `Sequence` method. And they will be right. Most of the coders 
do it exactly that way. It is very flexible way to extract collection with generating only one collection in result.

But there is no any thing in the world **simpler than for-loops!**
 
And we go for it.

```kotlin
val result = collection.extract(
    filter = { it.name.contains("duck") }
    , map = { it.name }
    , breakIfResult = { it.size >= 10 }
)
```

🔥🔥🔥 Results show up to **100% performance increase**!

Just try it and give your feedback!
