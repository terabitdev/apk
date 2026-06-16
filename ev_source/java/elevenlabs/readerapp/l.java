package io.elevenlabs.readerapp;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task token$lambda$1;
        token$lambda$1 = StaticAppCheckProvider.getToken$lambda$1(task);
        return token$lambda$1;
    }
}
