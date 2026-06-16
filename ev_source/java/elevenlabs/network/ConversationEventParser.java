package io.elevenlabs.network;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.c;
import com.google.gson.f;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.d;
import com.google.gson.internal.l;
import com.google.gson.internal.n;
import com.google.gson.j;
import io.elevenlabs.models.ConversationEvent;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010;J#\u0010@\u001a\u00020!2\u0006\u0010<\u001a\u00020\t2\n\u0010?\u001a\u00060=j\u0002`>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u0004\u0018\u00010\u001b2\u0006\u0010<\u001a\u00020\t¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\t2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GR\u001c\u0010J\u001a\n I*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lio/elevenlabs/network/ConversationEventParser;", "", "<init>", "()V", "Lcom/google/gson/i;", "jsonObject", "Lio/elevenlabs/models/ConversationEvent$Ping;", "parsePing", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$Ping;", "", "getEventType", "(Lcom/google/gson/i;)Ljava/lang/String;", "Lio/elevenlabs/models/ConversationEvent$AgentResponse;", "parseAgentResponse", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AgentResponse;", "Lio/elevenlabs/models/ConversationEvent$UserTranscript;", "parseUserTranscript", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$UserTranscript;", "Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "parseClientToolCall", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;", "parseAgentResponseCorrection", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;", "Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;", "parseAgentToolResponse", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;", "Lio/elevenlabs/models/ConversationEvent;", "parseAudio", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent;", "Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;", "parseConversationInitiationMetadata", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;", "Lsn/z;", "logAgentToolResponse", "(Lcom/google/gson/i;)V", "Lio/elevenlabs/models/ConversationEvent$VadScore;", "parseVadScore", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$VadScore;", "Lio/elevenlabs/models/ConversationEvent$Interruption;", "parseInterruption", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$Interruption;", "Lio/elevenlabs/models/ConversationEvent$AudioAlignment;", "parseAudioAlignment", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AudioAlignment;", "Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;", "parseAgentResponseMetadata", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;", "Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;", "parseAgentChatResponsePart", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;", "Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;", "parseTentativeAgentResponse", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;", "Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "parseTentativeUserTranscript", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "Lio/elevenlabs/models/ConversationEvent$ServerError;", "parseError", "(Lcom/google/gson/i;)Lio/elevenlabs/models/ConversationEvent$ServerError;", "json", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "handleParsingError", "(Ljava/lang/String;Ljava/lang/Exception;)V", "parseIncomingEvent", "(Ljava/lang/String;)Lio/elevenlabs/models/ConversationEvent;", "Lio/elevenlabs/network/OutgoingEvent;", "event", "serializeOutgoingEvent", "(Lio/elevenlabs/network/OutgoingEvent;)Ljava/lang/String;", "Lcom/google/gson/a;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/a;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationEventParser {
    public static final ConversationEventParser INSTANCE = new ConversationEventParser();
    private static final a gson;

    static {
        b bVar = new b();
        bVar.f6779c = 5;
        gson = bVar.a();
    }

    private ConversationEventParser() {
    }

    private final String getEventType(i jsonObject) {
        f m10 = jsonObject.m("type");
        if (m10 != null) {
            return m10.j();
        }
        return null;
    }

    private final void handleParsingError(String json, Exception error) {
        Log.d("ConversationEventParser", "Failed to parse conversation event: " + error.getMessage());
        Log.d("ConversationEventParser", "JSON: " + json);
    }

    private final void logAgentToolResponse(i jsonObject) {
        try {
            Log.d("ConversationEventParser", "Agent tool response: " + jsonObject);
        } catch (Exception unused) {
        }
    }

    private final ConversationEvent.AgentChatResponsePart parseAgentChatResponsePart(i jsonObject) {
        String str;
        String j4;
        i o6 = jsonObject.o("text_response_part");
        if (o6 == null) {
            o6 = new i();
        }
        f m10 = o6.m(ParameterNames.TEXT);
        String str2 = "";
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        f m11 = o6.m("type");
        if (m11 != null && (j4 = m11.j()) != null) {
            str2 = j4;
        }
        return new ConversationEvent.AgentChatResponsePart(str2, str);
    }

    private final ConversationEvent.AgentResponse parseAgentResponse(i jsonObject) {
        String str;
        f m10;
        i o6 = jsonObject.o("agent_response_event");
        if (o6 == null || (m10 = o6.m("agent_response")) == null || (str = m10.j()) == null) {
            str = "";
        }
        return new ConversationEvent.AgentResponse(str);
    }

    private final ConversationEvent.AgentResponseCorrection parseAgentResponseCorrection(i jsonObject) {
        String str;
        String j4;
        i o6 = jsonObject.o("agent_response_correction_event");
        if (o6 != null) {
            jsonObject = o6;
        }
        f m10 = jsonObject.m("original_agent_response");
        String str2 = "";
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        f m11 = jsonObject.m("corrected_agent_response");
        if (m11 != null && (j4 = m11.j()) != null) {
            str2 = j4;
        }
        return new ConversationEvent.AgentResponseCorrection(str, str2);
    }

    private final ConversationEvent.AgentResponseMetadata parseAgentResponseMetadata(i jsonObject) {
        i o6 = jsonObject.o("agent_response_metadata_event");
        if (o6 == null) {
            o6 = jsonObject.b();
        }
        Object c5 = gson.c(o6, new zi.a<Map<String, ? extends Object>>() { // from class: io.elevenlabs.network.ConversationEventParser$parseAgentResponseMetadata$mapType$1
        }.getType());
        c5.getClass();
        return new ConversationEvent.AgentResponseMetadata((Map) c5);
    }

    private final ConversationEvent.AgentToolResponse parseAgentToolResponse(i jsonObject) {
        String str;
        String str2;
        boolean z6;
        String j4;
        i o6 = jsonObject.o("agent_tool_response");
        if (o6 != null) {
            jsonObject = o6;
        }
        f m10 = jsonObject.m("tool_name");
        String str3 = "";
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        f m11 = jsonObject.m("tool_call_id");
        if (m11 == null || (str2 = m11.j()) == null) {
            str2 = "";
        }
        f m12 = jsonObject.m("tool_type");
        if (m12 != null && (j4 = m12.j()) != null) {
            str3 = j4;
        }
        f m13 = jsonObject.m("is_error");
        if (m13 != null) {
            z6 = m13.c();
        } else {
            z6 = false;
        }
        return new ConversationEvent.AgentToolResponse(str, str2, str3, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ConversationEvent parseAudio(i jsonObject) {
        boolean z6;
        f m10;
        String j4;
        f m11;
        f m12;
        i o6 = jsonObject.o("audio_event");
        if (o6 != null) {
            jsonObject = o6;
        }
        n nVar = jsonObject.f6793a;
        boolean z10 = true;
        int i10 = 0;
        if (nVar.containsKey("alignment")) {
            f m13 = jsonObject.m("alignment");
            m13.getClass();
            if (!(m13 instanceof h)) {
                z6 = true;
                if (!nVar.containsKey("audio_base64") && !nVar.containsKey("audio_base_64")) {
                    z10 = false;
                }
                if (!z6 && !z10) {
                    Object c5 = gson.c(jsonObject, new zi.a<Map<String, ? extends Object>>() { // from class: io.elevenlabs.network.ConversationEventParser$parseAudio$mapType$1
                    }.getType());
                    c5.getClass();
                    return new ConversationEvent.AudioAlignment((Map) c5);
                }
                String str = "";
                if (nVar.containsKey("audio_base64") ? !(!nVar.containsKey("audio_base_64") || (m10 = jsonObject.m("audio_base_64")) == null || (j4 = m10.j()) == null) : !((m12 = jsonObject.m("audio_base64")) == null || (j4 = m12.j()) == null)) {
                    str = j4;
                }
                m11 = jsonObject.m("event_id");
                if (m11 != null) {
                    i10 = m11.e();
                }
                return new ConversationEvent.Audio(i10, str);
            }
        }
        z6 = false;
        if (!nVar.containsKey("audio_base64")) {
            z10 = false;
        }
        if (!z6) {
        }
        String str2 = "";
        if (nVar.containsKey("audio_base64")) {
            m11 = jsonObject.m("event_id");
            if (m11 != null) {
            }
            return new ConversationEvent.Audio(i10, str2);
        }
        m11 = jsonObject.m("event_id");
        if (m11 != null) {
        }
        return new ConversationEvent.Audio(i10, str2);
    }

    private final ConversationEvent.AudioAlignment parseAudioAlignment(i jsonObject) {
        i o6 = jsonObject.o("audio_alignment_event");
        if (o6 == null) {
            o6 = jsonObject.b();
        }
        Object c5 = gson.c(o6, new zi.a<Map<String, ? extends Object>>() { // from class: io.elevenlabs.network.ConversationEventParser$parseAudioAlignment$mapType$1
        }.getType());
        c5.getClass();
        return new ConversationEvent.AudioAlignment((Map) c5);
    }

    private final ConversationEvent.ClientToolCall parseClientToolCall(i jsonObject) {
        i iVar;
        boolean z6;
        String str;
        String j4;
        Object fVar;
        i o6 = jsonObject.o("client_tool_call");
        if (o6 != null || (o6 = jsonObject.o("agent_tool_request")) != null) {
            jsonObject = o6;
        }
        f m10 = jsonObject.m("parameters");
        if (m10 != null) {
            iVar = m10.f();
        } else {
            iVar = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iVar != null) {
            Iterator it = ((l) iVar.f6793a.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                f fVar2 = (f) entry.getValue();
                fVar2.getClass();
                if (fVar2 instanceof j) {
                    j g10 = ((f) entry.getValue()).g();
                    Serializable serializable = g10.f6960a;
                    if (serializable instanceof String) {
                        fVar = g10.j();
                    } else if (serializable instanceof Number) {
                        fVar = g10.k();
                    } else if (serializable instanceof Boolean) {
                        fVar = Boolean.valueOf(g10.c());
                    } else {
                        fVar = g10.j();
                    }
                } else {
                    f fVar3 = (f) entry.getValue();
                    fVar3.getClass();
                    if (fVar3 instanceof c) {
                        a aVar = gson;
                        f fVar4 = (f) entry.getValue();
                        aVar.getClass();
                        fVar = d.l(List.class).cast(aVar.d(fVar4, zi.a.get(List.class)));
                    } else {
                        f fVar5 = (f) entry.getValue();
                        fVar5.getClass();
                        if (fVar5 instanceof i) {
                            a aVar2 = gson;
                            f fVar6 = (f) entry.getValue();
                            aVar2.getClass();
                            fVar = d.l(Map.class).cast(aVar2.d(fVar6, zi.a.get(Map.class)));
                        } else {
                            fVar = ((f) entry.getValue()).toString();
                        }
                    }
                }
                linkedHashMap.put(key, fVar);
            }
        }
        f m11 = jsonObject.m("expects_response");
        if (m11 != null && !(m11 instanceof h)) {
            z6 = m11.c();
        } else {
            z6 = true;
        }
        f m12 = jsonObject.m("tool_name");
        String str2 = "";
        if (m12 == null || (str = m12.j()) == null) {
            str = "";
        }
        f m13 = jsonObject.m("tool_call_id");
        if (m13 != null && (j4 = m13.j()) != null) {
            str2 = j4;
        }
        return new ConversationEvent.ClientToolCall(str, linkedHashMap, str2, z6);
    }

    private final ConversationEvent.ConversationInitiationMetadata parseConversationInitiationMetadata(i jsonObject) {
        String str;
        String str2;
        String j4;
        i o6 = jsonObject.o("conversation_initiation_metadata");
        if (o6 != null) {
            jsonObject = o6;
        }
        f m10 = jsonObject.m("conversation_id");
        String str3 = "";
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        f m11 = jsonObject.m("agent_output_audio_format");
        if (m11 == null || (str2 = m11.j()) == null) {
            str2 = "";
        }
        f m12 = jsonObject.m("user_input_audio_format");
        if (m12 != null && (j4 = m12.j()) != null) {
            str3 = j4;
        }
        return new ConversationEvent.ConversationInitiationMetadata(str, str2, str3);
    }

    private final ConversationEvent.ServerError parseError(i jsonObject) {
        int i10;
        f m10;
        String j4;
        f m11;
        i o6 = jsonObject.o("error_event");
        if (o6 != null && (m11 = o6.m("code")) != null) {
            i10 = m11.e();
        } else {
            f m12 = jsonObject.m("code");
            if (m12 != null) {
                i10 = m12.e();
            } else {
                i10 = 1011;
            }
        }
        String str = null;
        if (o6 != null && (m10 = o6.m("message")) != null) {
            if (m10 instanceof h) {
                j4 = null;
            } else {
                j4 = m10.j();
            }
            if (j4 != null) {
                str = j4;
                return new ConversationEvent.ServerError(i10, str);
            }
        }
        f m13 = jsonObject.m("message");
        if (m13 != null && !(m13 instanceof h)) {
            str = m13.j();
        }
        return new ConversationEvent.ServerError(i10, str);
    }

    private final ConversationEvent.Interruption parseInterruption(i jsonObject) {
        int i10;
        f m10;
        i o6 = jsonObject.o("interruption_event");
        if (o6 != null && (m10 = o6.m("event_id")) != null) {
            i10 = m10.e();
        } else {
            i10 = 0;
        }
        return new ConversationEvent.Interruption(i10);
    }

    private final ConversationEvent.Ping parsePing(i jsonObject) {
        int i10;
        f m10;
        f m11;
        i o6 = jsonObject.o("ping_event");
        if (o6 != null && (m11 = o6.m("event_id")) != null) {
            i10 = m11.e();
        } else {
            i10 = 0;
        }
        Long l4 = null;
        if (o6 != null && (m10 = o6.m("ping_ms")) != null && !(m10 instanceof h)) {
            l4 = Long.valueOf(m10.i());
        }
        return new ConversationEvent.Ping(i10, l4);
    }

    private final ConversationEvent.TentativeAgentResponse parseTentativeAgentResponse(i jsonObject) {
        String str;
        i o6 = jsonObject.o("tentative_agent_response_internal_event");
        if (o6 == null) {
            o6 = new i();
        }
        f m10 = o6.m("tentative_agent_response");
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        return new ConversationEvent.TentativeAgentResponse(str);
    }

    private final ConversationEvent.TentativeUserTranscript parseTentativeUserTranscript(i jsonObject) {
        String str;
        i o6 = jsonObject.o("tentative_user_transcription_event");
        if (o6 == null) {
            o6 = new i();
        }
        f m10 = o6.m("user_transcript");
        if (m10 == null || (str = m10.j()) == null) {
            str = "";
        }
        f m11 = o6.m("event_id");
        Integer num = null;
        if (m11 != null && !(m11 instanceof h)) {
            num = Integer.valueOf(m11.e());
        }
        return new ConversationEvent.TentativeUserTranscript(str, num);
    }

    private final ConversationEvent.UserTranscript parseUserTranscript(i jsonObject) {
        String str;
        f m10;
        i o6 = jsonObject.o("user_transcription_event");
        if (o6 == null || (m10 = o6.m("user_transcript")) == null || (str = m10.j()) == null) {
            str = "";
        }
        return new ConversationEvent.UserTranscript(str);
    }

    private final ConversationEvent.VadScore parseVadScore(i jsonObject) {
        float f10;
        i o6 = jsonObject.o("vad_score_event");
        if (o6 != null) {
            jsonObject = o6;
        }
        f m10 = jsonObject.m("vad_score");
        if (m10 != null) {
            f10 = m10.d();
        } else {
            f10 = u.P;
        }
        return new ConversationEvent.VadScore(f10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0018. Please report as an issue. */
    public final ConversationEvent parseIncomingEvent(String json) {
        json.getClass();
        try {
            i f10 = tb.a.C(json).f();
            String eventType = getEventType(f10);
            if (eventType != null) {
                switch (eventType.hashCode()) {
                    case -1850296914:
                        if (!eventType.equals("internal_tentative_agent_response")) {
                            break;
                        } else {
                            return parseTentativeAgentResponse(f10);
                        }
                    case -1211112990:
                        if (!eventType.equals("agent_tool_request")) {
                            break;
                        }
                        return parseClientToolCall(f10);
                    case -536140109:
                        if (!eventType.equals("agent_response_metadata")) {
                            break;
                        } else {
                            return parseAgentResponseMetadata(f10);
                        }
                    case -394615638:
                        if (!eventType.equals("user_transcript")) {
                            break;
                        } else {
                            return parseUserTranscript(f10);
                        }
                    case -247682363:
                        if (!eventType.equals("interruption")) {
                            break;
                        } else {
                            return parseInterruption(f10);
                        }
                    case -16582174:
                        if (!eventType.equals("agent_response_correction")) {
                            break;
                        } else {
                            return parseAgentResponseCorrection(f10);
                        }
                    case 3441010:
                        if (!eventType.equals("ping")) {
                            break;
                        } else {
                            return parsePing(f10);
                        }
                    case 93166550:
                        if (!eventType.equals("audio")) {
                            break;
                        } else {
                            return parseAudio(f10);
                        }
                    case 96784904:
                        if (!eventType.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            break;
                        } else {
                            return parseError(f10);
                        }
                    case 107737580:
                        if (!eventType.equals("vad_score")) {
                            break;
                        } else {
                            return parseVadScore(f10);
                        }
                    case 265317654:
                        if (!eventType.equals("conversation_initiation_metadata")) {
                            break;
                        } else {
                            return parseConversationInitiationMetadata(f10);
                        }
                    case 830445627:
                        if (!eventType.equals("agent_response")) {
                            break;
                        } else {
                            return parseAgentResponse(f10);
                        }
                    case 906425649:
                        if (!eventType.equals("client_tool_call")) {
                            break;
                        }
                        return parseClientToolCall(f10);
                    case 961930426:
                        if (!eventType.equals("audio_alignment")) {
                            break;
                        } else {
                            return parseAudioAlignment(f10);
                        }
                    case 1163136846:
                        if (!eventType.equals("agent_tool_response")) {
                            break;
                        } else {
                            return parseAgentToolResponse(f10);
                        }
                    case 1223854084:
                        if (!eventType.equals("agent_chat_response_part")) {
                            break;
                        } else {
                            return parseAgentChatResponsePart(f10);
                        }
                    case 1249097881:
                        if (!eventType.equals("tentative_user_transcript")) {
                            break;
                        } else {
                            return parseTentativeUserTranscript(f10);
                        }
                }
            }
            handleParsingError(json, new IllegalArgumentException("Unknown event type: " + eventType));
            return null;
        } catch (Exception e10) {
            handleParsingError(json, e10);
            return null;
        }
    }

    public final String serializeOutgoingEvent(OutgoingEvent event) {
        event.getClass();
        a aVar = gson;
        aVar.getClass();
        Class<?> cls = event.getClass();
        StringWriter stringWriter = new StringWriter();
        aVar.j(event, cls, stringWriter);
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }
}
