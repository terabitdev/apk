package io.elevenlabs.readerapp.di;

import com.google.firebase.auth.FirebaseAuth;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/di/FirebaseModule;", "", "<init>", "()V", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FirebaseModule {
    public static final int $stable = 0;
    public static final FirebaseModule INSTANCE = new FirebaseModule();

    private FirebaseModule() {
    }

    public final FirebaseAuth firebaseAuth() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.getClass();
        return firebaseAuth;
    }
}
