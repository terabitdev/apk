package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f2;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.p;
import io.elevenlabs.ui.components.EchoInputSearchKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.v0;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001am\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0014²\u0006\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "", "title", "", "Lio/elevenlabs/domain/model/KeyLabel;", "options", "", "activeOptionKeys", "Lkotlin/Function1;", "onSave", "onClear", "MultiOptionFilterBottomSheet", "(Lho/a;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Lho/l;Lho/a;Lu2/m;II)V", "Preview_MultiOptionFilterBottomSheet", "(Lu2/m;I)V", "Preview_MultiOptionFilterBottomSheet_ManyOptions", "activeOptions", "searchQuery", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MultiOptionFilterBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MultiOptionFilterBottomSheet(ho.a aVar, String str, List<KeyLabel> list, Set<String> set, l lVar, ho.a aVar2, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        boolean z6;
        ho.a aVar4;
        r1 r10;
        ho.a aVar5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        aVar.getClass();
        str.getClass();
        list.getClass();
        set.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1400970736);
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
            if (qVar.h(set)) {
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
                    aVar5 = null;
                } else {
                    aVar5 = aVar3;
                }
                boolean f10 = qVar.f(set);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = r.A(o.l1(set));
                    qVar.h0(L);
                }
                int i20 = i12 << 3;
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, str, true, null, null, k.d(1111580643, true, new io.elevenlabs.readerapp.core.router.g(list, (z0) L, aVar5, lVar, 4), qVar), qVar, (i20 & 112) | 1575936 | (i20 & 896), 49);
                aVar4 = aVar5;
            } else {
                qVar.R();
                aVar4 = aVar3;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new u0(aVar, str, (List) list, (Object) set, lVar, aVar4, i10, i11, 5);
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

    private static final Set<String> MultiOptionFilterBottomSheet$lambda$1(z0 z0Var) {
        return (Set) z0Var.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x016c, code lost:
    
        if (r4 == r1) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z MultiOptionFilterBottomSheet$lambda$3(List list, z0 z0Var, ho.a aVar, l lVar, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        h4.d dVar;
        u2.e eVar;
        BottomSheetControl bottomSheetControl2;
        float f10;
        float f11;
        float f12;
        float f13;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar = i3.q.f13017a;
        t d10 = p2.d(qVar, 1.0f);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        t I = r1.d.I(d10, u.P, u.P, u.P, echoTheme.getSpacings(mVar, i11).getX4(), 7);
        r1.e eVar2 = r1.j.f29230c;
        i3.j jVar = i3.d.B0;
        x a10 = w.a(eVar2, jVar, mVar, 0);
        q qVar2 = (q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        c3.o l4 = qVar2.l();
        t c5 = i3.a.c(I, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        h4.e eVar3 = h4.g.f11907f;
        r.J(eVar3, a10, mVar);
        h4.e eVar4 = h4.g.f11906e;
        r.J(eVar4, l4, mVar);
        Integer valueOf = Integer.valueOf(hashCode);
        h4.e eVar5 = h4.g.f11908g;
        r.y(mVar, valueOf, eVar5);
        h4.d dVar2 = h4.g.f11909h;
        r.F(dVar2, mVar);
        h4.e eVar6 = h4.g.f11905d;
        r.J(eVar6, c5, mVar);
        Object L = qVar2.L();
        u2.e eVar7 = u2.l.f33918a;
        if (L == eVar7) {
            L = r.A("");
            qVar2.h0(L);
        }
        z0 z0Var2 = (z0) L;
        String MultiOptionFilterBottomSheet$lambda$3$0$1 = MultiOptionFilterBottomSheet$lambda$3$0$1(z0Var2);
        Object L2 = qVar2.L();
        if (L2 == eVar7) {
            dVar = dVar2;
            L2 = new a2.y(z0Var2, 16);
            qVar2.h0(L2);
        } else {
            dVar = dVar2;
        }
        h4.d dVar3 = dVar;
        EchoInputSearchKt.EchoInputSearch(MultiOptionFilterBottomSheet$lambda$3$0$1, (l) L2, r1.d.G(p2.e(qVar, 1.0f), echoTheme.getSpacings(mVar, i11).getX4(), u.P, 2), kj.c.R(mVar, R.string.search_placeholder), mVar, 48, 0);
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        t G = r1.d.G(n.y(new m1(1.0f, true), n.x(mVar), true, true), u.P, echoTheme.getSpacings(mVar, i11).getX4(), 1);
        x a11 = w.a(eVar2, jVar, mVar, 0);
        int hashCode2 = Long.hashCode(qVar2.T);
        c3.o l7 = qVar2.l();
        t c10 = i3.a.c(G, mVar);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        r.J(eVar3, a11, mVar);
        r.J(eVar4, l7, mVar);
        r.y(mVar, Integer.valueOf(hashCode2), eVar5);
        r.F(dVar3, mVar);
        r.J(eVar6, c10, mVar);
        List list2 = list;
        boolean f14 = qVar2.f(MultiOptionFilterBottomSheet$lambda$3$0$1(z0Var2)) | qVar2.f(list2);
        Object L3 = qVar2.L();
        if (!f14) {
            eVar = eVar7;
        } else {
            eVar = eVar7;
        }
        if (!wq.n.m0(MultiOptionFilterBottomSheet$lambda$3$0$1(z0Var2))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String label = ((KeyLabel) obj).getLabel();
                Locale locale = Locale.ROOT;
                String lowerCase = label.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = MultiOptionFilterBottomSheet$lambda$3$0$1(z0Var2).toLowerCase(locale);
                lowerCase2.getClass();
                if (wq.n.a0(lowerCase, lowerCase2, false)) {
                    arrayList.add(obj);
                }
            }
            list2 = arrayList;
        }
        qVar2.h0(list2);
        L3 = list2;
        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
        int i12 = EchoTheme.$stable;
        r1.d.g(p2.f(qVar, echoTheme2.getSpacings(mVar, i12).getX6()), mVar);
        t G2 = r1.d.G(qVar, echoTheme2.getSpacings(mVar, i12).getX4(), u.P, 2);
        r1.u0 u0Var = r1.j.f29228a;
        r1.d.b(G2, r1.j.g(echoTheme2.getSpacings(mVar, i12).getX4()), r1.j.g(echoTheme2.getSpacings(mVar, i12).getX4()), null, 0, 0, k.d(99400948, true, new defpackage.b((List) L3, z0Var, 9), mVar), mVar, 1572864, 56);
        m mVar2 = mVar;
        qVar2.p(true);
        r1.d.g(p2.f(qVar, echoTheme2.getSpacings(mVar2, i12).getX5()), mVar2);
        t G3 = r1.d.G(p2.e(qVar, 1.0f), echoTheme2.getSpacings(mVar2, i12).getX5(), u.P, 2);
        k2 a12 = i2.a(r1.j.g(echoTheme2.getSpacings(mVar2, i12).getX4()), i3.d.f13004y0, mVar2, 0);
        int hashCode3 = Long.hashCode(qVar2.T);
        c3.o l10 = qVar2.l();
        t c11 = i3.a.c(G3, mVar2);
        h4.h.f11920i.getClass();
        h4.f fVar2 = h4.g.f11903b;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar2);
        } else {
            qVar2.k0();
        }
        r.J(h4.g.f11907f, a12, mVar2);
        r.J(h4.g.f11906e, l10, mVar2);
        r.y(mVar2, Integer.valueOf(hashCode3), h4.g.f11908g);
        r.F(h4.g.f11909h, mVar2);
        r.J(h4.g.f11905d, c11, mVar2);
        if (aVar != null) {
            qVar2.X(-853032598);
            String R = kj.c.R(mVar2, R.string.explore_filters_clear_filter);
            boolean f15 = qVar2.f(aVar) | qVar2.h(bottomSheetControl);
            Object L4 = qVar2.L();
            if (f15 || L4 == eVar) {
                L4 = new d(aVar, bottomSheetControl, 1);
                qVar2.h0(L4);
            }
            ho.a aVar2 = (ho.a) L4;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            bottomSheetControl2 = bottomSheetControl;
            f10 = Float.MAX_VALUE;
            f11 = 1.0f;
            FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar2, new m1(f13, true), null, FullWidthButtonVariant.Secondary, null, false, false, false, mVar, 24576, 488);
            mVar2 = mVar;
            qVar2.p(false);
        } else {
            bottomSheetControl2 = bottomSheetControl;
            f10 = Float.MAX_VALUE;
            f11 = 1.0f;
            qVar2.X(-852606875);
            qVar2.p(false);
        }
        String R2 = kj.c.R(mVar2, R.string.explore_filters_show_results);
        boolean f16 = qVar2.f(lVar) | qVar2.f(z0Var) | qVar2.h(bottomSheetControl2);
        Object L5 = qVar2.L();
        if (f16 || L5 == eVar) {
            L5 = new h(lVar, bottomSheetControl2, z0Var, 0);
            qVar2.h0(L5);
        }
        ho.a aVar3 = (ho.a) L5;
        if (f11 <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        float f17 = f11;
        if (f17 > f10) {
            f12 = f10;
        } else {
            f12 = f17;
        }
        FullWidthButtonKt.EchoThemeFullWidthButton(R2, aVar3, new m1(f12, true), null, null, null, false, false, false, mVar, 0, 504);
        qVar2.p(true);
        WeakHashMap weakHashMap = c3.f29142x;
        r1.d.g(r1.d.N(r1.u0.e(mVar).f29154l), mVar);
        qVar2.p(true);
        return z.f31622a;
    }

    private static final String MultiOptionFilterBottomSheet$lambda$3$0$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$3$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$4$1(List list, z0 z0Var, v0 v0Var, m mVar, int i10) {
        boolean z6;
        Integer num;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KeyLabel keyLabel = (KeyLabel) it.next();
                boolean f10 = qVar.f(MultiOptionFilterBottomSheet$lambda$1(z0Var)) | qVar.f(keyLabel.getKey());
                Object L = qVar.L();
                Object obj = u2.l.f33918a;
                if (f10 || L == obj) {
                    L = Boolean.valueOf(MultiOptionFilterBottomSheet$lambda$1(z0Var).contains(keyLabel.getKey()));
                    qVar.h0(L);
                }
                boolean booleanValue = ((Boolean) L).booleanValue();
                String label = keyLabel.getLabel();
                ExploreFilterChipSize exploreFilterChipSize = ExploreFilterChipSize.Small;
                ho.a aVar = null;
                if (booleanValue) {
                    num = Integer.valueOf(io.elevenlabs.ui.R.drawable.close_rounded);
                } else {
                    num = null;
                }
                boolean f11 = qVar.f(z0Var) | qVar.g(booleanValue) | qVar.h(keyLabel);
                Object L2 = qVar.L();
                if (f11 || L2 == obj) {
                    L2 = new i(booleanValue, keyLabel, z0Var);
                    qVar.h0(L2);
                }
                ho.a aVar2 = (ho.a) L2;
                if (booleanValue) {
                    qVar.X(1164186224);
                    boolean f12 = qVar.f(z0Var) | qVar.h(keyLabel);
                    Object L3 = qVar.L();
                    if (f12 || L3 == obj) {
                        L3 = new j(keyLabel, z0Var, 0);
                        qVar.h0(L3);
                    }
                    aVar = (ho.a) L3;
                    qVar.p(false);
                } else {
                    qVar.X(1164296150);
                    qVar.p(false);
                }
                ExploreFilterChipKt.ExploreFilterChip(label, booleanValue, null, exploreFilterChipSize, num, aVar2, aVar, null, qVar, 3072, 132);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$1$0(boolean z6, KeyLabel keyLabel, z0 z0Var) {
        LinkedHashSet O;
        if (z6) {
            O = kd.a.K(MultiOptionFilterBottomSheet$lambda$1(z0Var), keyLabel.getKey());
        } else {
            O = kd.a.O(MultiOptionFilterBottomSheet$lambda$1(z0Var), keyLabel.getKey());
        }
        z0Var.setValue(O);
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$2$0(KeyLabel keyLabel, z0 z0Var) {
        z0Var.setValue(kd.a.K(MultiOptionFilterBottomSheet$lambda$1(z0Var), keyLabel.getKey()));
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$5$0$0(ho.a aVar, BottomSheetControl bottomSheetControl) {
        aVar.invoke();
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$3$0$5$1$0(l lVar, BottomSheetControl bottomSheetControl, z0 z0Var) {
        lVar.invoke(o.g1(MultiOptionFilterBottomSheet$lambda$1(z0Var)));
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z MultiOptionFilterBottomSheet$lambda$4(ho.a aVar, String str, List list, Set set, l lVar, ho.a aVar2, int i10, int i11, m mVar, int i12) {
        MultiOptionFilterBottomSheet(aVar, str, list, set, lVar, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_MultiOptionFilterBottomSheet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(647704765);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(new KeyLabel("fantasy", "Fantasy"), new KeyLabel("scifi", "Science Fiction"), new KeyLabel("mystery", "Mystery"), new KeyLabel("thriller", "Thriller"), new KeyLabel("romance", "Romance"), new KeyLabel("horror", "Horror"), new KeyLabel("historical", "Historical Fiction"), new KeyLabel("biography", "Biography"));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new p(21);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Set f12 = tn.n.f1(new String[]{"fantasy", "scifi"});
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(8);
                qVar.h0(L2);
            }
            l lVar = (l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new p(22);
                qVar.h0(L3);
            }
            MultiOptionFilterBottomSheet(aVar, "Genres", I, f12, lVar, (ho.a) L3, qVar, 224310, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 0);
        }
    }

    public static final z Preview_MultiOptionFilterBottomSheet$lambda$1$0(List list) {
        list.getClass();
        return z.f31622a;
    }

    public static final z Preview_MultiOptionFilterBottomSheet$lambda$3(int i10, m mVar, int i11) {
        Preview_MultiOptionFilterBottomSheet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_MultiOptionFilterBottomSheet_ManyOptions(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2051728349);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            no.e eVar = new no.e(1, 50, 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(eVar, 10));
            Iterator it = eVar.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((tn.y) it).nextInt();
                arrayList.add(new KeyLabel(defpackage.f.e(nextInt, "tag_"), defpackage.f.e(nextInt, "Tag ")));
            }
            Object L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (L == eVar2) {
                L = new p(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Set f12 = tn.n.f1(new String[]{"tag_5", "tag_12", "tag_23"});
            Object L2 = qVar.L();
            if (L2 == eVar2) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(9);
                qVar.h0(L2);
            }
            l lVar = (l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar2) {
                L3 = new p(23);
                qVar.h0(L3);
            }
            MultiOptionFilterBottomSheet(aVar, "Tags", arrayList, f12, lVar, (ho.a) L3, qVar, 224310, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 1);
        }
    }

    public static final z Preview_MultiOptionFilterBottomSheet_ManyOptions$lambda$2$0(List list) {
        list.getClass();
        return z.f31622a;
    }

    public static final z Preview_MultiOptionFilterBottomSheet_ManyOptions$lambda$4(int i10, m mVar, int i11) {
        Preview_MultiOptionFilterBottomSheet_ManyOptions(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
