package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.MenuKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aI\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onMuteAudioClick", "onGiveFeedbackClick", "isAudioMuted", "AssistantMenu", "(ZLho/a;Lho/a;Lho/a;ZLu2/m;I)V", "Preview_AssistantMenu", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantMenuKt {
    public static final void AssistantMenu(final boolean z6, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final boolean z10, u2.m mVar, final int i10) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(657647387);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.g(z10)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        int i17 = i11;
        if ((i17 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i17 & 1, z11)) {
            MenuKt.Menu(z6, aVar, c3.k.d(-121981543, true, new u(z10, aVar, aVar2, aVar3, 0), qVar), qVar, (i17 & 14) | 384 | (i17 & 112));
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.v
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z AssistantMenu$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    AssistantMenu$lambda$1 = AssistantMenuKt.AssistantMenu$lambda$1(z6, aVar, aVar2, aVar3, z10, i10, (u2.m) obj, intValue);
                    return AssistantMenu$lambda$1;
                }
            };
        }
    }

    public static final sn.z AssistantMenu$lambda$0(boolean z6, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, r1.y yVar, u2.m mVar, int i10) {
        boolean z10;
        int i11;
        int i12;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                i11 = R.drawable.volume_full_outline;
            } else {
                i11 = R.drawable.volume_off_outline;
            }
            int i13 = i11;
            if (z6) {
                i12 = io.elevenlabs.readerapp.R.string.assistant_menu_unmute_volume_label;
            } else {
                i12 = io.elevenlabs.readerapp.R.string.assistant_menu_mute_volume_label;
            }
            String R = kj.c.R(qVar, i12);
            boolean f10 = qVar.f(aVar) | qVar.f(aVar2);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                final int i14 = 0;
                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.t
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z AssistantMenu$lambda$0$0$0;
                        sn.z AssistantMenu$lambda$0$1$0;
                        switch (i14) {
                            case 0:
                                AssistantMenu$lambda$0$0$0 = AssistantMenuKt.AssistantMenu$lambda$0$0$0(aVar, aVar2);
                                return AssistantMenu$lambda$0$0$0;
                            default:
                                AssistantMenu$lambda$0$1$0 = AssistantMenuKt.AssistantMenu$lambda$0$1$0(aVar, aVar2);
                                return AssistantMenu$lambda$0$1$0;
                        }
                    }
                };
                qVar.h0(L);
            }
            MenuKt.MenuItem(i13, R, (ho.a) L, false, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.assistant_menu_mute_volume_sublabel), qVar, 0, 8);
            int i15 = R.drawable.bubble_outline;
            String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.assistant_menu_give_feedback_label);
            boolean f11 = qVar.f(aVar) | qVar.f(aVar3);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                final int i16 = 1;
                L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.t
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z AssistantMenu$lambda$0$0$0;
                        sn.z AssistantMenu$lambda$0$1$0;
                        switch (i16) {
                            case 0:
                                AssistantMenu$lambda$0$0$0 = AssistantMenuKt.AssistantMenu$lambda$0$0$0(aVar, aVar3);
                                return AssistantMenu$lambda$0$0$0;
                            default:
                                AssistantMenu$lambda$0$1$0 = AssistantMenuKt.AssistantMenu$lambda$0$1$0(aVar, aVar3);
                                return AssistantMenu$lambda$0$1$0;
                        }
                    }
                };
                qVar.h0(L2);
            }
            MenuKt.MenuItem(i15, R2, (ho.a) L2, false, null, qVar, 0, 24);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AssistantMenu$lambda$0$0$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AssistantMenu$lambda$0$1$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AssistantMenu$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z10, int i10, u2.m mVar, int i11) {
        AssistantMenu(z6, aVar, aVar2, aVar3, z10, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AssistantMenu(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1629864668);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantMenuKt.INSTANCE.getLambda$1168504118$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 11);
        }
    }

    public static final sn.z Preview_AssistantMenu$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AssistantMenu(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
