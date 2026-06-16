package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00061"}, d2 = {"Lio/elevenlabs/data/model/response/SupportAgentInitResponse;", "", "", "signedUrl", "conversationToken", "agentId", "websocketUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/SupportAgentInitResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/SupportAgentInitResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSignedUrl", "getSignedUrl$annotations", "()V", "getConversationToken", "getConversationToken$annotations", "getAgentId", "getAgentId$annotations", "getWebsocketUrl", "getWebsocketUrl$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class SupportAgentInitResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String agentId;
    private final String conversationToken;
    private final String signedUrl;
    private final String websocketUrl;

    public /* synthetic */ SupportAgentInitResponse(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.signedUrl = str;
            this.conversationToken = str2;
            this.agentId = str3;
            this.websocketUrl = str4;
            return;
        }
        t0.j(i10, 15, SupportAgentInitResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SupportAgentInitResponse copy$default(SupportAgentInitResponse supportAgentInitResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = supportAgentInitResponse.signedUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = supportAgentInitResponse.conversationToken;
        }
        if ((i10 & 4) != 0) {
            str3 = supportAgentInitResponse.agentId;
        }
        if ((i10 & 8) != 0) {
            str4 = supportAgentInitResponse.websocketUrl;
        }
        return supportAgentInitResponse.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(SupportAgentInitResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.signedUrl);
        output.V(serialDesc, 1, self.conversationToken);
        output.V(serialDesc, 2, self.agentId);
        output.V(serialDesc, 3, self.websocketUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSignedUrl() {
        return this.signedUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationToken() {
        return this.conversationToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public final SupportAgentInitResponse copy(String signedUrl, String conversationToken, String agentId, String websocketUrl) {
        signedUrl.getClass();
        conversationToken.getClass();
        agentId.getClass();
        websocketUrl.getClass();
        return new SupportAgentInitResponse(signedUrl, conversationToken, agentId, websocketUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportAgentInitResponse)) {
            return false;
        }
        SupportAgentInitResponse supportAgentInitResponse = (SupportAgentInitResponse) other;
        if (m.c(this.signedUrl, supportAgentInitResponse.signedUrl) && m.c(this.conversationToken, supportAgentInitResponse.conversationToken) && m.c(this.agentId, supportAgentInitResponse.agentId) && m.c(this.websocketUrl, supportAgentInitResponse.websocketUrl)) {
            return true;
        }
        return false;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getConversationToken() {
        return this.conversationToken;
    }

    public final String getSignedUrl() {
        return this.signedUrl;
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public int hashCode() {
        return this.websocketUrl.hashCode() + j0.c.c(j0.c.c(this.signedUrl.hashCode() * 31, 31, this.conversationToken), 31, this.agentId);
    }

    public String toString() {
        String str = this.signedUrl;
        String str2 = this.conversationToken;
        return f.n(f.s("SupportAgentInitResponse(signedUrl=", str, ", conversationToken=", str2, ", agentId="), this.agentId, ", websocketUrl=", this.websocketUrl, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/SupportAgentInitResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/SupportAgentInitResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return SupportAgentInitResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAgentId$annotations() {
    }

    public static /* synthetic */ void getConversationToken$annotations() {
    }

    public static /* synthetic */ void getSignedUrl$annotations() {
    }

    public static /* synthetic */ void getWebsocketUrl$annotations() {
    }

    public SupportAgentInitResponse(String str, String str2, String str3, String str4) {
        j0.c.u(str, str2, str3, str4);
        this.signedUrl = str;
        this.conversationToken = str2;
        this.agentId = str3;
        this.websocketUrl = str4;
    }
}
