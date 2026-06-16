package io.livekit.android.e2ee;

import as.l7;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/e2ee/E2EEOptions;", "", "Lio/livekit/android/e2ee/KeyProvider;", "keyProvider", "Las/l7;", "encryptionType", "<init>", "(Lio/livekit/android/e2ee/KeyProvider;Las/l7;)V", "Lio/livekit/android/e2ee/KeyProvider;", "getKeyProvider", "()Lio/livekit/android/e2ee/KeyProvider;", "setKeyProvider", "(Lio/livekit/android/e2ee/KeyProvider;)V", "Las/l7;", "getEncryptionType", "()Las/l7;", "setEncryptionType", "(Las/l7;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class E2EEOptions {
    private l7 encryptionType;
    private KeyProvider keyProvider;

    public /* synthetic */ E2EEOptions(KeyProvider keyProvider, l7 l7Var, int i10, f fVar) {
        this((i10 & 1) != 0 ? new BaseKeyProvider(E2EEOptionsKt.defaultRatchetSalt, E2EEOptionsKt.defaultMagicBytes, 16, true, -1, 16, false) : keyProvider, (i10 & 2) != 0 ? l7.GCM : l7Var);
    }

    public final l7 getEncryptionType() {
        return this.encryptionType;
    }

    public final KeyProvider getKeyProvider() {
        return this.keyProvider;
    }

    public final void setEncryptionType(l7 l7Var) {
        l7Var.getClass();
        this.encryptionType = l7Var;
    }

    public final void setKeyProvider(KeyProvider keyProvider) {
        keyProvider.getClass();
        this.keyProvider = keyProvider;
    }

    public E2EEOptions(KeyProvider keyProvider, l7 l7Var) {
        keyProvider.getClass();
        l7Var.getClass();
        this.keyProvider = keyProvider;
        this.encryptionType = l7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E2EEOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
