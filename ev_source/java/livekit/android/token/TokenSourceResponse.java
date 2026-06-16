package io.livekit.android.token;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/livekit/android/token/TokenSourceResponse;", "", "", "serverUrl", "participantToken", "roomName", "participantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/token/TokenSourceResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/livekit/android/token/TokenSourceResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerUrl", "getParticipantToken", "getRoomName", "getParticipantName", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class TokenSourceResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String participantName;
    private final String participantToken;
    private final String roomName;
    private final String serverUrl;

    @c
    public /* synthetic */ TokenSourceResponse(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.serverUrl = str;
            this.participantToken = str2;
            if ((i10 & 4) == 0) {
                this.roomName = null;
            } else {
                this.roomName = str3;
            }
            if ((i10 & 8) == 0) {
                this.participantName = null;
                return;
            } else {
                this.participantName = str4;
                return;
            }
        }
        t0.j(i10, 3, TokenSourceResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ TokenSourceResponse copy$default(TokenSourceResponse tokenSourceResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenSourceResponse.serverUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenSourceResponse.participantToken;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenSourceResponse.roomName;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenSourceResponse.participantName;
        }
        return tokenSourceResponse.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(TokenSourceResponse self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.serverUrl);
        output.V(serialDesc, 1, self.participantToken);
        if (output.C(serialDesc) || self.roomName != null) {
            output.o(serialDesc, 2, g1.f34588a, self.roomName);
        }
        if (output.C(serialDesc) || self.participantName != null) {
            output.o(serialDesc, 3, g1.f34588a, self.participantName);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParticipantToken() {
        return this.participantToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    public final TokenSourceResponse copy(String serverUrl, String participantToken, String roomName, String participantName) {
        serverUrl.getClass();
        participantToken.getClass();
        return new TokenSourceResponse(serverUrl, participantToken, roomName, participantName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenSourceResponse)) {
            return false;
        }
        TokenSourceResponse tokenSourceResponse = (TokenSourceResponse) other;
        if (m.c(this.serverUrl, tokenSourceResponse.serverUrl) && m.c(this.participantToken, tokenSourceResponse.participantToken) && m.c(this.roomName, tokenSourceResponse.roomName) && m.c(this.participantName, tokenSourceResponse.participantName)) {
            return true;
        }
        return false;
    }

    public final String getParticipantName() {
        return this.participantName;
    }

    public final String getParticipantToken() {
        return this.participantToken;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(this.serverUrl.hashCode() * 31, 31, this.participantToken);
        String str = this.roomName;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.participantName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TokenSourceResponse(serverUrl=");
        sb.append(this.serverUrl);
        sb.append(", participantToken=");
        sb.append(this.participantToken);
        sb.append(", roomName=");
        sb.append(this.roomName);
        sb.append(", participantName=");
        return f.m(sb, this.participantName, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/token/TokenSourceResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/token/TokenSourceResponse;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return TokenSourceResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenSourceResponse(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.serverUrl = str;
        this.participantToken = str2;
        this.roomName = str3;
        this.participantName = str4;
    }

    public /* synthetic */ TokenSourceResponse(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
