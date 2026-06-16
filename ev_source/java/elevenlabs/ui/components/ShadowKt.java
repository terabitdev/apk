package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u001a=\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aQ\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u000b\u001a!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/t;", "modifier", "Lh5/f;", "bottomShadowHeight", "Lp3/x;", "color", "Lkotlin/Function1;", "Lr1/s;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "BottomShadowOverlay-PZ-HvWI", "(Li3/t;FJLho/q;Lu2/m;II)V", "BottomShadowOverlay", "Lkotlin/Function2;", "mainContent", "footerContent", "DynamicBottomShadowOverlay-sW7UJKQ", "(Li3/t;JLho/r;Lho/q;Lu2/m;II)V", "DynamicBottomShadowOverlay", "shadowHeight", "", "fastFade", "BottomShadow-8s8adOk", "(FJZLu2/m;II)V", "BottomShadow", "TopShadowOverlay-PZ-HvWI", "TopShadowOverlay", "TopShadow-kbKKJSQ", "(FJLu2/m;II)V", "TopShadow", "", "footerHeightPx", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ShadowKt {
    /* renamed from: BottomShadow-8s8adOk */
    public static final void m1875BottomShadow8s8adOk(final float f10, long j4, boolean z6, u2.m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z10;
        List I;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(162211637);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.e(j4)) {
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
            if (qVar.g(z6)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 2) != 0) {
                    j4 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar, 6);
                }
                if (i16 != 0) {
                    z6 = false;
                }
            }
            qVar.q();
            i3.t f11 = r1.p2.f(r1.p2.e(i3.q.f13017a, 1.0f), f10);
            if (z6) {
                I = ig.f.I(new p3.x(p3.x.b(t2.u.P, j4)), new p3.x(j4), new p3.x(j4));
            } else {
                I = ig.f.I(new p3.x(p3.x.b(t2.u.P, j4)), new p3.x(j4));
            }
            VerticalGradientKt.VerticalGradient(f11, I, qVar, 0, 0);
        } else {
            qVar.R();
        }
        final long j10 = j4;
        final boolean z11 = z6;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.l2
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z BottomShadow_8s8adOk$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    BottomShadow_8s8adOk$lambda$0 = ShadowKt.BottomShadow_8s8adOk$lambda$0(f10, j10, z11, i10, i11, (u2.m) obj, intValue);
                    return BottomShadow_8s8adOk$lambda$0;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if ((r23 & 4) != 0) goto L113;
     */
    /* renamed from: BottomShadowOverlay-PZ-HvWI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1876BottomShadowOverlayPZHvWI(i3.t tVar, float f10, long j4, ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        float f11;
        long j10;
        boolean z6;
        int i13;
        int i14;
        int i15;
        int i16;
        tVar.getClass();
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1665484338);
        if ((i10 & 6) == 0) {
            if (qVar2.f(tVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            f11 = f10;
            if (qVar2.c(f11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            f11 = f10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j10 = j4;
                if (qVar2.e(j10)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                j10 = j4;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            j10 = j4;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(qVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
            } else {
                if ((i11 & 4) != 0) {
                    j10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                    i12 &= -897;
                }
                qVar2.q();
                f4.f1 d10 = r1.p.d(i3.d.Z, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(tVar, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar2);
                u2.r.J(h4.g.f11906e, l4, qVar2);
                u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar2);
                u2.r.J(h4.g.f11905d, c5, qVar2);
                qVar.invoke(r1.t.f29349a, qVar2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                m1875BottomShadow8s8adOk(f11, j10, false, qVar2, (i12 >> 3) & 126, 4);
                qVar2.p(true);
            }
        } else {
            qVar2.R();
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new k2(tVar, f10, j10, qVar, i10, i11, 0);
        }
    }

    public static final sn.z BottomShadowOverlay_PZ_HvWI$lambda$1(i3.t tVar, float f10, long j4, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        m1876BottomShadowOverlayPZHvWI(tVar, f10, j4, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z BottomShadow_8s8adOk$lambda$0(float f10, long j4, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        m1875BottomShadow8s8adOk(f10, j4, z6, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if ((r25 & 2) != 0) goto L129;
     */
    /* renamed from: DynamicBottomShadowOverlay-sW7UJKQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1877DynamicBottomShadowOverlaysW7UJKQ(i3.t tVar, long j4, ho.r rVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        long j10;
        boolean z6;
        i3.t tVar3;
        long j11;
        ho.q qVar2;
        int i14;
        int i15;
        int i16;
        ho.q qVar3 = qVar;
        rVar.getClass();
        qVar3.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-1438711542);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                j10 = j4;
                if (qVar4.e(j10)) {
                    i16 = 32;
                    i12 |= i16;
                }
            } else {
                j10 = j4;
            }
            i16 = 16;
            i12 |= i16;
        } else {
            j10 = j4;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.h(rVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar4.h(qVar3)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar4.O(i12 & 1, z6)) {
            qVar4.T();
            int i18 = i10 & 1;
            i3.q qVar5 = i3.q.f13017a;
            if (i18 != 0 && !qVar4.y()) {
                qVar4.R();
            } else {
                if (i17 != 0) {
                    tVar2 = qVar5;
                }
                if ((i11 & 2) != 0) {
                    j10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar4, 6);
                    i12 &= -113;
                }
                qVar4.q();
                Object L = qVar4.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = com.google.android.gms.internal.play_billing.b.t(0, qVar4);
                }
                u2.x0 x0Var = (u2.x0) L;
                float S = ((h5.c) qVar4.j(i4.j1.f13129h)).S(DynamicBottomShadowOverlay_sW7UJKQ$lambda$1(x0Var));
                i3.l lVar = i3.d.f12997a;
                f4.f1 d10 = r1.p.d(lVar, false);
                int hashCode = Long.hashCode(qVar4.T);
                c3.o l4 = qVar4.l();
                i3.t c5 = i3.a.c(tVar2, qVar4);
                h4.h.f11920i.getClass();
                i3.t tVar4 = tVar2;
                h4.f fVar = h4.g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                u2.r.J(eVar2, d10, qVar4);
                h4.e eVar3 = h4.g.f11906e;
                u2.r.J(eVar3, l4, qVar4);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                u2.r.y(qVar4, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar4);
                h4.e eVar5 = h4.g.f11905d;
                u2.r.J(eVar5, c5, qVar4);
                long j12 = j10;
                Object fVar2 = new h5.f(S);
                Object valueOf2 = Integer.valueOf(6 | (i12 & 896));
                r1.t tVar5 = r1.t.f29349a;
                rVar.invoke(tVar5, fVar2, qVar4, valueOf2);
                i3.t b10 = tVar5.b(r1.p2.e(qVar5, 1.0f), i3.d.Z);
                Object L2 = qVar4.L();
                if (L2 == eVar) {
                    L2 = new a0(x0Var, 2);
                    qVar4.h0(L2);
                }
                i3.t q = f4.i0.q(b10, (ho.l) L2);
                f4.f1 d11 = r1.p.d(lVar, false);
                int hashCode2 = Long.hashCode(qVar4.T);
                c3.o l7 = qVar4.l();
                i3.t c10 = i3.a.c(q, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                u2.r.J(eVar2, d11, qVar4);
                u2.r.J(eVar3, l7, qVar4);
                defpackage.f.u(hashCode2, qVar4, eVar4, qVar4, dVar);
                u2.r.J(eVar5, c10, qVar4);
                r1.p.a(l1.n.g(tVar5.a(), p3.s.b(p3.t.Companion, ig.f.I(new p3.x(p3.x.b(t2.u.P, j12)), new p3.x(j12)), t2.u.P, t2.u.P, 14), null, 6), qVar4, 0);
                ho.q qVar6 = qVar;
                qVar6.invoke(tVar5, qVar4, Integer.valueOf(((i12 >> 6) & 112) | 6));
                qVar4.p(true);
                qVar4.p(true);
                j11 = j12;
                tVar3 = tVar4;
                qVar2 = qVar6;
            }
        } else {
            qVar4.R();
            tVar3 = tVar2;
            j11 = j10;
            qVar2 = qVar3;
        }
        u2.r1 r10 = qVar4.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.d(tVar3, j11, rVar, qVar2, i10, i11);
        }
    }

    private static final int DynamicBottomShadowOverlay_sW7UJKQ$lambda$1(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void DynamicBottomShadowOverlay_sW7UJKQ$lambda$2(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final sn.z DynamicBottomShadowOverlay_sW7UJKQ$lambda$4$0$0(u2.x0 x0Var, h5.l lVar) {
        DynamicBottomShadowOverlay_sW7UJKQ$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z DynamicBottomShadowOverlay_sW7UJKQ$lambda$5(i3.t tVar, long j4, ho.r rVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        m1877DynamicBottomShadowOverlaysW7UJKQ(tVar, j4, rVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* renamed from: TopShadow-kbKKJSQ */
    public static final void m1878TopShadowkbKKJSQ(final float f10, long j4, u2.m mVar, final int i10, final int i11) {
        int i12;
        boolean z6;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-350624629);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.e(j4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                int i15 = i11 & 2;
            } else if ((i11 & 2) != 0) {
                j4 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar, 6);
            }
            qVar.q();
            VerticalGradientKt.VerticalGradient(r1.p2.f(r1.p2.e(i3.q.f13017a, 1.0f), f10), ig.f.I(new p3.x(j4), new p3.x(p3.x.b(t2.u.P, j4))), qVar, 0, 0);
        } else {
            qVar.R();
        }
        final long j10 = j4;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.m2
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z TopShadow_kbKKJSQ$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    TopShadow_kbKKJSQ$lambda$0 = ShadowKt.TopShadow_kbKKJSQ$lambda$0(f10, j10, i10, i11, (u2.m) obj, intValue);
                    return TopShadow_kbKKJSQ$lambda$0;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if ((r23 & 4) != 0) goto L113;
     */
    /* renamed from: TopShadowOverlay-PZ-HvWI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1879TopShadowOverlayPZHvWI(i3.t tVar, float f10, long j4, ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        float f11;
        long j10;
        boolean z6;
        int i13;
        int i14;
        int i15;
        int i16;
        tVar.getClass();
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(902215808);
        if ((i10 & 6) == 0) {
            if (qVar2.f(tVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            f11 = f10;
            if (qVar2.c(f11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            f11 = f10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j10 = j4;
                if (qVar2.e(j10)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                j10 = j4;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            j10 = j4;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(qVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
            } else {
                if ((i11 & 4) != 0) {
                    j10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar2, 6);
                    i12 &= -897;
                }
                qVar2.q();
                f4.f1 d10 = r1.p.d(i3.d.f12998b, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(tVar, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar2);
                u2.r.J(h4.g.f11906e, l4, qVar2);
                u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar2);
                u2.r.J(h4.g.f11905d, c5, qVar2);
                qVar.invoke(r1.t.f29349a, qVar2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                m1878TopShadowkbKKJSQ(f11, j10, qVar2, (i12 >> 3) & 126, 0);
                qVar2.p(true);
            }
        } else {
            qVar2.R();
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new k2(tVar, f10, j10, qVar, i10, i11, 1);
        }
    }

    public static final sn.z TopShadowOverlay_PZ_HvWI$lambda$1(i3.t tVar, float f10, long j4, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        m1879TopShadowOverlayPZHvWI(tVar, f10, j4, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z TopShadow_kbKKJSQ$lambda$0(float f10, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1878TopShadowkbKKJSQ(f10, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
