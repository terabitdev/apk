package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;
import io.elevenlabs.ui.extensions.SafeHapticFeedbackKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a_\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b$\u0010%\u001aG\u0010(\u001a\u00020'2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b(\u0010)\u001aO\u00101\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050+2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/H\u0003¢\u0006\u0004\b1\u00102\u001aC\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/H\u0003¢\u0006\u0004\b4\u00105\u001a#\u0010\b\u001a\u00020\u00072\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050+H\u0007¢\u0006\u0004\b\b\u00108\u001a\u000f\u00109\u001a\u00020\u0005H\u0003¢\u0006\u0004\b9\u0010:\u001a\u000f\u0010;\u001a\u00020\u0005H\u0007¢\u0006\u0004\b;\u0010:\u001a\u000f\u0010<\u001a\u00020\u0005H\u0007¢\u0006\u0004\b<\u0010:\"\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010?\"\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u001e\u0010D\u001a\u00020-*\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E*\u0018\b\u0002\u0010F\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004*8\b\u0002\u0010I\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0+2\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0+*D\b\u0002\u0010K\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0J2\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0J*D\b\u0002\u0010L\"\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0J2\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0G\u0012\u0006\u0012\u0004\u0018\u00010H0J¨\u0006T²\u0006\u000e\u0010M\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010O\u001a\u00020N8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010P\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\f\u0010Q\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010R\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010S\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"", "contentDescription", "Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Lio/elevenlabs/ui/components/ActionSpec;", "actionSpec", "Lio/elevenlabs/ui/components/SwipeAnchor;", "initialAnchor", "Lio/elevenlabs/ui/components/SwipeToActionMenuController;", "menuController", FirebaseAnalytics.Param.CONTENT, "SwipeToActionBox", "(Ljava/lang/String;Li3/t;Lho/a;Lio/elevenlabs/ui/components/ActionSpec;Lio/elevenlabs/ui/components/SwipeAnchor;Lio/elevenlabs/ui/components/SwipeToActionMenuController;Lho/p;Lu2/m;II)V", "Ln1/p;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "offsetX", "Lfr/d0;", "scope", "ActionRowsContainer", "(Ln1/p;Lio/elevenlabs/ui/components/ActionSpec;FLfr/d0;Li3/t;Lu2/m;II)V", "boxWidth", "", "Lio/elevenlabs/ui/components/ActionConfig;", "startSideActions", "endSideActions", "rememberAnchoredDraggableState", "(FLjava/util/List;Ljava/util/List;Lio/elevenlabs/ui/components/SwipeAnchor;Lu2/m;I)Ln1/p;", "startPeekPx", "endPeekPx", "startFullyOpenPx", "endFullyOpenPx", "Ln1/f1;", "buildDraggableAnchors", "(FFLjava/lang/Float;Ljava/lang/Float;)Ln1/f1;", "onThresholdCrossed", "Lio/elevenlabs/ui/components/ThresholdState;", "rememberThresholdState", "(Ln1/p;Ljava/util/List;Ljava/util/List;Lho/a;Lu2/m;I)Lio/elevenlabs/ui/components/ThresholdState;", "actions", "Lkotlin/Function1;", "onActionTap", "", "isThresholdCrossed", "Lio/elevenlabs/ui/components/BoxSide;", "side", "ActionsRow", "(Ljava/util/List;Lho/l;Li3/t;ZLio/elevenlabs/ui/components/BoxSide;Lu2/m;II)V", "item", "ActionItem", "(Lio/elevenlabs/ui/components/ActionConfig;Lho/a;Li3/t;ZLio/elevenlabs/ui/components/BoxSide;Lu2/m;II)V", "Lio/elevenlabs/ui/components/ActionSpecBuilder;", "block", "(Lho/q;Lu2/m;I)Lio/elevenlabs/ui/components/ActionSpec;", "TestingSwipeToActionBoxContent", "(Lu2/m;I)V", "Preview_SwipeToActionBox_StartSideOpen", "Preview_SwipeToActionBox_EndSideOpen", "Lh5/f;", "ACTION_ITEM_WIDTH", TokenNames.F, "RUBBER_BAND_EFFECT_FACTOR", "Lj1/e1;", "SNAP_ANIMATION_SPEC", "Lj1/e1;", "isSingleDestructiveAction", "(Ljava/util/List;)Z", "SimpleHandler", "Lwn/c;", "", "SuspendableHandlerWithConfirm", "Lkotlin/Function2;", "SuspendableActionHandlerWithConfirm", "SuspendableOnDismissGestureHandlerWithConfirm", "menuExpanded", "Lh5/g;", "menuOffset", "overscrollDelta", "visualOffset", "thresholdState", "animatedBias", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt {
    private static final float RUBBER_BAND_EFFECT_FACTOR = 0.2f;
    private static final float ACTION_ITEM_WIDTH = 94;
    private static final j1.e1 SNAP_ANIMATION_SPEC = new j1.e1(1.0f, (Object) null, 4);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ActionItem(ActionConfig actionConfig, ho.a aVar, i3.t tVar, boolean z6, BoxSide boxSide, u2.m mVar, int i10, int i11) {
        ActionConfig actionConfig2;
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int ordinal;
        int i17;
        boolean z11;
        BoxSide boxSide2;
        i3.t tVar3;
        boolean z12;
        u2.r1 r10;
        i3.t tVar4;
        boolean z13;
        BoxSide boxSide3;
        float f10;
        boolean z14;
        int i18;
        int i19;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-418866681);
        if ((i10 & 6) == 0) {
            actionConfig2 = actionConfig;
            if (qVar.f(actionConfig2)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            actionConfig2 = actionConfig;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (boxSide == null) {
                        ordinal = -1;
                    } else {
                        ordinal = boxSide.ordinal();
                    }
                    if (qVar.d(ordinal)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i20 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if (i16 != 0) {
                        boxSide3 = BoxSide.START;
                    } else {
                        boxSide3 = boxSide;
                    }
                    if (z13 && boxSide3 == BoxSide.START) {
                        f10 = 1.0f;
                    } else if (z13 && boxSide3 == BoxSide.END) {
                        f10 = -1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    BoxSide boxSide4 = boxSide3;
                    i3.l lVar = new i3.l(ActionItem$lambda$0(j1.f.b(f10, new j1.e1(0.5f, (Object) null, 4), "BiasAnimation", qVar, 3120, 20)), 0.0f);
                    if ((i12 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Object L = qVar.L();
                    if (z14 || L == u2.l.f33918a) {
                        L = new o(11, aVar);
                        qVar.h0(L);
                    }
                    i3.t tVar5 = tVar4;
                    i3.t h10 = l1.n.h(r1.p2.c(l1.n.p(tVar4, false, null, null, null, (ho.a) L, 15), 1.0f), actionConfig2.m1772getColor0d7_KjU(), p3.h0.f26395b);
                    f4.f1 d10 = r1.p.d(lVar, false);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(h10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    h4.e eVar = h4.g.f11907f;
                    u2.r.J(eVar, d10, qVar);
                    h4.e eVar2 = h4.g.f11906e;
                    u2.r.J(eVar2, l4, qVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar3 = h4.g.f11908g;
                    u2.r.y(qVar, valueOf, eVar3);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar);
                    h4.e eVar4 = h4.g.f11905d;
                    u2.r.J(eVar4, c5, qVar);
                    i3.t s10 = r1.p2.s(qVar2, ACTION_ITEM_WIDTH);
                    r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
                    int hashCode2 = Long.hashCode(qVar.T);
                    c3.o l7 = qVar.l();
                    i3.t c10 = i3.a.c(s10, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(eVar, a10, qVar);
                    u2.r.J(eVar2, l7, qVar);
                    defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                    u2.r.J(eVar4, c10, qVar);
                    u3.c M = kd.a.M(actionConfig.getIcon(), qVar, 0);
                    long j4 = p3.x.f26431f;
                    q2.y2.a(M, null, null, j4, qVar, u3.c.$stable | 3120, 4);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    ib.i.A(elevenLabsTheme, qVar, 6, qVar2, qVar);
                    j7.d(actionConfig.getText(), r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM(), 0.0f, 2), j4, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall500(), qVar, 384, 0, 130040);
                    qVar = qVar;
                    qVar.p(true);
                    qVar.p(true);
                    z12 = z13;
                    tVar3 = tVar5;
                    boxSide2 = boxSide4;
                } else {
                    qVar.R();
                    boxSide2 = boxSide;
                    tVar3 = tVar2;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new o2(actionConfig, aVar, tVar3, z12, boxSide2, i10, i11, 0);
                    return;
                }
                return;
            }
            z10 = z6;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        z10 = z6;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float ActionItem$lambda$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z ActionItem$lambda$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ActionItem$lambda$3(ActionConfig actionConfig, ho.a aVar, i3.t tVar, boolean z6, BoxSide boxSide, int i10, int i11, u2.m mVar, int i12) {
        ActionItem(actionConfig, aVar, tVar, z6, boxSide, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ActionRowsContainer(n1.p pVar, ActionSpec actionSpec, float f10, fr.d0 d0Var, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(33702451);
        if ((i10 & 6) == 0) {
            if (qVar.f(pVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(actionSpec)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.c(f10)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(d0Var)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        int i19 = i11 & 16;
        if (i19 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i14 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i19 != 0) {
                    tVar2 = qVar2;
                }
                SafeHapticFeedback safeHapticFeedback = SafeHapticFeedbackKt.safeHapticFeedback(qVar, 0);
                List<ActionConfig> startSide = actionSpec.getStartSide();
                List<ActionConfig> endSide = actionSpec.getEndSide();
                boolean h10 = qVar.h(safeHapticFeedback);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (h10 || L == eVar) {
                    L = new h0(safeHapticFeedback, 2);
                    qVar.h0(L);
                }
                int i20 = i14 & 14;
                i3.t tVar5 = tVar2;
                ThresholdState rememberThresholdState = rememberThresholdState(pVar, startSide, endSide, (ho.a) L, qVar, i20);
                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar5, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                h5.c cVar = (h5.c) qVar.j(i4.j1.f13129h);
                float d02 = cVar.d0(ACTION_ITEM_WIDTH);
                r1.t tVar6 = r1.t.f29349a;
                if (f10 > 0.0f && !actionSpec.getStartSide().isEmpty()) {
                    qVar.X(1945495777);
                    float size = d02 * actionSpec.getStartSide().size();
                    float e10 = f10 - ((n1.y) pVar.b()).e(SwipeAnchor.StartPeeking);
                    if (e10 < 0.0f) {
                        e10 = 0.0f;
                    }
                    float T = cVar.T(size + e10);
                    List<ActionConfig> startSide2 = actionSpec.getStartSide();
                    boolean h11 = qVar.h(d0Var);
                    if ((i14 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z17 = h11 | z14;
                    if (i20 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z18 = z17 | z15;
                    Object L2 = qVar.L();
                    if (z18 || L2 == eVar) {
                        L2 = new SwipeToActionBoxKt$ActionRowsContainer$1$1$1(d0Var, actionSpec, pVar);
                        qVar.h0(L2);
                    }
                    ho.l lVar = (ho.l) ((oo.g) L2);
                    i3.t s10 = r1.p2.s(tVar6.b(qVar2, i3.d.f13000d), T);
                    if (rememberThresholdState == ThresholdState.START_SIDE_CROSSED) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    tVar4 = tVar5;
                    z10 = true;
                    ActionsRow(startSide2, lVar, s10, z16, BoxSide.START, qVar, 24576, 0);
                    qVar.p(false);
                } else {
                    tVar4 = tVar5;
                    if (f10 < 0.0f && !actionSpec.getEndSide().isEmpty()) {
                        qVar.X(1946360429);
                        float size2 = d02 * actionSpec.getEndSide().size();
                        float e11 = ((n1.y) pVar.b()).e(SwipeAnchor.EndPeeking) - f10;
                        if (e11 < 0.0f) {
                            e11 = 0.0f;
                        }
                        float T2 = cVar.T(size2 + e11);
                        List<ActionConfig> endSide2 = actionSpec.getEndSide();
                        boolean h12 = qVar.h(d0Var);
                        if ((i14 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z19 = h12 | z11;
                        if (i20 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z20 = z19 | z12;
                        Object L3 = qVar.L();
                        if (z20 || L3 == eVar) {
                            L3 = new SwipeToActionBoxKt$ActionRowsContainer$1$2$1(d0Var, actionSpec, pVar);
                            qVar.h0(L3);
                        }
                        ho.l lVar2 = (ho.l) ((oo.g) L3);
                        i3.t s11 = r1.p2.s(tVar6.b(qVar2, i3.d.f13002f), T2);
                        if (rememberThresholdState == ThresholdState.END_SIDE_CROSSED) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ActionsRow(endSide2, lVar2, s11, z13, BoxSide.END, qVar, 24576, 0);
                        qVar.p(false);
                    } else {
                        qVar.X(1947135305);
                        qVar.p(false);
                    }
                    z10 = true;
                }
                qVar.p(z10);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.b(pVar, actionSpec, f10, d0Var, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((i14 & 9363) == 9362) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ActionRowsContainer$lambda$0$0(SafeHapticFeedback safeHapticFeedback) {
        safeHapticFeedback.mo1982performHapticFeedbackCdsT49E(0);
        return sn.z.f31622a;
    }

    public static final void ActionRowsContainer$lambda$1$handleActionTap(fr.d0 d0Var, ActionSpec actionSpec, n1.p pVar, ActionConfig actionConfig) {
        fr.g0.D(d0Var, null, null, new SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1(actionConfig, actionSpec, pVar, null), 3);
    }

    public static final sn.z ActionRowsContainer$lambda$2(n1.p pVar, ActionSpec actionSpec, float f10, fr.d0 d0Var, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ActionRowsContainer(pVar, actionSpec, f10, d0Var, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ActionsRow(List<ActionConfig> list, ho.l lVar, i3.t tVar, boolean z6, BoxSide boxSide, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int ordinal;
        int i17;
        boolean z11;
        i3.t tVar3;
        boolean z12;
        BoxSide boxSide2;
        u2.r1 r10;
        boolean z13;
        BoxSide boxSide3;
        boolean z14;
        int i18;
        int i19;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1967646892);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        int i20 = 32;
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (boxSide == null) {
                        ordinal = -1;
                    } else {
                        ordinal = boxSide.ordinal();
                    }
                    if (qVar.d(ordinal)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    if (i21 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if (i16 != 0) {
                        boxSide3 = BoxSide.START;
                    } else {
                        boxSide3 = boxSide;
                    }
                    i3.t c5 = r1.p2.c(tVar3, 1.0f);
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c10 = i3.a.c(c5, qVar);
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
                    Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c10, h4.g.f11905d, -1664772175, list);
                    while (s10.hasNext()) {
                        ActionConfig actionConfig = (ActionConfig) s10.next();
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        r1.m1 m1Var = new r1.m1(1.0f, true);
                        if ((i12 & 112) == i20) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean f10 = z14 | qVar.f(actionConfig);
                        Object L = qVar.L();
                        if (f10 || L == u2.l.f33918a) {
                            L = new b0(lVar, actionConfig, 3);
                            qVar.h0(L);
                        }
                        ActionItem(actionConfig, (ho.a) L, m1Var, z13, boxSide3, qVar, 64512 & i12, 0);
                        i20 = 32;
                    }
                    qVar.p(false);
                    qVar.p(true);
                    z12 = z13;
                    boxSide2 = boxSide3;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    z12 = z10;
                    boxSide2 = boxSide;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new o2(list, lVar, tVar3, z12, boxSide2, i10, i11, 1);
                    return;
                }
                return;
            }
            z10 = z6;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        z10 = z6;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ActionsRow$lambda$0$0$0$0(ho.l lVar, ActionConfig actionConfig) {
        lVar.invoke(actionConfig);
        return sn.z.f31622a;
    }

    public static final sn.z ActionsRow$lambda$1(List list, ho.l lVar, i3.t tVar, boolean z6, BoxSide boxSide, int i10, int i11, u2.m mVar, int i12) {
        ActionsRow(list, lVar, tVar, z6, boxSide, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_SwipeToActionBox_EndSideOpen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1828253229);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.plus_small;
            ReaderColors readerColors = ReaderColors.INSTANCE;
            SwipeToActionBox("Hello", r1.p2.f(i3.q.f13017a, 80), null, actionSpec(c3.k.d(-495160407, true, new s2(new ActionConfig(i11, "Add to collection", readerColors.m2395getGreen6000d7_KjU(), false, false, 24, null), new ActionConfig(R.drawable.unread, "Mark as unread", readerColors.m2439getPurple6000d7_KjU(), false, false, 24, null), new ActionConfig(R.drawable.bucket, "Archive", readerColors.m2419getNeutral8000d7_KjU(), true, false, 16, null), 0), qVar), qVar, 6), SwipeAnchor.EndPeeking, null, ComposableSingletons$SwipeToActionBoxKt.INSTANCE.m1824getLambda$1061626336$ui_release(), qVar, 1597494, 36);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 17);
        }
    }

    public static final sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0(final ActionConfig actionConfig, final ActionConfig actionConfig2, final ActionConfig actionConfig3, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        actionSpecBuilder.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(actionConfig) | qVar.f(actionConfig2) | qVar.f(actionConfig3);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            final int i11 = 0;
            L = new ho.l() { // from class: io.elevenlabs.ui.components.p2
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0;
                    sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0;
                    switch (i11) {
                        case 0:
                            Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0(actionConfig, actionConfig2, actionConfig3, (ActionSpecBuilder.HandlerScope) obj);
                            return Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0;
                        default:
                            Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0(actionConfig, actionConfig2, actionConfig3, (ActionSpecBuilder.PlacementScope) obj);
                            return Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0;
                    }
                }
            };
            qVar.h0(L);
        }
        actionSpecBuilder.handlers((ho.l) L);
        boolean f11 = qVar.f(actionConfig) | qVar.f(actionConfig2) | qVar.f(actionConfig3);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            final int i12 = 1;
            L2 = new ho.l() { // from class: io.elevenlabs.ui.components.p2
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0;
                    sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0;
                    switch (i12) {
                        case 0:
                            Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0(actionConfig, actionConfig2, actionConfig3, (ActionSpecBuilder.HandlerScope) obj);
                            return Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0;
                        default:
                            Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0(actionConfig, actionConfig2, actionConfig3, (ActionSpecBuilder.PlacementScope) obj);
                            return Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        actionSpecBuilder.placement((ho.l) L2);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$0$0(ActionConfig actionConfig, ActionConfig actionConfig2, ActionConfig actionConfig3, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new u0(29));
        handlerScope.handledBy(actionConfig2, new t2(0));
        handlerScope.handledBy(actionConfig3, new t2(1));
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0$1$0(ActionConfig actionConfig, ActionConfig actionConfig2, ActionConfig actionConfig3, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        un.b o6 = ig.f.o();
        o6.add(actionConfig);
        o6.add(actionConfig2);
        o6.add(actionConfig3);
        placementScope.setEndSide(ig.f.i(o6));
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SwipeToActionBox_EndSideOpen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SwipeToActionBox_StartSideOpen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1366620602);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SwipeToActionBox("Hello", r1.p2.f(i3.q.f13017a, 80), null, actionSpec(c3.k.d(-784130878, true, new c1(new ActionConfig(R.drawable.download, "Download", ReaderColors.INSTANCE.m2372getBlue5000d7_KjU(), false, false, 24, null), 4), qVar), qVar, 6), SwipeAnchor.StartPeeking, null, ComposableSingletons$SwipeToActionBoxKt.INSTANCE.getLambda$302957945$ui_release(), qVar, 1597494, 36);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 15);
        }
    }

    public static final sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0(final ActionConfig actionConfig, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        actionSpecBuilder.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(actionConfig);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            final int i11 = 0;
            L = new ho.l() { // from class: io.elevenlabs.ui.components.r2
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0;
                    sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0;
                    switch (i11) {
                        case 0:
                            Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0(actionConfig, (ActionSpecBuilder.HandlerScope) obj);
                            return Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0;
                        default:
                            Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0(actionConfig, (ActionSpecBuilder.PlacementScope) obj);
                            return Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0;
                    }
                }
            };
            qVar.h0(L);
        }
        actionSpecBuilder.handlers((ho.l) L);
        boolean f11 = qVar.f(actionConfig);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            final int i12 = 1;
            L2 = new ho.l() { // from class: io.elevenlabs.ui.components.r2
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0;
                    sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0;
                    switch (i12) {
                        case 0:
                            Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0(actionConfig, (ActionSpecBuilder.HandlerScope) obj);
                            return Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0;
                        default:
                            Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0(actionConfig, (ActionSpecBuilder.PlacementScope) obj);
                            return Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        actionSpecBuilder.placement((ho.l) L2);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$0$0(ActionConfig actionConfig, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new u0(28));
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0$1$0(ActionConfig actionConfig, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setStartSide(ig.f.H(actionConfig));
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SwipeToActionBox_StartSideOpen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToActionBox(String str, i3.t tVar, ho.a aVar, ActionSpec actionSpec, SwipeAnchor swipeAnchor, SwipeToActionMenuController swipeToActionMenuController, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        ho.a aVar2;
        ActionSpec actionSpec2;
        int i14;
        int i15;
        SwipeToActionMenuController swipeToActionMenuController2;
        char c5;
        i3.t tVar3;
        ho.a aVar3;
        ActionSpec actionSpec3;
        SwipeToActionMenuController swipeToActionMenuController3;
        SwipeAnchor swipeAnchor2;
        u2.q qVar;
        ho.p pVar2;
        u2.r1 r10;
        int i16;
        ho.a aVar4;
        i3.q qVar2;
        SwipeAnchor swipeAnchor3;
        ActionSpec actionSpec4;
        u2.w0 w0Var;
        h4.e eVar;
        h4.e eVar2;
        h4.d dVar;
        h4.e eVar3;
        ho.a aVar5;
        fr.d0 d0Var;
        int i17;
        ActionSpec actionSpec5;
        u2.q qVar3;
        int i18;
        ho.p pVar3 = pVar;
        str.getClass();
        pVar3.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-1444144868);
        if ((i10 & 6) == 0) {
            i12 = (qVar4.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            i12 |= qVar4.f(tVar2) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                i12 |= qVar4.h(aVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        actionSpec2 = actionSpec;
                        if (qVar4.f(actionSpec2)) {
                            i18 = 2048;
                            i12 |= i18;
                        }
                    } else {
                        actionSpec2 = actionSpec;
                    }
                    i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i12 |= i18;
                } else {
                    actionSpec2 = actionSpec;
                }
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    i12 |= qVar4.d(swipeAnchor == null ? -1 : swipeAnchor.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= 196608;
                    swipeToActionMenuController2 = swipeToActionMenuController;
                    c5 = ' ';
                } else {
                    swipeToActionMenuController2 = swipeToActionMenuController;
                    c5 = ' ';
                    if ((i10 & 196608) == 0) {
                        i12 |= qVar4.h(swipeToActionMenuController2) ? 131072 : 65536;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    i12 |= qVar4.h(pVar3) ? 1048576 : 524288;
                }
                if (qVar4.O(i12 & 1, (i12 & 599187) != 599186)) {
                    qVar4.T();
                    int i20 = i10 & 1;
                    i3.q qVar5 = i3.q.f13017a;
                    Object obj = u2.l.f33918a;
                    if (i20 != 0 && !qVar4.y()) {
                        qVar4.R();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        i16 = i12;
                        aVar4 = aVar2;
                        actionSpec4 = actionSpec2;
                        qVar2 = qVar5;
                        swipeAnchor3 = swipeAnchor;
                    } else {
                        if (i19 != 0) {
                            tVar2 = qVar5;
                        }
                        if (i13 != 0) {
                            Object L = qVar4.L();
                            if (L == obj) {
                                L = new t2(2);
                                qVar4.h0(L);
                            }
                            aVar2 = (ho.a) L;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            actionSpec2 = ActionSpec.INSTANCE.noActions();
                        }
                        SwipeAnchor swipeAnchor4 = i14 != 0 ? SwipeAnchor.SettledAtCenter : swipeAnchor;
                        if (i15 != 0) {
                            i16 = i12;
                            aVar4 = aVar2;
                            qVar2 = qVar5;
                            swipeToActionMenuController2 = null;
                        } else {
                            i16 = i12;
                            aVar4 = aVar2;
                            qVar2 = qVar5;
                        }
                        swipeAnchor3 = swipeAnchor4;
                        actionSpec4 = actionSpec2;
                    }
                    qVar4.q();
                    Object L2 = qVar4.L();
                    if (L2 == obj) {
                        L2 = u2.r.A(Boolean.FALSE);
                        qVar4.h0(L2);
                    }
                    u2.z0 z0Var = (u2.z0) L2;
                    i3.q qVar6 = qVar2;
                    long floatToRawIntBits = (Float.floatToRawIntBits(ElevenLabsTheme.INSTANCE.getSpacings(qVar4, 6).m2356getX4D9Ej5fM()) << c5) | (Float.floatToRawIntBits(0) & 4294967295L);
                    Object L3 = qVar4.L();
                    if (L3 == obj) {
                        L3 = u2.r.A(new h5.g(floatToRawIntBits));
                        qVar4.h0(L3);
                    }
                    u2.z0 z0Var2 = (u2.z0) L3;
                    Object L4 = qVar4.L();
                    if (L4 == obj) {
                        L4 = u2.r.q(qVar4);
                        qVar4.h0(L4);
                    }
                    fr.d0 d0Var2 = (fr.d0) L4;
                    boolean h10 = qVar4.h(swipeToActionMenuController2);
                    Object L5 = qVar4.L();
                    if (h10 || L5 == obj) {
                        L5 = new SwipeToActionBoxKt$SwipeToActionBox$2$1(swipeToActionMenuController2, z0Var2, z0Var, null);
                        qVar4.h0(L5);
                    }
                    u2.r.f((ho.p) L5, swipeToActionMenuController2, qVar4);
                    boolean z6 = (((i16 & 7168) ^ 3072) > 2048 && qVar4.f(actionSpec4)) || (i16 & 3072) == 2048;
                    Object L6 = qVar4.L();
                    if (z6 || L6 == obj) {
                        L6 = new SwipeToActionBoxKt$SwipeToActionBox$onDismissGestureHandler$1$1(actionSpec4, null);
                        qVar4.h0(L6);
                    }
                    ho.p pVar4 = (ho.p) L6;
                    Object L7 = qVar4.L();
                    if (L7 == obj) {
                        L7 = new u2.e1(0.0f);
                        qVar4.h0(L7);
                    }
                    u2.w0 w0Var2 = (u2.w0) L7;
                    SwipeToActionMenuController swipeToActionMenuController4 = swipeToActionMenuController2;
                    ActionSpec actionSpec6 = actionSpec4;
                    int i21 = i16;
                    n1.p rememberAnchoredDraggableState = rememberAnchoredDraggableState(SwipeToActionBox$lambda$10(w0Var2), actionSpec4.getStartSide(), actionSpec4.getEndSide(), swipeAnchor3, qVar4, (i16 >> 3) & 7168);
                    SwipeAnchor swipeAnchor5 = swipeAnchor3;
                    boolean f10 = qVar4.f(rememberAnchoredDraggableState) | qVar4.h(pVar4);
                    Object L8 = qVar4.L();
                    if (f10 || L8 == obj) {
                        L8 = new SwipeToActionBoxKt$SwipeToActionBox$3$1(rememberAnchoredDraggableState, pVar4, null);
                        qVar4.h0(L8);
                    }
                    u2.r.f((ho.p) L8, rememberAnchoredDraggableState, qVar4);
                    Object L9 = qVar4.L();
                    if (L9 == obj) {
                        L9 = new u2.e1(0.0f);
                        qVar4.h0(L9);
                    }
                    u2.w0 w0Var3 = (u2.w0) L9;
                    boolean c10 = qVar4.c(rememberAnchoredDraggableState.f23888f.h()) | qVar4.c(SwipeToActionBox$lambda$14(w0Var3));
                    Object L10 = qVar4.L();
                    if (c10 || L10 == obj) {
                        L10 = new u2.e1(rememberAnchoredDraggableState.f23888f.h() + SwipeToActionBox$lambda$14(w0Var3));
                        qVar4.h0(L10);
                    }
                    u2.w0 w0Var4 = (u2.w0) L10;
                    boolean f11 = qVar4.f(rememberAnchoredDraggableState);
                    Object L11 = qVar4.L();
                    if (f11 || L11 == obj) {
                        L11 = new RubberBandOverscrollEffect(rememberAnchoredDraggableState, new n2(w0Var3, 1), new h0(w0Var3, 3), d0Var2, 0.0f, null, 48, null);
                        qVar4.h0(L11);
                    }
                    RubberBandOverscrollEffect rubberBandOverscrollEffect = (RubberBandOverscrollEffect) L11;
                    j1.a2 a2Var = n1.b.f23636a;
                    j1.e1 e1Var = SNAP_ANIMATION_SPEC;
                    j1.a2 a2Var2 = n1.b.f23636a;
                    Object obj2 = n1.b.f23637b;
                    Object obj3 = (h5.c) qVar4.j(i4.j1.f13129h);
                    boolean f12 = qVar4.f(obj3) | qVar4.f(rememberAnchoredDraggableState) | qVar4.f(obj2) | qVar4.f(e1Var);
                    Object L12 = qVar4.L();
                    if (f12 || L12 == obj) {
                        j1.v vVar = n1.g.f23751b;
                        ja.c1 c1Var = new ja.c1(rememberAnchoredDraggableState, obj2, new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g(obj3, 15), false, 7);
                        rememberAnchoredDraggableState = rememberAnchoredDraggableState;
                        float f13 = o1.k.f24754a;
                        Object gVar = new o1.g(c1Var, vVar, e1Var);
                        qVar4.h0(gVar);
                        L12 = gVar;
                    }
                    o1.g gVar2 = (o1.g) L12;
                    i3.t e10 = r1.p2.e(tVar2, 1.0f);
                    Object L13 = qVar4.L();
                    if (L13 == obj) {
                        L13 = new n2(w0Var2, 2);
                        qVar4.h0(L13);
                    }
                    i3.t q = f4.i0.q(e10, (ho.l) L13);
                    boolean z10 = (i21 & 14) == 4;
                    Object L14 = qVar4.L();
                    if (z10 || L14 == obj) {
                        L14 = new g(str, 17);
                        qVar4.h0(L14);
                    }
                    i3.t a10 = l1.u1.a(n1.g.g(p4.q.c(q, true, (ho.l) L14), rememberAnchoredDraggableState, rubberBandOverscrollEffect, gVar2), rubberBandOverscrollEffect);
                    i3.l lVar = i3.d.f12997a;
                    f4.f1 d10 = r1.p.d(lVar, false);
                    int hashCode = Long.hashCode(qVar4.T);
                    c3.o l4 = qVar4.l();
                    i3.t c11 = i3.a.c(a10, qVar4);
                    h4.h.f11920i.getClass();
                    ho.a aVar6 = h4.g.f11903b;
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(aVar6);
                    } else {
                        qVar4.k0();
                    }
                    h4.e eVar4 = h4.g.f11907f;
                    u2.r.J(eVar4, d10, qVar4);
                    h4.e eVar5 = h4.g.f11906e;
                    u2.r.J(eVar5, l4, qVar4);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar6 = h4.g.f11908g;
                    u2.r.y(qVar4, valueOf, eVar6);
                    h4.d dVar2 = h4.g.f11909h;
                    u2.r.F(dVar2, qVar4);
                    i3.t tVar4 = tVar2;
                    h4.e eVar7 = h4.g.f11905d;
                    u2.r.J(eVar7, c11, qVar4);
                    if (SwipeToActionBox$lambda$17(w0Var4) == 0.0f) {
                        qVar4.X(605778912);
                        qVar4.p(false);
                        eVar2 = eVar7;
                        eVar = eVar5;
                        w0Var = w0Var4;
                        dVar = dVar2;
                        eVar3 = eVar6;
                        aVar5 = aVar6;
                        actionSpec5 = actionSpec6;
                        d0Var = d0Var2;
                        i17 = 3;
                        qVar3 = qVar4;
                    } else {
                        qVar4.X(605571336);
                        w0Var = w0Var4;
                        eVar = eVar5;
                        eVar2 = eVar7;
                        dVar = dVar2;
                        eVar3 = eVar6;
                        aVar5 = aVar6;
                        d0Var = d0Var2;
                        i17 = 3;
                        ActionRowsContainer(rememberAnchoredDraggableState, actionSpec6, SwipeToActionBox$lambda$17(w0Var), d0Var, r1.t.f29349a.a(), qVar4, (i21 >> 6) & 112, 0);
                        actionSpec5 = actionSpec6;
                        u2.q qVar7 = qVar4;
                        qVar7.p(false);
                        qVar3 = qVar7;
                    }
                    i3.t e11 = r1.p2.e(qVar6, 1.0f);
                    boolean f14 = qVar3.f(w0Var);
                    Object L15 = qVar3.L();
                    if (f14 || L15 == obj) {
                        L15 = new n2(w0Var, i17);
                        qVar3.h0(L15);
                    }
                    i3.t z11 = r1.d.z(e11, (ho.l) L15);
                    Object L16 = qVar3.L();
                    if (L16 == obj) {
                        L16 = new v2(z0Var, 1);
                        qVar3.h0(L16);
                    }
                    i3.t r11 = l1.n.r(z11, (ho.a) L16, aVar4);
                    f4.f1 d11 = r1.p.d(lVar, false);
                    int hashCode2 = Long.hashCode(qVar3.T);
                    c3.o l7 = qVar3.l();
                    i3.t c12 = i3.a.c(r11, qVar3);
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(aVar5);
                    } else {
                        qVar3.k0();
                    }
                    u2.r.J(eVar4, d11, qVar3);
                    u2.r.J(eVar, l7, qVar3);
                    defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                    u2.r.J(eVar2, c12, qVar3);
                    ho.p pVar5 = pVar;
                    pVar5.invoke(qVar3, Integer.valueOf((i21 >> 18) & 14));
                    boolean SwipeToActionBox$lambda$2 = SwipeToActionBox$lambda$2(z0Var);
                    Object L17 = qVar3.L();
                    if (L17 == obj) {
                        L17 = new v2(z0Var, 2);
                        qVar3.h0(L17);
                    }
                    ho.a aVar7 = (ho.a) L17;
                    long SwipeToActionBox$lambda$5 = SwipeToActionBox$lambda$5(z0Var2);
                    qVar3.X(914071663);
                    List<ActionConfig> longPress = actionSpec5.getLongPress();
                    ArrayList arrayList = new ArrayList(tn.p.a0(longPress, 10));
                    Iterator<T> it = longPress.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c3.k.d(1093506087, true, new c2(d0Var, z0Var, actionSpec5, (ActionConfig) it.next()), qVar3));
                    }
                    qVar3.p(false);
                    u2.q qVar8 = qVar3;
                    MenuKt.m1842MenuILWXrKs(SwipeToActionBox$lambda$2, aVar7, null, SwipeToActionBox$lambda$5, null, arrayList, qVar8, 48, 20);
                    u2.q qVar9 = qVar8;
                    qVar9.p(true);
                    qVar9.p(true);
                    swipeToActionMenuController3 = swipeToActionMenuController4;
                    aVar3 = aVar4;
                    actionSpec3 = actionSpec5;
                    tVar3 = tVar4;
                    swipeAnchor2 = swipeAnchor5;
                    pVar2 = pVar5;
                    qVar = qVar9;
                } else {
                    qVar4.R();
                    tVar3 = tVar2;
                    aVar3 = aVar2;
                    actionSpec3 = actionSpec2;
                    swipeToActionMenuController3 = swipeToActionMenuController2;
                    swipeAnchor2 = swipeAnchor;
                    pVar2 = pVar3;
                    qVar = qVar4;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.c(str, tVar3, aVar3, actionSpec3, swipeAnchor2, swipeToActionMenuController3, pVar2, i10, i11, 8);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i10 & 3072) == 0) {
            }
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            i15 = i11 & 32;
            if (i15 != 0) {
            }
            if ((i10 & 1572864) == 0) {
            }
            if (qVar4.O(i12 & 1, (i12 & 599187) != 599186)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        aVar2 = aVar;
        if ((i10 & 3072) == 0) {
        }
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        i15 = i11 & 32;
        if (i15 != 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        if (qVar4.O(i12 & 1, (i12 & 599187) != 599186)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float SwipeToActionBox$lambda$10(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final void SwipeToActionBox$lambda$11(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    public static final float SwipeToActionBox$lambda$14(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final void SwipeToActionBox$lambda$15(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    private static final float SwipeToActionBox$lambda$17(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final sn.z SwipeToActionBox$lambda$18$0(u2.w0 w0Var, float f10) {
        SwipeToActionBox$lambda$15(w0Var, f10);
        return sn.z.f31622a;
    }

    public static final sn.z SwipeToActionBox$lambda$19$0(u2.w0 w0Var, h5.l lVar) {
        SwipeToActionBox$lambda$11(w0Var, (int) (lVar.f12092a >> 32));
        return sn.z.f31622a;
    }

    private static final boolean SwipeToActionBox$lambda$2(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final sn.z SwipeToActionBox$lambda$20$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final h5.j SwipeToActionBox$lambda$21$0$0(u2.w0 w0Var, h5.c cVar) {
        cVar.getClass();
        return new h5.j((jo.a.y(SwipeToActionBox$lambda$17(w0Var)) << 32) | (0 & 4294967295L));
    }

    public static final sn.z SwipeToActionBox$lambda$21$1$0(u2.z0 z0Var) {
        SwipeToActionBox$lambda$3(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z SwipeToActionBox$lambda$21$2$0$0(u2.z0 z0Var) {
        SwipeToActionBox$lambda$3(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z SwipeToActionBox$lambda$21$2$1$0(final fr.d0 d0Var, final ActionSpec actionSpec, final ActionConfig actionConfig, final u2.z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(d0Var) | qVar.f(actionSpec) | qVar.f(actionConfig);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new ho.a() { // from class: io.elevenlabs.ui.components.q2
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z SwipeToActionBox$lambda$21$2$1$0$0$0;
                        SwipeToActionBox$lambda$21$2$1$0$0$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$21$2$1$0$0$0(fr.d0.this, z0Var, actionSpec, actionConfig);
                        return SwipeToActionBox$lambda$21$2$1$0$0$0;
                    }
                };
                qVar.h0(L);
            }
            MenuKt.MenuItem((ho.a) L, false, actionConfig.getText(), Integer.valueOf(actionConfig.getIcon()), false, actionConfig.isMenuDestructive(), qVar, 0, 18);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SwipeToActionBox$lambda$21$2$1$0$0$0(fr.d0 d0Var, u2.z0 z0Var, ActionSpec actionSpec, ActionConfig actionConfig) {
        SwipeToActionBox$lambda$3(z0Var, false);
        fr.g0.D(d0Var, null, null, new SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1(actionSpec, actionConfig, null), 3);
        return sn.z.f31622a;
    }

    public static final sn.z SwipeToActionBox$lambda$22(String str, i3.t tVar, ho.a aVar, ActionSpec actionSpec, SwipeAnchor swipeAnchor, SwipeToActionMenuController swipeToActionMenuController, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        SwipeToActionBox(str, tVar, aVar, actionSpec, swipeAnchor, swipeToActionMenuController, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void SwipeToActionBox$lambda$3(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final long SwipeToActionBox$lambda$5(u2.z0 z0Var) {
        return ((h5.g) z0Var.getValue()).f12084a;
    }

    public static final void SwipeToActionBox$lambda$6(u2.z0 z0Var, long j4) {
        z0Var.setValue(new h5.g(j4));
    }

    public static final void TestingSwipeToActionBoxContent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1596475848);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(l1.n.h(r1.p2.d(qVar2, 1.0f), p3.x.f26431f, p3.h0.f26395b), 16);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d("Project Hail Mary", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium600(), qVar, 6, 0, 131070);
            r1.d.g(r1.p2.f(qVar2, 8), qVar);
            j7.d("By Andy Weir", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall400(), qVar, 6, 0, 131070);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 16);
        }
    }

    public static final sn.z TestingSwipeToActionBoxContent$lambda$1(int i10, u2.m mVar, int i11) {
        TestingSwipeToActionBoxContent(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final ActionSpec actionSpec(ho.q qVar, u2.m mVar, int i10) {
        qVar.getClass();
        ActionSpecBuilder actionSpecBuilder = new ActionSpecBuilder();
        qVar.invoke(actionSpecBuilder, mVar, Integer.valueOf((i10 << 3) & 112));
        return actionSpecBuilder.build$ui_release(mVar, 0);
    }

    private static final n1.f1 buildDraggableAnchors(float f10, float f11, Float f12, Float f13) {
        n1.g1 g1Var = new n1.g1();
        buildDraggableAnchors$lambda$0(f10, f11, f12, f13, g1Var);
        float[] fArr = g1Var.f23758b;
        ArrayList arrayList = g1Var.f23757a;
        int size = arrayList.size();
        fArr.getClass();
        gg.b.C(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return new n1.y(arrayList, copyOfRange);
    }

    private static final sn.z buildDraggableAnchors$lambda$0(float f10, float f11, Float f12, Float f13, n1.g1 g1Var) {
        g1Var.getClass();
        g1Var.a(SwipeAnchor.SettledAtCenter, 0.0f);
        g1Var.a(SwipeAnchor.StartPeeking, f10);
        g1Var.a(SwipeAnchor.EndPeeking, f11);
        if (f12 != null) {
            g1Var.a(SwipeAnchor.StartFullyOpen, f12.floatValue());
        }
        if (f13 != null) {
            g1Var.a(SwipeAnchor.EndFullyOpen, f13.floatValue());
        }
        return sn.z.f31622a;
    }

    public static final boolean isSingleDestructiveAction(List<ActionConfig> list) {
        if (list.size() != 1 || !list.get(0).isDestructive()) {
            return false;
        }
        return true;
    }

    private static final n1.p rememberAnchoredDraggableState(float f10, List<ActionConfig> list, List<ActionConfig> list2, SwipeAnchor swipeAnchor, u2.m mVar, int i10) {
        Float f11;
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        float d02 = ((h5.c) qVar.j(i4.j1.f13129h)).d0(ACTION_ITEM_WIDTH);
        float size = list.size() * d02;
        float f12 = (-list2.size()) * d02;
        Float f13 = null;
        if (isSingleDestructiveAction(list)) {
            f11 = Float.valueOf(f10);
        } else {
            f11 = null;
        }
        if (isSingleDestructiveAction(list2)) {
            f13 = Float.valueOf(-f10);
        }
        if ((((i10 & 14) ^ 6) > 4 && qVar.c(f10)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean f14 = z6 | qVar.f(list) | qVar.f(list2);
        Object L = qVar.L();
        if (f14 || L == u2.l.f33918a) {
            L = new n1.p(swipeAnchor, buildDraggableAnchors(size, f12, f11, f13));
            qVar.h0(L);
        }
        return (n1.p) L;
    }

    private static final ThresholdState rememberThresholdState(n1.p pVar, List<ActionConfig> list, List<ActionConfig> list2, ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        n1.p pVar2;
        List<ActionConfig> list3;
        List<ActionConfig> list4;
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = u2.r.A(ThresholdState.NOT_CROSSED);
            qVar.h0(L);
        }
        u2.z0 z0Var = (u2.z0) L;
        boolean h10 = qVar.h(list) | qVar.h(list2);
        boolean z10 = false;
        if ((((i10 & 14) ^ 6) > 4 && qVar.f(pVar)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z11 = h10 | z6;
        if ((((i10 & 7168) ^ 3072) > 2048 && qVar.f(aVar)) || (i10 & 3072) == 2048) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        Object L2 = qVar.L();
        if (!z12 && L2 != eVar) {
            pVar2 = pVar;
            list3 = list;
            list4 = list2;
        } else {
            pVar2 = pVar;
            list3 = list;
            list4 = list2;
            SwipeToActionBoxKt$rememberThresholdState$1$1 swipeToActionBoxKt$rememberThresholdState$1$1 = new SwipeToActionBoxKt$rememberThresholdState$1$1(list3, list4, pVar2, aVar, z0Var, null);
            qVar.h0(swipeToActionBoxKt$rememberThresholdState$1$1);
            L2 = swipeToActionBoxKt$rememberThresholdState$1$1;
        }
        u2.r.h(pVar2, list3, list4, (ho.p) L2, qVar);
        return rememberThresholdState$lambda$1(z0Var);
    }

    public static final ThresholdState rememberThresholdState$lambda$1(u2.z0 z0Var) {
        return (ThresholdState) z0Var.getValue();
    }
}
