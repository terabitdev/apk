package io.elevenlabs;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.r0;
import ho.l;
import ho.p;
import ho.q;
import ho.r;
import io.elevenlabs.audio.AudioManager;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.models.ConversationMode;
import io.elevenlabs.network.OutgoingEvent;
import io.livekit.android.rpc.RpcError;
import ir.b2;
import ir.j1;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import mr.e;
import sn.z;
import wn.c;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B±\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\"\b\u0002\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016\u0012(\b\u0002\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018\u0012\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012 \b\u0002\u0010\u001f\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006\u0012\u001e\b\u0002\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0011¢\u0006\u0004\b2\u0010)J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u00104J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u00104J\u0018\u0010:\u001a\u00020\b2\u0006\u0010$\u001a\u000209H\u0082@¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u00020\b2\u0006\u0010$\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\u0006\u0010$\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\b2\u0006\u0010$\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010$\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010I\u001a\u00020\b2\u0006\u0010$\u001a\u00020HH\u0082@¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020\b2\u0006\u0010$\u001a\u00020KH\u0082@¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010$\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010$\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\b2\u0006\u0010$\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\b2\u0006\u0010$\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\b2\u0006\u0010$\u001a\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\b2\u0006\u0010$\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\u00020\b2\u0006\u0010$\u001a\u00020\fH\u0082@¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\b2\u0006\u0010$\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010$\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010iR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010jR\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010jR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010jR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010jR.\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010jR.\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010jR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010jR\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010jR(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010kR4\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010lR.\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010mR\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010jR,\u0010\u001f\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010jR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010kR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u0002050q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u0002050t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010z¨\u0006|"}, d2 = {"Lio/elevenlabs/ConversationEventHandler;", "", "Lio/elevenlabs/audio/AudioManager;", "audioManager", "Lio/elevenlabs/ClientToolRegistry;", "toolRegistry", "Lkotlin/Function1;", "Lio/elevenlabs/network/OutgoingEvent;", "Lsn/z;", "messageCallback", "", "onCanSendFeedbackChange", "Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "onUnhandledClientToolCall", "", "onVadScore", "", "", "onAudioAlignment", "onAgentResponseMetadata", "onUserTranscript", "onAgentResponse", "Lkotlin/Function2;", "onAgentResponseCorrection", "Lkotlin/Function4;", "onAgentToolResponse", "Lkotlin/Function3;", "onConversationInitiationMetadata", "", "onInterruption", "Lwn/c;", "onEndCall", "onError", "<init>", "(Lio/elevenlabs/audio/AudioManager;Lio/elevenlabs/ClientToolRegistry;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/p;Lho/r;Lho/q;Lho/l;Lho/l;Lho/p;)V", "Lio/elevenlabs/models/ConversationEvent;", "event", "handleIncomingEvent", "(Lio/elevenlabs/models/ConversationEvent;Lwn/c;)Ljava/lang/Object;", FirebaseAnalytics.Param.CONTENT, "sendUserMessage", "(Ljava/lang/String;)V", "toolCallId", "result", "isError", "sendToolResult", "(Ljava/lang/String;Ljava/lang/String;Z)V", "isPositive", "sendFeedback", "(Z)V", "sendContextualUpdate", "sendUserActivity", "()V", "Lio/elevenlabs/models/ConversationMode;", "getCurrentMode", "()Lio/elevenlabs/models/ConversationMode;", "cleanup", "Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;", "handleAgentChatResponsePart", "(Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "handleTentativeUserTranscript", "(Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;", "handleTentativeAgentResponse", "(Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;)V", "Lio/elevenlabs/models/ConversationEvent$AudioAlignment;", "handleAudioAlignment", "(Lio/elevenlabs/models/ConversationEvent$AudioAlignment;)V", "Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;", "handleAgentResponseMetadata", "(Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;)V", "Lio/elevenlabs/models/ConversationEvent$AgentResponse;", "handleAgentResponse", "(Lio/elevenlabs/models/ConversationEvent$AgentResponse;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/ConversationEvent$UserTranscript;", "handleUserTranscript", "(Lio/elevenlabs/models/ConversationEvent$UserTranscript;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;", "handleAgentResponseCorrection", "(Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;)V", "Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;", "handleAgentToolResponse", "(Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;)V", "Lio/elevenlabs/models/ConversationEvent$Audio;", "handleAudio", "(Lio/elevenlabs/models/ConversationEvent$Audio;)V", "Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;", "handleConversationInitiationMetadata", "(Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;)V", "Lio/elevenlabs/models/ConversationEvent$Interruption;", "handleInterruption", "(Lio/elevenlabs/models/ConversationEvent$Interruption;)V", "Lio/elevenlabs/models/ConversationEvent$ServerError;", "handleServerError", "(Lio/elevenlabs/models/ConversationEvent$ServerError;)V", "handleClientToolCall", "(Lio/elevenlabs/models/ConversationEvent$ClientToolCall;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/ConversationEvent$Ping;", "handlePing", "(Lio/elevenlabs/models/ConversationEvent$Ping;)V", "Lio/elevenlabs/models/ConversationEvent$VadScore;", "handleVadScore", "(Lio/elevenlabs/models/ConversationEvent$VadScore;)V", "Lio/elevenlabs/audio/AudioManager;", "Lio/elevenlabs/ClientToolRegistry;", "Lho/l;", "Lho/p;", "Lho/r;", "Lho/q;", "Lfr/d0;", "scope", "Lfr/d0;", "Lir/j1;", "_conversationMode", "Lir/j1;", "Lir/z1;", "conversationMode", "Lir/z1;", "getConversationMode", "()Lir/z1;", "_lastAgentEventId", "Ljava/lang/Integer;", "_lastFeedbackSentForEventIdInt", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationEventHandler {
    private final j1 _conversationMode;
    private Integer _lastAgentEventId;
    private Integer _lastFeedbackSentForEventIdInt;
    private final AudioManager audioManager;
    private final z1 conversationMode;
    private final l messageCallback;
    private final l onAgentResponse;
    private final p onAgentResponseCorrection;
    private final l onAgentResponseMetadata;
    private final r onAgentToolResponse;
    private final l onAudioAlignment;
    private final l onCanSendFeedbackChange;
    private final q onConversationInitiationMetadata;
    private final l onEndCall;
    private final p onError;
    private final l onInterruption;
    private final l onUnhandledClientToolCall;
    private final l onUserTranscript;
    private final l onVadScore;
    private final d0 scope;
    private final ClientToolRegistry toolRegistry;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConversationEventHandler(AudioManager audioManager, ClientToolRegistry clientToolRegistry, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, p pVar, r rVar, q qVar, l lVar9, l lVar10, p pVar2, int i10, f fVar) {
        this(audioManager, clientToolRegistry, lVar, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        l lVar11;
        l lVar12;
        l lVar13;
        l lVar14;
        l lVar15;
        l lVar16;
        l lVar17;
        p pVar3;
        r rVar2;
        q qVar2;
        l lVar18;
        l lVar19;
        p pVar4;
        if ((i10 & 8) != 0) {
            lVar11 = null;
        } else {
            lVar11 = lVar2;
        }
        if ((i10 & 16) != 0) {
            lVar12 = null;
        } else {
            lVar12 = lVar3;
        }
        if ((i10 & 32) != 0) {
            lVar13 = null;
        } else {
            lVar13 = lVar4;
        }
        if ((i10 & 64) != 0) {
            lVar14 = null;
        } else {
            lVar14 = lVar5;
        }
        if ((i10 & 128) != 0) {
            lVar15 = null;
        } else {
            lVar15 = lVar6;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            lVar16 = null;
        } else {
            lVar16 = lVar7;
        }
        if ((i10 & 512) != 0) {
            lVar17 = null;
        } else {
            lVar17 = lVar8;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar;
        }
        if ((i10 & 2048) != 0) {
            rVar2 = null;
        } else {
            rVar2 = rVar;
        }
        if ((i10 & 4096) != 0) {
            qVar2 = null;
        } else {
            qVar2 = qVar;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            lVar18 = null;
        } else {
            lVar18 = lVar9;
        }
        if ((i10 & 16384) != 0) {
            lVar19 = null;
        } else {
            lVar19 = lVar10;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(2:20|(2:22|(2:26|(3:28|29|(1:31))))(2:32|(2:36|(1:38))))(2:39|(1:41))|12|13)|11|12|13))|43|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAgentChatResponsePart(ConversationEvent.AgentChatResponsePart agentChatResponsePart, c<? super z> cVar) {
        ConversationEventHandler$handleAgentChatResponsePart$1 conversationEventHandler$handleAgentChatResponsePart$1;
        int i10;
        if (cVar instanceof ConversationEventHandler$handleAgentChatResponsePart$1) {
            conversationEventHandler$handleAgentChatResponsePart$1 = (ConversationEventHandler$handleAgentChatResponsePart$1) cVar;
            int i11 = conversationEventHandler$handleAgentChatResponsePart$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationEventHandler$handleAgentChatResponsePart$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationEventHandler$handleAgentChatResponsePart$1.result;
                i10 = conversationEventHandler$handleAgentChatResponsePart$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    String partType = agentChatResponsePart.getPartType();
                    int hashCode = partType.hashCode();
                    if (hashCode != 3540994) {
                        if (hashCode != 95468472) {
                            if (hashCode == 109757538 && partType.equals("start")) {
                                this._conversationMode.setValue(ConversationMode.SPEAKING);
                                if (!this.audioManager.isPlaying()) {
                                    AudioManager audioManager = this.audioManager;
                                    conversationEventHandler$handleAgentChatResponsePart$1.label = 1;
                                    Object startPlayback = audioManager.startPlayback(conversationEventHandler$handleAgentChatResponsePart$1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (startPlayback == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                        } else if (partType.equals("delta") && agentChatResponsePart.getText().length() > 0) {
                            l lVar = this.onAgentResponse;
                            if (lVar != null) {
                                lVar.invoke(agentChatResponsePart.getText());
                            }
                        }
                    } else if (partType.equals("stop")) {
                        this._conversationMode.setValue(ConversationMode.LISTENING);
                    }
                    return z.f31622a;
                }
                return z.f31622a;
            }
        }
        conversationEventHandler$handleAgentChatResponsePart$1 = new ConversationEventHandler$handleAgentChatResponsePart$1(this, cVar);
        Object obj2 = conversationEventHandler$handleAgentChatResponsePart$1.result;
        i10 = conversationEventHandler$handleAgentChatResponsePart$1.label;
        if (i10 == 0) {
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(1:(3:9|10|11)(2:25|26))(5:27|(1:29)|30|(4:33|34|35|(1:37))|32)|13|14|(1:16)|18|19))|41|6|(0)(0)|13|14|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        android.util.Log.e("ConvEventHandler", "Error in onAgentResponse callback: " + r5.getMessage(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #1 {Exception -> 0x008d, blocks: (B:14:0x0081, B:16:0x0085), top: B:13:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAgentResponse(ConversationEvent.AgentResponse agentResponse, c<? super z> cVar) {
        ConversationEventHandler$handleAgentResponse$1 conversationEventHandler$handleAgentResponse$1;
        int i10;
        ConversationEventHandler conversationEventHandler;
        l lVar;
        if (cVar instanceof ConversationEventHandler$handleAgentResponse$1) {
            conversationEventHandler$handleAgentResponse$1 = (ConversationEventHandler$handleAgentResponse$1) cVar;
            int i11 = conversationEventHandler$handleAgentResponse$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationEventHandler$handleAgentResponse$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationEventHandler$handleAgentResponse$1.result;
                i10 = conversationEventHandler$handleAgentResponse$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        agentResponse = (ConversationEvent.AgentResponse) conversationEventHandler$handleAgentResponse$1.L$1;
                        conversationEventHandler = (ConversationEventHandler) conversationEventHandler$handleAgentResponse$1.L$0;
                        try {
                            sn.a.g(obj);
                        } catch (Exception e10) {
                            e = e10;
                            yn.f.b(Log.d("ConvEventHandler", "Failed to start audio playback: " + e.getMessage()));
                            lVar = conversationEventHandler.onAgentResponse;
                            if (lVar != null) {
                            }
                            return z.f31622a;
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this._conversationMode.setValue(ConversationMode.SPEAKING);
                    l lVar2 = this.onCanSendFeedbackChange;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.TRUE);
                    }
                    if (!this.audioManager.isPlaying()) {
                        try {
                            AudioManager audioManager = this.audioManager;
                            conversationEventHandler$handleAgentResponse$1.L$0 = this;
                            conversationEventHandler$handleAgentResponse$1.L$1 = agentResponse;
                            conversationEventHandler$handleAgentResponse$1.label = 1;
                            Object startPlayback = audioManager.startPlayback(conversationEventHandler$handleAgentResponse$1);
                            xn.a aVar = xn.a.f37986a;
                            if (startPlayback == aVar) {
                                return aVar;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            conversationEventHandler = this;
                            yn.f.b(Log.d("ConvEventHandler", "Failed to start audio playback: " + e.getMessage()));
                            lVar = conversationEventHandler.onAgentResponse;
                            if (lVar != null) {
                            }
                            return z.f31622a;
                        }
                    }
                    conversationEventHandler = this;
                }
                lVar = conversationEventHandler.onAgentResponse;
                if (lVar != null) {
                    lVar.invoke(agentResponse.getAgentResponse());
                }
                return z.f31622a;
            }
        }
        conversationEventHandler$handleAgentResponse$1 = new ConversationEventHandler$handleAgentResponse$1(this, cVar);
        Object obj2 = conversationEventHandler$handleAgentResponse$1.result;
        i10 = conversationEventHandler$handleAgentResponse$1.label;
        if (i10 == 0) {
        }
        lVar = conversationEventHandler.onAgentResponse;
        if (lVar != null) {
        }
        return z.f31622a;
    }

    private final void handleAgentResponseCorrection(ConversationEvent.AgentResponseCorrection event) {
        try {
            p pVar = this.onAgentResponseCorrection;
            if (pVar != null) {
                pVar.invoke(event.getOriginalAgentResponse(), event.getCorrectedAgentResponse());
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onAgentResponseCorrection callback: " + e10.getMessage(), e10);
        }
    }

    private final void handleAgentResponseMetadata(ConversationEvent.AgentResponseMetadata event) {
        try {
            l lVar = this.onAgentResponseMetadata;
            if (lVar != null) {
                lVar.invoke(event.getMetadata());
            }
        } catch (Throwable unused) {
        }
    }

    private final void handleAgentToolResponse(ConversationEvent.AgentToolResponse event) {
        try {
            r rVar = this.onAgentToolResponse;
            if (rVar != null) {
                rVar.invoke(event.getToolName(), event.getToolCallId(), event.getToolType(), Boolean.valueOf(event.isError()));
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onAgentToolResponse callback: " + e10.getMessage(), e10);
        }
        if (m.c(event.getToolName(), "end_call")) {
            g0.D(this.scope, null, null, new ConversationEventHandler$handleAgentToolResponse$1(this, null), 3);
        }
    }

    private final void handleAudio(ConversationEvent.Audio event) {
        Log.d("ConvEventHandler", "Audio event: id=" + event.getEventId() + ", bytes=" + event.getAudioBase64().length());
    }

    private final void handleAudioAlignment(ConversationEvent.AudioAlignment event) {
        try {
            l lVar = this.onAudioAlignment;
            if (lVar != null) {
                lVar.invoke(event.getAlignment());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleClientToolCall(ConversationEvent.ClientToolCall clientToolCall, c<? super z> cVar) {
        g0.D(this.scope, null, null, new ConversationEventHandler$handleClientToolCall$2(this, clientToolCall, null), 3);
        return z.f31622a;
    }

    private final void handleConversationInitiationMetadata(ConversationEvent.ConversationInitiationMetadata event) {
        try {
            q qVar = this.onConversationInitiationMetadata;
            if (qVar != null) {
                qVar.invoke(event.getConversationId(), event.getAgentOutputAudioFormat(), event.getUserInputAudioFormat());
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onConversationInitiationMetadata callback: " + e10.getMessage(), e10);
        }
    }

    private final void handleInterruption(ConversationEvent.Interruption event) {
        this._conversationMode.setValue(ConversationMode.LISTENING);
        l lVar = this.onCanSendFeedbackChange;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
        try {
            l lVar2 = this.onInterruption;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(event.getEventId()));
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onInterruption callback: " + e10.getMessage(), e10);
        }
    }

    private final void handlePing(ConversationEvent.Ping event) {
        Log.d("ConvEventHandler", "Ping received: eventId=" + event.getEventId() + ", pingMs=" + event.getPingMs());
        g0.D(this.scope, null, null, new ConversationEventHandler$handlePing$1(event, this, null), 3);
    }

    private final void handleServerError(ConversationEvent.ServerError event) {
        int code = event.getCode();
        String message = event.getMessage();
        if (message == null) {
            message = "unknown";
        }
        Log.e("ConvEventHandler", "Server error (" + code + "): " + message);
        try {
            p pVar = this.onError;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(event.getCode()), event.getMessage());
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onError callback: " + e10.getMessage(), e10);
        }
    }

    private final void handleTentativeAgentResponse(ConversationEvent.TentativeAgentResponse event) {
        try {
            l lVar = this.onAgentResponse;
            if (lVar != null) {
                lVar.invoke(event.getTentativeAgentResponse());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleTentativeUserTranscript(ConversationEvent.TentativeUserTranscript tentativeUserTranscript, c<? super z> cVar) {
        try {
            l lVar = this.onUserTranscript;
            if (lVar != null) {
                lVar.invoke(tentativeUserTranscript.getUserTranscript());
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleUserTranscript(ConversationEvent.UserTranscript userTranscript, c<? super z> cVar) {
        try {
            l lVar = this.onUserTranscript;
            if (lVar != null) {
                lVar.invoke(userTranscript.getUserTranscript());
            }
        } catch (Exception e10) {
            Log.e("ConvEventHandler", "Error in onUserTranscript callback: " + e10.getMessage(), e10);
        }
        return z.f31622a;
    }

    private final void handleVadScore(ConversationEvent.VadScore event) {
        try {
            l lVar = this.onVadScore;
            if (lVar != null) {
                lVar.invoke(Float.valueOf(event.getScore()));
            }
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Error in onVadScore callback: ", e10.getMessage(), "ConvEventHandler");
        }
    }

    public static /* synthetic */ void sendToolResult$default(ConversationEventHandler conversationEventHandler, String str, String str2, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        conversationEventHandler.sendToolResult(str, str2, z6);
    }

    public final void cleanup() {
        g0.i(this.scope, null);
        this._lastAgentEventId = null;
        this._lastFeedbackSentForEventIdInt = null;
    }

    public final z1 getConversationMode() {
        return this.conversationMode;
    }

    public final ConversationMode getCurrentMode() {
        return (ConversationMode) this._conversationMode.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:17)(2:14|15))(5:20|21|22|(2:24|(1:26))(2:28|(2:30|(1:32))(2:33|(2:35|(1:37))(2:38|(2:40|(1:42))(2:43|(1:45)(2:46|(1:48)(2:50|(1:52)(2:53|(1:55)(2:56|(1:58)(2:59|(1:61)(2:62|(1:64)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(2:80|81))))))))))))))))|27)|18|19))|84|6|7|(0)(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (handleClientToolCall((io.elevenlabs.models.ConversationEvent.ClientToolCall) r8, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0032, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
    
        android.gov.nist.javax.sip.header.a.s("Error handling conversation event: ", r8.getMessage(), "ConvEventHandler");
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleIncomingEvent(ConversationEvent conversationEvent, c<? super z> cVar) {
        ConversationEventHandler$handleIncomingEvent$1 conversationEventHandler$handleIncomingEvent$1;
        int i10;
        if (cVar instanceof ConversationEventHandler$handleIncomingEvent$1) {
            conversationEventHandler$handleIncomingEvent$1 = (ConversationEventHandler$handleIncomingEvent$1) cVar;
            int i11 = conversationEventHandler$handleIncomingEvent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationEventHandler$handleIncomingEvent$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationEventHandler$handleIncomingEvent$1.result;
                i10 = conversationEventHandler$handleIncomingEvent$1.label;
                if (i10 == 0) {
                    if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    boolean z6 = conversationEvent instanceof ConversationEvent.AgentResponse;
                    Object obj2 = xn.a.f37986a;
                    if (z6) {
                        conversationEventHandler$handleIncomingEvent$1.label = 1;
                        if (handleAgentResponse((ConversationEvent.AgentResponse) conversationEvent, conversationEventHandler$handleIncomingEvent$1) == obj2) {
                        }
                    } else if (conversationEvent instanceof ConversationEvent.AgentChatResponsePart) {
                        conversationEventHandler$handleIncomingEvent$1.label = 2;
                        if (handleAgentChatResponsePart((ConversationEvent.AgentChatResponsePart) conversationEvent, conversationEventHandler$handleIncomingEvent$1) == obj2) {
                        }
                    } else if (conversationEvent instanceof ConversationEvent.UserTranscript) {
                        conversationEventHandler$handleIncomingEvent$1.label = 3;
                        if (handleUserTranscript((ConversationEvent.UserTranscript) conversationEvent, conversationEventHandler$handleIncomingEvent$1) == obj2) {
                        }
                    } else if (conversationEvent instanceof ConversationEvent.TentativeUserTranscript) {
                        conversationEventHandler$handleIncomingEvent$1.label = 4;
                        if (handleTentativeUserTranscript((ConversationEvent.TentativeUserTranscript) conversationEvent, conversationEventHandler$handleIncomingEvent$1) == obj2) {
                        }
                    } else if (conversationEvent instanceof ConversationEvent.TentativeAgentResponse) {
                        handleTentativeAgentResponse((ConversationEvent.TentativeAgentResponse) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.ClientToolCall) {
                        conversationEventHandler$handleIncomingEvent$1.label = 5;
                    } else if (conversationEvent instanceof ConversationEvent.VadScore) {
                        handleVadScore((ConversationEvent.VadScore) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.AudioAlignment) {
                        handleAudioAlignment((ConversationEvent.AudioAlignment) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.AgentResponseMetadata) {
                        handleAgentResponseMetadata((ConversationEvent.AgentResponseMetadata) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.Ping) {
                        handlePing((ConversationEvent.Ping) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.AgentResponseCorrection) {
                        handleAgentResponseCorrection((ConversationEvent.AgentResponseCorrection) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.AgentToolResponse) {
                        handleAgentToolResponse((ConversationEvent.AgentToolResponse) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.Audio) {
                        handleAudio((ConversationEvent.Audio) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.ConversationInitiationMetadata) {
                        handleConversationInitiationMetadata((ConversationEvent.ConversationInitiationMetadata) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.Interruption) {
                        handleInterruption((ConversationEvent.Interruption) conversationEvent);
                    } else if (conversationEvent instanceof ConversationEvent.ServerError) {
                        handleServerError((ConversationEvent.ServerError) conversationEvent);
                    } else {
                        throw new RuntimeException();
                    }
                    return obj2;
                }
                return z.f31622a;
            }
        }
        conversationEventHandler$handleIncomingEvent$1 = new ConversationEventHandler$handleIncomingEvent$1(this, cVar);
        Object obj3 = conversationEventHandler$handleIncomingEvent$1.result;
        i10 = conversationEventHandler$handleIncomingEvent$1.label;
        if (i10 == 0) {
        }
        return z.f31622a;
    }

    public final void sendContextualUpdate(String content) {
        content.getClass();
        this.messageCallback.invoke(new OutgoingEvent.ContextualUpdate(content));
        Log.d("ConvEventHandler", "Sent contextual update: ".concat(content));
    }

    public final void sendFeedback(boolean isPositive) {
        String str;
        String str2;
        Integer num = this._lastAgentEventId;
        Integer num2 = this._lastFeedbackSentForEventIdInt;
        if (num != null) {
            if (num2 != null && num.intValue() <= num2.intValue()) {
                Log.d("ConvEventHandler", "Feedback already sent for event ID " + num + " (last feedback sent for: " + num2 + Separators.RPAREN);
                return;
            }
            try {
                if (isPositive) {
                    str = "like";
                } else {
                    str = "dislike";
                }
                this.messageCallback.invoke(new OutgoingEvent.Feedback(str, num.intValue()));
                if (isPositive) {
                    str2 = "positive";
                } else {
                    str2 = "negative";
                }
                Log.d("ConvEventHandler", "Sent " + str2 + " feedback for event ID: " + num);
                this._lastFeedbackSentForEventIdInt = num;
                l lVar = this.onCanSendFeedbackChange;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                    return;
                }
                return;
            } catch (Exception e10) {
                android.gov.nist.javax.sip.header.a.s("Error sending feedback: ", e10.getMessage(), "ConvEventHandler");
                return;
            }
        }
        Log.d("ConvEventHandler", "No agent response to provide feedback for");
    }

    public final void sendToolResult(String toolCallId, String result, boolean isError) {
        String str;
        toolCallId.getClass();
        result.getClass();
        this.messageCallback.invoke(new OutgoingEvent.ClientToolResult(toolCallId, result, isError));
        if (isError) {
            str = "ERROR";
        } else {
            str = "SUCCESS";
        }
        Log.d("ConvEventHandler", h.c("Sent tool result for call ID: ", toolCallId, " (", str, Separators.RPAREN));
    }

    public final void sendUserActivity() {
        try {
            this.messageCallback.invoke(new OutgoingEvent.UserActivity());
            Log.d("ConvEventHandler", "Sent user activity");
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Failed to send user activity: ", e10.getMessage(), "ConvEventHandler");
        }
    }

    public final void sendUserMessage(String content) {
        content.getClass();
        this.messageCallback.invoke(new OutgoingEvent.UserMessage(content));
    }

    public ConversationEventHandler(AudioManager audioManager, ClientToolRegistry clientToolRegistry, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, p pVar, r rVar, q qVar, l lVar9, l lVar10, p pVar2) {
        audioManager.getClass();
        clientToolRegistry.getClass();
        lVar.getClass();
        this.audioManager = audioManager;
        this.toolRegistry = clientToolRegistry;
        this.messageCallback = lVar;
        this.onCanSendFeedbackChange = lVar2;
        this.onUnhandledClientToolCall = lVar3;
        this.onVadScore = lVar4;
        this.onAudioAlignment = lVar5;
        this.onAgentResponseMetadata = lVar6;
        this.onUserTranscript = lVar7;
        this.onAgentResponse = lVar8;
        this.onAgentResponseCorrection = pVar;
        this.onAgentToolResponse = rVar;
        this.onConversationInitiationMetadata = qVar;
        this.onInterruption = lVar9;
        this.onEndCall = lVar10;
        this.onError = pVar2;
        e eVar = r0.f9888a;
        this.scope = g0.c(o.f20734a.plus(g0.f()));
        b2 c5 = ir.r.c(ConversationMode.LISTENING);
        this._conversationMode = c5;
        this.conversationMode = c5;
    }
}
