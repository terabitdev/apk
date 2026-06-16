package io.elevenlabs.readerapp.ui.components.homev3;

import c3.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import fm.e;
import fm.i;
import h4.g;
import h4.h;
import h5.f;
import ho.l;
import i3.a;
import i3.t;
import io.elevenlabs.domain.model.GenreTilesGridRow;
import io.elevenlabs.readerapp.ui.components.homev3.GenreTilesGridRowKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.d2;
import r1.j;
import r1.p2;
import r1.u;
import r1.u0;
import r1.v;
import r1.w;
import r1.x;
import rd.c1;
import sn.z;
import t1.b;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "title", "", "Lio/elevenlabs/domain/model/GenreTilesGridRow$Tile;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "GenreTilesGridRowV3", "(Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", "item", "Lkotlin/Function0;", "onClick", "Tile", "(Lio/elevenlabs/domain/model/GenreTilesGridRow$Tile;Lho/a;Li3/t;Lu2/m;II)V", "Preview_GenreTilesGridRowV3", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class GenreTilesGridRowKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenreTilesGridRowV3(final String str, final List<GenreTilesGridRow.Tile> list, final l lVar, t tVar, m mVar, int i10, int i11) {
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
        qVar.Z(348633719);
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
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                final float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i18).m2357getX5D9Ej5fM();
                final float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM();
                final float m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i18).m2356getX4D9Ej5fM();
                final float m2353getX2D9Ej5fM2 = elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM();
                d.a(tVar4, null, false, k.d(-997499167, true, new ho.q() { // from class: fm.h
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z GenreTilesGridRowV3$lambda$0;
                        int intValue = ((Integer) obj3).intValue();
                        GenreTilesGridRowV3$lambda$0 = GenreTilesGridRowKt.GenreTilesGridRowV3$lambda$0(list, m2356getX4D9Ej5fM, m2357getX5D9Ej5fM, m2353getX2D9Ej5fM, str, m2353getX2D9Ej5fM2, lVar, (u) obj, (u2.m) obj2, intValue);
                        return GenreTilesGridRowV3$lambda$0;
                    }
                }, qVar), qVar, ((i12 >> 9) & 14) | 3072, 6);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new i(i10, i11, 0, lVar, tVar3, str, list);
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

    public static final z GenreTilesGridRowV3$lambda$0(List list, float f10, float f11, float f12, String str, final float f13, final l lVar, u uVar, m mVar, int i10) {
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
            Object obj = u2.l.f33918a;
            if (c5 || L == obj) {
                float f14 = 2;
                L = new f(((vVar.d() - (f11 * f14)) - f12) / f14);
                qVar.h0(L);
            }
            final float f15 = ((f) L).f12083a;
            boolean f16 = qVar.f(list);
            Object L2 = qVar.L();
            if (f16 || L2 == obj) {
                L2 = o.l0(list, 2);
                qVar.h0(L2);
            }
            final List list2 = (List) L2;
            i3.q qVar2 = i3.q.f13017a;
            t I = d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, f10, 7);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c10 = a.c(I, qVar);
            h.f11920i.getClass();
            ho.a aVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c10, qVar);
            SectionHeaderKt.SectionHeader(str, SectionHeaderStyle.Large, null, null, qVar, 48, 12);
            d2 d10 = d.d(f11, t2.u.P, 2);
            r1.h g10 = j.g(f12);
            t e10 = p2.e(qVar2, 1.0f);
            boolean h10 = qVar.h(list2) | qVar.c(f15) | qVar.c(f13) | qVar.f(lVar);
            Object L3 = qVar.L();
            if (h10 || L3 == obj) {
                L3 = new l() { // from class: fm.k
                    @Override // ho.l
                    public final Object invoke(Object obj2) {
                        z GenreTilesGridRowV3$lambda$0$2$0$0;
                        GenreTilesGridRowV3$lambda$0$2$0$0 = GenreTilesGridRowKt.GenreTilesGridRowV3$lambda$0$2$0$0(list2, f15, f13, lVar, (t1.t) obj2);
                        return GenreTilesGridRowV3$lambda$0$2$0$0;
                    }
                };
                qVar.h0(L3);
            }
            c1.d(e10, null, d10, g10, null, null, false, null, (l) L3, qVar, 6, 490);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z GenreTilesGridRowV3$lambda$0$2$0$0(final List list, final float f10, final float f11, final l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.d(tVar, list.size(), null, new c3.j(new ho.r() { // from class: fm.j
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                z GenreTilesGridRowV3$lambda$0$2$0$0$0;
                int intValue = ((Integer) obj4).intValue();
                GenreTilesGridRowV3$lambda$0$2$0$0$0 = GenreTilesGridRowKt.GenreTilesGridRowV3$lambda$0$2$0$0$0(f10, f11, list, lVar, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue);
                return GenreTilesGridRowV3$lambda$0$2$0$0$0;
            }
        }, true, -1093421609), 6);
        return z.f31622a;
    }

    public static final z GenreTilesGridRowV3$lambda$0$2$0$0$0(float f10, float f11, List list, l lVar, b bVar, int i10, m mVar, int i11) {
        int i12;
        boolean z6;
        int i13;
        bVar.getClass();
        if ((i11 & 48) == 0) {
            if (((q) mVar).d(i10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t s10 = p2.s(qVar2, f10);
            x a10 = w.a(j.g(f11), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = a.c(s10, qVar);
            h.f11920i.getClass();
            ho.a aVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            qVar.X(1939274377);
            for (GenreTilesGridRow.Tile tile : (Iterable) list.get(i10)) {
                boolean f12 = qVar.f(lVar) | qVar.h(tile);
                Object L = qVar.L();
                if (f12 || L == u2.l.f33918a) {
                    L = new a2.q(lVar, tile, 9);
                    qVar.h0(L);
                }
                Tile(tile, (ho.a) L, p2.e(qVar2, 1.0f), qVar, 384, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z GenreTilesGridRowV3$lambda$0$2$0$0$0$0$0$0$0(l lVar, GenreTilesGridRow.Tile tile) {
        lVar.invoke(tile);
        return z.f31622a;
    }

    public static final z GenreTilesGridRowV3$lambda$1(String str, List list, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        GenreTilesGridRowV3(str, list, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_GenreTilesGridRowV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1096497231);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$GenreTilesGridRowKt.INSTANCE.m1170getLambda$860566693$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 2);
        }
    }

    public static final z Preview_GenreTilesGridRowV3$lambda$0(int i10, m mVar, int i11) {
        Preview_GenreTilesGridRowV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Tile(GenreTilesGridRow.Tile tile, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        GenreTilesGridRow.Tile tile2;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(846562864);
        if ((i10 & 6) == 0) {
            tile2 = tile;
            if (qVar.h(tile2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            tile2 = tile;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
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
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                z1.g b10 = z1.h.b(elevenLabsTheme.getSpacings(qVar, i17).m2355getX3D9Ej5fM());
                t c5 = m3.h.c(tVar4, b10);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                if (z10 || L == u2.l.f33918a) {
                    L = new fm.g(0, aVar);
                    qVar.h0(L);
                }
                t E = d.E(p2.h(n.h(n.p(c5, false, null, null, null, (ho.a) L, 15), elevenLabsTheme.getColor(qVar, i17).getSquareIconButton().m2168getBg0d7_KjU(), b10), 96, t2.u.P, 2), elevenLabsTheme.getSpacings(qVar, i17).m2355getX3D9Ej5fM());
                u0 u0Var = j.f29228a;
                x a10 = w.a(j.i(elevenLabsTheme.getSpacings(qVar, i17).m2353getX2D9Ej5fM(), i3.d.A0), i3.d.B0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                t c10 = a.c(E, qVar);
                h.f11920i.getClass();
                h4.f fVar = g.f11903b;
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
                r.J(g.f11905d, c10, qVar);
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(tile2.getIconUrl(), p2.o(qVar2, 24), new p3.x(elevenLabsTheme.getColor(qVar, i17).getSquareIconButton().m2169getFg0d7_KjU()), null, null, Integer.valueOf(R.drawable.more_dots), null, qVar, 48, 88);
                j7.d(tile.getTitle(), p2.e(qVar2, 1.0f), elevenLabsTheme.getColor(qVar, i17).getSquareIconButton().m2169getFg0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 2, 1, null, elevenLabsTheme.getTypo(qVar, i17).getBodySmall600(), qVar, 48, 221184, 81912);
                qVar = qVar;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(tile, aVar, tVar3, i10, i11, 1);
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

    public static final z Tile$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z Tile$lambda$2(GenreTilesGridRow.Tile tile, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        Tile(tile, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
