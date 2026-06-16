package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.o;
import e5.k;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.i1;
import io.elevenlabs.readerapp.ui.components.j1;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.c3;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onConfirm", "AccountSignOutWarningGenericDialog", "(Lho/a;Lho/a;Lu2/m;I)V", "AccountSignOutWarningDownloadedReadsDialog", "AccountSignOutWarningDialogContent", "(Lho/a;Lu2/m;I)V", "Preview_AccountSignOutWarningDownloadedReadsDialog", "(Lu2/m;I)V", "Preview_AccountSignOutWarningGenericDialog", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountSignOutWarningDialogKt {
    public static final void AccountSignOutWarningDialogContent(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(-1199072633);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM(), u.P, 2);
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
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2351getX10D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.logout_warning_sheet_title), p2.e(qVar2, 1.0f), 0L, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleMedium700(), qVar, 48, 0, 130044);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.logout_warning_sheet_subtitle), p2.e(qVar2, 1.0f), ReaderColors.INSTANCE.m2414getNeutral4000d7_KjU(), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyMedium500(), qVar, 48, 0, 130040);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2351getX10D9Ej5fM()), qVar);
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar, R.string.logout_warning_sheet_action), aVar, r1.d.I(p2.e(qVar2, 1.0f), u.P, elevenLabsTheme.getSpacings(qVar, i13).m2350getX1D9Ej5fM(), u.P, u.P, 13), FullWidthButtonSize.Large, null, null, false, false, false, qVar, ((i11 << 3) & 112) | 3072, 496);
            ib.i.p(elevenLabsTheme, qVar, i13, qVar2, qVar);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar, i10, 3);
        }
    }

    public static final z AccountSignOutWarningDialogContent$lambda$1(ho.a aVar, int i10, m mVar, int i11) {
        AccountSignOutWarningDialogContent(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AccountSignOutWarningDownloadedReadsDialog(ho.a aVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        int i12;
        int i13;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(279308494);
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
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(true, false, 0L, u.P, aVar3, false, (ho.r) c3.k.d(1526530432, true, new i1(1, aVar2), qVar), (m) qVar, ((i11 << 12) & 57344) | 1572870, 46);
        } else {
            aVar3 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(aVar3, aVar2, i10, 2);
        }
    }

    public static final z AccountSignOutWarningDownloadedReadsDialog$lambda$0(ho.a aVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean f10 = qVar.f(aVar) | qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (f10 || L == l.f33918a) {
            L = new c(aVar, bottomSheetControl, 1);
            qVar.h0(L);
        }
        AccountSignOutWarningDialogContent((ho.a) L, qVar, 0);
        return z.f31622a;
    }

    public static final z AccountSignOutWarningDownloadedReadsDialog$lambda$0$0$0(ho.a aVar, BottomSheetControl bottomSheetControl) {
        aVar.invoke();
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z AccountSignOutWarningDownloadedReadsDialog$lambda$1(ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        AccountSignOutWarningDownloadedReadsDialog(aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AccountSignOutWarningGenericDialog(ho.a aVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        ho.a aVar4;
        int i12;
        int i13;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(126894349);
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
            aVar4 = aVar2;
            ConfirmationDialogKt.ConfirmationDialog(aVar3, aVar4, kj.c.R(qVar, R.string.settings_sign_out_confirmation_title), kj.c.R(qVar, R.string.settings_sign_out_confirmation_body), kj.c.R(qVar, R.string.settings_sign_out_confirmation_cancel), kj.c.R(qVar, R.string.settings_sign_out_confirmation_confirm), true, qVar, (i11 & 14) | 1572864 | (i11 & 112), 0);
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(aVar3, aVar4, i10, 1);
        }
    }

    public static final z AccountSignOutWarningGenericDialog$lambda$0(ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        AccountSignOutWarningGenericDialog(aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSignOutWarningDownloadedReadsDialog(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1694304095);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AccountSignOutWarningDialogKt.INSTANCE.m1239getLambda$377751989$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 21);
        }
    }

    public static final z Preview_AccountSignOutWarningDownloadedReadsDialog$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSignOutWarningDownloadedReadsDialog(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSignOutWarningGenericDialog(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(840640962);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AccountSignOutWarningDialogKt.INSTANCE.getLambda$777613676$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 20);
        }
    }

    public static final z Preview_AccountSignOutWarningGenericDialog$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSignOutWarningGenericDialog(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$AccountSignOutWarningDialogContent(ho.a aVar, m mVar, int i10) {
        AccountSignOutWarningDialogContent(aVar, mVar, i10);
    }
}
