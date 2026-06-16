package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import i4.j1;
import i4.q2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import s4.y0;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "action", "ExportSheet", "(Lho/a;Lho/l;Lu2/m;I)V", "ExportSheetUI", "(Lho/a;Lho/l;Lu2/m;II)V", "Preview_ExportSheet", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExportSheetKt {
    public static final void ExportSheet(ho.a aVar, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        int i13;
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(395701022);
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
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            Object L = qVar.L();
            if (z10 || L == u2.l.f33918a) {
                L = new ExportSheetKt$ExportSheet$1$1(lVar, null);
                qVar.h0(L);
            }
            u2.r.f((ho.p) L, sn.z.f31622a, qVar);
            aVar2 = aVar;
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar2, false, (ho.r) c3.k.d(-610962352, true, new m(lVar, 0), qVar), (u2.m) qVar, ((i11 << 12) & 57344) | 1572864, 47);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new n(aVar2, lVar, i10);
        }
    }

    public static final sn.z ExportSheet$lambda$1(ho.l lVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new b(bottomSheetControl, 4);
            qVar.h0(L);
        }
        ExportSheetUI((ho.a) L, lVar, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheet$lambda$1$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheet$lambda$2(ho.a aVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        ExportSheet(aVar, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExportSheetUI(ho.a aVar, ho.l lVar, u2.m mVar, int i10, int i11) {
        ho.a aVar2;
        int i12;
        int i13;
        ho.l lVar2;
        int i14;
        int i15;
        boolean z6;
        ho.a aVar3;
        r1 r10;
        ho.a aVar4;
        ho.l lVar3;
        boolean z10;
        boolean z11;
        ho.a aVar5;
        ho.l lVar4;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1354966386);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            aVar2 = aVar;
        } else if ((i10 & 6) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i12;
            if ((i15 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i15 & 1, z6)) {
                u2.e eVar = u2.l.f33918a;
                if (i16 != 0) {
                    Object L = qVar.L();
                    if (L == eVar) {
                        L = new c(4);
                        qVar.h0(L);
                    }
                    aVar4 = (ho.a) L;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new o(14);
                        qVar.h0(L2);
                    }
                    lVar3 = (ho.l) L2;
                } else {
                    lVar3 = lVar2;
                }
                i3.q qVar2 = i3.q.f13017a;
                i3.t e10 = p2.e(qVar2, 1.0f);
                r1.e eVar2 = r1.j.f29230c;
                i3.j jVar = i3.d.B0;
                r1.x a10 = r1.w.a(eVar2, jVar, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(e10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar3 = h4.g.f11907f;
                u2.r.J(eVar3, a10, qVar);
                h4.e eVar4 = h4.g.f11906e;
                u2.r.J(eVar4, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar5 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar5);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                h4.e eVar6 = h4.g.f11905d;
                u2.r.J(eVar6, c5, qVar);
                ho.a aVar6 = aVar4;
                ho.l lVar5 = lVar3;
                HeaderKt.Header(kj.c.R(qVar, R.string.create_and_export_content_mobile_title), null, c3.k.d(188858668, true, new i(aVar4, 1), qVar), null, null, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, qVar, 196992, 26);
                i3.t e11 = p2.e(qVar2, 1.0f);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                i3.t y10 = l1.n.y(e11.then(new m1(1.0f, true)), l1.n.x(qVar), true, true);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i18, y10);
                r1.x a11 = r1.w.a(eVar2, jVar, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(f10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar3, a11, qVar);
                u2.r.J(eVar4, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
                u2.r.J(eVar6, c10, qVar);
                String R = kj.c.R(qVar, R.string.create_and_export_content_mobile_text);
                y0 bodyLarge500 = elevenLabsTheme.getTypo(qVar, i18).getBodyLarge500();
                qVar = qVar;
                MarkdownTextKt.m1841MarkdownText6lElgYI(R, null, 0L, 0, bodyLarge500, null, null, null, 0, qVar, 0, 494);
                ib.i.C(elevenLabsTheme, qVar, i18, qVar2, qVar);
                qVar.p(true);
                i3.t f11 = ib.i.f(elevenLabsTheme, qVar, i18, p2.e(qVar2, 1.0f));
                r1.x a12 = r1.w.a(eVar2, jVar, qVar, 0);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(f11, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar3, a12, qVar);
                u2.r.J(eVar4, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar5, qVar, dVar);
                u2.r.J(eVar6, c11, qVar);
                q2 q2Var = (q2) qVar.j(j1.f13138r);
                i3.t e12 = p2.e(qVar2, 1.0f);
                String R2 = kj.c.R(qVar, R.string.create_and_export_content_mobile_action_title);
                ButtonSize buttonSize = ButtonSize.Medium;
                if ((i15 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = qVar.h(q2Var) | z10;
                if ((i15 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = h10 | z11;
                Object L3 = qVar.L();
                if (!z12 && L3 != eVar) {
                    aVar5 = aVar6;
                    lVar4 = lVar5;
                } else {
                    aVar5 = aVar6;
                    lVar4 = lVar5;
                    L3 = new c3.b(lVar4, q2Var, aVar5, 20);
                    qVar.h0(L3);
                }
                ho.a aVar7 = aVar5;
                ButtonKt.Button(R2, (ho.a) L3, e12, buttonSize, null, null, null, false, false, false, qVar, 3456, 1008);
                ib.i.p(elevenLabsTheme, qVar, i18, qVar2, qVar);
                ButtonKt.Button(kj.c.R(qVar, R.string.common_dismiss), aVar7, p2.e(qVar2, 1.0f), buttonSize, ButtonVariant.Secondary, null, null, false, false, false, qVar, ((i15 << 3) & 112) | 28032, 992);
                qVar.p(true);
                WeakHashMap weakHashMap = c3.f29142x;
                r1.d.g(r1.d.P(qVar2, new o1(u0.e(qVar).f29154l, 32)), qVar);
                qVar.p(true);
                aVar3 = aVar7;
                lVar2 = lVar4;
            } else {
                qVar.R();
                aVar3 = aVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p((Object) aVar3, lVar2, i10, i11, 15);
                return;
            }
            return;
        }
        lVar2 = lVar;
        i15 = i12;
        if ((i15 & 19) == 18) {
        }
        if (!qVar.O(i15 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ExportSheetUI$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheetUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonIconKt.ButtonIcon(io.elevenlabs.ui.R.drawable.close, kj.c.R(qVar, io.elevenlabs.ui.R.string.accessibility_bottom_sheet_dialog_close), aVar, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheetUI$lambda$2$2$0$0(ho.l lVar, q2 q2Var, ho.a aVar) {
        lVar.invoke(new o(13));
        q2Var.openUri("https://play.google.com/store/apps/details?id=io.elevenlabs.coreapp");
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheetUI$lambda$2$2$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(Analytics.Event.PlayerClickedExportElevenLabsRedirect.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z ExportSheetUI$lambda$3(ho.a aVar, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        ExportSheetUI(aVar, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExportSheet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(773037254);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExportSheetKt.INSTANCE.getLambda$1136179440$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.j1(i10, 19);
        }
    }

    public static final sn.z Preview_ExportSheet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExportSheet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
