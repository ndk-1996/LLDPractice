package com.ndk.lldpractice.multithreading.atomicperfcheck;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

@Getter
public class AtomicPerfCheck extends PerfCheck {

    protected final AtomicLong atomicLong = new AtomicLong(0);

    @Override
    public Runnable getTask() {
        return () -> {
            for (int i = 0; i < numTimes; i++) {
                atomicLong.addAndGet(1);
            }
        };
    }
}
