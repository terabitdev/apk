package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.n0;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import h4.f2;
import i1.m0;
import i1.y0;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.MicPermissionPromptKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.VoiceModeControlsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states.AssistantDisconnectedStateKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states.AssistantExplainerStateKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states.AssistantTermsStateKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.r0;
import io.elevenlabs.readerapp.ui.utils.NotificationPrimerSharedActions;
import io.elevenlabs.ui.components.EchoCloseButtonKt;
import io.elevenlabs.ui.components.KeepScreenOnKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.d5;
import q2.j7;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import rd.c1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ak\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001ai\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aC\u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0000H\u0003¢\u0006\u0004\b$\u0010%\u001a'\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010+¨\u0006,²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "readId", "voiceId", "", "position", "subtitle", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel;", "vm", "AskAssistantSheet", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "onEvent", "Lj/j;", "", "permissionLauncher", "onOpenSettings", "AskAssistantSheetUI", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;Lho/l;Lho/a;Lj/j;Lho/a;Ljava/lang/String;Lu2/m;I)V", "showTitle", "showActions", "showCloseButton", "showHeaderImage", "showOverflowMenu", "isAudioMuted", "onClose", "AssistantHeader", "(Ljava/lang/String;ZZZZZZLho/l;Lho/a;Lu2/m;I)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "status", "isKeyboardVisible", "AssistantConnectedContent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;Lho/l;ZLjava/lang/String;Lu2/m;I)V", "Landroid/content/Context;", "context", "permission", "hasAskedBefore", "isPermissionPermanentlyDenied", "(Landroid/content/Context;Ljava/lang/String;Z)Z", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAssistantSheetKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.t.values().length];
            try {
                iArr[androidx.lifecycle.t.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.t.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AskAssistantSheet(String str, String str2, long j4, String str3, ho.a aVar, AskAssistantViewModel askAssistantViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        AskAssistantViewModel askAssistantViewModel2;
        boolean z6;
        u2.q qVar;
        AskAssistantViewModel askAssistantViewModel3;
        q7.c cVar;
        int i13;
        u2.q qVar2;
        int i14;
        boolean rememberIsAppInForeground;
        boolean h10;
        Object L;
        AskAssistantViewModel askAssistantViewModel4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object L2;
        boolean z14;
        AskAssistantViewModel askAssistantViewModel5;
        boolean g10;
        Object L3;
        boolean h11;
        Object L4;
        boolean f10;
        Object L5;
        boolean h12;
        Object L6;
        boolean h13;
        Object L7;
        boolean h14;
        Object L8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-2142889741);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.e(j4)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.f(str3)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                askAssistantViewModel2 = askAssistantViewModel;
                if (qVar3.h(askAssistantViewModel2)) {
                    i15 = 131072;
                    i12 |= i15;
                }
            } else {
                askAssistantViewModel2 = askAssistantViewModel;
            }
            i15 = 65536;
            i12 |= i15;
        } else {
            askAssistantViewModel2 = askAssistantViewModel;
        }
        int i21 = i12;
        boolean z15 = true;
        if ((i21 & 74899) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i21 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 32) != 0) {
                    i21 &= -458753;
                    i13 = 0;
                    qVar2 = qVar3;
                    i14 = i21;
                    qVar2.q();
                    Context context = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                    q2 q2Var = (q2) qVar2.j(j1.f13138r);
                    z0 m10 = c1.m(askAssistantViewModel2.getStateFlow(), qVar2, i13);
                    rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, i13);
                    n0 n0Var = new n0(3);
                    h10 = qVar2.h(context) | qVar2.h(askAssistantViewModel2);
                    L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10) {
                    }
                    L = new n(context, askAssistantViewModel2);
                    qVar2.h0(L);
                    j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L, qVar2, 0);
                    boolean h15 = qVar2.h(askAssistantViewModel2);
                    askAssistantViewModel4 = askAssistantViewModel2;
                    if ((i14 & 14) != 4) {
                    }
                    boolean z16 = z10 | h15;
                    if ((i14 & 896) != 256) {
                    }
                    boolean z17 = z16 | z11;
                    if ((i14 & 112) != 32) {
                    }
                    z13 = z17 | z12;
                    L2 = qVar2.L();
                    if (!z13) {
                    }
                    z14 = rememberIsAppInForeground;
                    askAssistantViewModel5 = askAssistantViewModel4;
                    AskAssistantSheetKt$AskAssistantSheet$1$1 askAssistantSheetKt$AskAssistantSheet$1$1 = new AskAssistantSheetKt$AskAssistantSheet$1$1(askAssistantViewModel5, str, j4, str2, null);
                    qVar2.h0(askAssistantSheetKt$AskAssistantSheet$1$1);
                    L2 = askAssistantSheetKt$AskAssistantSheet$1$1;
                    sn.z zVar = sn.z.f31622a;
                    u2.r.f((ho.p) L2, zVar, qVar2);
                    Boolean valueOf = Boolean.valueOf(z14);
                    g10 = qVar2.g(z14) | qVar2.h(context) | qVar2.h(askAssistantViewModel5);
                    L3 = qVar2.L();
                    if (!g10) {
                    }
                    L3 = new AskAssistantSheetKt$AskAssistantSheet$2$1(z14, context, askAssistantViewModel5, null);
                    qVar2.h0(L3);
                    u2.r.f((ho.p) L3, valueOf, qVar2);
                    boolean h16 = qVar2.h(askAssistantViewModel5);
                    if ((57344 & i14) != 16384) {
                    }
                    h11 = h16 | z15 | qVar2.h(q2Var);
                    L4 = qVar2.L();
                    if (!h11) {
                    }
                    L4 = new AskAssistantSheetKt$AskAssistantSheet$3$1(askAssistantViewModel5, aVar, q2Var, null);
                    qVar2.h0(L4);
                    u2.r.f((ho.p) L4, zVar, qVar2);
                    Object[] objArr = {Boolean.valueOf(AskAssistantSheet$lambda$0(m10).getShowExplainerMessage()), Boolean.valueOf(AskAssistantSheet$lambda$0(m10).getShowTermsAcceptance()), AskAssistantSheet$lambda$0(m10).getMicPermissionGranted(), Boolean.valueOf(AskAssistantSheet$lambda$0(m10).getHasRequestedInitialPermission())};
                    f10 = qVar2.f(m10) | qVar2.h(askAssistantViewModel5) | qVar2.h(C);
                    L5 = qVar2.L();
                    if (!f10) {
                    }
                    L5 = new AskAssistantSheetKt$AskAssistantSheet$4$1(askAssistantViewModel5, C, m10, null);
                    qVar2.h0(L5);
                    u2.r.i(objArr, (ho.p) L5, qVar2);
                    h12 = qVar2.h(askAssistantViewModel5);
                    L6 = qVar2.L();
                    if (!h12) {
                    }
                    L6 = new p(askAssistantViewModel5, 1);
                    qVar2.h0(L6);
                    ComposeExtensionsKt.OnLifecycleEvent((ho.l) L6, qVar2, 0);
                    AssistantContract.State AskAssistantSheet$lambda$0 = AskAssistantSheet$lambda$0(m10);
                    h13 = qVar2.h(askAssistantViewModel5);
                    L7 = qVar2.L();
                    if (!h13) {
                    }
                    L7 = new AskAssistantSheetKt$AskAssistantSheet$6$1(askAssistantViewModel5);
                    qVar2.h0(L7);
                    ho.l lVar = (ho.l) ((oo.g) L7);
                    h14 = qVar2.h(context);
                    L8 = qVar2.L();
                    if (!h14) {
                    }
                    L8 = new j(context, 0);
                    qVar2.h0(L8);
                    u2.q qVar4 = qVar2;
                    AskAssistantSheetUI(str3, AskAssistantSheet$lambda$0, lVar, aVar, C, (ho.a) L8, str2, qVar4, ((i14 >> 9) & 14) | ((i14 >> 3) & 7168) | PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS | ((i14 << 15) & 3670016));
                    qVar = qVar4;
                    askAssistantViewModel3 = askAssistantViewModel5;
                }
                i13 = 0;
                qVar2 = qVar3;
                i14 = i21;
                qVar2.q();
                Context context2 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                q2 q2Var2 = (q2) qVar2.j(j1.f13138r);
                z0 m102 = c1.m(askAssistantViewModel2.getStateFlow(), qVar2, i13);
                rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, i13);
                n0 n0Var2 = new n0(3);
                h10 = qVar2.h(context2) | qVar2.h(askAssistantViewModel2);
                L = qVar2.L();
                u2.e eVar2 = u2.l.f33918a;
                if (!h10) {
                }
                L = new n(context2, askAssistantViewModel2);
                qVar2.h0(L);
                j.j C2 = android.support.v4.media.session.b.C(n0Var2, (ho.l) L, qVar2, 0);
                boolean h152 = qVar2.h(askAssistantViewModel2);
                askAssistantViewModel4 = askAssistantViewModel2;
                if ((i14 & 14) != 4) {
                }
                boolean z162 = z10 | h152;
                if ((i14 & 896) != 256) {
                }
                boolean z172 = z162 | z11;
                if ((i14 & 112) != 32) {
                }
                z13 = z172 | z12;
                L2 = qVar2.L();
                if (!z13) {
                }
                z14 = rememberIsAppInForeground;
                askAssistantViewModel5 = askAssistantViewModel4;
                AskAssistantSheetKt$AskAssistantSheet$1$1 askAssistantSheetKt$AskAssistantSheet$1$12 = new AskAssistantSheetKt$AskAssistantSheet$1$1(askAssistantViewModel5, str, j4, str2, null);
                qVar2.h0(askAssistantSheetKt$AskAssistantSheet$1$12);
                L2 = askAssistantSheetKt$AskAssistantSheet$1$12;
                sn.z zVar2 = sn.z.f31622a;
                u2.r.f((ho.p) L2, zVar2, qVar2);
                Boolean valueOf2 = Boolean.valueOf(z14);
                g10 = qVar2.g(z14) | qVar2.h(context2) | qVar2.h(askAssistantViewModel5);
                L3 = qVar2.L();
                if (!g10) {
                }
                L3 = new AskAssistantSheetKt$AskAssistantSheet$2$1(z14, context2, askAssistantViewModel5, null);
                qVar2.h0(L3);
                u2.r.f((ho.p) L3, valueOf2, qVar2);
                boolean h162 = qVar2.h(askAssistantViewModel5);
                if ((57344 & i14) != 16384) {
                }
                h11 = h162 | z15 | qVar2.h(q2Var2);
                L4 = qVar2.L();
                if (!h11) {
                }
                L4 = new AskAssistantSheetKt$AskAssistantSheet$3$1(askAssistantViewModel5, aVar, q2Var2, null);
                qVar2.h0(L4);
                u2.r.f((ho.p) L4, zVar2, qVar2);
                Object[] objArr2 = {Boolean.valueOf(AskAssistantSheet$lambda$0(m102).getShowExplainerMessage()), Boolean.valueOf(AskAssistantSheet$lambda$0(m102).getShowTermsAcceptance()), AskAssistantSheet$lambda$0(m102).getMicPermissionGranted(), Boolean.valueOf(AskAssistantSheet$lambda$0(m102).getHasRequestedInitialPermission())};
                f10 = qVar2.f(m102) | qVar2.h(askAssistantViewModel5) | qVar2.h(C2);
                L5 = qVar2.L();
                if (!f10) {
                }
                L5 = new AskAssistantSheetKt$AskAssistantSheet$4$1(askAssistantViewModel5, C2, m102, null);
                qVar2.h0(L5);
                u2.r.i(objArr2, (ho.p) L5, qVar2);
                h12 = qVar2.h(askAssistantViewModel5);
                L6 = qVar2.L();
                if (!h12) {
                }
                L6 = new p(askAssistantViewModel5, 1);
                qVar2.h0(L6);
                ComposeExtensionsKt.OnLifecycleEvent((ho.l) L6, qVar2, 0);
                AssistantContract.State AskAssistantSheet$lambda$02 = AskAssistantSheet$lambda$0(m102);
                h13 = qVar2.h(askAssistantViewModel5);
                L7 = qVar2.L();
                if (!h13) {
                }
                L7 = new AskAssistantSheetKt$AskAssistantSheet$6$1(askAssistantViewModel5);
                qVar2.h0(L7);
                ho.l lVar2 = (ho.l) ((oo.g) L7);
                h14 = qVar2.h(context2);
                L8 = qVar2.L();
                if (!h14) {
                }
                L8 = new j(context2, 0);
                qVar2.h0(L8);
                u2.q qVar42 = qVar2;
                AskAssistantSheetUI(str3, AskAssistantSheet$lambda$02, lVar2, aVar, C2, (ho.a) L8, str2, qVar42, ((i14 >> 9) & 14) | ((i14 >> 3) & 7168) | PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS | ((i14 << 15) & 3670016));
                qVar = qVar42;
                askAssistantViewModel3 = askAssistantViewModel5;
            } else {
                if ((i11 & 32) != 0) {
                    r1 a10 = r7.a.a(qVar3);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar3);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        i13 = 0;
                        qVar2 = qVar3;
                        i21 &= -458753;
                        askAssistantViewModel2 = (AskAssistantViewModel) gg.b.j0(e0.f20562a.b(AskAssistantViewModel.class), a10, null, o6, cVar, qVar2);
                        i14 = i21;
                        qVar2.q();
                        Context context22 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                        q2 q2Var22 = (q2) qVar2.j(j1.f13138r);
                        z0 m1022 = c1.m(askAssistantViewModel2.getStateFlow(), qVar2, i13);
                        rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, i13);
                        n0 n0Var22 = new n0(3);
                        h10 = qVar2.h(context22) | qVar2.h(askAssistantViewModel2);
                        L = qVar2.L();
                        u2.e eVar22 = u2.l.f33918a;
                        if (!h10 || L == eVar22) {
                            L = new n(context22, askAssistantViewModel2);
                            qVar2.h0(L);
                        }
                        j.j C22 = android.support.v4.media.session.b.C(n0Var22, (ho.l) L, qVar2, 0);
                        boolean h1522 = qVar2.h(askAssistantViewModel2);
                        askAssistantViewModel4 = askAssistantViewModel2;
                        if ((i14 & 14) != 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z1622 = z10 | h1522;
                        if ((i14 & 896) != 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z1722 = z1622 | z11;
                        if ((i14 & 112) != 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z1722 | z12;
                        L2 = qVar2.L();
                        if (!z13 || L2 == eVar22) {
                            z14 = rememberIsAppInForeground;
                            askAssistantViewModel5 = askAssistantViewModel4;
                            AskAssistantSheetKt$AskAssistantSheet$1$1 askAssistantSheetKt$AskAssistantSheet$1$122 = new AskAssistantSheetKt$AskAssistantSheet$1$1(askAssistantViewModel5, str, j4, str2, null);
                            qVar2.h0(askAssistantSheetKt$AskAssistantSheet$1$122);
                            L2 = askAssistantSheetKt$AskAssistantSheet$1$122;
                        } else {
                            askAssistantViewModel5 = askAssistantViewModel4;
                            z14 = rememberIsAppInForeground;
                        }
                        sn.z zVar22 = sn.z.f31622a;
                        u2.r.f((ho.p) L2, zVar22, qVar2);
                        Boolean valueOf22 = Boolean.valueOf(z14);
                        g10 = qVar2.g(z14) | qVar2.h(context22) | qVar2.h(askAssistantViewModel5);
                        L3 = qVar2.L();
                        if (!g10 || L3 == eVar22) {
                            L3 = new AskAssistantSheetKt$AskAssistantSheet$2$1(z14, context22, askAssistantViewModel5, null);
                            qVar2.h0(L3);
                        }
                        u2.r.f((ho.p) L3, valueOf22, qVar2);
                        boolean h1622 = qVar2.h(askAssistantViewModel5);
                        if ((57344 & i14) != 16384) {
                            z15 = false;
                        }
                        h11 = h1622 | z15 | qVar2.h(q2Var22);
                        L4 = qVar2.L();
                        if (!h11 || L4 == eVar22) {
                            L4 = new AskAssistantSheetKt$AskAssistantSheet$3$1(askAssistantViewModel5, aVar, q2Var22, null);
                            qVar2.h0(L4);
                        }
                        u2.r.f((ho.p) L4, zVar22, qVar2);
                        Object[] objArr22 = {Boolean.valueOf(AskAssistantSheet$lambda$0(m1022).getShowExplainerMessage()), Boolean.valueOf(AskAssistantSheet$lambda$0(m1022).getShowTermsAcceptance()), AskAssistantSheet$lambda$0(m1022).getMicPermissionGranted(), Boolean.valueOf(AskAssistantSheet$lambda$0(m1022).getHasRequestedInitialPermission())};
                        f10 = qVar2.f(m1022) | qVar2.h(askAssistantViewModel5) | qVar2.h(C22);
                        L5 = qVar2.L();
                        if (!f10 || L5 == eVar22) {
                            L5 = new AskAssistantSheetKt$AskAssistantSheet$4$1(askAssistantViewModel5, C22, m1022, null);
                            qVar2.h0(L5);
                        }
                        u2.r.i(objArr22, (ho.p) L5, qVar2);
                        h12 = qVar2.h(askAssistantViewModel5);
                        L6 = qVar2.L();
                        if (!h12 || L6 == eVar22) {
                            L6 = new p(askAssistantViewModel5, 1);
                            qVar2.h0(L6);
                        }
                        ComposeExtensionsKt.OnLifecycleEvent((ho.l) L6, qVar2, 0);
                        AssistantContract.State AskAssistantSheet$lambda$022 = AskAssistantSheet$lambda$0(m1022);
                        h13 = qVar2.h(askAssistantViewModel5);
                        L7 = qVar2.L();
                        if (!h13 || L7 == eVar22) {
                            L7 = new AskAssistantSheetKt$AskAssistantSheet$6$1(askAssistantViewModel5);
                            qVar2.h0(L7);
                        }
                        ho.l lVar22 = (ho.l) ((oo.g) L7);
                        h14 = qVar2.h(context22);
                        L8 = qVar2.L();
                        if (!h14 || L8 == eVar22) {
                            L8 = new j(context22, 0);
                            qVar2.h0(L8);
                        }
                        u2.q qVar422 = qVar2;
                        AskAssistantSheetUI(str3, AskAssistantSheet$lambda$022, lVar22, aVar, C22, (ho.a) L8, str2, qVar422, ((i14 >> 9) & 14) | ((i14 >> 3) & 7168) | PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS | ((i14 << 15) & 3670016));
                        qVar = qVar422;
                        askAssistantViewModel3 = askAssistantViewModel5;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                i13 = 0;
                qVar2 = qVar3;
                i14 = i21;
                qVar2.q();
                Context context222 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                q2 q2Var222 = (q2) qVar2.j(j1.f13138r);
                z0 m10222 = c1.m(askAssistantViewModel2.getStateFlow(), qVar2, i13);
                rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, i13);
                n0 n0Var222 = new n0(3);
                h10 = qVar2.h(context222) | qVar2.h(askAssistantViewModel2);
                L = qVar2.L();
                u2.e eVar222 = u2.l.f33918a;
                if (!h10) {
                }
                L = new n(context222, askAssistantViewModel2);
                qVar2.h0(L);
                j.j C222 = android.support.v4.media.session.b.C(n0Var222, (ho.l) L, qVar2, 0);
                boolean h15222 = qVar2.h(askAssistantViewModel2);
                askAssistantViewModel4 = askAssistantViewModel2;
                if ((i14 & 14) != 4) {
                }
                boolean z16222 = z10 | h15222;
                if ((i14 & 896) != 256) {
                }
                boolean z17222 = z16222 | z11;
                if ((i14 & 112) != 32) {
                }
                z13 = z17222 | z12;
                L2 = qVar2.L();
                if (!z13) {
                }
                z14 = rememberIsAppInForeground;
                askAssistantViewModel5 = askAssistantViewModel4;
                AskAssistantSheetKt$AskAssistantSheet$1$1 askAssistantSheetKt$AskAssistantSheet$1$1222 = new AskAssistantSheetKt$AskAssistantSheet$1$1(askAssistantViewModel5, str, j4, str2, null);
                qVar2.h0(askAssistantSheetKt$AskAssistantSheet$1$1222);
                L2 = askAssistantSheetKt$AskAssistantSheet$1$1222;
                sn.z zVar222 = sn.z.f31622a;
                u2.r.f((ho.p) L2, zVar222, qVar2);
                Boolean valueOf222 = Boolean.valueOf(z14);
                g10 = qVar2.g(z14) | qVar2.h(context222) | qVar2.h(askAssistantViewModel5);
                L3 = qVar2.L();
                if (!g10) {
                }
                L3 = new AskAssistantSheetKt$AskAssistantSheet$2$1(z14, context222, askAssistantViewModel5, null);
                qVar2.h0(L3);
                u2.r.f((ho.p) L3, valueOf222, qVar2);
                boolean h16222 = qVar2.h(askAssistantViewModel5);
                if ((57344 & i14) != 16384) {
                }
                h11 = h16222 | z15 | qVar2.h(q2Var222);
                L4 = qVar2.L();
                if (!h11) {
                }
                L4 = new AskAssistantSheetKt$AskAssistantSheet$3$1(askAssistantViewModel5, aVar, q2Var222, null);
                qVar2.h0(L4);
                u2.r.f((ho.p) L4, zVar222, qVar2);
                Object[] objArr222 = {Boolean.valueOf(AskAssistantSheet$lambda$0(m10222).getShowExplainerMessage()), Boolean.valueOf(AskAssistantSheet$lambda$0(m10222).getShowTermsAcceptance()), AskAssistantSheet$lambda$0(m10222).getMicPermissionGranted(), Boolean.valueOf(AskAssistantSheet$lambda$0(m10222).getHasRequestedInitialPermission())};
                f10 = qVar2.f(m10222) | qVar2.h(askAssistantViewModel5) | qVar2.h(C222);
                L5 = qVar2.L();
                if (!f10) {
                }
                L5 = new AskAssistantSheetKt$AskAssistantSheet$4$1(askAssistantViewModel5, C222, m10222, null);
                qVar2.h0(L5);
                u2.r.i(objArr222, (ho.p) L5, qVar2);
                h12 = qVar2.h(askAssistantViewModel5);
                L6 = qVar2.L();
                if (!h12) {
                }
                L6 = new p(askAssistantViewModel5, 1);
                qVar2.h0(L6);
                ComposeExtensionsKt.OnLifecycleEvent((ho.l) L6, qVar2, 0);
                AssistantContract.State AskAssistantSheet$lambda$0222 = AskAssistantSheet$lambda$0(m10222);
                h13 = qVar2.h(askAssistantViewModel5);
                L7 = qVar2.L();
                if (!h13) {
                }
                L7 = new AskAssistantSheetKt$AskAssistantSheet$6$1(askAssistantViewModel5);
                qVar2.h0(L7);
                ho.l lVar222 = (ho.l) ((oo.g) L7);
                h14 = qVar2.h(context222);
                L8 = qVar2.L();
                if (!h14) {
                }
                L8 = new j(context222, 0);
                qVar2.h0(L8);
                u2.q qVar4222 = qVar2;
                AskAssistantSheetUI(str3, AskAssistantSheet$lambda$0222, lVar222, aVar, C222, (ho.a) L8, str2, qVar4222, ((i14 >> 9) & 14) | ((i14 >> 3) & 7168) | PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS | ((i14 << 15) & 3670016));
                qVar = qVar4222;
                askAssistantViewModel3 = askAssistantViewModel5;
            }
        } else {
            qVar = qVar3;
            qVar.R();
            askAssistantViewModel3 = askAssistantViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k(str, str2, j4, str3, aVar, askAssistantViewModel3, i10, i11);
        }
    }

    public static final AssistantContract.State AskAssistantSheet$lambda$0(s2 s2Var) {
        return (AssistantContract.State) s2Var.getValue();
    }

    public static final sn.z AskAssistantSheet$lambda$1$0(Context context, AskAssistantViewModel askAssistantViewModel, boolean z6) {
        boolean z10;
        if (!z6) {
            z10 = isPermissionPermanentlyDenied(context, "android.permission.RECORD_AUDIO", true);
        } else {
            z10 = false;
        }
        askAssistantViewModel.handlePermissionResult(z6, z10);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheet$lambda$6$0(AskAssistantViewModel askAssistantViewModel, androidx.lifecycle.t tVar) {
        tVar.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                askAssistantViewModel.onEvent(AssistantContract.Event.LifecyclePause.INSTANCE);
            }
        } else {
            askAssistantViewModel.onEvent(AssistantContract.Event.LifecycleResume.INSTANCE);
        }
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheet$lambda$8$0(Context context) {
        NotificationPrimerSharedActions.INSTANCE.openAppSettings(context);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheet$lambda$9(String str, String str2, long j4, String str3, ho.a aVar, AskAssistantViewModel askAssistantViewModel, int i10, int i11, u2.m mVar, int i12) {
        AskAssistantSheet(str, str2, j4, str3, aVar, askAssistantViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void AskAssistantSheetUI(String str, AssistantContract.State state, ho.l lVar, ho.a aVar, j.j jVar, ho.a aVar2, String str2, u2.m mVar, int i10) {
        int i11;
        ho.a aVar3;
        String str3;
        boolean z6;
        u2.q qVar;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean h10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1140658422);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(state)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if ((32768 & i10) == 0) {
                h10 = qVar2.f(jVar);
            } else {
                h10 = qVar2.h(jVar);
            }
            if (h10) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            aVar3 = aVar2;
            if (qVar2.h(aVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        } else {
            aVar3 = aVar2;
        }
        if ((1572864 & i10) == 0) {
            str3 = str2;
            if (qVar2.f(str3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        } else {
            str3 = str2;
        }
        if ((599187 & i11) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            boolean booleanValue = ((Boolean) u0.e(qVar2).f29145c.f29137d.getValue()).booleanValue();
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11 | z10;
            Object L = qVar2.L();
            if (z12 || L == u2.l.f33918a) {
                L = new c(lVar, aVar, 0);
                qVar2.h0(L);
            }
            qVar = qVar2;
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L, null, false, null, c3.k.d(-1023438264, true, new fm.o(str, (Object) state, (Object) lVar, 7), qVar2), c3.k.d(626334999, true, new d(state, lVar, jVar, aVar3, booleanValue, str3), qVar2), qVar, 1769472, 29);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(str, state, lVar, aVar, jVar, aVar2, str2, i10);
        }
    }

    public static final sn.z AskAssistantSheetUI$lambda$0$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(AssistantContract.Event.Close.INSTANCE);
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$1(String str, AssistantContract.State state, ho.l lVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        bottomSheetControl.getClass();
        boolean showHeaderTitle = state.getShowHeaderTitle();
        boolean showHeaderActions = state.getShowHeaderActions();
        boolean showHeaderClose = state.getShowHeaderClose();
        boolean showExplainerMessage = state.getShowExplainerMessage();
        boolean showOverflowMenu = state.getShowOverflowMenu();
        boolean isAudioMuted = state.isAudioMuted();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new AskAssistantSheetKt$AskAssistantSheetUI$2$1$1(bottomSheetControl);
            qVar.h0(L);
        }
        AssistantHeader(str, showHeaderTitle, showHeaderActions, showHeaderClose, showExplainerMessage, showOverflowMenu, isAudioMuted, lVar, (ho.a) ((oo.g) L), qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2(AssistantContract.State state, ho.l lVar, j.j jVar, ho.a aVar, boolean z6, String str, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        boolean z10;
        i3.t e10;
        boolean z11;
        AssistantContract.State state2;
        u2.q qVar;
        u2.m mVar2 = mVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        if (state.getStatus() == AssistantStatus.CONNECTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        KeepScreenOnKt.KeepScreenOn(z10, mVar2, 0);
        boolean showFullyExpandedSheet = state.getShowFullyExpandedSheet();
        i3.q qVar2 = i3.q.f13017a;
        if (showFullyExpandedSheet) {
            e10 = p2.d(qVar2, 1.0f);
        } else {
            e10 = p2.e(qVar2, 1.0f);
        }
        WeakHashMap weakHashMap = c3.f29142x;
        i3.t P = r1.d.P(e10, new o1(u0.e(mVar2).f29155m, 32));
        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar2, 0);
        u2.q qVar3 = (u2.q) mVar2;
        int hashCode = Long.hashCode(qVar3.T);
        c3.o l4 = qVar3.l();
        i3.t c5 = i3.a.c(P, mVar2);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar3.f33969a;
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(fVar);
        } else {
            qVar3.k0();
        }
        u2.r.J(h4.g.f11907f, a10, mVar2);
        u2.r.J(h4.g.f11906e, l4, mVar2);
        u2.r.y(mVar2, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, mVar2);
        u2.r.J(h4.g.f11905d, c5, mVar2);
        boolean showExplainerMessage = state.getShowExplainerMessage();
        u2.e eVar = u2.l.f33918a;
        if (showExplainerMessage) {
            qVar3.X(1208499328);
            boolean f10 = qVar3.f(lVar);
            Object L = qVar3.L();
            if (f10 || L == eVar) {
                L = new b(lVar, 7);
                qVar3.h0(L);
            }
            AssistantExplainerStateKt.AssistantExplainerState((ho.a) L, null, mVar2, 0, 2);
            qVar3.p(false);
            state2 = state;
        } else if (state.getShowTermsAcceptance()) {
            qVar3.X(1208505055);
            boolean f11 = qVar3.f(lVar);
            Object L2 = qVar3.L();
            if (f11 || L2 == eVar) {
                L2 = new b(lVar, 8);
                qVar3.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            boolean f12 = qVar3.f(lVar) | qVar3.h(bottomSheetControl);
            Object L3 = qVar3.L();
            if (f12 || L3 == eVar) {
                L3 = new c(lVar, bottomSheetControl, 1);
                qVar3.h0(L3);
            }
            AssistantTermsStateKt.AssistantTermsState(aVar2, (ho.a) L3, null, mVar2, 0, 4);
            qVar3.p(false);
            state2 = state;
            mVar2 = mVar;
        } else {
            float f13 = Float.MAX_VALUE;
            if (kotlin.jvm.internal.m.c(state.getMicPermissionGranted(), Boolean.FALSE) && (state.getHasDeniedInitialPermissionPrompt() || state.getMicPermissionPermanentlyDenied())) {
                qVar3.X(-1190482556);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f13 = 1.0f;
                }
                m1 m1Var = new m1(f13, true);
                boolean micPermissionPermanentlyDenied = state.getMicPermissionPermanentlyDenied();
                boolean h10 = qVar3.h(jVar);
                Object L4 = qVar3.L();
                if (h10 || L4 == eVar) {
                    L4 = new j(jVar, 1);
                    qVar3.h0(L4);
                }
                MicPermissionPromptKt.MicPermissionPrompt((ho.a) L4, m1Var, micPermissionPermanentlyDenied, aVar, mVar, 0, 0);
                qVar3.p(false);
                state2 = state;
                mVar2 = mVar;
            } else {
                qVar3.X(-1190072984);
                if (state.getStatus() == AssistantStatus.DISCONNECTED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f13 = 1.0f;
                }
                m1 m1Var2 = new m1(f13, true);
                Boolean valueOf = Boolean.valueOf(z11);
                Object L5 = qVar3.L();
                if (L5 == eVar) {
                    L5 = new o(5);
                    qVar3.h0(L5);
                }
                state2 = state;
                mVar2 = mVar;
                i1.l.b(valueOf, m1Var2, (ho.l) L5, null, "status_transition", null, c3.k.d(883202269, true, new f(lVar, state2, z6, str), mVar), mVar2, 1597824, 40);
                qVar3.p(false);
            }
        }
        if (state2.getShowBetaLabel()) {
            qVar3.X(-1189059222);
            i3.t e11 = p2.e(qVar2, 1.0f);
            String R = kj.c.R(mVar2, R.string.common_beta_feature_warning);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            j7.d(R, e11, p3.x.b(0.32f, echoTheme.getColors(mVar2, i11).getText().getPrimary(mVar2, EchoThemeColors.Text.$stable)), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(mVar2, i11).getXsRegular400(mVar2, EchoThemeTypography.$stable), mVar, 48, 0, 130040);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(mVar, i11).getX4()), mVar);
            qVar = qVar3;
            qVar.p(false);
        } else {
            qVar = qVar3;
            qVar.X(-1188606591);
            qVar.p(false);
        }
        qVar.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$0$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.DismissExplainer.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$1$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.AcceptTerms.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$2$0(ho.l lVar, BottomSheetControl bottomSheetControl) {
        lVar.invoke(AssistantContract.Event.DeclineTerms.INSTANCE);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$3$0(j.j jVar) {
        jVar.a("android.permission.RECORD_AUDIO");
        return sn.z.f31622a;
    }

    public static final m0 AskAssistantSheetUI$lambda$2$0$4$0(i1.q qVar) {
        qVar.getClass();
        return i1.l.c(y0.e(null, 3), y0.f(null, 3));
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$5(ho.l lVar, AssistantContract.State state, boolean z6, String str, i1.o oVar, boolean z10, u2.m mVar, int i10) {
        oVar.getClass();
        if (z10) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(509211816);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new b(lVar, 0);
                qVar.h0(L);
            }
            AssistantDisconnectedStateKt.AssistantDisconnectedState((ho.a) L, null, state.getConfigError(), qVar, 0, 2);
            qVar.p(false);
        } else {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(509471906);
            AssistantConnectedContent(state.getStatus(), state, lVar, z6, str, qVar2, 0);
            qVar2.p(false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$2$0$5$0$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.Retry.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AskAssistantSheetUI$lambda$3(String str, AssistantContract.State state, ho.l lVar, ho.a aVar, j.j jVar, ho.a aVar2, String str2, int i10, u2.m mVar, int i11) {
        AskAssistantSheetUI(str, state, lVar, aVar, jVar, aVar2, str2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void AssistantConnectedContent(AssistantStatus assistantStatus, AssistantContract.State state, ho.l lVar, boolean z6, String str, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(629645206);
        if ((i10 & 48) == 0) {
            if (qVar.h(state)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.g(z6)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.f(str)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 9361) != 9360) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            if (state.getInteractionMode() == AssistantInteractionMode.TEXT) {
                z11 = true;
            }
            i3.t d10 = p2.d(i3.q.f13017a, 1.0f);
            Boolean valueOf = Boolean.valueOf(z11);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(4);
                qVar.h0(L);
            }
            i1.l.b(valueOf, d10, (ho.l) L, null, "mode_transition", null, c3.k.d(371680435, true, new f(state, lVar, z6, str), qVar), qVar, 1597872, 40);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(assistantStatus, state, lVar, z6, str, i10, 1);
        }
    }

    public static final m0 AssistantConnectedContent$lambda$0$0(i1.q qVar) {
        qVar.getClass();
        boolean booleanValue = ((Boolean) ((i1.x) qVar).a()).booleanValue();
        return i1.l.c(y0.e(j1.e.s(300, 0, null, 6), 2).a(y0.l(new q(booleanValue, 2), j1.e.s(300, 0, null, 6))), y0.f(j1.e.s(300, 0, null, 6), 2).a(y0.o(new q(booleanValue, 3), j1.e.s(300, 0, null, 6))));
    }

    public static final int AssistantConnectedContent$lambda$0$0$0(boolean z6, int i10) {
        if (z6) {
            return i10 / 4;
        }
        return (-i10) / 4;
    }

    public static final int AssistantConnectedContent$lambda$0$0$1(boolean z6, int i10) {
        if (z6) {
            return (-i10) / 4;
        }
        return i10 / 4;
    }

    public static final sn.z AssistantConnectedContent$lambda$1(AssistantContract.State state, final ho.l lVar, boolean z6, String str, i1.o oVar, boolean z10, u2.m mVar, int i10) {
        boolean z11;
        oVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(state);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            if (state.getStatus() != AssistantStatus.CONNECTED) {
                z11 = true;
            } else {
                z11 = false;
            }
            L = Boolean.valueOf(z11);
            qVar.h0(L);
        }
        boolean booleanValue = ((Boolean) L).booleanValue();
        if (z10) {
            qVar.X(306294242);
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                final int i11 = 0;
                L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.h
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z AssistantConnectedContent$lambda$1$1$0;
                        sn.z AssistantConnectedContent$lambda$1$4$0$0;
                        switch (i11) {
                            case 0:
                                AssistantConnectedContent$lambda$1$1$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$1$1$0(lVar, (String) obj);
                                return AssistantConnectedContent$lambda$1$1$0;
                            default:
                                AssistantConnectedContent$lambda$1$4$0$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$1$4$0$0(lVar, (String) obj);
                                return AssistantConnectedContent$lambda$1$4$0$0;
                        }
                    }
                };
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            boolean f12 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f12 || L3 == eVar) {
                L3 = new b(lVar, 1);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            boolean f13 = qVar.f(lVar) | qVar.g(z6);
            Object L4 = qVar.L();
            if (f13 || L4 == eVar) {
                L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.n(lVar, 1, z6);
                qVar.h0(L4);
            }
            AssistantTextModeScreenKt.AssistantTextModeScreen(state, booleanValue, lVar2, aVar, (ho.a) L4, qVar, 0);
            qVar.p(false);
        } else {
            qVar.X(306898680);
            i3.t d10 = p2.d(i3.q.f13017a, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29234g, i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            boolean f14 = qVar.f(lVar);
            Object L5 = qVar.L();
            if (f14 || L5 == eVar) {
                final int i12 = 1;
                L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.h
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z AssistantConnectedContent$lambda$1$1$0;
                        sn.z AssistantConnectedContent$lambda$1$4$0$0;
                        switch (i12) {
                            case 0:
                                AssistantConnectedContent$lambda$1$1$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$1$1$0(lVar, (String) obj);
                                return AssistantConnectedContent$lambda$1$1$0;
                            default:
                                AssistantConnectedContent$lambda$1$4$0$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$1$4$0$0(lVar, (String) obj);
                                return AssistantConnectedContent$lambda$1$4$0$0;
                        }
                    }
                };
                qVar.h0(L5);
            }
            AssistantVoiceModeScreenKt.AssistantVoiceModeScreen(str, state, booleanValue, (ho.l) L5, m1Var, qVar, 0, 0);
            boolean isMicMuted = state.isMicMuted();
            boolean f15 = qVar.f(lVar);
            Object L6 = qVar.L();
            if (f15 || L6 == eVar) {
                L6 = new b(lVar, 2);
                qVar.h0(L6);
            }
            ho.a aVar2 = (ho.a) L6;
            boolean f16 = qVar.f(lVar) | qVar.g(z6);
            Object L7 = qVar.L();
            if (f16 || L7 == eVar) {
                L7 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.n(lVar, 2, z6);
                qVar.h0(L7);
            }
            VoiceModeControlsKt.VoiceModeControls(booleanValue, isMicMuted, aVar2, (ho.a) L7, null, qVar, 0, 16);
            qVar.p(true);
            qVar.p(false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$1$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new AssistantContract.Event.SendTextMessage(str));
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$2$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.UserTyping.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$3$0(ho.l lVar, boolean z6) {
        lVar.invoke(new AssistantContract.Event.ToggleMode(z6));
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$4$0$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new AssistantContract.Event.SuggestedPromptClicked(str));
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$4$1$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.ToggleMic.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$1$4$2$0(ho.l lVar, boolean z6) {
        lVar.invoke(new AssistantContract.Event.ToggleMode(z6));
        return sn.z.f31622a;
    }

    public static final sn.z AssistantConnectedContent$lambda$2(AssistantStatus assistantStatus, AssistantContract.State state, ho.l lVar, boolean z6, String str, int i10, u2.m mVar, int i11) {
        AssistantConnectedContent(assistantStatus, state, lVar, z6, str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void AssistantHeader(final String str, final boolean z6, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final ho.l lVar, final ho.a aVar, u2.m mVar, final int i10) {
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        ho.l lVar2;
        ho.a aVar2;
        boolean z18;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1890564244);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.g(z10)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        if ((i10 & 3072) == 0) {
            z15 = z11;
            if (qVar2.g(z15)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i17;
        } else {
            z15 = z11;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.g(z12)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i16;
        }
        if ((196608 & i10) == 0) {
            z16 = z13;
            if (qVar2.g(z16)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        } else {
            z16 = z13;
        }
        if ((1572864 & i10) == 0) {
            z17 = z14;
            if (qVar2.g(z17)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        } else {
            z17 = z14;
        }
        if ((12582912 & i10) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        } else {
            lVar2 = lVar;
        }
        if ((100663296 & i10) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        } else {
            aVar2 = aVar;
        }
        if ((38347923 & i11) != 38347922) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (qVar2.O(i11 & 1, z18)) {
            final boolean z19 = z15;
            final boolean z20 = z17;
            final ho.l lVar3 = lVar2;
            final ho.a aVar3 = aVar2;
            final boolean z21 = z16;
            qVar = qVar2;
            HeaderKt.EchoHeader(c3.k.d(-1547955323, true, new a(0, str, z6), qVar2), null, c3.k.d(1892472515, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.g
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z AssistantHeader$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    AssistantHeader$lambda$1 = AskAssistantSheetKt.AssistantHeader$lambda$1(z10, lVar3, z21, z20, z19, aVar3, (l2) obj, (u2.m) obj2, intValue);
                    return AssistantHeader$lambda$1;
                }
            }, qVar2), null, null, c3.k.d(-1729025455, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.i
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z AssistantHeader$lambda$2;
                    int intValue = ((Integer) obj3).intValue();
                    AssistantHeader$lambda$2 = AskAssistantSheetKt.AssistantHeader$lambda$2(z12, (r1.s) obj, (u2.m) obj2, intValue);
                    return AssistantHeader$lambda$2;
                }
            }, qVar2), qVar, 196998, 26);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.l
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z AssistantHeader$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    AssistantHeader$lambda$3 = AskAssistantSheetKt.AssistantHeader$lambda$3(str, z6, z10, z11, z12, z13, z14, lVar, aVar, i10, (u2.m) obj, intValue);
                    return AssistantHeader$lambda$3;
                }
            };
        }
    }

    public static final sn.z AssistantHeader$lambda$0(boolean z6, String str, l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        u2.q qVar;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z10)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t b10 = p2.b(l2Var.b(qVar3, 1.0f, true), t2.u.P, 48, 1);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.B0, qVar2, 54);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(b10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            if (z6) {
                qVar2.X(986446111);
                String R = kj.c.R(qVar2, R.string.assistant_title);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                EchoThemeTypography typography = echoTheme.getTypography(qVar2, i13);
                int i14 = EchoThemeTypography.$stable;
                j7.d(R, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, typography.getBaseRegular500(qVar2, i14), qVar2, 0, 24960, 110590);
                r1.d.g(p2.f(qVar3, 2), qVar2);
                j7.d(str, l1.n.i(), echoTheme.getColors(qVar2, i13).getText().getSecondary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar2, i13).getSmRegular400(qVar2, i14), qVar2, 48, 24960, 110584);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(987161095);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$1(boolean z6, ho.l lVar, boolean z10, boolean z11, boolean z12, ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z13;
        u2.q qVar;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z13 = true;
        } else {
            z13 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z13)) {
            u2.e eVar = u2.l.f33918a;
            if (z6) {
                qVar2.X(-1386947587);
                boolean f10 = qVar2.f(lVar);
                Object L = qVar2.L();
                if (f10 || L == eVar) {
                    L = new b(lVar, 3);
                    qVar2.h0(L);
                }
                d5.g((ho.a) L, p2.o(i3.q.f13017a, 48), false, d5.q(0L, EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getIcon().getPrimary(qVar2, EchoThemeColors.Icon.$stable), 0L, 0L, qVar2, 13), null, ComposableSingletons$AskAssistantSheetKt.INSTANCE.getLambda$396391740$app_productionRelease(), qVar2, 1572912, 52);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-1386269121);
                qVar.p(false);
            }
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new b(lVar, 4);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            boolean f12 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f12 || L3 == eVar) {
                L3 = new b(lVar, 5);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            boolean f13 = qVar.f(lVar);
            Object L4 = qVar.L();
            if (f13 || L4 == eVar) {
                L4 = new b(lVar, 6);
                qVar.h0(L4);
            }
            AssistantMenuKt.AssistantMenu(z10, aVar2, aVar3, (ho.a) L4, z11, qVar, 0);
            if (z12) {
                qVar.X(-1385845785);
                EchoCloseButtonKt.EchoCloseButton(aVar, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-1385791969);
                qVar.p(false);
            }
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$1$0$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.OpenOverflowMenu.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$1$1$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.CloseOverflowMenu.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$1$2$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.ToggleAudio.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$1$3$0(ho.l lVar) {
        lVar.invoke(AssistantContract.Event.GiveFeedback.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$2(boolean z6, r1.s sVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        sVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(sVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            if (z6) {
                qVar.X(145500532);
                u3.c M = kd.a.M(io.elevenlabs.ui.R.drawable.illustration_assistant_explainer, qVar, 0);
                i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
                i3.l lVar = i3.d.f12998b;
                l1.n.c(M, null, sVar.b(e10, lVar), lVar, f4.q.f8841d, t2.u.P, null, qVar, u3.c.$stable | 27696, 96);
                qVar.p(false);
            } else {
                qVar.X(145958929);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AssistantHeader$lambda$3(String str, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        AssistantHeader(str, z6, z10, z11, z12, z13, z14, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final boolean isPermissionPermanentlyDenied(Context context, String str, boolean z6) {
        i.m mVar;
        if (!z6) {
            return false;
        }
        if (context instanceof i.m) {
            mVar = (i.m) context;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return false;
        }
        return !y5.c.j(str, mVar);
    }
}
