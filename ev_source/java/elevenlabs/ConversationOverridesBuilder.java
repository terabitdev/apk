package io.elevenlabs;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/elevenlabs/ConversationOverridesBuilder;", "", "<init>", "()V", CredentialProviderBaseController.TYPE_TAG, "", "constructOverrides", "Lorg/json/JSONObject;", "config", "Lio/elevenlabs/ConversationConfig;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationOverridesBuilder {
    public static final ConversationOverridesBuilder INSTANCE = new ConversationOverridesBuilder();
    private static final String TYPE = "conversation_initiation_client_data";

    private ConversationOverridesBuilder() {
    }

    public final JSONObject constructOverrides(ConversationConfig config) {
        ClientOverrides client;
        Boolean textOnly;
        String voiceId;
        config.getClass();
        JSONObject put = new JSONObject().put("type", TYPE);
        Overrides overrides = config.getOverrides();
        if (overrides != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            AgentOverrides agent = overrides.getAgent();
            if (agent != null) {
                PromptOverrides prompt = agent.getPrompt();
                if (prompt != null) {
                    jSONObject2.put(SDPKeywords.PROMPT, new JSONObject().put(SDPKeywords.PROMPT, prompt.getPrompt()));
                }
                String firstMessage = agent.getFirstMessage();
                if (firstMessage != null) {
                    jSONObject2.put("first_message", firstMessage);
                }
                Language language = agent.getLanguage();
                if (language != null) {
                    jSONObject2.put("language", language.getCode());
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("agent", jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            TtsOverrides tts = overrides.getTts();
            if (tts != null && (voiceId = tts.getVoiceId()) != null) {
                jSONObject3.put("voice_id", voiceId);
            }
            if (jSONObject3.length() > 0) {
                jSONObject.put("tts", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            ConversationOverrides conversation = overrides.getConversation();
            if (conversation != null && (textOnly = conversation.getTextOnly()) != null) {
                jSONObject4.put("text_only", textOnly.booleanValue());
            }
            if (jSONObject4.length() > 0) {
                jSONObject.put("conversation", jSONObject4);
            }
            if (jSONObject.length() > 0) {
                put.put("conversation_config_override", jSONObject);
            }
        }
        Map<String, Object> customLlmExtraBody = config.getCustomLlmExtraBody();
        if (customLlmExtraBody != null) {
            put.put("custom_llm_extra_body", new JSONObject(customLlmExtraBody));
        }
        Map<String, Object> dynamicVariables = config.getDynamicVariables();
        if (dynamicVariables != null) {
            put.put("dynamic_variables", new JSONObject(dynamicVariables));
        }
        Object userId = config.getUserId();
        if (userId != null) {
            put.put("user_id", userId);
        }
        Overrides overrides2 = config.getOverrides();
        if (overrides2 != null && (client = overrides2.getClient()) != null) {
            JSONObject jSONObject5 = new JSONObject();
            String source = client.getSource();
            if (source != null) {
                jSONObject5.put("source", source);
            }
            String version = client.getVersion();
            if (version != null) {
                jSONObject5.put("version", version);
            }
            if (jSONObject5.length() > 0) {
                put.put("source_info", jSONObject5);
            }
        }
        put.getClass();
        return put;
    }
}
