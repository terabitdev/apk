package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003Ju\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, d2 = {"Lio/elevenlabs/domain/model/AssistantConfig;", "", "promptSuggestions", "", "", "conversationToken", "userId", "voiceId", "firstMessage", "language", "dynamicVariables", "", "apiEndpoint", "websocketUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getPromptSuggestions", "()Ljava/util/List;", "getConversationToken", "()Ljava/lang/String;", "getUserId", "getVoiceId", "getFirstMessage", "getLanguage", "getDynamicVariables", "()Ljava/util/Map;", "getApiEndpoint", "getWebsocketUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AssistantConfig {
    private final String apiEndpoint;
    private final String conversationToken;
    private final Map<String, String> dynamicVariables;
    private final String firstMessage;
    private final String language;
    private final List<String> promptSuggestions;
    private final String userId;
    private final String voiceId;
    private final String websocketUrl;

    public AssistantConfig(List<String> list, String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
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

    public static /* synthetic */ AssistantConfig copy$default(AssistantConfig assistantConfig, List list, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = assistantConfig.promptSuggestions;
        }
        if ((i10 & 2) != 0) {
            str = assistantConfig.conversationToken;
        }
        if ((i10 & 4) != 0) {
            str2 = assistantConfig.userId;
        }
        if ((i10 & 8) != 0) {
            str3 = assistantConfig.voiceId;
        }
        if ((i10 & 16) != 0) {
            str4 = assistantConfig.firstMessage;
        }
        if ((i10 & 32) != 0) {
            str5 = assistantConfig.language;
        }
        if ((i10 & 64) != 0) {
            map = assistantConfig.dynamicVariables;
        }
        if ((i10 & 128) != 0) {
            str6 = assistantConfig.apiEndpoint;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str7 = assistantConfig.websocketUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Map map2 = map;
        String str11 = str4;
        String str12 = str2;
        return assistantConfig.copy(list, str, str12, str3, str11, str10, map2, str8, str9);
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

    public final AssistantConfig copy(List<String> promptSuggestions, String conversationToken, String userId, String voiceId, String firstMessage, String language, Map<String, String> dynamicVariables, String apiEndpoint, String websocketUrl) {
        promptSuggestions.getClass();
        conversationToken.getClass();
        userId.getClass();
        voiceId.getClass();
        firstMessage.getClass();
        language.getClass();
        dynamicVariables.getClass();
        apiEndpoint.getClass();
        websocketUrl.getClass();
        return new AssistantConfig(promptSuggestions, conversationToken, userId, voiceId, firstMessage, language, dynamicVariables, apiEndpoint, websocketUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantConfig)) {
            return false;
        }
        AssistantConfig assistantConfig = (AssistantConfig) other;
        if (m.c(this.promptSuggestions, assistantConfig.promptSuggestions) && m.c(this.conversationToken, assistantConfig.conversationToken) && m.c(this.userId, assistantConfig.userId) && m.c(this.voiceId, assistantConfig.voiceId) && m.c(this.firstMessage, assistantConfig.firstMessage) && m.c(this.language, assistantConfig.language) && m.c(this.dynamicVariables, assistantConfig.dynamicVariables) && m.c(this.apiEndpoint, assistantConfig.apiEndpoint) && m.c(this.websocketUrl, assistantConfig.websocketUrl)) {
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
        return this.websocketUrl.hashCode() + c.c(f.a(this.dynamicVariables, c.c(c.c(c.c(c.c(c.c(this.promptSuggestions.hashCode() * 31, 31, this.conversationToken), 31, this.userId), 31, this.voiceId), 31, this.firstMessage), 31, this.language), 31), 31, this.apiEndpoint);
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
        StringBuilder sb = new StringBuilder("AssistantConfig(promptSuggestions=");
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
}
