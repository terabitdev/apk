package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001as\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {TokenNames.T, "Li3/t;", "modifier", "", FirebaseAnalytics.Param.ITEMS, "Lh5/f;", "minItemWidth", "maxItemWidth", "", "minColumns", "horizontalSpacing", "verticalSpacing", "Lkotlin/Function1;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "AdaptiveGrid-5PRATvw", "(Li3/t;Ljava/lang/Iterable;FFIFFLho/q;Lu2/m;II)V", "AdaptiveGrid", "Preview_AdaptiveGrid", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AdaptiveGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0084  */
    /* renamed from: AdaptiveGrid-5PRATvw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void m1773AdaptiveGrid5PRATvw(i3.t tVar, final Iterable<? extends T> iterable, float f10, float f11, int i10, float f12, float f13, final ho.q qVar, u2.m mVar, final int i11, final int i12) {
        int i13;
        int i14;
        Iterable<? extends T> iterable2;
        float f14;
        int i15;
        float f15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f16;
        int i20;
        int i21;
        float f17;
        int i22;
        int i23;
        boolean z6;
        final i3.t tVar2;
        u2.q qVar2;
        final float f18;
        final float f19;
        final int i24;
        final float f20;
        final float f21;
        u2.r1 r10;
        i3.t tVar3;
        float f22;
        final float f23;
        final float f24;
        final float f25;
        final float f26;
        i3.t tVar4;
        final int i25;
        int i26;
        int i27;
        int i28;
        iterable.getClass();
        qVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1303562583);
        int i29 = i12 & 1;
        if (i29 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (qVar3.f(tVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            iterable2 = iterable;
            if (qVar3.h(iterable2)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i13 |= i28;
        } else {
            iterable2 = iterable;
        }
        int i30 = i12 & 4;
        if (i30 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            f14 = f10;
            if (qVar3.c(f14)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
            if ((i11 & 3072) != 0) {
                if ((i12 & 8) == 0) {
                    f15 = f11;
                    if (qVar3.c(f15)) {
                        i27 = 2048;
                        i13 |= i27;
                    }
                } else {
                    f15 = f11;
                }
                i27 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i13 |= i27;
            } else {
                f15 = f11;
            }
            i16 = i12 & 16;
            if (i16 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i17 = i10;
                if (qVar3.d(i17)) {
                    i18 = 16384;
                } else {
                    i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i18;
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    f16 = f12;
                    if (qVar3.c(f16)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i13 |= i20;
                    i21 = i12 & 64;
                    if (i21 == 0) {
                        i13 |= 1572864;
                    } else if ((1572864 & i11) == 0) {
                        f17 = f13;
                        if (qVar3.c(f17)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                        if ((12582912 & i11) == 0) {
                            if (qVar3.h(qVar)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i13 |= i26;
                        }
                        i23 = i13;
                        if ((i13 & 4793491) != 4793490) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar3.O(i23 & 1, z6)) {
                            qVar3.T();
                            if ((i11 & 1) != 0 && !qVar3.y()) {
                                qVar3.R();
                                f24 = f14;
                                f23 = f16;
                                f26 = f17;
                                f25 = f15;
                                i25 = i17;
                                tVar4 = tVar;
                            } else {
                                if (i29 != 0) {
                                    tVar3 = i3.q.f13017a;
                                } else {
                                    tVar3 = tVar;
                                }
                                if (i30 != 0) {
                                    f14 = 100;
                                }
                                if ((i12 & 8) != 0) {
                                    f15 = f14;
                                }
                                if (i16 != 0) {
                                    i17 = 1;
                                }
                                if (i19 != 0) {
                                    f22 = 8;
                                } else {
                                    f22 = f16;
                                }
                                if (i21 != 0) {
                                    f26 = 8;
                                    f23 = f22;
                                    f24 = f14;
                                    f25 = f15;
                                    i25 = i17;
                                    tVar4 = tVar3;
                                } else {
                                    f23 = f22;
                                    f24 = f14;
                                    f25 = f15;
                                    f26 = f17;
                                    tVar4 = tVar3;
                                    i25 = i17;
                                }
                            }
                            qVar3.q();
                            final Iterable<? extends T> iterable3 = iterable2;
                            r1.d.a(r1.p2.e(tVar4, 1.0f), null, false, c3.k.d(1887208769, true, new ho.q() { // from class: io.elevenlabs.ui.components.c
                                @Override // ho.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    sn.z AdaptiveGrid_5PRATvw$lambda$0;
                                    int intValue = ((Integer) obj3).intValue();
                                    AdaptiveGrid_5PRATvw$lambda$0 = AdaptiveGridKt.AdaptiveGrid_5PRATvw$lambda$0(f24, f25, f23, i25, f26, iterable3, qVar, (r1.u) obj, (u2.m) obj2, intValue);
                                    return AdaptiveGrid_5PRATvw$lambda$0;
                                }
                            }, qVar3), qVar3, 3072, 6);
                            qVar2 = qVar3;
                            tVar2 = tVar4;
                            f18 = f24;
                            f19 = f25;
                            f20 = f23;
                            i24 = i25;
                            f21 = f26;
                        } else {
                            qVar3.R();
                            tVar2 = tVar;
                            qVar2 = qVar3;
                            f18 = f14;
                            f19 = f15;
                            i24 = i17;
                            f20 = f16;
                            f21 = f17;
                        }
                        r10 = qVar2.r();
                        if (r10 != null) {
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.d
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z AdaptiveGrid_5PRATvw$lambda$1;
                                    int intValue = ((Integer) obj2).intValue();
                                    AdaptiveGrid_5PRATvw$lambda$1 = AdaptiveGridKt.AdaptiveGrid_5PRATvw$lambda$1(i3.t.this, iterable, f18, f19, i24, f20, f21, qVar, i11, i12, (u2.m) obj, intValue);
                                    return AdaptiveGrid_5PRATvw$lambda$1;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f17 = f13;
                    if ((12582912 & i11) == 0) {
                    }
                    i23 = i13;
                    if ((i13 & 4793491) != 4793490) {
                    }
                    if (qVar3.O(i23 & 1, z6)) {
                    }
                    r10 = qVar2.r();
                    if (r10 != null) {
                    }
                }
                f16 = f12;
                i21 = i12 & 64;
                if (i21 == 0) {
                }
                f17 = f13;
                if ((12582912 & i11) == 0) {
                }
                i23 = i13;
                if ((i13 & 4793491) != 4793490) {
                }
                if (qVar3.O(i23 & 1, z6)) {
                }
                r10 = qVar2.r();
                if (r10 != null) {
                }
            }
            i17 = i10;
            i19 = i12 & 32;
            if (i19 != 0) {
            }
            f16 = f12;
            i21 = i12 & 64;
            if (i21 == 0) {
            }
            f17 = f13;
            if ((12582912 & i11) == 0) {
            }
            i23 = i13;
            if ((i13 & 4793491) != 4793490) {
            }
            if (qVar3.O(i23 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        f14 = f10;
        if ((i11 & 3072) != 0) {
        }
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        i17 = i10;
        i19 = i12 & 32;
        if (i19 != 0) {
        }
        f16 = f12;
        i21 = i12 & 64;
        if (i21 == 0) {
        }
        f17 = f13;
        if ((12582912 & i11) == 0) {
        }
        i23 = i13;
        if ((i13 & 4793491) != 4793490) {
        }
        if (qVar3.O(i23 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final sn.z AdaptiveGrid_5PRATvw$lambda$0(float f10, float f11, float f12, int i10, float f13, Iterable iterable, ho.q qVar, r1.u uVar, u2.m mVar, int i11) {
        int i12;
        boolean z6;
        double d10;
        float f14;
        float f15;
        int i13;
        uVar.getClass();
        if ((i11 & 6) == 0) {
            if (((u2.q) mVar).f(uVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i12 & 1, z6)) {
            h5.c cVar = (h5.c) qVar2.j(i4.j1.f13129h);
            float h10 = h5.a.h(((r1.v) uVar).f29369b);
            boolean f16 = qVar2.f(cVar) | qVar2.c(h10) | qVar2.c(f10) | qVar2.c(f11) | qVar2.c(f12);
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (f16 || L == eVar) {
                L = Float.valueOf(Math.min(cVar.d0(f11), Math.max(cVar.d0(f10), h10 / ((int) (h10 / (cVar.d0(f12) + cVar.d0(f10)))))));
                qVar2.h0(L);
            }
            float floatValue = ((Number) L).floatValue();
            boolean f17 = qVar2.f(cVar) | qVar2.c(h10) | qVar2.c(floatValue) | qVar2.c(f12) | qVar2.d(i10);
            Object L2 = qVar2.L();
            if (f17 || L2 == eVar) {
                L2 = Integer.valueOf(Math.max(i10, (int) ((cVar.d0(f12) + h10) / (cVar.d0(f12) + floatValue))));
                qVar2.h0(L2);
            }
            int intValue = ((Number) L2).intValue();
            i3.q qVar3 = i3.q.f13017a;
            float f18 = 1.0f;
            i3.t e10 = r1.p2.e(qVar3, 1.0f);
            r1.x a10 = r1.w.a(r1.j.g(f13), i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(e10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            qVar2.X(-506764030);
            Iterator it = tn.o.l0(iterable, intValue).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                i3.t e11 = r1.p2.e(qVar3, f18);
                r1.k2 a11 = r1.i2.a(r1.j.g(f12), i3.d.f13004y0, qVar2, 0);
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                i3.t c10 = i3.a.c(e11, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar2);
                } else {
                    qVar2.k0();
                }
                u2.r.J(h4.g.f11907f, a11, qVar2);
                u2.r.J(h4.g.f11906e, l7, qVar2);
                u2.r.y(qVar2, Integer.valueOf(hashCode2), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar2);
                Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar2, c10, h4.g.f11905d, 2045593042, list);
                while (true) {
                    d10 = 0.0d;
                    if (!s10.hasNext()) {
                        break;
                    }
                    Object next = s10.next();
                    if (f18 <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (f18 > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = f18;
                    }
                    r1.m1 m1Var = new r1.m1(f15, true);
                    f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
                    int hashCode3 = Long.hashCode(qVar2.T);
                    c3.o l10 = qVar2.l();
                    i3.t c11 = i3.a.c(m1Var, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar3 = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar3);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(h4.g.f11907f, d11, qVar2);
                    u2.r.J(h4.g.f11906e, l10, qVar2);
                    u2.r.y(qVar2, Integer.valueOf(hashCode3), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar2);
                    u2.r.J(h4.g.f11905d, c11, qVar2);
                    qVar.invoke(next, qVar2, 0);
                    qVar2.p(true);
                    f18 = 1.0f;
                }
                qVar2.p(false);
                qVar2.X(2045601772);
                int size = intValue - list.size();
                int i14 = 0;
                while (i14 < size) {
                    double d12 = d10;
                    if (1.0f <= d12) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    r1.d.g(new r1.m1(f14, true), qVar2);
                    i14++;
                    d10 = d12;
                }
                qVar2.p(false);
                qVar2.p(true);
                f18 = 1.0f;
            }
            qVar2.p(false);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AdaptiveGrid_5PRATvw$lambda$1(i3.t tVar, Iterable iterable, float f10, float f11, int i10, float f12, float f13, ho.q qVar, int i11, int i12, u2.m mVar, int i13) {
        m1773AdaptiveGrid5PRATvw(tVar, iterable, f10, f11, i10, f12, f13, qVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_AdaptiveGrid(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1999848626);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.n(ElevenLabsTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            List g12 = tn.o.g1(new no.e(1, 2, 1));
            float f10 = 80;
            float f11 = 200;
            ComposableSingletons$AdaptiveGridKt composableSingletons$AdaptiveGridKt = ComposableSingletons$AdaptiveGridKt.INSTANCE;
            m1773AdaptiveGrid5PRATvw(null, g12, f10, f11, 0, t2.u.P, t2.u.P, composableSingletons$AdaptiveGridKt.getLambda$1120329279$ui_release(), qVar, 12586368, 113);
            m1773AdaptiveGrid5PRATvw(null, tn.o.g1(new no.e(1, 2, 1)), 100, 160, 0, t2.u.P, t2.u.P, composableSingletons$AdaptiveGridKt.getLambda$1469005046$ui_release(), qVar, 12586368, 113);
            m1773AdaptiveGrid5PRATvw(null, tn.o.g1(new no.e(1, 7, 1)), f10, f11, 0, t2.u.P, t2.u.P, composableSingletons$AdaptiveGridKt.getLambda$1503828983$ui_release(), qVar, 12586368, 113);
            m1773AdaptiveGrid5PRATvw(null, tn.o.g1(new no.e(1, 7, 1)), 20, f11, 0, t2.u.P, t2.u.P, composableSingletons$AdaptiveGridKt.getLambda$1538652920$ui_release(), qVar, 12586368, 113);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 19);
        }
    }

    public static final sn.z Preview_AdaptiveGrid$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AdaptiveGrid(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
