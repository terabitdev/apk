package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import fr.d0;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory implements c {
    private final f activityRetainedLifecycleProvider;

    private ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory(f fVar) {
        this.activityRetainedLifecycleProvider = fVar;
    }

    public static d0 activityRetainedCoroutineScope(ll.a aVar) {
        d0 activityRetainedCoroutineScope = ActivityRetainedCoroutinesModule.INSTANCE.activityRetainedCoroutineScope(aVar);
        m0.n(activityRetainedCoroutineScope);
        return activityRetainedCoroutineScope;
    }

    public static ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory create(f fVar) {
        return new ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory(fVar);
    }

    @Override // rn.a
    public d0 get() {
        return activityRetainedCoroutineScope((ll.a) this.activityRetainedLifecycleProvider.get());
    }
}
