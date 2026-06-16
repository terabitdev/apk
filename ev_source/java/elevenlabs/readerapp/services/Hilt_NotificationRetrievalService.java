package io.elevenlabs.readerapp.services;

import com.google.firebase.messaging.FirebaseMessagingService;
import ql.k;
import tl.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public abstract class Hilt_NotificationRetrievalService extends FirebaseMessagingService implements b {
    private volatile k componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final k m1020componentManager() {
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
        return m1020componentManager().generatedComponent();
    }

    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((NotificationRetrievalService_GeneratedInjector) generatedComponent()).injectNotificationRetrievalService((NotificationRetrievalService) this);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }
}
