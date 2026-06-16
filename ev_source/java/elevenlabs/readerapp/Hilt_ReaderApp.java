package io.elevenlabs.readerapp;

import android.app.Application;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public abstract class Hilt_ReaderApp extends Application implements tl.b {
    private boolean injected = false;
    private final ql.g componentManager = new ql.g(new ql.h() { // from class: io.elevenlabs.readerapp.Hilt_ReaderApp.1
        @Override // ql.h
        public Object get() {
            return DaggerReaderApp_HiltComponents_SingletonC.builder().applicationContextModule(new rl.a(Hilt_ReaderApp.this)).build();
        }
    });

    @Override // tl.b
    public final Object generatedComponent() {
        return m1006componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            ((ReaderApp_GeneratedInjector) generatedComponent()).injectReaderApp((ReaderApp) this);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ql.g m1006componentManager() {
        return this.componentManager;
    }
}
