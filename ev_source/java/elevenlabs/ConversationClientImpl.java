package io.elevenlabs;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.c6;
import io.elevenlabs.audio.AudioSessionManager;
import io.elevenlabs.audio.LiveKitAudioManager;
import io.elevenlabs.audio.NoOpAudioManager;
import io.elevenlabs.network.TokenResponse;
import io.elevenlabs.network.TokenService;
import io.elevenlabs.network.WebRTCConnection;
import io.elevenlabs.network.WebSocketConnection;
import io.livekit.android.AudioOptions;
import io.livekit.android.LiveKit;
import io.livekit.android.LiveKitOverrides;
import io.livekit.android.room.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import sn.z;
import wn.c;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/ConversationClientImpl;", "", "<init>", "()V", "Lio/elevenlabs/ConversationConfig;", "config", "Landroid/content/Context;", "context", "Lio/elevenlabs/ConversationSession;", "startVoiceSession", "(Lio/elevenlabs/ConversationConfig;Landroid/content/Context;Lwn/c;)Ljava/lang/Object;", "startTextOnlySession", "Lio/elevenlabs/ClientToolRegistry;", "buildToolRegistry", "(Lio/elevenlabs/ConversationConfig;)Lio/elevenlabs/ClientToolRegistry;", "Lsn/z;", "validateConfig", "(Lio/elevenlabs/ConversationConfig;)V", "startSession", "Lio/elevenlabs/ConversationSessionBuilder;", "builder", "(Landroid/content/Context;)Lio/elevenlabs/ConversationSessionBuilder;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationClientImpl {
    public static final ConversationClientImpl INSTANCE = new ConversationClientImpl();

    private ConversationClientImpl() {
    }

    private final ClientToolRegistry buildToolRegistry(ConversationConfig config) {
        ClientToolRegistry clientToolRegistry = new ClientToolRegistry();
        for (Map.Entry<String, ClientTool> entry : config.getClientTools().entrySet()) {
            String key = entry.getKey();
            try {
                clientToolRegistry.registerTool(key, entry.getValue());
            } catch (Exception e10) {
                Log.d("ConversationClient", "Failed to register client tool '" + key + "': " + e10.getMessage());
            }
        }
        return clientToolRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startTextOnlySession(ConversationConfig conversationConfig, Context context, c<? super ConversationSession> cVar) {
        ConversationClientImpl$startTextOnlySession$1 conversationClientImpl$startTextOnlySession$1;
        int i10;
        if (cVar instanceof ConversationClientImpl$startTextOnlySession$1) {
            conversationClientImpl$startTextOnlySession$1 = (ConversationClientImpl$startTextOnlySession$1) cVar;
            int i11 = conversationClientImpl$startTextOnlySession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationClientImpl$startTextOnlySession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationClientImpl$startTextOnlySession$1.result;
                i10 = conversationClientImpl$startTextOnlySession$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ConversationSessionImpl conversationSessionImpl = (ConversationSessionImpl) conversationClientImpl$startTextOnlySession$1.L$0;
                        sn.a.g(obj);
                        return conversationSessionImpl;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                WebSocketConnection webSocketConnection = new WebSocketConnection(null, null, 3, null);
                Log.d("ConversationClient", "WebSocketConnection initialized for text-only session");
                ConversationSessionImpl conversationSessionImpl2 = new ConversationSessionImpl(context, conversationConfig, null, webSocketConnection, new NoOpAudioManager(), buildToolRegistry(conversationConfig));
                conversationClientImpl$startTextOnlySession$1.L$0 = conversationSessionImpl2;
                conversationClientImpl$startTextOnlySession$1.label = 1;
                Object start = conversationSessionImpl2.start(conversationClientImpl$startTextOnlySession$1);
                xn.a aVar = xn.a.f37986a;
                if (start == aVar) {
                    return aVar;
                }
                return conversationSessionImpl2;
            }
        }
        conversationClientImpl$startTextOnlySession$1 = new ConversationClientImpl$startTextOnlySession$1(this, cVar);
        Object obj2 = conversationClientImpl$startTextOnlySession$1.result;
        i10 = conversationClientImpl$startTextOnlySession$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startVoiceSession(ConversationConfig conversationConfig, Context context, c<? super ConversationSession> cVar) {
        ConversationClientImpl$startVoiceSession$1 conversationClientImpl$startVoiceSession$1;
        ConversationClientImpl$startVoiceSession$1 conversationClientImpl$startVoiceSession$12;
        int i10;
        xn.a aVar;
        ConversationConfig conversationConfig2;
        Context context2;
        ConversationClientImpl conversationClientImpl;
        String str;
        String str2;
        ConversationClientImpl conversationClientImpl2;
        ConversationConfig conversationConfig3;
        ClientOverrides client;
        ClientOverrides client2;
        ConversationSessionImpl conversationSessionImpl;
        if (cVar instanceof ConversationClientImpl$startVoiceSession$1) {
            conversationClientImpl$startVoiceSession$1 = (ConversationClientImpl$startVoiceSession$1) cVar;
            int i11 = conversationClientImpl$startVoiceSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationClientImpl$startVoiceSession$1.label = i11 - Integer.MIN_VALUE;
                conversationClientImpl$startVoiceSession$12 = conversationClientImpl$startVoiceSession$1;
                Object obj = conversationClientImpl$startVoiceSession$12.result;
                i10 = conversationClientImpl$startVoiceSession$12.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ConversationSessionImpl conversationSessionImpl2 = (ConversationSessionImpl) conversationClientImpl$startVoiceSession$12.L$0;
                            sn.a.g(obj);
                            return conversationSessionImpl2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context2 = (Context) conversationClientImpl$startVoiceSession$12.L$2;
                    ConversationConfig conversationConfig4 = (ConversationConfig) conversationClientImpl$startVoiceSession$12.L$1;
                    conversationClientImpl2 = (ConversationClientImpl) conversationClientImpl$startVoiceSession$12.L$0;
                    sn.a.g(obj);
                    conversationConfig3 = conversationConfig4;
                } else {
                    sn.a.g(obj);
                    if (!conversationConfig.isPrivateAgent()) {
                        TokenService tokenService = new TokenService(conversationConfig.getApiEndpoint(), null, null, 6, null);
                        String agentId = conversationConfig.getAgentId();
                        agentId.getClass();
                        Overrides overrides = conversationConfig.getOverrides();
                        if (overrides == null || (client2 = overrides.getClient()) == null || (str = client2.getSource()) == null) {
                            str = "android_sdk";
                        }
                        String str3 = str;
                        Overrides overrides2 = conversationConfig.getOverrides();
                        if (overrides2 == null || (client = overrides2.getClient()) == null || (str2 = client.getVersion()) == null) {
                            str2 = BuildConfig.SDK_VERSION;
                        }
                        String str4 = str2;
                        String environment = conversationConfig.getEnvironment();
                        conversationClientImpl$startVoiceSession$12.L$0 = this;
                        conversationClientImpl$startVoiceSession$12.L$1 = conversationConfig;
                        context2 = context;
                        conversationClientImpl$startVoiceSession$12.L$2 = context2;
                        conversationClientImpl$startVoiceSession$12.label = 1;
                        Object fetchPublicAgentToken = tokenService.fetchPublicAgentToken(agentId, str3, str4, environment, conversationClientImpl$startVoiceSession$12);
                        if (fetchPublicAgentToken != aVar) {
                            conversationClientImpl2 = this;
                            conversationConfig3 = conversationConfig;
                            obj = fetchPublicAgentToken;
                        }
                        return aVar;
                    }
                    conversationConfig2 = conversationConfig;
                    context2 = context;
                    conversationClientImpl = this;
                    ConversationConfig conversationConfig5 = conversationConfig2;
                    Room create$default = LiveKit.create$default(LiveKit.INSTANCE, context2, null, new LiveKitOverrides(null, null, null, new AudioOptions(null, null, null, new a2.b(conversationConfig5, 19), false, null, 55, null), null, null, 55, null), 2, null);
                    Log.d("ConversationClient", "Created LiveKit room instance @" + create$default.hashCode());
                    WebRTCConnection webRTCConnection = new WebRTCConnection(context2, create$default, null, 4, null);
                    Log.d("ConversationClient", "WebRTCConnection initialized");
                    AudioSessionManager audioSessionManager = new AudioSessionManager(context2);
                    LiveKitAudioManager liveKitAudioManager = new LiveKitAudioManager(context2, create$default);
                    Log.d("ConversationClient", "LiveKitAudioManager initialized");
                    ClientToolRegistry buildToolRegistry = conversationClientImpl.buildToolRegistry(conversationConfig5);
                    audioSessionManager.configureForVoiceCall();
                    conversationSessionImpl = new ConversationSessionImpl(context2, conversationConfig5, create$default, webRTCConnection, liveKitAudioManager, buildToolRegistry);
                    conversationClientImpl$startVoiceSession$12.L$0 = conversationSessionImpl;
                    conversationClientImpl$startVoiceSession$12.L$1 = null;
                    conversationClientImpl$startVoiceSession$12.L$2 = null;
                    conversationClientImpl$startVoiceSession$12.label = 2;
                    if (conversationSessionImpl.start(conversationClientImpl$startVoiceSession$12) == aVar) {
                        return aVar;
                    }
                    return conversationSessionImpl;
                }
                conversationConfig2 = ConversationConfig.copy$default(conversationConfig3, null, ((TokenResponse) obj).getToken(), null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483644, null);
                conversationClientImpl = conversationClientImpl2;
                ConversationConfig conversationConfig52 = conversationConfig2;
                Room create$default2 = LiveKit.create$default(LiveKit.INSTANCE, context2, null, new LiveKitOverrides(null, null, null, new AudioOptions(null, null, null, new a2.b(conversationConfig52, 19), false, null, 55, null), null, null, 55, null), 2, null);
                Log.d("ConversationClient", "Created LiveKit room instance @" + create$default2.hashCode());
                WebRTCConnection webRTCConnection2 = new WebRTCConnection(context2, create$default2, null, 4, null);
                Log.d("ConversationClient", "WebRTCConnection initialized");
                AudioSessionManager audioSessionManager2 = new AudioSessionManager(context2);
                LiveKitAudioManager liveKitAudioManager2 = new LiveKitAudioManager(context2, create$default2);
                Log.d("ConversationClient", "LiveKitAudioManager initialized");
                ClientToolRegistry buildToolRegistry2 = conversationClientImpl.buildToolRegistry(conversationConfig52);
                audioSessionManager2.configureForVoiceCall();
                conversationSessionImpl = new ConversationSessionImpl(context2, conversationConfig52, create$default2, webRTCConnection2, liveKitAudioManager2, buildToolRegistry2);
                conversationClientImpl$startVoiceSession$12.L$0 = conversationSessionImpl;
                conversationClientImpl$startVoiceSession$12.L$1 = null;
                conversationClientImpl$startVoiceSession$12.L$2 = null;
                conversationClientImpl$startVoiceSession$12.label = 2;
                if (conversationSessionImpl.start(conversationClientImpl$startVoiceSession$12) == aVar) {
                }
            }
        }
        conversationClientImpl$startVoiceSession$1 = new ConversationClientImpl$startVoiceSession$1(this, cVar);
        conversationClientImpl$startVoiceSession$12 = conversationClientImpl$startVoiceSession$1;
        Object obj2 = conversationClientImpl$startVoiceSession$12.result;
        i10 = conversationClientImpl$startVoiceSession$12.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        conversationConfig2 = ConversationConfig.copy$default(conversationConfig3, null, ((TokenResponse) obj2).getToken(), null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483644, null);
        conversationClientImpl = conversationClientImpl2;
        ConversationConfig conversationConfig522 = conversationConfig2;
        Room create$default22 = LiveKit.create$default(LiveKit.INSTANCE, context2, null, new LiveKitOverrides(null, null, null, new AudioOptions(null, null, null, new a2.b(conversationConfig522, 19), false, null, 55, null), null, null, 55, null), 2, null);
        Log.d("ConversationClient", "Created LiveKit room instance @" + create$default22.hashCode());
        WebRTCConnection webRTCConnection22 = new WebRTCConnection(context2, create$default22, null, 4, null);
        Log.d("ConversationClient", "WebRTCConnection initialized");
        AudioSessionManager audioSessionManager22 = new AudioSessionManager(context2);
        LiveKitAudioManager liveKitAudioManager22 = new LiveKitAudioManager(context2, create$default22);
        Log.d("ConversationClient", "LiveKitAudioManager initialized");
        ClientToolRegistry buildToolRegistry22 = conversationClientImpl.buildToolRegistry(conversationConfig522);
        audioSessionManager22.configureForVoiceCall();
        conversationSessionImpl = new ConversationSessionImpl(context2, conversationConfig522, create$default22, webRTCConnection22, liveKitAudioManager22, buildToolRegistry22);
        conversationClientImpl$startVoiceSession$12.L$0 = conversationSessionImpl;
        conversationClientImpl$startVoiceSession$12.L$1 = null;
        conversationClientImpl$startVoiceSession$12.L$2 = null;
        conversationClientImpl$startVoiceSession$12.label = 2;
        if (conversationSessionImpl.start(conversationClientImpl$startVoiceSession$12) == aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z startVoiceSession$lambda$0(ConversationConfig conversationConfig, JavaAudioDeviceModule.Builder builder) {
        builder.getClass();
        builder.setSampleRate(conversationConfig.getAudioInputSampleRate());
        return z.f31622a;
    }

    private final void validateConfig(ConversationConfig config) {
        String str;
        String str2;
        String agentId = config.getAgentId();
        String str3 = null;
        if (agentId == null || n.m0(agentId)) {
            agentId = null;
        }
        if (agentId != null) {
            str = "agentId";
        } else {
            str = null;
        }
        String conversationToken = config.getConversationToken();
        if (conversationToken == null || n.m0(conversationToken)) {
            conversationToken = null;
        }
        if (conversationToken != null) {
            str2 = "conversationToken";
        } else {
            str2 = null;
        }
        String signedUrl = config.getSignedUrl();
        if (signedUrl == null || n.m0(signedUrl)) {
            signedUrl = null;
        }
        if (signedUrl != null) {
            str3 = "signedUrl";
        }
        List F0 = tn.n.F0(new String[]{str, str2, str3});
        if (((ArrayList) F0).size() == 1) {
            if (config.getTextOnly()) {
                String conversationToken2 = config.getConversationToken();
                if (conversationToken2 != null && !n.m0(conversationToken2)) {
                    c6.t("Text-only sessions use signedUrl (private) or agentId (public), not conversationToken");
                    return;
                }
                return;
            }
            String signedUrl2 = config.getSignedUrl();
            if (signedUrl2 != null && !n.m0(signedUrl2)) {
                c6.t("Voice sessions use conversationToken (private) or agentId (public), not signedUrl");
                return;
            }
            return;
        }
        m8.b.t(F0, "ConversationConfig requires exactly one of agentId / conversationToken / signedUrl, got ");
    }

    public final ConversationSessionBuilder builder(Context context) {
        context.getClass();
        return new ConversationSessionBuilder(context);
    }

    public final Object startSession(ConversationConfig conversationConfig, Context context, c<? super ConversationSession> cVar) {
        validateConfig(conversationConfig);
        if (conversationConfig.getTextOnly()) {
            return startTextOnlySession(conversationConfig, context, cVar);
        }
        return startVoiceSession(conversationConfig, context, cVar);
    }
}
