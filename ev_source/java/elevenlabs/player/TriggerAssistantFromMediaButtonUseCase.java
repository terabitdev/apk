package io.elevenlabs.player;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import com.google.protobuf.c6;
import fr.g0;
import fr.z;
import ho.l;
import ho.p;
import ib.i;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.domain.services.player.AssistantTriggerEvent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 *2\u00020\u0001:\u0002*+B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJW\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010 \u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J`\u0010#\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001e2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0086B¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)¨\u0006,"}, d2 = {"Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase;", "", "Lio/elevenlabs/player/AssistantSessionManager;", "assistantSessionManager", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "assistantTriggerEmitter", "Lio/elevenlabs/domain/services/CharacterReportingService;", "characterReportingService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/player/AssistantSessionManager;Lio/elevenlabs/player/AssistantTriggerEmitter;Lio/elevenlabs/domain/services/CharacterReportingService;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "", "readId", "voiceId", "", "position", "Lkotlin/Function2;", "", "buildDeepLink", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lsn/z;", "startActivity", "launchAssistantUI", "(Ljava/lang/String;Ljava/lang/String;JLho/p;Lho/l;)V", "Lw7/h1;", "player", "Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;", "currentState", "startHeadlessAssistant", "(Ljava/lang/String;Ljava/lang/String;JLw7/h1;Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;Lwn/c;)Ljava/lang/Object;", "assistantState", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lw7/h1;Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;Lho/p;Lho/l;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/player/AssistantSessionManager;", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "Lio/elevenlabs/domain/services/CharacterReportingService;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Companion", "AssistantState", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TriggerAssistantFromMediaButtonUseCase {
    private static final String TAG = "TriggerAssistantFromMediaButtonUseCase";
    private final AssistantSessionManager assistantSessionManager;
    private final AssistantTriggerEmitter assistantTriggerEmitter;
    private final CharacterReportingService characterReportingService;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/player/TriggerAssistantFromMediaButtonUseCase$AssistantState;", "", "wasPlayingBeforeAssistant", "", "<init>", "(Z)V", "getWasPlayingBeforeAssistant", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AssistantState {
        private final boolean wasPlayingBeforeAssistant;

        public AssistantState(boolean z6) {
            this.wasPlayingBeforeAssistant = z6;
        }

        public static /* synthetic */ AssistantState copy$default(AssistantState assistantState, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z6 = assistantState.wasPlayingBeforeAssistant;
            }
            return assistantState.copy(z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWasPlayingBeforeAssistant() {
            return this.wasPlayingBeforeAssistant;
        }

        public final AssistantState copy(boolean wasPlayingBeforeAssistant) {
            return new AssistantState(wasPlayingBeforeAssistant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AssistantState) && this.wasPlayingBeforeAssistant == ((AssistantState) other).wasPlayingBeforeAssistant) {
                return true;
            }
            return false;
        }

        public final boolean getWasPlayingBeforeAssistant() {
            return this.wasPlayingBeforeAssistant;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasPlayingBeforeAssistant);
        }

        public String toString() {
            return "AssistantState(wasPlayingBeforeAssistant=" + this.wasPlayingBeforeAssistant + Separators.RPAREN;
        }
    }

    public TriggerAssistantFromMediaButtonUseCase(AssistantSessionManager assistantSessionManager, AssistantTriggerEmitter assistantTriggerEmitter, CharacterReportingService characterReportingService, DispatcherFactory dispatcherFactory, Logger logger) {
        assistantSessionManager.getClass();
        assistantTriggerEmitter.getClass();
        characterReportingService.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        this.assistantSessionManager = assistantSessionManager;
        this.assistantTriggerEmitter = assistantTriggerEmitter;
        this.characterReportingService = characterReportingService;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
    }

    private final void launchAssistantUI(String readId, String voiceId, long position, p buildDeepLink, l startActivity) {
        i.r("Launching assistant UI for readId=", readId, this.logger, TAG);
        this.assistantTriggerEmitter.emit(new AssistantTriggerEvent(readId, voiceId, position));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) buildDeepLink.invoke(readId, Boolean.TRUE)));
        intent.setFlags(805306368);
        startActivity.invoke(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startHeadlessAssistant(String str, String str2, long j4, h1 h1Var, AssistantState assistantState, wn.c<? super AssistantState> cVar) {
        TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1;
        int i10;
        String str3;
        xn.a aVar;
        AssistantState assistantState2;
        String str4;
        long j10;
        boolean booleanValue;
        Object m949startSessionyxL6bBk$default;
        h1 h1Var2;
        AssistantState assistantState3;
        Throwable a10;
        boolean z6;
        h1 h1Var3 = h1Var;
        if (cVar instanceof TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1) {
            triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 = (TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1) cVar;
            int i11 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1.label = i11 - Integer.MIN_VALUE;
                TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1;
                Object obj = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.result;
                i10 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.label;
                xn.a aVar2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                z6 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.Z$0;
                                assistantState3 = (AssistantState) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3;
                                sn.a.g(obj);
                                booleanValue = z6;
                                return assistantState3.copy(booleanValue);
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z10 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.Z$0;
                        long j11 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.J$0;
                        assistantState3 = (AssistantState) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3;
                        h1Var2 = (h1) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$2;
                        sn.a.g(obj);
                        Object obj2 = ((m) obj).f31603a;
                        booleanValue = z10;
                        aVar = aVar2;
                        j10 = j11;
                        m949startSessionyxL6bBk$default = obj2;
                        a10 = m.a(m949startSessionyxL6bBk$default);
                        if (a10 != null) {
                            Logger.logWarning$default(this.logger, TAG, "Failed to start headless assistant: " + a10, null, 4, null);
                            if (booleanValue) {
                                z main = this.dispatcherFactory.getMain();
                                TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1 triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1 = new TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1(h1Var2, null);
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$0 = null;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$1 = null;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$2 = null;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3 = assistantState3;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$4 = m949startSessionyxL6bBk$default;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$5 = null;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.J$0 = j10;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.Z$0 = booleanValue;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.I$0 = 0;
                                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.label = 3;
                                if (g0.Q(main, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12) == aVar) {
                                    return aVar;
                                }
                                z6 = booleanValue;
                                booleanValue = z6;
                            }
                        }
                        return assistantState3.copy(booleanValue);
                    }
                    long j12 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.J$0;
                    assistantState2 = (AssistantState) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3;
                    h1 h1Var4 = (h1) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$2;
                    String str5 = (String) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$1;
                    String str6 = (String) triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$0;
                    sn.a.g(obj);
                    h1Var3 = h1Var4;
                    aVar = aVar2;
                    str3 = str6;
                    str4 = str5;
                    j10 = j12;
                } else {
                    sn.a.g(obj);
                    i.r("Starting headless assistant for readId=", str, this.logger, TAG);
                    z main2 = this.dispatcherFactory.getMain();
                    TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$wasPlaying$1 triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$wasPlaying$1 = new TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$wasPlaying$1(h1Var3, null);
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$0 = str;
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$1 = str2;
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$2 = h1Var3;
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3 = assistantState;
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.J$0 = j4;
                    triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.label = 1;
                    obj = g0.Q(main2, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$wasPlaying$1, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    str3 = str;
                    aVar = aVar2;
                    assistantState2 = assistantState;
                    str4 = str2;
                    j10 = j4;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                AssistantSessionManager assistantSessionManager = this.assistantSessionManager;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$0 = null;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$1 = null;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$2 = h1Var3;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.L$3 = assistantState2;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.J$0 = j10;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.Z$0 = booleanValue;
                triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12.label = 2;
                m949startSessionyxL6bBk$default = AssistantSessionService.m949startSessionyxL6bBk$default(assistantSessionManager, str3, j10, str4, false, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$12, 8, null);
                if (m949startSessionyxL6bBk$default == aVar) {
                    h1Var2 = h1Var3;
                    assistantState3 = assistantState2;
                    a10 = m.a(m949startSessionyxL6bBk$default);
                    if (a10 != null) {
                    }
                    return assistantState3.copy(booleanValue);
                }
                return aVar;
            }
        }
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 = new TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1(this, cVar);
        TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1;
        Object obj3 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.result;
        i10 = triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.label;
        xn.a aVar22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        AssistantSessionManager assistantSessionManager2 = this.assistantSessionManager;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.L$0 = null;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.L$1 = null;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.L$2 = h1Var3;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.L$3 = assistantState2;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.J$0 = j10;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.Z$0 = booleanValue;
        triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122.label = 2;
        m949startSessionyxL6bBk$default = AssistantSessionService.m949startSessionyxL6bBk$default(assistantSessionManager2, str3, j10, str4, false, triggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$122, 8, null);
        if (m949startSessionyxL6bBk$default == aVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, String str2, h1 h1Var, AssistantState assistantState, p pVar, l lVar, wn.c<? super AssistantState> cVar) {
        TriggerAssistantFromMediaButtonUseCase$invoke$1 triggerAssistantFromMediaButtonUseCase$invoke$1;
        int i10;
        AssistantState assistantState2;
        if (cVar instanceof TriggerAssistantFromMediaButtonUseCase$invoke$1) {
            triggerAssistantFromMediaButtonUseCase$invoke$1 = (TriggerAssistantFromMediaButtonUseCase$invoke$1) cVar;
            int i11 = triggerAssistantFromMediaButtonUseCase$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                triggerAssistantFromMediaButtonUseCase$invoke$1.label = i11 - Integer.MIN_VALUE;
                TriggerAssistantFromMediaButtonUseCase$invoke$1 triggerAssistantFromMediaButtonUseCase$invoke$12 = triggerAssistantFromMediaButtonUseCase$invoke$1;
                Object obj = triggerAssistantFromMediaButtonUseCase$invoke$12.result;
                i10 = triggerAssistantFromMediaButtonUseCase$invoke$12.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    assistantState2 = (AssistantState) triggerAssistantFromMediaButtonUseCase$invoke$12.L$3;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    boolean isSessionActive = this.assistantSessionManager.isSessionActive();
                    Object obj2 = xn.a.f37986a;
                    if (isSessionActive) {
                        this.logger.log(TAG, "Ending active assistant session via media button");
                        this.assistantSessionManager.endSession(true);
                        if (!assistantState.getWasPlayingBeforeAssistant()) {
                            return assistantState;
                        }
                        z main = this.dispatcherFactory.getMain();
                        TriggerAssistantFromMediaButtonUseCase$invoke$2 triggerAssistantFromMediaButtonUseCase$invoke$2 = new TriggerAssistantFromMediaButtonUseCase$invoke$2(h1Var, null);
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$0 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$1 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$2 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$3 = assistantState;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$4 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$5 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.label = 1;
                        if (g0.Q(main, triggerAssistantFromMediaButtonUseCase$invoke$2, triggerAssistantFromMediaButtonUseCase$invoke$12) != obj2) {
                            assistantState2 = assistantState;
                        }
                    } else {
                        long currentPosition = this.characterReportingService.getCurrentPosition();
                        Logger logger = this.logger;
                        StringBuilder s10 = defpackage.f.s("Triggering assistant for readId=", str, ", voiceId=", str2, ", position=");
                        s10.append(currentPosition);
                        logger.log(TAG, s10.toString());
                        t0 t0Var = t0.f2884x0;
                        boolean a10 = t0.f2884x0.f2890f.f2799c.a(u.f2894d);
                        if (a10) {
                            launchAssistantUI(str, str2, currentPosition, pVar, lVar);
                            return assistantState;
                        }
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$0 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$1 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$2 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$3 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$4 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.L$5 = null;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.J$0 = currentPosition;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.Z$0 = a10;
                        triggerAssistantFromMediaButtonUseCase$invoke$12.label = 2;
                        Object startHeadlessAssistant = startHeadlessAssistant(str, str2, currentPosition, h1Var, assistantState, triggerAssistantFromMediaButtonUseCase$invoke$12);
                        if (startHeadlessAssistant != obj2) {
                            return startHeadlessAssistant;
                        }
                    }
                    return obj2;
                }
                return assistantState2.copy(false);
            }
        }
        triggerAssistantFromMediaButtonUseCase$invoke$1 = new TriggerAssistantFromMediaButtonUseCase$invoke$1(this, cVar);
        TriggerAssistantFromMediaButtonUseCase$invoke$1 triggerAssistantFromMediaButtonUseCase$invoke$122 = triggerAssistantFromMediaButtonUseCase$invoke$1;
        Object obj3 = triggerAssistantFromMediaButtonUseCase$invoke$122.result;
        i10 = triggerAssistantFromMediaButtonUseCase$invoke$122.label;
        if (i10 == 0) {
        }
        return assistantState2.copy(false);
    }
}
