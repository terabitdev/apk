package io.livekit.android.room;

import android.gov.nist.javax.sip.parser.TokenNames;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.c;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON;", "", "", "candidate", "", "sdpMLineIndex", "sdpMid", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/room/IceCandidateJSON;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lio/livekit/android/room/IceCandidateJSON;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCandidate", TokenNames.I, "getSdpMLineIndex", "getSdpMid", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class IceCandidateJSON {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String candidate;
    private final int sdpMLineIndex;
    private final String sdpMid;

    @c
    public /* synthetic */ IceCandidateJSON(int i10, String str, int i11, String str2, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.candidate = str;
            this.sdpMLineIndex = i11;
            this.sdpMid = str2;
            return;
        }
        t0.j(i10, 7, IceCandidateJSON$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ IceCandidateJSON copy$default(IceCandidateJSON iceCandidateJSON, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iceCandidateJSON.candidate;
        }
        if ((i11 & 2) != 0) {
            i10 = iceCandidateJSON.sdpMLineIndex;
        }
        if ((i11 & 4) != 0) {
            str2 = iceCandidateJSON.sdpMid;
        }
        return iceCandidateJSON.copy(str, i10, str2);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(IceCandidateJSON self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.candidate);
        output.P(1, self.sdpMLineIndex, serialDesc);
        output.o(serialDesc, 2, g1.f34588a, self.sdpMid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSdpMid() {
        return this.sdpMid;
    }

    public final IceCandidateJSON copy(String candidate, int sdpMLineIndex, String sdpMid) {
        candidate.getClass();
        return new IceCandidateJSON(candidate, sdpMLineIndex, sdpMid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceCandidateJSON)) {
            return false;
        }
        IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) other;
        if (m.c(this.candidate, iceCandidateJSON.candidate) && this.sdpMLineIndex == iceCandidateJSON.sdpMLineIndex && m.c(this.sdpMid, iceCandidateJSON.sdpMid)) {
            return true;
        }
        return false;
    }

    public final String getCandidate() {
        return this.candidate;
    }

    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    public final String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        int hashCode;
        int b10 = j0.c.b(this.sdpMLineIndex, this.candidate.hashCode() * 31, 31);
        String str = this.sdpMid;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return b10 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IceCandidateJSON(candidate=");
        sb.append(this.candidate);
        sb.append(", sdpMLineIndex=");
        sb.append(this.sdpMLineIndex);
        sb.append(", sdpMid=");
        return f.m(sb, this.sdpMid, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/IceCandidateJSON;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return IceCandidateJSON$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IceCandidateJSON(String str, int i10, String str2) {
        str.getClass();
        this.candidate = str;
        this.sdpMLineIndex = i10;
        this.sdpMid = str2;
    }
}
