package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBa\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fB\u0087\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0018J|\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u0018R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010\u0018R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u0018R \u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010\u0018R \u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010\u0018R,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u001eR \u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010\u0018R \u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bH\u00106\u001a\u0004\bG\u0010\u0018¨\u0006K"}, d2 = {"Lio/elevenlabs/data/model/response/AssistantInitResponse;", "", "", "", "promptSuggestions", "conversationToken", "userId", "voiceId", "firstMessage", "language", "", "dynamicVariables", "apiEndpoint", "websocketUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/AssistantInitResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AssistantInitResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPromptSuggestions", "getPromptSuggestions$annotations", "()V", "Ljava/lang/String;", "getConversationToken", "getConversationToken$annotations", "getUserId", "getUserId$annotations", "getVoiceId", "getVoiceId$annotations", "getFirstMessage", "getFirstMessage$annotations", "getLanguage", "getLanguage$annotations", "Ljava/util/Map;", "getDynamicVariables", "getDynamicVariables$annotations", "getApiEndpoint", "getApiEndpoint$annotations", "getWebsocketUrl", "getWebsocketUrl$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AssistantInitResponse {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String apiEndpoint;
    private final String conversationToken;
    private final Map<String, String> dynamicVariables;
    private final String firstMessage;
    private final String language;
    private final List<String> promptSuggestions;
    private final String userId;
    private final String voiceId;
    private final String websocketUrl;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(6);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), null, null, null, null, null, sn.a.d(iVar, new io.elevenlabs.data.model.a(7)), null, null};
    }

    public AssistantInitResponse(List<String> list, String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        map.getClass();
        str6.getClass();
        str7.getClass();
        this.promptSuggestions = list;
        this.conversationToken = str;
        this.userId = str2;
        this.voiceId = str3;
        this.firstMessage = str4;
        this.language = str5;
        this.dynamicVariables = map;
        this.apiEndpoint = str6;
        this.websocketUrl = str7;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(g1.f34588a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, g1Var);
    }

    public static /* synthetic */ AssistantInitResponse copy$default(AssistantInitResponse assistantInitResponse, List list, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = assistantInitResponse.promptSuggestions;
        }
        if ((i10 & 2) != 0) {
            str = assistantInitResponse.conversationToken;
        }
        if ((i10 & 4) != 0) {
            str2 = assistantInitResponse.userId;
        }
        if ((i10 & 8) != 0) {
            str3 = assistantInitResponse.voiceId;
        }
        if ((i10 & 16) != 0) {
            str4 = assistantInitResponse.firstMessage;
        }
        if ((i10 & 32) != 0) {
            str5 = assistantInitResponse.language;
        }
        if ((i10 & 64) != 0) {
            map = assistantInitResponse.dynamicVariables;
        }
        if ((i10 & 128) != 0) {
            str6 = assistantInitResponse.apiEndpoint;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str7 = assistantInitResponse.websocketUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Map map2 = map;
        String str11 = str4;
        String str12 = str2;
        return assistantInitResponse.copy(list, str, str12, str3, str11, str10, map2, str8, str9);
    }

    public static final /* synthetic */ void write$Self$data_release(AssistantInitResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.promptSuggestions);
        output.V(serialDesc, 1, self.conversationToken);
        output.V(serialDesc, 2, self.userId);
        output.V(serialDesc, 3, self.voiceId);
        output.V(serialDesc, 4, self.firstMessage);
        output.V(serialDesc, 5, self.language);
        output.g(serialDesc, 6, (KSerializer) hVarArr[6].getValue(), self.dynamicVariables);
        output.V(serialDesc, 7, self.apiEndpoint);
        output.V(serialDesc, 8, self.websocketUrl);
    }

    public final List<String> component1() {
        return this.promptSuggestions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationToken() {
        return this.conversationToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFirstMessage() {
        return this.firstMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final Map<String, String> component7() {
        return this.dynamicVariables;
    }

    /* renamed from: component8, reason: from getter */
    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public final AssistantInitResponse copy(List<String> promptSuggestions, String conversationToken, String userId, String voiceId, String firstMessage, String language, Map<String, String> dynamicVariables, String apiEndpoint, String websocketUrl) {
        promptSuggestions.getClass();
        conversationToken.getClass();
        userId.getClass();
        voiceId.getClass();
        firstMessage.getClass();
        language.getClass();
        dynamicVariables.getClass();
        apiEndpoint.getClass();
        websocketUrl.getClass();
        return new AssistantInitResponse(promptSuggestions, conversationToken, userId, voiceId, firstMessage, language, dynamicVariables, apiEndpoint, websocketUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantInitResponse)) {
            return false;
        }
        AssistantInitResponse assistantInitResponse = (AssistantInitResponse) other;
        if (m.c(this.promptSuggestions, assistantInitResponse.promptSuggestions) && m.c(this.conversationToken, assistantInitResponse.conversationToken) && m.c(this.userId, assistantInitResponse.userId) && m.c(this.voiceId, assistantInitResponse.voiceId) && m.c(this.firstMessage, assistantInitResponse.firstMessage) && m.c(this.language, assistantInitResponse.language) && m.c(this.dynamicVariables, assistantInitResponse.dynamicVariables) && m.c(this.apiEndpoint, assistantInitResponse.apiEndpoint) && m.c(this.websocketUrl, assistantInitResponse.websocketUrl)) {
            return true;
        }
        return false;
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final String getConversationToken() {
        return this.conversationToken;
    }

    public final Map<String, String> getDynamicVariables() {
        return this.dynamicVariables;
    }

    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final List<String> getPromptSuggestions() {
        return this.promptSuggestions;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public int hashCode() {
        return this.websocketUrl.hashCode() + j0.c.c(f.a(this.dynamicVariables, j0.c.c(j0.c.c(j0.c.c(j0.c.c(j0.c.c(this.promptSuggestions.hashCode() * 31, 31, this.conversationToken), 31, this.userId), 31, this.voiceId), 31, this.firstMessage), 31, this.language), 31), 31, this.apiEndpoint);
    }

    public String toString() {
        List<String> list = this.promptSuggestions;
        String str = this.conversationToken;
        String str2 = this.userId;
        String str3 = this.voiceId;
        String str4 = this.firstMessage;
        String str5 = this.language;
        Map<String, String> map = this.dynamicVariables;
        String str6 = this.apiEndpoint;
        String str7 = this.websocketUrl;
        StringBuilder sb = new StringBuilder("AssistantInitResponse(promptSuggestions=");
        sb.append(list);
        sb.append(", conversationToken=");
        sb.append(str);
        sb.append(", userId=");
        f.x(sb, str2, ", voiceId=", str3, ", firstMessage=");
        f.x(sb, str4, ", language=", str5, ", dynamicVariables=");
        sb.append(map);
        sb.append(", apiEndpoint=");
        sb.append(str6);
        sb.append(", websocketUrl=");
        return f.l(str7, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AssistantInitResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AssistantInitResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AssistantInitResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getApiEndpoint$annotations() {
    }

    public static /* synthetic */ void getConversationToken$annotations() {
    }

    public static /* synthetic */ void getDynamicVariables$annotations() {
    }

    public static /* synthetic */ void getFirstMessage$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getPromptSuggestions$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public static /* synthetic */ void getWebsocketUrl$annotations() {
    }

    public /* synthetic */ AssistantInitResponse(int i10, List list, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, c1 c1Var) {
        if (511 != (i10 & 511)) {
            t0.j(i10, 511, AssistantInitResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.promptSuggestions = list;
        this.conversationToken = str;
        this.userId = str2;
        this.voiceId = str3;
        this.firstMessage = str4;
        this.language = str5;
        this.dynamicVariables = map;
        this.apiEndpoint = str6;
        this.websocketUrl = str7;
    }
}
