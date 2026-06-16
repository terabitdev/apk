package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lsn/z;", "onCheckedChange", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/EchoToggleSize;", "size", "enabled", "EchoToggle", "(ZLho/l;Li3/t;Lio/elevenlabs/ui/components/EchoToggleSize;ZLu2/m;II)V", "EchoToggleAllVariantsPreview", "(Lu2/m;I)V", "EchoToggleAllVariantsDarkPreview", "Lh5/f;", "thumbOffset", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoToggleKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EchoToggleSize.values().length];
            try {
                iArr[EchoToggleSize.ExtraSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EchoToggleSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EchoToggleSize.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoToggle(boolean z6, ho.l lVar, i3.t tVar, EchoToggleSize echoToggleSize, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
        boolean z11;
        int i17;
        boolean z12;
        EchoToggleSize echoToggleSize2;
        i3.t tVar3;
        boolean z13;
        u2.r1 r10;
        i3.t tVar4;
        EchoToggleSize echoToggleSize3;
        boolean z14;
        sn.p pVar;
        long octonary;
        float f10;
        i3.t tVar5;
        i3.t tVar6;
        i3.t j4;
        boolean z15;
        boolean z16;
        int i18;
        int i19;
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-406527711);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (echoToggleSize == null) {
                    ordinal = -1;
                } else {
                    ordinal = echoToggleSize.ordinal();
                }
                if (qVar.d(ordinal)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z11 = z10;
                if (qVar.g(z11)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (qVar.O(i12 & 1, z12)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i20 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        echoToggleSize3 = EchoToggleSize.Medium;
                    } else {
                        echoToggleSize3 = echoToggleSize;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    z1.g gVar = z1.h.f39128a;
                    int i21 = WhenMappings.$EnumSwitchMapping$0[echoToggleSize3.ordinal()];
                    if (i21 != 1) {
                        if (i21 != 2) {
                            if (i21 == 3) {
                                pVar = new sn.p(new h5.f(40), new h5.f(24), new h5.f(20));
                            } else {
                                c6.p();
                                return;
                            }
                        } else {
                            pVar = new sn.p(new h5.f(32), new h5.f(20), new h5.f(16));
                        }
                    } else {
                        pVar = new sn.p(new h5.f(24), new h5.f(16), new h5.f(12));
                    }
                    float f11 = ((h5.f) pVar.f31610a).f12083a;
                    float f12 = ((h5.f) pVar.f31611b).f12083a;
                    float f13 = ((h5.f) pVar.f31612c).f12083a;
                    if (z6) {
                        qVar.X(941260779);
                        if (z14) {
                            qVar.X(941277302);
                            octonary = EchoTheme.INSTANCE.getColors(qVar, 6).getFill().getPrimary(qVar, 0);
                            qVar.p(false);
                        } else {
                            qVar.X(941326003);
                            octonary = EchoTheme.INSTANCE.getColors(qVar, 6).getFill().getQuaternary(qVar, 0);
                            qVar.p(false);
                        }
                        qVar.p(false);
                    } else {
                        qVar.X(941383694);
                        if (z14) {
                            qVar.X(941400279);
                            octonary = EchoTheme.INSTANCE.getColors(qVar, 6).getFill().getSenary(qVar, 0);
                            qVar.p(false);
                        } else {
                            qVar.X(941447957);
                            octonary = EchoTheme.INSTANCE.getColors(qVar, 6).getFill().getOctonary(qVar, 0);
                            qVar.p(false);
                        }
                        qVar.p(false);
                    }
                    long j10 = octonary;
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    long onFillPrimary = echoTheme.getColors(qVar, 6).getFill().getOnFillPrimary(qVar, 0);
                    if (z6) {
                        f10 = (f11 - f13) - 2;
                    } else {
                        f10 = 2;
                    }
                    int i22 = i12;
                    u2.s2 a10 = j1.f.a(f10, j1.e.s(200, 0, null, 6), "thumbOffset", qVar, 432, 8);
                    Object L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (L == eVar) {
                        L = j0.c.o(qVar);
                    }
                    p1.l lVar2 = (p1.l) L;
                    i3.t c5 = m3.h.c(r1.p2.f(r1.p2.s(tVar4, f11), f12), gVar);
                    p3.w0 w0Var = p3.h0.f26395b;
                    i3.t h10 = l1.n.h(c5, j10, w0Var);
                    if (z6) {
                        qVar.X(942002051);
                        qVar.p(false);
                        tVar5 = tVar4;
                        j4 = qVar2;
                        tVar6 = j4;
                    } else {
                        qVar.X(942041948);
                        tVar5 = tVar4;
                        long septenaryAlpha = echoTheme.getColors(qVar, 6).getBorder().getSeptenaryAlpha(qVar, 0);
                        tVar6 = qVar2;
                        j4 = l1.n.j((float) 0.25d, septenaryAlpha, tVar6, gVar);
                        qVar.p(false);
                    }
                    i3.t then = h10.then(j4);
                    if ((i22 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i22 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z17 = z16 | z15;
                    Object L2 = qVar.L();
                    if (z17 || L2 == eVar) {
                        L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.n(lVar, 3, z6);
                        qVar.h0(L2);
                    }
                    i3.t n2 = l1.n.n(then, lVar2, null, z14, null, (ho.a) L2, 24);
                    z13 = z14;
                    f4.f1 d10 = r1.p.d(i3.d.f13000d, false);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c10 = i3.a.c(n2, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(h4.g.f11907f, d10, qVar);
                    u2.r.J(h4.g.f11906e, l4, qVar);
                    u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar);
                    u2.r.J(h4.g.f11905d, c10, qVar);
                    r1.p.a(l1.n.h(m3.h.c(r1.p2.o(r1.d.I(tVar6, EchoToggle$lambda$0(a10), t2.u.P, t2.u.P, t2.u.P, 14), f13), gVar), onFillPrimary, w0Var), qVar, 0);
                    qVar.p(true);
                    echoToggleSize2 = echoToggleSize3;
                    tVar3 = tVar5;
                } else {
                    qVar.R();
                    echoToggleSize2 = echoToggleSize;
                    tVar3 = tVar2;
                    z13 = z11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.e0(z6, lVar, tVar3, echoToggleSize2, z13, i10, i11);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        i16 = i11 & 16;
        if (i16 == 0) {
        }
        z11 = z10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float EchoToggle$lambda$0(u2.s2 s2Var) {
        return ((h5.f) s2Var.getValue()).f12083a;
    }

    public static final sn.z EchoToggle$lambda$2$0(ho.l lVar, boolean z6) {
        lVar.invoke(Boolean.valueOf(!z6));
        return sn.z.f31622a;
    }

    public static final sn.z EchoToggle$lambda$4(boolean z6, ho.l lVar, i3.t tVar, EchoToggleSize echoToggleSize, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        EchoToggle(z6, lVar, tVar, echoToggleSize, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void EchoToggleAllVariantsDarkPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1198839212);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(EchoTheme.Mode.Dark, ComposableSingletons$EchoToggleKt.INSTANCE.m1809getLambda$483147630$ui_release(), qVar, 438, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 28);
        }
    }

    public static final sn.z EchoToggleAllVariantsDarkPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoToggleAllVariantsDarkPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoToggleAllVariantsPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(816530966);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoToggleKt.INSTANCE.getLambda$615486460$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 29);
        }
    }

    public static final sn.z EchoToggleAllVariantsPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoToggleAllVariantsPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
