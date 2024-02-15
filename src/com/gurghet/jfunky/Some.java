package com.gurghet.jfunky;

import java.util.function.Consumer;

public record Some<T>(T value) implements Opt<T> {
    @Override
    public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) {
        action.accept(value);
    }

    @Override
    public T getOrElse(T other) {
        return value;
    }
}
