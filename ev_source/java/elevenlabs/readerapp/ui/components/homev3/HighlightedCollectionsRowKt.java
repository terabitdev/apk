package io.elevenlabs.readerapp.ui.components.homev3;

import c3.k;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import fm.g;
import h4.f;
import h4.h;
import ho.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import io.elevenlabs.readerapp.ui.components.homev3.HighlightedCollectionsRowKt;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d2;
import r1.e;
import r1.j;
import r1.p;
import r1.p2;
import r1.u;
import r1.v;
import r1.w;
import r1.x;
import rd.c1;
import sn.z;
import t1.b;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection$Item;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "HighlightedCollectionsRowV3", "(Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", "item", "Lkotlin/Function0;", "onClick", "HighlightedCollection", "(Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection$Item;Lho/a;Li3/t;Lu2/m;II)V", "Preview_HighlightedCollectionsRowV3", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlightedCollectionsRowKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HighlightedCollection(HighlightedCollectionsRowSection.Item item, a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(689756236);
        if ((i10 & 6) == 0) {
            if (qVar2.h(item)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
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
            if (qVar2.f(tVar2)) {
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
            if (!qVar2.O(i12 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar2.L();
                if (z10 || L == l.f33918a) {
                    L = new g(1, aVar);
                    qVar2.h0(L);
                }
                t p10 = n.p(tVar4, false, null, null, null, (a) L, 15);
                t tVar5 = tVar4;
                e eVar = j.f29230c;
                i3.j jVar = d.B0;
                x a10 = w.a(eVar, jVar, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(p10, qVar2);
                h.f11920i.getClass();
                f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                r.J(eVar2, a10, qVar2);
                h4.e eVar3 = h4.g.f11906e;
                r.J(eVar3, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                r.y(qVar2, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar2);
                h4.e eVar5 = h4.g.f11905d;
                r.J(eVar5, c5, qVar2);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                z1.g b10 = z1.h.b(elevenLabsTheme.getSpacings(qVar2, i17).m2355getX3D9Ej5fM());
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(item.getImageUrl(), r1.d.j(n.h(m3.h.c(BoxShadowKt.boxShadow(p2.e(qVar3, 1.0f), elevenLabsTheme.getShadows(qVar2, i17).getLg(), b10, false, qVar2, 6, 4), b10), elevenLabsTheme.getColor(qVar2, i17).getBackground().m2003getPrimary0d7_KjU(), b10), 1.875f, false), null, f4.q.f8839b, null, null, null, qVar2, 3072, 116);
                r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i17).m2355getX3D9Ej5fM()), qVar2);
                f1 d10 = p.d(d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar2.T);
                o l7 = qVar2.l();
                t c10 = i3.a.c(qVar3, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar2, d10, qVar2);
                r.J(eVar3, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                r.J(eVar5, c10, qVar2);
                float f10 = 6;
                x a11 = w.a(j.g(f10), jVar, qVar2, 6);
                int hashCode3 = Long.hashCode(qVar2.T);
                o l10 = qVar2.l();
                t c11 = i3.a.c(qVar3, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar2, a11, qVar2);
                r.J(eVar3, l10, qVar2);
                defpackage.f.u(hashCode3, qVar2, eVar4, qVar2, dVar);
                r.J(eVar5, c11, qVar2);
                j7.d(item.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar2, i17), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar2, i17).getBodyMedium700(), qVar2, 0, 24960, 110586);
                String subtitle = item.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                j7.d(subtitle, null, i.w(elevenLabsTheme, qVar2, i17), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, elevenLabsTheme.getTypo(qVar2, i17).getBodySmall400(), qVar2, 0, 24960, 110586);
                qVar2.p(true);
                x a12 = w.a(j.g(f10), jVar, qVar2, 6);
                int hashCode4 = Long.hashCode(qVar2.T);
                o l11 = qVar2.l();
                t c12 = i3.a.c(qVar3, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar2, a12, qVar2);
                r.J(eVar3, l11, qVar2);
                defpackage.f.u(hashCode4, qVar2, eVar4, qVar2, dVar);
                r.J(eVar5, c12, qVar2);
                j7.d("", null, defpackage.f.b(elevenLabsTheme, qVar2, i17), 0L, null, 0L, null, 0L, 0, false, 0, 2, null, elevenLabsTheme.getTypo(qVar2, i17).getBodyMedium700(), qVar2, 6, 196608, 98298);
                j7.d("", null, i.w(elevenLabsTheme, qVar2, i17), 0L, null, 0L, null, 0L, 0, false, 0, 2, null, elevenLabsTheme.getTypo(qVar2, i17).getBodySmall400(), qVar2, 6, 196608, 98298);
                qVar = qVar2;
                p.n.t(qVar, true, true, true);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(item, aVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HighlightedCollection$lambda$0$0(a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z HighlightedCollection$lambda$2(HighlightedCollectionsRowSection.Item item, a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        HighlightedCollection(item, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HighlightedCollectionsRowV3(String str, List<HighlightedCollectionsRowSection.Item> list, ho.l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        int i16;
        str.getClass();
        list.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1560455637);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                r1.d.a(tVar4, null, false, k.d(-1521555819, true, new fm.l(tVar4, str, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), list, lVar), qVar), qVar, ((i12 >> 9) & 14) | 3072, 6);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.i(i10, i11, 1, lVar, tVar3, str, list);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HighlightedCollectionsRowV3$lambda$0(t tVar, String str, float f10, List list, ho.l lVar, u uVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        uVar.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(uVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            v vVar = (v) uVar;
            boolean c5 = qVar.c(vVar.d());
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (c5 || L == eVar) {
                L = new h5.f(vVar.d() * 0.75f);
                qVar.h0(L);
            }
            float f11 = ((h5.f) L).f12083a;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            t I = r1.d.I(tVar, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), 7);
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c10 = i3.a.c(I, qVar);
            h.f11920i.getClass();
            f fVar = h4.g.f11903b;
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
            r.J(h4.g.f11905d, c10, qVar);
            SectionHeaderKt.SectionHeader(str, SectionHeaderStyle.Large, null, null, qVar, 48, 12);
            d2 d10 = r1.d.d(f10, t2.u.P, 2);
            r1.h g10 = j.g(elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM());
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            boolean h10 = qVar.h(list) | qVar.f(lVar) | qVar.c(f11);
            Object L2 = qVar.L();
            if (h10 || L2 == eVar) {
                L2 = new a2.a(list, lVar, f11, 1);
                qVar.h0(L2);
            }
            c1.d(e10, null, d10, g10, null, null, false, null, (ho.l) L2, qVar, 6, 490);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HighlightedCollectionsRowV3$lambda$0$1$0$0(final List list, final ho.l lVar, final float f10, t1.t tVar) {
        tVar.getClass();
        t1.t.d(tVar, list.size(), null, new c3.j(new ho.r() { // from class: fm.m
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z HighlightedCollectionsRowV3$lambda$0$1$0$0$0;
                int intValue = ((Integer) obj4).intValue();
                HighlightedCollectionsRowV3$lambda$0$1$0$0$0 = HighlightedCollectionsRowKt.HighlightedCollectionsRowV3$lambda$0$1$0$0$0(list, lVar, f10, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue);
                return HighlightedCollectionsRowV3$lambda$0$1$0$0$0;
            }
        }, true, -1553559157), 6);
        return z.f31622a;
    }

    public static final z HighlightedCollectionsRowV3$lambda$0$1$0$0$0(List list, ho.l lVar, float f10, b bVar, int i10, m mVar, int i11) {
        boolean z6;
        int i12;
        bVar.getClass();
        if ((i11 & 48) == 0) {
            if (((q) mVar).d(i10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            HighlightedCollectionsRowSection.Item item = (HighlightedCollectionsRowSection.Item) list.get(i10);
            boolean f11 = qVar.f(lVar) | qVar.h(item);
            Object L = qVar.L();
            if (f11 || L == l.f33918a) {
                L = new a2.q(lVar, item, 10);
                qVar.h0(L);
            }
            HighlightedCollection(item, (a) L, p2.s(i3.q.f13017a, f10), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HighlightedCollectionsRowV3$lambda$0$1$0$0$0$0$0(ho.l lVar, HighlightedCollectionsRowSection.Item item) {
        lVar.invoke(item);
        return z.f31622a;
    }

    public static final z HighlightedCollectionsRowV3$lambda$1(String str, List list, ho.l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        HighlightedCollectionsRowV3(str, list, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HighlightedCollectionsRowV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1454396443);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$HighlightedCollectionsRowKt.INSTANCE.getLambda$633805711$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 3);
        }
    }

    public static final z Preview_HighlightedCollectionsRowV3$lambda$0(int i10, m mVar, int i11) {
        Preview_HighlightedCollectionsRowV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
