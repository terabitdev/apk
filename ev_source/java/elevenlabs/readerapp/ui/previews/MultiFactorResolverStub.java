package io.elevenlabs.readerapp.ui.previews;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0015\b\u0016\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/previews/MultiFactorResolverStub;", "Lcom/google/firebase/auth/MultiFactorResolver;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "dest", "", "flags", "Lsn/z;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/google/firebase/auth/MultiFactorAssertion;", "p0", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "resolveSignIn", "(Lcom/google/firebase/auth/MultiFactorAssertion;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "Lcom/google/firebase/auth/MultiFactorSession;", "getSession", "()Lcom/google/firebase/auth/MultiFactorSession;", "", "Lcom/google/firebase/auth/MultiFactorInfo;", "getHints", "()Ljava/util/List;", "CREATOR", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MultiFactorResolverStub extends MultiFactorResolver {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MultiFactorResolverStub(Parcel parcel) {
        this();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public FirebaseAuth getFirebaseAuth() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public List<MultiFactorInfo> getHints() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public MultiFactorSession getSession() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public Task<AuthResult> resolveSignIn(MultiFactorAssertion p02) {
        p02.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        throw new UnsupportedOperationException();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/ui/previews/MultiFactorResolverStub$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lio/elevenlabs/readerapp/ui/previews/MultiFactorResolverStub;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lio/elevenlabs/readerapp/ui/previews/MultiFactorResolverStub;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.previews.MultiFactorResolverStub$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements Parcelable.Creator<MultiFactorResolverStub> {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiFactorResolverStub createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MultiFactorResolverStub(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MultiFactorResolverStub[] newArray(int size) {
            return new MultiFactorResolverStub[size];
        }
    }

    public MultiFactorResolverStub() {
    }

    public /* synthetic */ MultiFactorResolverStub(Parcel parcel, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : parcel);
    }
}
