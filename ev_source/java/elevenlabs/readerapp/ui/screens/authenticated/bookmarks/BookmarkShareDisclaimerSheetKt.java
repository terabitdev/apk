package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import c3.o;
import ho.r;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.j1;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import u2.q;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u000f\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onAgree", "BookmarkShareDisclaimerSheet", "(Lho/a;Lho/a;Lu2/m;I)V", "BookmarkShareDisclaimerSheetUI", "Preview_BookmarkShareDisclaimerSheet", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarkShareDisclaimerSheetKt {
    public static final void BookmarkShareDisclaimerSheet(ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        int i12;
        int i13;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(-977808666);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            aVar3 = aVar;
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, u.P, aVar3, false, (r) c3.k.d(2015001880, true, new io.elevenlabs.readerapp.e(aVar, aVar2, 2), qVar), (u2.m) qVar, ((i11 << 12) & 57344) | 1572864, 47);
        } else {
            aVar3 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(aVar3, aVar2, i10, 4);
        }
    }

    public static final z BookmarkShareDisclaimerSheet$lambda$0(ho.a aVar, ho.a aVar2, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        BookmarkShareDisclaimerSheetUI(aVar, aVar2, mVar, 0);
        return z.f31622a;
    }

    public static final z BookmarkShareDisclaimerSheet$lambda$1(ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        BookmarkShareDisclaimerSheet(aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void BookmarkShareDisclaimerSheetUI(ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(1628081938);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        boolean z11 = false;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i14 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM(), u.P, 2);
            x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(G, qVar);
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
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2358getX6D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.share_disclaimer_title), null, defpackage.f.b(elevenLabsTheme, qVar, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getTitleMedium700(), qVar, 0, 0, 130042);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2355getX3D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.share_disclaimer_description), null, defpackage.f.A(elevenLabsTheme, qVar, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getBodyMedium500(), qVar, 0, 0, 130042);
            qVar = qVar;
            ib.i.p(elevenLabsTheme, qVar, i15, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.share_disclaimer_action);
            ButtonSize buttonSize = ButtonSize.Medium;
            t e11 = p2.e(qVar2, 1.0f);
            if ((i14 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i14 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object L = qVar.L();
            if (z12 || L == u2.l.f33918a) {
                L = new a2.q(aVar, aVar2, 18);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, e11, buttonSize, null, null, null, false, false, false, qVar, 3456, 1008);
            ib.i.p(elevenLabsTheme, qVar, i15, qVar2, qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(aVar, aVar2, i10, 3);
        }
    }

    public static final z BookmarkShareDisclaimerSheetUI$lambda$0$0$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return z.f31622a;
    }

    public static final z BookmarkShareDisclaimerSheetUI$lambda$1(ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        BookmarkShareDisclaimerSheetUI(aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_BookmarkShareDisclaimerSheet(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1482893117);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$BookmarkShareDisclaimerSheetKt.INSTANCE.getLambda$131822061$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 9);
        }
    }

    public static final z Preview_BookmarkShareDisclaimerSheet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_BookmarkShareDisclaimerSheet(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }
}
