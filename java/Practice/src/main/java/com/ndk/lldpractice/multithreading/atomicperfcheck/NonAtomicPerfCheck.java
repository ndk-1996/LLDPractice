package com.ndk.lldpractice.multithreading.atomicperfcheck;

import lombok.Getter;

@Getter
public class NonAtomicPerfCheck extends PerfCheck {

    private Long val = 0L;

    @Override
    public Runnable getTask() {
        return () -> {
            for (int i = 0; i < numTimes; i++) {
                increment(1);
            }
        };
    }

    private synchronized void increment(int inc) {
        val = val + inc;
    }
}
