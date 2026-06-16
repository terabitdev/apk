package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/SupportAgentConfig;", "", "signedUrl", "", "conversationToken", "agentId", "websocketUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSignedUrl", "()Ljava/lang/String;", "getConversationToken", "getAgentId", "getWebsocketUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SupportAgentConfig {
    private final String agentId;
    private final String conversationToken;
    private final String signedUrl;
    private final String websocketUrl;

    public SupportAgentConfig(String str, String str2, String str3, String str4) {
        c.u(str, str2, str3, str4);
        this.signedUrl = str;
        this.conversationToken = str2;
        this.agentId = str3;
        this.websocketUrl = str4;
    }

    public static /* synthetic */ SupportAgentConfig copy$default(SupportAgentConfig supportAgentConfig, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = supportAgentConfig.signedUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = supportAgentConfig.conversationToken;
        }
        if ((i10 & 4) != 0) {
            str3 = supportAgentConfig.agentId;
        }
        if ((i10 & 8) != 0) {
            str4 = supportAgentConfig.websocketUrl;
        }
        return supportAgentConfig.copy(str, str2, str3, str4);
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

    public final SupportAgentConfig copy(String signedUrl, String conversationToken, String agentId, String websocketUrl) {
        signedUrl.getClass();
        conversationToken.getClass();
        agentId.getClass();
        websocketUrl.getClass();
        return new SupportAgentConfig(signedUrl, conversationToken, agentId, websocketUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportAgentConfig)) {
            return false;
        }
        SupportAgentConfig supportAgentConfig = (SupportAgentConfig) other;
        if (m.c(this.signedUrl, supportAgentConfig.signedUrl) && m.c(this.conversationToken, supportAgentConfig.conversationToken) && m.c(this.agentId, supportAgentConfig.agentId) && m.c(this.websocketUrl, supportAgentConfig.websocketUrl)) {
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
        return this.websocketUrl.hashCode() + c.c(c.c(this.signedUrl.hashCode() * 31, 31, this.conversationToken), 31, this.agentId);
    }

    public String toString() {
        String str = this.signedUrl;
        String str2 = this.conversationToken;
        return f.n(f.s("SupportAgentConfig(signedUrl=", str, ", conversationToken=", str2, ", agentId="), this.agentId, ", websocketUrl=", this.websocketUrl, Separators.RPAREN);
    }
}
