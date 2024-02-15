package com.gurghet.jfunky;

import java.util.function.Consumer;

public sealed interface Opt<T> permits Some, None {
    void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction);
    T getOrElse(T other);
}

