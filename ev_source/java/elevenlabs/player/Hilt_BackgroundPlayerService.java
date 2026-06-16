package io.elevenlabs.player;

import ja.b3;
import ql.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public abstract class Hilt_BackgroundPlayerService extends b3 implements tl.b {
    private volatile k componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final k m1001componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public k createComponentManager() {
        return new k(this);
    }

    @Override // tl.b
    public final Object generatedComponent() {
        return m1001componentManager().generatedComponent();
    }

    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((BackgroundPlayerService_GeneratedInjector) generatedComponent()).injectBackgroundPlayerService((BackgroundPlayerService) this);
        }
    }

    @Override // ja.b3, androidx.lifecycle.e0, android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }
}
