package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.g;
import i3.t;
import io.elevenlabs.readerapp.ui.components.e0;
import io.elevenlabs.readerapp.ui.components.m0;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.livekit.android.rpc.RpcError;
import j1.f;
import j1.y;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import q2.d5;
import q2.x2;
import q2.y2;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aE\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"", "isLoading", "isMicMuted", "Lkotlin/Function0;", "Lsn/z;", "onMicToggle", "onSwitchToTextMode", "Li3/t;", "modifier", "VoiceModeControls", "(ZZLho/a;Lho/a;Li3/t;Lu2/m;II)V", "Preview_VoiceModeControls_Unmuted", "(Lu2/m;I)V", "Preview_VoiceModeControls_Muted", "", "controlsAlpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceModeControlsKt {
    public static final void Preview_VoiceModeControls_Muted(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1742648788);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoiceModeControlsKt.INSTANCE.m1297getLambda$599486190$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 28);
        }
    }

    public static final z Preview_VoiceModeControls_Muted$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceModeControls_Muted(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceModeControls_Unmuted(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(510112947);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoiceModeControlsKt.INSTANCE.m1296getLambda$422258151$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 29);
        }
    }

    public static final z Preview_VoiceModeControls_Unmuted$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceModeControls_Unmuted(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceModeControls(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z11;
        t tVar3;
        r1 r10;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(1543335856);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            if ((i12 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar2 = qVar2;
                }
                if (z6) {
                    f10 = u.P;
                } else {
                    f10 = 1.0f;
                }
                t tVar4 = tVar2;
                s2 b10 = f.b(f10, j1.e.s(300, 0, y.f18444a, 2), "ControlsAlpha", qVar, 3072, 20);
                t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                t a10 = h.a(d.E(e10, echoTheme.getSpacings(qVar, i19).getX5()), VoiceModeControls$lambda$0(b10));
                k2 a11 = i2.a(j.f29234g, i3.d.f13004y0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(a10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = g.f11903b;
                qVar.b0();
                int i20 = i12;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a11, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                float f11 = 48;
                t o6 = p2.o(qVar2, f11);
                EchoThemeColors.Fill fill = echoTheme.getColors(qVar, i19).getFill();
                int i21 = EchoThemeColors.Fill.$stable;
                long denaryAlpha = fill.getDenaryAlpha(qVar, i21);
                EchoThemeColors.Icon icon = echoTheme.getColors(qVar, i19).getIcon();
                int i22 = EchoThemeColors.Icon.$stable;
                d5.g(aVar, o6, false, d5.q(denaryAlpha, icon.getPrimary(qVar, i22), 0L, 0L, qVar, 12), null, k.d(1839683378, true, new m0(z10, 2), qVar), qVar, ((i20 >> 6) & 14) | 1572912, 52);
                t o10 = p2.o(qVar2, f11);
                x2 q = d5.q(echoTheme.getColors(qVar, i19).getFill().getDenaryAlpha(qVar, i21), echoTheme.getColors(qVar, i19).getIcon().getPrimary(qVar, i22), 0L, 0L, qVar, 12);
                qVar = qVar;
                d5.g(aVar2, o10, false, q, null, ComposableSingletons$VoiceModeControlsKt.INSTANCE.m1295getLambda$1489639319$app_productionRelease(), qVar, ((i20 >> 9) & 14) | 1572912, 52);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new e0(z6, z10, aVar, aVar2, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final float VoiceModeControls$lambda$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z VoiceModeControls$lambda$1$0(boolean z6, m mVar, int i10) {
        boolean z10;
        int i11;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                i11 = R.drawable.mic_off_filled;
            } else {
                i11 = R.drawable.mic_filled;
            }
            y2.a(kd.a.M(i11, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.assistant_mute_mic_button_accessibility_label), p2.o(i3.q.f13017a, 20), 0L, qVar, u3.c.$stable | 384, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceModeControls$lambda$2(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, t tVar, int i10, int i11, m mVar, int i12) {
        VoiceModeControls(z6, z10, aVar, aVar2, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
