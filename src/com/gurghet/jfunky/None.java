package com.gurghet.jfunky;

import java.util.function.Consumer;

public record None<T>() implements Opt<T> {
    @Override
    public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) {
        emptyAction.run();
    }

    @Override
    public T getOrElse(T other) {
        return other;
    }
}
