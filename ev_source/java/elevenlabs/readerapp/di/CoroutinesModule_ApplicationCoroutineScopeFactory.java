package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import fr.d0;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CoroutinesModule_ApplicationCoroutineScopeFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final CoroutinesModule_ApplicationCoroutineScopeFactory INSTANCE = new CoroutinesModule_ApplicationCoroutineScopeFactory();

        private InstanceHolder() {
        }
    }

    public static d0 applicationCoroutineScope() {
        d0 applicationCoroutineScope = CoroutinesModule.INSTANCE.applicationCoroutineScope();
        m0.n(applicationCoroutineScope);
        return applicationCoroutineScope;
    }

    public static CoroutinesModule_ApplicationCoroutineScopeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // rn.a
    public d0 get() {
        return applicationCoroutineScope();
    }
}
