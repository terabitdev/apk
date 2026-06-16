package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import c3.o;
import e5.k;
import fm.e;
import h4.f;
import h4.g;
import h4.h;
import ho.a;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onAccept", "onDecline", "Li3/t;", "modifier", "AssistantTermsState", "(Lho/a;Lho/a;Li3/t;Lu2/m;II)V", "Preview_AssistantTermsState", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantTermsStateKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistantTermsState(a aVar, a aVar2, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(35711684);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t y10 = n.y(p2.e(tVar4, 1.0f), n.x(qVar), true, true);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                t G = d.G(y10, echoTheme.getSpacings(qVar, i17).getX5(), u.P, 2);
                x a10 = w.a(j.f29230c, i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(G, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                String R = c.R(qVar, R.string.assistant_terms_title);
                EchoThemeTypography typography = echoTheme.getTypography(qVar, i17);
                int i18 = EchoThemeTypography.$stable;
                y0 lgCompact500 = typography.getLgCompact500(qVar, i18);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i17).getText();
                int i19 = EchoThemeColors.Text.$stable;
                int i20 = i12;
                j7.d(R, null, text.getPrimary(qVar, i19), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, lgCompact500, qVar, 0, 0, 130042);
                d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i17).getX2()), qVar);
                j7.d(c.R(qVar, R.string.assistant_terms_body), null, i.b(i17, i19, echoTheme, qVar, qVar), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i17).getBaseRegular400(qVar, i18), qVar, 0, 0, 130042);
                qVar = qVar;
                d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i17).getX10()), qVar);
                FullWidthButtonKt.EchoThemeFullWidthButton(c.R(qVar, R.string.assistant_terms_accept_button), aVar, p2.e(qVar2, 1.0f), null, FullWidthButtonVariant.Primary, null, false, false, false, qVar, ((i20 << 3) & 112) | 24960, 488);
                i.z(echoTheme, qVar, i17, qVar2, qVar);
                FullWidthButtonKt.EchoThemeFullWidthButton(c.R(qVar, R.string.common_cancel), aVar2, p2.e(qVar2, 1.0f), null, FullWidthButtonVariant.Secondary, null, false, false, false, qVar, (i20 & 112) | 24960, 488);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.c(aVar, aVar2, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AssistantTermsState$lambda$1(a aVar, a aVar2, t tVar, int i10, int i11, m mVar, int i12) {
        AssistantTermsState(aVar, aVar2, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AssistantTermsState(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2095377004);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantTermsStateKt.INSTANCE.getLambda$1395185106$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 9);
        }
    }

    public static final z Preview_AssistantTermsState$lambda$0(int i10, m mVar, int i11) {
        Preview_AssistantTermsState(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
