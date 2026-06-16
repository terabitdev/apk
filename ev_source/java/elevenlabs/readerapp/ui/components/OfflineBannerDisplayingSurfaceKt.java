package io.elevenlabs.readerapp.ui.components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.extensions.ContextExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import j1.a2;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import q2.j7;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aE\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u000e¨\u0006\u001d²\u0006\f\u0010\u0016\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Li3/t;", "modifier", "", "isOffline", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lkotlin/Function2;", "Lr1/s;", "Lh5/f;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "OfflineBannerDisplayingSurface", "(Li3/t;ZLio/elevenlabs/domain/services/ConnectivityService;Lho/r;Lu2/m;II)V", "Preview_OfflineBannerDisplayingSurface_Offline", "(Lu2/m;I)V", "Preview_OfflineBannerDisplayingSurface_Online", "topPadding", "ReadingContentPreview-8Feqmps", "(FLu2/m;I)V", "ReadingContentPreview", "Preview_OfflineBannerDisplayingSurface_Reading_Phone", "Preview_OfflineBannerDisplayingSurface_Reading_Tablet", "displayOfflineBanner", "", "visibleContentHeightPx", "offlineBannerOuterHeight", "offsetY", "", "bannerAlpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineBannerDisplayingSurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OfflineBannerDisplayingSurface(i3.t tVar, boolean z6, ConnectivityService connectivityService, ho.r rVar, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        boolean z12;
        r1 r10;
        i3.t tVar3;
        boolean z13;
        float f10;
        u2.z0 z0Var;
        int i15;
        int i16;
        connectivityService.getClass();
        rVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(97310459);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) == 0) {
                if (qVar.h(connectivityService)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
            }
            if ((i10 & 3072) == 0) {
                if (qVar.h(rVar)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) == 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                if (i17 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                boolean f11 = qVar.f(connectivityService);
                Object L = qVar.L();
                Object obj = u2.l.f33918a;
                if (f11 || L == obj) {
                    final z1 isConnected = connectivityService.getIsConnected();
                    L = new ir.i() { // from class: io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$lambda$0$$inlined$map$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$lambda$0$$inlined$map$1$2, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass2<T> implements ir.j {
                            final /* synthetic */ ir.j $this_unsafeFlow;

                            @yn.e(c = "io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$lambda$0$$inlined$map$1$2", f = "OfflineBannerDisplayingSurface.kt", l = {50}, m = "emit", v = 2)
                            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                            /* loaded from: classes3.dex */
                            public static final class AnonymousClass1 extends yn.c {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(wn.c cVar) {
                                    super(cVar);
                                }

                                @Override // yn.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(ir.j jVar) {
                                this.$this_unsafeFlow = jVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            @Override // ir.j
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, wn.c cVar) {
                                AnonymousClass1 anonymousClass1;
                                int i10;
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i11 = anonymousClass1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        i10 = anonymousClass1.label;
                                        if (i10 == 0) {
                                            if (i10 == 1) {
                                                sn.a.g(obj2);
                                            } else {
                                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                        } else {
                                            sn.a.g(obj2);
                                            ir.j jVar = this.$this_unsafeFlow;
                                            Boolean valueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(valueOf, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                        return sn.z.f31622a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(cVar);
                                Object obj22 = anonymousClass1.result;
                                i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                }
                                return sn.z.f31622a;
                            }
                        }

                        @Override // ir.i
                        public Object collect(ir.j jVar, wn.c cVar) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return sn.z.f31622a;
                        }
                    };
                    qVar.h0(L);
                }
                u2.z0 l4 = rd.c1.l((ir.i) L, Boolean.valueOf(z13), qVar, i12 & 112);
                boolean w6 = l1.n.w(qVar);
                h5.c cVar = (h5.c) qVar.j(i4.j1.f13129h);
                View view = (View) qVar.j(AndroidCompositionLocals_androidKt.f2295f);
                Object L2 = qVar.L();
                if (L2 == obj) {
                    L2 = com.google.android.gms.internal.play_billing.b.t(0, qVar);
                }
                u2.x0 x0Var = (u2.x0) L2;
                Object L3 = qVar.L();
                if (L3 == obj) {
                    L3 = com.google.android.gms.internal.play_billing.b.t(0, qVar);
                }
                u2.x0 x0Var2 = (u2.x0) L3;
                if (OfflineBannerDisplayingSurface$lambda$1(l4)) {
                    f10 = cVar.S(OfflineBannerDisplayingSurface$lambda$3(x0Var));
                } else {
                    f10 = 0;
                }
                s2 a10 = j1.f.a(f10, j1.e.s(0, 0, null, 7), null, qVar, 48, 12);
                Activity findActivity = ContextExtensionsKt.findActivity((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                Boolean valueOf = Boolean.valueOf(OfflineBannerDisplayingSurface$lambda$1(l4));
                boolean h10 = qVar.h(findActivity) | qVar.g(w6) | qVar.h(view) | qVar.f(l4);
                Object L4 = qVar.L();
                if (!h10 && L4 != obj) {
                    z0Var = l4;
                } else {
                    z0Var = l4;
                    OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1 offlineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1 = new OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1(findActivity, w6, view, z0Var, null);
                    qVar.h0(offlineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1);
                    L4 = offlineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1;
                }
                u2.r.f((ho.p) L4, valueOf, qVar);
                a7.a(p2.d(tVar3, 1.0f), null, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), 0L, t2.u.P, t2.u.P, null, c3.k.d(560162582, true, new f2.o(rVar, a10, z0Var, x0Var2, x0Var, 3), qVar), qVar, 12582912, 122);
                qVar = qVar;
                z12 = z13;
                tVar2 = tVar3;
            } else {
                qVar.R();
                z12 = z10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new d0(tVar2, z12, connectivityService, rVar, i10, i11);
                return;
            }
            return;
        }
        z10 = z6;
        if ((i10 & 384) == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final boolean OfflineBannerDisplayingSurface$lambda$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final sn.z OfflineBannerDisplayingSurface$lambda$11(ho.r rVar, s2 s2Var, s2 s2Var2, u2.x0 x0Var, u2.x0 x0Var2, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        float f10;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            i3.l lVar = i3.d.f12997a;
            f4.f1 d11 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            rVar.invoke(r1.t.f29349a, new h5.f(OfflineBannerDisplayingSurface$lambda$9(s2Var)), qVar, 6);
            if (OfflineBannerDisplayingSurface$lambda$1(s2Var2)) {
                i11 = 0;
            } else {
                i11 = -OfflineBannerDisplayingSurface$lambda$6(x0Var);
            }
            a2 s10 = j1.e.s(0, 0, null, 7);
            j1.e1 e1Var = j1.f.f18231a;
            s2 c10 = j1.f.c(Integer.valueOf(i11), j1.e.f18215k, s10, null, "IntAnimation", qVar, 384, 8);
            if (OfflineBannerDisplayingSurface$lambda$1(s2Var2)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i3.t a10 = m3.h.a(p2.e(qVar2, 1.0f), OfflineBannerDisplayingSurface$lambda$11$0$1(j1.f.b(f10, j1.e.s(0, 0, null, 7), null, qVar, 48, 28)));
            boolean f11 = qVar.f(c10);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (f11 || L == eVar5) {
                L = new a0(c10, 0);
                qVar.h0(L);
            }
            i3.t O = r1.d.O(l1.n.h(r1.d.z(a10, (ho.l) L), p3.x.f26427b, p3.h0.f26395b), new qm.a(4));
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new b0(x0Var, 0);
                qVar.h0(L2);
            }
            i3.t q = f4.i0.q(O, (ho.l) L2);
            f4.f1 d12 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(q, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d12, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new b0(x0Var2, 1);
                qVar.h0(L3);
            }
            i3.t q10 = f4.i0.q(qVar2, (ho.l) L3);
            f4.f1 d13 = r1.p.d(lVar, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c12 = i3.a.c(q10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d13, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            j7.d(kj.c.R(qVar, R.string.offline_banner_title), r1.d.G(p2.e(qVar2, 1.0f), t2.u.P, 8, 1), p3.x.f26431f, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, ElevenLabsTheme.$stable).getBodySmall500(), qVar, 432, 0, 130040);
            p.n.t(qVar, true, true, true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final int OfflineBannerDisplayingSurface$lambda$11$0$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).intValue();
    }

    private static final float OfflineBannerDisplayingSurface$lambda$11$0$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final h5.j OfflineBannerDisplayingSurface$lambda$11$0$2$0(s2 s2Var, h5.c cVar) {
        cVar.getClass();
        return new h5.j((OfflineBannerDisplayingSurface$lambda$11$0$0(s2Var) & 4294967295L) | (0 << 32));
    }

    public static final sn.z OfflineBannerDisplayingSurface$lambda$11$0$3$0(u2.x0 x0Var, h5.l lVar) {
        OfflineBannerDisplayingSurface$lambda$7(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z OfflineBannerDisplayingSurface$lambda$11$0$4$0$0(u2.x0 x0Var, h5.l lVar) {
        OfflineBannerDisplayingSurface$lambda$4(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z OfflineBannerDisplayingSurface$lambda$12(i3.t tVar, boolean z6, ConnectivityService connectivityService, ho.r rVar, int i10, int i11, u2.m mVar, int i12) {
        OfflineBannerDisplayingSurface(tVar, z6, connectivityService, rVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final int OfflineBannerDisplayingSurface$lambda$3(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void OfflineBannerDisplayingSurface$lambda$4(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final int OfflineBannerDisplayingSurface$lambda$6(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void OfflineBannerDisplayingSurface$lambda$7(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final float OfflineBannerDisplayingSurface$lambda$9(s2 s2Var) {
        return ((h5.f) s2Var.getValue()).f12083a;
    }

    public static final void Preview_OfflineBannerDisplayingSurface_Offline(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-684498534);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurface(null, true, new ConnectivityService() { // from class: io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$Preview_OfflineBannerDisplayingSurface_Offline$1
                private final ir.j1 isConnected = ir.r.c(Boolean.FALSE);

                @Override // io.elevenlabs.domain.services.ConnectivityService
                /* renamed from: isConnected, reason: from getter */
                public ir.j1 getIsConnected() {
                    return this.isConnected;
                }
            }, ComposableSingletons$OfflineBannerDisplayingSurfaceKt.INSTANCE.m1036getLambda$1967848045$app_productionRelease(), qVar, 3120, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 13);
        }
    }

    public static final sn.z Preview_OfflineBannerDisplayingSurface_Offline$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_OfflineBannerDisplayingSurface_Offline(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OfflineBannerDisplayingSurface_Online(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1394946510);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurface(null, false, new ConnectivityService() { // from class: io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$Preview_OfflineBannerDisplayingSurface_Online$1
                private final ir.j1 isConnected = ir.r.c(Boolean.TRUE);

                @Override // io.elevenlabs.domain.services.ConnectivityService
                /* renamed from: isConnected, reason: from getter */
                public ir.j1 getIsConnected() {
                    return this.isConnected;
                }
            }, ComposableSingletons$OfflineBannerDisplayingSurfaceKt.INSTANCE.getLambda$1057507097$app_productionRelease(), qVar, 3120, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 12);
        }
    }

    public static final sn.z Preview_OfflineBannerDisplayingSurface_Online$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_OfflineBannerDisplayingSurface_Online(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OfflineBannerDisplayingSurface_Reading_Phone(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(434591138);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$OfflineBannerDisplayingSurfaceKt.INSTANCE.getLambda$1252089016$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 14);
        }
    }

    public static final sn.z Preview_OfflineBannerDisplayingSurface_Reading_Phone$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_OfflineBannerDisplayingSurface_Reading_Phone(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OfflineBannerDisplayingSurface_Reading_Tablet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1479279060);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$OfflineBannerDisplayingSurfaceKt.INSTANCE.m1035getLambda$1906648618$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 15);
        }
    }

    public static final sn.z Preview_OfflineBannerDisplayingSurface_Reading_Tablet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_OfflineBannerDisplayingSurface_Reading_Tablet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: ReadingContentPreview-8Feqmps */
    public static final void m1086ReadingContentPreview8Feqmps(final float f10, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-689472096);
        if ((i10 & 6) == 0) {
            if (qVar2.c(f10)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t G = r1.d.G(r1.d.I(p2.d(qVar3, 1.0f), t2.u.P, f10, t2.u.P, t2.u.P, 13), 16, t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(G, qVar2);
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
            r1.d.g(p2.f(qVar3, 48), qVar2);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            j7.d("The Art of Programming", null, defpackage.f.b(elevenLabsTheme, qVar2, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i13).getTitleLarge600(), qVar2, 6, 0, 131066);
            qVar = qVar2;
            r1.d.g(p2.f(qVar3, 8), qVar);
            j7.d("By Jane Smith", null, defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyMedium400(), qVar2, 6, 0, 131066);
            r1.d.g(p2.f(qVar3, 24), qVar);
            j7.d("Chapter 1: Getting Started\n\nProgramming is both an art and a science. It requires creativity to solve complex problems while adhering to logical principles that govern how computers process information.\n\nIn this chapter, we will explore the fundamental concepts that every programmer should understand. From variables and data types to control structures and functions, these building blocks form the foundation of all software development.\n\nThe journey of learning to code begins with understanding that computers are, at their core, machines that follow instructions. These instructions must be precise and unambiguous, leaving no room for interpretation.", null, defpackage.f.b(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyMedium400(), qVar2, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.c0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ReadingContentPreview_8Feqmps$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    ReadingContentPreview_8Feqmps$lambda$1 = OfflineBannerDisplayingSurfaceKt.ReadingContentPreview_8Feqmps$lambda$1(f10, i10, (u2.m) obj, intValue);
                    return ReadingContentPreview_8Feqmps$lambda$1;
                }
            };
        }
    }

    public static final sn.z ReadingContentPreview_8Feqmps$lambda$1(float f10, int i10, u2.m mVar, int i11) {
        m1086ReadingContentPreview8Feqmps(f10, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: access$ReadingContentPreview-8Feqmps */
    public static final /* synthetic */ void m1087access$ReadingContentPreview8Feqmps(float f10, u2.m mVar, int i10) {
        m1086ReadingContentPreview8Feqmps(f10, mVar, i10);
    }
}
