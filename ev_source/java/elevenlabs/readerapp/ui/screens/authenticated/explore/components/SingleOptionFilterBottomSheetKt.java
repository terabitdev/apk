package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f2;
import i3.t;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.k;
import io.elevenlabs.ui.components.EchoRadioButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
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
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "", "title", "", "Lio/elevenlabs/domain/model/KeyLabel;", "options", "activeOptionKey", "Lkotlin/Function1;", "onSave", "onClear", "SingleOptionFilterBottomSheet", "(Lho/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lho/l;Lho/a;Lu2/m;II)V", "Preview_SingleOptionFilterBottomSheet", "(Lu2/m;I)V", "Preview_SingleOptionFilterBottomSheet_Sort", "activeOption", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SingleOptionFilterBottomSheetKt {
    public static final void Preview_SingleOptionFilterBottomSheet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1645644725);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(new KeyLabel("free", "Free"), new KeyLabel("under_5", "Under £5"), new KeyLabel("under_10", "Under £10"), new KeyLabel("under_20", "Under £20"));
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new p(26);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k(11);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new p(24);
                qVar.h0(L3);
            }
            SingleOptionFilterBottomSheet(aVar, "Price", I, "under_10", lVar, (ho.a) L3, qVar, 224310, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 2);
        }
    }

    public static final z Preview_SingleOptionFilterBottomSheet$lambda$1$0(String str) {
        return z.f31622a;
    }

    public static final z Preview_SingleOptionFilterBottomSheet$lambda$3(int i10, m mVar, int i11) {
        Preview_SingleOptionFilterBottomSheet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SingleOptionFilterBottomSheet_Sort(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-162593484);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(new KeyLabel("newest", "Newest"), new KeyLabel("popularity", "Popularity"), new KeyLabel("relevance", "Relevance"));
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new p(25);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k(10);
                qVar.h0(L2);
            }
            SingleOptionFilterBottomSheet(aVar, "Sort By", I, "newest", (ho.l) L2, null, qVar, 27702, 32);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 3);
        }
    }

    public static final z Preview_SingleOptionFilterBottomSheet_Sort$lambda$1$0(String str) {
        return z.f31622a;
    }

    public static final z Preview_SingleOptionFilterBottomSheet_Sort$lambda$2(int i10, m mVar, int i11) {
        Preview_SingleOptionFilterBottomSheet_Sort(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleOptionFilterBottomSheet(ho.a aVar, String str, List<KeyLabel> list, String str2, ho.l lVar, ho.a aVar2, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        boolean z6;
        r1 r10;
        ho.a aVar4;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        aVar.getClass();
        str.getClass();
        list.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1567684143);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(list)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.f(str2)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            aVar3 = aVar2;
            if (qVar.h(aVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar3;
                }
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                if (z10 || L == l.f33918a) {
                    L = r.A(str2);
                    qVar.h0(L);
                }
                z0 z0Var = (z0) L;
                if (list.size() > 20) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i20 = i12 << 3;
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, str, true, null, null, c3.k.d(199309278, true, new c(z11, list, z0Var, aVar4, lVar), qVar), qVar, (i20 & 112) | 1575936 | (i20 & 896), 49);
                aVar3 = aVar4;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new u0(aVar, str, (List) list, (Object) str2, lVar, aVar3, i10, i11, 6);
                return;
            }
            return;
        }
        aVar3 = aVar2;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final String SingleOptionFilterBottomSheet$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z SingleOptionFilterBottomSheet$lambda$3(boolean z6, List list, z0 z0Var, ho.a aVar, ho.l lVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        t tVar;
        boolean z10;
        t tVar2;
        Object obj;
        float f10;
        Object obj2;
        q qVar;
        BottomSheetControl bottomSheetControl2;
        float f11;
        float f12;
        boolean z11;
        m mVar2 = mVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar2 = i3.q.f13017a;
        t e10 = p2.e(qVar2, 1.0f);
        if (z6) {
            tVar = ((r1.z) yVar).c(qVar2, 1.0f, true);
        } else {
            tVar = qVar2;
        }
        t then = e10.then(tVar);
        r1.e eVar = r1.j.f29230c;
        i3.j jVar = i3.d.B0;
        x a10 = w.a(eVar, jVar, mVar2, 0);
        q qVar3 = (q) mVar2;
        int hashCode = Long.hashCode(qVar3.T);
        o l4 = qVar3.l();
        t c5 = i3.a.c(then, mVar2);
        h4.h.f11920i.getClass();
        ho.a aVar2 = h4.g.f11903b;
        f2 f2Var = qVar3.f33969a;
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(aVar2);
        } else {
            qVar3.k0();
        }
        h4.e eVar2 = h4.g.f11907f;
        r.J(eVar2, a10, mVar2);
        h4.e eVar3 = h4.g.f11906e;
        r.J(eVar3, l4, mVar2);
        Integer valueOf = Integer.valueOf(hashCode);
        h4.e eVar4 = h4.g.f11908g;
        r.y(mVar2, valueOf, eVar4);
        h4.d dVar = h4.g.f11909h;
        r.F(dVar, mVar2);
        h4.e eVar5 = h4.g.f11905d;
        r.J(eVar5, c5, mVar2);
        if (z6) {
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            z10 = true;
            tVar2 = new m1(1.0f, true);
        } else {
            z10 = true;
            tVar2 = qVar2;
        }
        t y10 = n.y(tVar2, n.x(mVar2), z10, z10);
        x a11 = w.a(eVar, jVar, mVar2, 0);
        int hashCode2 = Long.hashCode(qVar3.T);
        o l7 = qVar3.l();
        t c10 = i3.a.c(y10, mVar2);
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(aVar2);
        } else {
            qVar3.k0();
        }
        r.J(eVar2, a11, mVar2);
        r.J(eVar3, l7, mVar2);
        r.y(mVar2, Integer.valueOf(hashCode2), eVar4);
        r.F(dVar, mVar2);
        r.J(eVar5, c10, mVar2);
        qVar3.X(460721385);
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = l.f33918a;
            if (!hasNext) {
                break;
            }
            KeyLabel keyLabel = (KeyLabel) it.next();
            boolean c11 = kotlin.jvm.internal.m.c(SingleOptionFilterBottomSheet$lambda$1(z0Var), keyLabel.getKey());
            String label = keyLabel.getLabel();
            t G = r1.d.G(p2.e(qVar2, 1.0f), EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5(), u.P, 2);
            boolean f13 = qVar3.f(z0Var) | qVar3.h(keyLabel);
            Object L = qVar3.L();
            if (!f13 && L != obj) {
                z11 = true;
            } else {
                z11 = true;
                L = new j(keyLabel, z0Var, 1);
                qVar3.h0(L);
            }
            EchoRadioButtonKt.EchoRadioButton(c11, (ho.a) L, label, G, null, mVar2, 0, 16);
        }
        qVar3.p(false);
        qVar3.p(true);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(mVar2, i11).getX5()), mVar2);
        t G2 = r1.d.G(p2.e(qVar2, 1.0f), echoTheme.getSpacings(mVar2, i11).getX5(), u.P, 2);
        r1.u0 u0Var = r1.j.f29228a;
        k2 a12 = i2.a(r1.j.g(echoTheme.getSpacings(mVar2, i11).getX4()), i3.d.f13004y0, mVar2, 0);
        int hashCode3 = Long.hashCode(qVar3.T);
        o l10 = qVar3.l();
        t c12 = i3.a.c(G2, mVar2);
        h4.h.f11920i.getClass();
        ho.a aVar3 = h4.g.f11903b;
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(aVar3);
        } else {
            qVar3.k0();
        }
        r.J(h4.g.f11907f, a12, mVar2);
        r.J(h4.g.f11906e, l10, mVar2);
        r.y(mVar2, Integer.valueOf(hashCode3), h4.g.f11908g);
        r.F(h4.g.f11909h, mVar2);
        r.J(h4.g.f11905d, c12, mVar2);
        if (aVar != null) {
            qVar3.X(368823427);
            String R = kj.c.R(mVar2, R.string.explore_filters_clear_filter);
            boolean f14 = qVar3.f(aVar) | qVar3.h(bottomSheetControl);
            Object L2 = qVar3.L();
            if (f14 || L2 == obj) {
                L2 = new d(aVar, bottomSheetControl, 2);
                qVar3.h0(L2);
            }
            ho.a aVar4 = (ho.a) L2;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = 1.0f;
            }
            f10 = Float.MAX_VALUE;
            qVar = qVar3;
            bottomSheetControl2 = bottomSheetControl;
            obj2 = obj;
            FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar4, new m1(f12, true), null, FullWidthButtonVariant.Secondary, null, false, false, false, mVar, 24576, 488);
            mVar2 = mVar;
            qVar.p(false);
        } else {
            f10 = Float.MAX_VALUE;
            obj2 = obj;
            qVar = qVar3;
            bottomSheetControl2 = bottomSheetControl;
            qVar.X(369249150);
            qVar.p(false);
        }
        String R2 = kj.c.R(mVar2, R.string.explore_filters_show_results);
        boolean f15 = qVar.f(lVar) | qVar.f(z0Var) | qVar.h(bottomSheetControl2);
        Object L3 = qVar.L();
        if (f15 || L3 == obj2) {
            L3 = new h(lVar, bottomSheetControl2, z0Var, 1);
            qVar.h0(L3);
        }
        ho.a aVar5 = (ho.a) L3;
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        if (1.0f > f10) {
            f11 = f10;
        } else {
            f11 = 1.0f;
        }
        q qVar4 = qVar;
        FullWidthButtonKt.EchoThemeFullWidthButton(R2, aVar5, new m1(f11, true), null, null, null, false, false, false, mVar2, 0, 504);
        qVar4.p(true);
        qVar4.p(true);
        return z.f31622a;
    }

    public static final z SingleOptionFilterBottomSheet$lambda$3$0$0$0$0$0(KeyLabel keyLabel, z0 z0Var) {
        z0Var.setValue(keyLabel.getKey());
        return z.f31622a;
    }

    public static final z SingleOptionFilterBottomSheet$lambda$3$0$1$0$0(ho.a aVar, BottomSheetControl bottomSheetControl) {
        aVar.invoke();
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z SingleOptionFilterBottomSheet$lambda$3$0$1$1$0(ho.l lVar, BottomSheetControl bottomSheetControl, z0 z0Var) {
        lVar.invoke(SingleOptionFilterBottomSheet$lambda$1(z0Var));
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z SingleOptionFilterBottomSheet$lambda$4(ho.a aVar, String str, List list, String str2, ho.l lVar, ho.a aVar2, int i10, int i11, m mVar, int i12) {
        SingleOptionFilterBottomSheet(aVar, str, list, str2, lVar, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
