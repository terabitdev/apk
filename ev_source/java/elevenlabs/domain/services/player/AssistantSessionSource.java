package io.elevenlabs.domain.services.player;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import defpackage.f;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionSource;", "", "ReadContext", "SupportAgent", "Lio/elevenlabs/domain/services/player/AssistantSessionSource$ReadContext;", "Lio/elevenlabs/domain/services/player/AssistantSessionSource$SupportAgent;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AssistantSessionSource {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionSource$ReadContext;", "Lio/elevenlabs/domain/services/player/AssistantSessionSource;", "readId", "", "position", "", "voiceId", "textOnly", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Z)V", "getReadId", "()Ljava/lang/String;", "getPosition", "()J", "getVoiceId", "getTextOnly", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadContext implements AssistantSessionSource {
        private final long position;
        private final String readId;
        private final boolean textOnly;
        private final String voiceId;

        public ReadContext(String str, long j4, String str2, boolean z6) {
            str.getClass();
            this.readId = str;
            this.position = j4;
            this.voiceId = str2;
            this.textOnly = z6;
        }

        public static /* synthetic */ ReadContext copy$default(ReadContext readContext, String str, long j4, String str2, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readContext.readId;
            }
            if ((i10 & 2) != 0) {
                j4 = readContext.position;
            }
            if ((i10 & 4) != 0) {
                str2 = readContext.voiceId;
            }
            if ((i10 & 8) != 0) {
                z6 = readContext.textOnly;
            }
            return readContext.copy(str, j4, str2, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReadId() {
            return this.readId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getPosition() {
            return this.position;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVoiceId() {
            return this.voiceId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getTextOnly() {
            return this.textOnly;
        }

        public final ReadContext copy(String readId, long position, String voiceId, boolean textOnly) {
            readId.getClass();
            return new ReadContext(readId, position, voiceId, textOnly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadContext)) {
                return false;
            }
            ReadContext readContext = (ReadContext) other;
            if (m.c(this.readId, readContext.readId) && this.position == readContext.position && m.c(this.voiceId, readContext.voiceId) && this.textOnly == readContext.textOnly) {
                return true;
            }
            return false;
        }

        public final long getPosition() {
            return this.position;
        }

        public final String getReadId() {
            return this.readId;
        }

        public final boolean getTextOnly() {
            return this.textOnly;
        }

        public final String getVoiceId() {
            return this.voiceId;
        }

        public int hashCode() {
            int hashCode;
            int g10 = b.g(this.position, this.readId.hashCode() * 31, 31);
            String str = this.voiceId;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.textOnly) + ((g10 + hashCode) * 31);
        }

        public String toString() {
            String str = this.readId;
            long j4 = this.position;
            String str2 = this.voiceId;
            boolean z6 = this.textOnly;
            StringBuilder r10 = b.r("ReadContext(readId=", str, j4, ", position=");
            r10.append(", voiceId=");
            r10.append(str2);
            r10.append(", textOnly=");
            r10.append(z6);
            r10.append(Separators.RPAREN);
            return r10.toString();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionSource$SupportAgent;", "Lio/elevenlabs/domain/services/player/AssistantSessionSource;", "signedUrl", "", "conversationToken", "websocketUrl", "dynamicVariables", "", "", "textOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getSignedUrl", "()Ljava/lang/String;", "getConversationToken", "getWebsocketUrl", "getDynamicVariables", "()Ljava/util/Map;", "getTextOnly", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SupportAgent implements AssistantSessionSource {
        private final String conversationToken;
        private final Map<String, Object> dynamicVariables;
        private final String signedUrl;
        private final boolean textOnly;
        private final String websocketUrl;

        public SupportAgent(String str, String str2, String str3, Map<String, ? extends Object> map, boolean z6) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            map.getClass();
            this.signedUrl = str;
            this.conversationToken = str2;
            this.websocketUrl = str3;
            this.dynamicVariables = map;
            this.textOnly = z6;
        }

        public static /* synthetic */ SupportAgent copy$default(SupportAgent supportAgent, String str, String str2, String str3, Map map, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = supportAgent.signedUrl;
            }
            if ((i10 & 2) != 0) {
                str2 = supportAgent.conversationToken;
            }
            if ((i10 & 4) != 0) {
                str3 = supportAgent.websocketUrl;
            }
            if ((i10 & 8) != 0) {
                map = supportAgent.dynamicVariables;
            }
            if ((i10 & 16) != 0) {
                z6 = supportAgent.textOnly;
            }
            boolean z10 = z6;
            String str4 = str3;
            return supportAgent.copy(str, str2, str4, map, z10);
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
        public final String getWebsocketUrl() {
            return this.websocketUrl;
        }

        public final Map<String, Object> component4() {
            return this.dynamicVariables;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getTextOnly() {
            return this.textOnly;
        }

        public final SupportAgent copy(String signedUrl, String conversationToken, String websocketUrl, Map<String, ? extends Object> dynamicVariables, boolean textOnly) {
            signedUrl.getClass();
            conversationToken.getClass();
            websocketUrl.getClass();
            dynamicVariables.getClass();
            return new SupportAgent(signedUrl, conversationToken, websocketUrl, dynamicVariables, textOnly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportAgent)) {
                return false;
            }
            SupportAgent supportAgent = (SupportAgent) other;
            if (m.c(this.signedUrl, supportAgent.signedUrl) && m.c(this.conversationToken, supportAgent.conversationToken) && m.c(this.websocketUrl, supportAgent.websocketUrl) && m.c(this.dynamicVariables, supportAgent.dynamicVariables) && this.textOnly == supportAgent.textOnly) {
                return true;
            }
            return false;
        }

        public final String getConversationToken() {
            return this.conversationToken;
        }

        public final Map<String, Object> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final String getSignedUrl() {
            return this.signedUrl;
        }

        public final boolean getTextOnly() {
            return this.textOnly;
        }

        public final String getWebsocketUrl() {
            return this.websocketUrl;
        }

        public int hashCode() {
            return Boolean.hashCode(this.textOnly) + f.a(this.dynamicVariables, c.c(c.c(this.signedUrl.hashCode() * 31, 31, this.conversationToken), 31, this.websocketUrl), 31);
        }

        public String toString() {
            String str = this.signedUrl;
            String str2 = this.conversationToken;
            String str3 = this.websocketUrl;
            Map<String, Object> map = this.dynamicVariables;
            boolean z6 = this.textOnly;
            StringBuilder s10 = f.s("SupportAgent(signedUrl=", str, ", conversationToken=", str2, ", websocketUrl=");
            s10.append(str3);
            s10.append(", dynamicVariables=");
            s10.append(map);
            s10.append(", textOnly=");
            return n.j(Separators.RPAREN, s10, z6);
        }

        public /* synthetic */ SupportAgent(String str, String str2, String str3, Map map, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, str3, (i10 & 8) != 0 ? u.f33548a : map, z6);
        }
    }
}
