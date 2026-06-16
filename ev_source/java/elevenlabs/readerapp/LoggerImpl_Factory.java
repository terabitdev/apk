package io.elevenlabs.readerapp;

import io.elevenlabs.readerapp.core.CrashlyticsLogger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class LoggerImpl_Factory implements ul.c {
    private final ul.f crashlyticsLoggerProvider;

    private LoggerImpl_Factory(ul.f fVar) {
        this.crashlyticsLoggerProvider = fVar;
    }

    public static LoggerImpl_Factory create(ul.f fVar) {
        return new LoggerImpl_Factory(fVar);
    }

    public static LoggerImpl newInstance(CrashlyticsLogger crashlyticsLogger) {
        return new LoggerImpl(crashlyticsLogger);
    }

    @Override // rn.a
    public LoggerImpl get() {
        return newInstance((CrashlyticsLogger) this.crashlyticsLoggerProvider.get());
    }
}
