package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Lio/elevenlabs/domain/model/MiniReadGridSection$Item;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "MiniReadGrid", "(Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", "item", "Lkotlin/Function0;", "onClick", "Item", "(Lio/elevenlabs/domain/model/MiniReadGridSection$Item;Lho/a;Li3/t;Lu2/m;II)V", "Preview_MiniReadGrid", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MiniReadGridKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Item(MiniReadGridSection.Item item, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(205987329);
        if ((i10 & 6) == 0) {
            if (qVar.h(item)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
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
                    tVar2 = qVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                EchoThemeShapes shapes = echoTheme.getShapes(qVar, i17);
                int i18 = EchoThemeShapes.$stable;
                p3.b1 twoXl = shapes.getTwoXl(qVar, i18);
                float f10 = 64;
                i3.t c5 = m3.h.c(p2.f(tVar2, f10), twoXl);
                EchoThemeColors.Fill fill = echoTheme.getColors(qVar, i17).getFill();
                int i19 = EchoThemeColors.Fill.$stable;
                long undenaryAlpha = fill.getUndenaryAlpha(qVar, i19);
                p3.w0 w0Var = p3.h0.f26395b;
                i3.t tVar3 = tVar2;
                i3.t p10 = l1.n.p(l1.n.j(1, echoTheme.getColors(qVar, i17).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable), l1.n.h(c5, undenaryAlpha, w0Var), twoXl), false, null, null, null, aVar, 15);
                boolean h10 = qVar.h(item);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new a2.b(item, 27);
                    qVar.h0(L);
                }
                i3.t c10 = p4.q.c(p10, true, (ho.l) L);
                r1.u0 u0Var = r1.j.f29228a;
                k2 a10 = i2.a(ib.i.m(echoTheme, qVar, i17), i3.d.f13005z0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c11 = i3.a.c(c10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                u2.r.J(eVar, a10, qVar);
                h4.e eVar2 = h4.g.f11906e;
                u2.r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                h4.e eVar4 = h4.g.f11905d;
                u2.r.J(eVar4, c11, qVar);
                i3.t o6 = p2.o(qVar2, f10);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c12 = i3.a.c(o6, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar, d10, qVar);
                u2.r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                u2.r.J(eVar4, c12, qVar);
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(item.getImageUrl(), l1.n.h(m3.h.c(p2.o(qVar2, 48), echoTheme.getShapes(qVar, i17).getLg(qVar, i18)), echoTheme.getColors(qVar, i17).getFill().getDenaryAlpha(qVar, i19), w0Var), null, f4.q.f8839b, i3.d.f12998b, null, null, qVar, 27648, 100);
                qVar.p(true);
                String title = item.getTitle();
                s4.y0 smRegular500 = echoTheme.getTypography(qVar, i17).getSmRegular500(qVar, EchoThemeTypography.$stable);
                long primary = echoTheme.getColors(qVar, i17).getText().getPrimary(qVar, EchoThemeColors.Text.$stable);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                j7.d(title, r1.d.I(new m1(1.0f, true), t2.u.P, t2.u.P, echoTheme.getSpacings(qVar, i17).getX2(), t2.u.P, 11), primary, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, smRegular500, qVar, 0, 24960, 110584);
                qVar = qVar;
                qVar.p(true);
                tVar2 = tVar3;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(item, aVar, tVar2, i10, i11, 13);
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

    public static final sn.z Item$lambda$0$0(MiniReadGridSection.Item item, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(item.getTitle(), b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z Item$lambda$2(MiniReadGridSection.Item item, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        Item(item, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void MiniReadGrid(final List<MiniReadGridSection.Item> list, final ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        int i14;
        int i15;
        list.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1503556587);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
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
            if (qVar.f(tVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i16 != 0) {
                tVar = i3.q.f13017a;
            }
            i3.t tVar3 = tVar;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i17 = EchoTheme.$stable;
            final float x32 = echoTheme.getSpacings(qVar, i17).getX3();
            final float x52 = echoTheme.getSpacings(qVar, i17).getX5();
            r1.d.a(tVar3, null, false, c3.k.d(944562431, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.components.y
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z MiniReadGrid$lambda$0;
                    int intValue = ((Integer) obj3).intValue();
                    MiniReadGrid$lambda$0 = MiniReadGridKt.MiniReadGrid$lambda$0(list, x52, x32, lVar, (r1.u) obj, (u2.m) obj2, intValue);
                    return MiniReadGrid$lambda$0;
                }
            }, qVar), qVar, ((i12 >> 6) & 14) | 3072, 6);
            tVar2 = tVar3;
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new z(list, lVar, tVar2, i10, i11, 0);
        }
    }

    public static final sn.z MiniReadGrid$lambda$0(List list, float f10, float f11, ho.l lVar, r1.u uVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        uVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(uVar)) {
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
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            r1.v vVar = (r1.v) uVar;
            boolean c5 = qVar.c(vVar.d());
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (c5 || L == obj) {
                float f12 = 2;
                L = new h5.f(((vVar.d() - (f10 * f12)) - f11) / f12);
                qVar.h0(L);
            }
            float f13 = ((h5.f) L).f12083a;
            boolean f14 = qVar.f(list);
            Object L2 = qVar.L();
            if (f14 || L2 == obj) {
                L2 = tn.o.l0(list, 2);
                qVar.h0(L2);
            }
            List list2 = (List) L2;
            i3.q qVar2 = i3.q.f13017a;
            i3.t G = r1.d.G(qVar2, f10, t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.g(f11), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c10, h4.g.f11905d, 1792364162, list2);
            while (s10.hasNext()) {
                List list3 = (List) s10.next();
                k2 a11 = i2.a(r1.j.g(f11), i3.d.f13004y0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c11 = i3.a.c(qVar2, qVar);
                h4.h.f11920i.getClass();
                ho.a aVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(aVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a11, qVar);
                u2.r.J(h4.g.f11906e, l7, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                Iterator s11 = com.google.android.gms.internal.play_billing.b.s(qVar, c11, h4.g.f11905d, 252333047, list3);
                while (s11.hasNext()) {
                    MiniReadGridSection.Item item = (MiniReadGridSection.Item) s11.next();
                    boolean f15 = qVar.f(lVar) | qVar.h(item);
                    Object L3 = qVar.L();
                    if (f15 || L3 == obj) {
                        L3 = new y0(lVar, item, 3);
                        qVar.h0(L3);
                    }
                    Item(item, (ho.a) L3, p2.s(qVar2, f13), qVar, 0, 0);
                }
                qVar.p(false);
                qVar.p(true);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MiniReadGrid$lambda$0$2$0$0$0$0$0(ho.l lVar, MiniReadGridSection.Item item) {
        lVar.invoke(item);
        return sn.z.f31622a;
    }

    public static final sn.z MiniReadGrid$lambda$1(List list, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        MiniReadGrid(list, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_MiniReadGrid(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1824570548);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MiniReadGridKt.INSTANCE.getLambda$142583706$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 11);
        }
    }

    public static final sn.z Preview_MiniReadGrid$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_MiniReadGrid(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
