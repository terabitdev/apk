package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import l1.n;
import l1.v;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p4.k;
import q2.y2;
import r1.p;
import r1.p2;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import z1.g;
import z1.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "ScrollToBottomButton", "(Lho/a;Li3/t;Lu2/m;II)V", "Preview_ScrollToBottomButton", "(Lu2/m;I)V", "Lh5/f;", "ButtonSize", TokenNames.F, "IconSize", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScrollToBottomButtonKt {
    private static final float ButtonSize = 36;
    private static final float IconSize = 16;

    public static final void Preview_ScrollToBottomButton(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1069812927);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ScrollToBottomButtonKt.INSTANCE.getLambda$355638567$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 10);
        }
    }

    public static final z Preview_ScrollToBottomButton$lambda$0(int i10, m mVar, int i11) {
        Preview_ScrollToBottomButton(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollToBottomButton(ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1435247683);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i15 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t o6 = p2.o(tVar4, ButtonSize);
                g gVar = h.f39128a;
                t c5 = m3.h.c(o6, gVar);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                t h10 = n.h(c5, echoTheme.getColors(qVar, i16).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
                v a10 = n.a(1, echoTheme.getColors(qVar, i16).getBorder().getPrimary(qVar, EchoThemeColors.Border.$stable));
                t p10 = n.p(n.k(h10, a10.f21071a, a10.f21072b, gVar), false, kj.c.R(qVar, R.string.chat_support_scroll_to_bottom_a11y), new k(0), null, aVar, 9);
                f1 d10 = p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c10 = i3.a.c(p10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, d10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c10, qVar);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.chevron_down, qVar, 0), null, p2.o(qVar2, IconSize), echoTheme.getColors(qVar, i16).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.b(aVar, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ScrollToBottomButton$lambda$1(ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        ScrollToBottomButton(aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
