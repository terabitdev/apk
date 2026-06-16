package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "visible", "", "progress", "Lp3/x;", "backgroundColor", "Lsn/z;", "FullScreenLoader-FNF3uiM", "(ZLjava/lang/Integer;JLu2/m;II)V", "FullScreenLoader", "Preview_FullScreenLoader", "(Lu2/m;I)V", "Preview_FullScreenLoader_Progress", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FullScreenLoaderKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0050  */
    /* renamed from: FullScreenLoader-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1838FullScreenLoaderFNF3uiM(final boolean z6, Integer num, long j4, u2.m mVar, final int i10, final int i11) {
        int i12;
        Integer num2;
        int i13;
        long j10;
        boolean z10;
        final Integer num3;
        final long j11;
        u2.r1 r10;
        Integer num4;
        Integer num5;
        long d10;
        long j12;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1583994097);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            num2 = num;
            if (qVar.f(num2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) != 0) {
                j10 = j4;
                if ((i11 & 4) == 0 && qVar.e(j10)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            } else {
                j10 = j4;
            }
            if ((i12 & 147) == 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                qVar.T();
                if ((i10 & 1) != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    num5 = num2;
                } else {
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if ((i11 & 4) != 0) {
                        d10 = ib.i.d(ElevenLabsTheme.INSTANCE, qVar, 6);
                        i12 &= -897;
                        num5 = num4;
                        qVar.q();
                        if (!z6) {
                            qVar.X(37714468);
                            i3.q qVar2 = i3.q.f13017a;
                            i3.t d11 = r1.p2.d(qVar2, 1.0f);
                            i3.l lVar = i3.d.f13001e;
                            f4.f1 d12 = r1.p.d(lVar, false);
                            int hashCode = Long.hashCode(qVar.T);
                            c3.o l4 = qVar.l();
                            i3.t c5 = i3.a.c(d11, qVar);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            h4.e eVar = h4.g.f11907f;
                            u2.r.J(eVar, d12, qVar);
                            h4.e eVar2 = h4.g.f11906e;
                            u2.r.J(eVar2, l4, qVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            h4.e eVar3 = h4.g.f11908g;
                            u2.r.y(qVar, valueOf, eVar3);
                            h4.d dVar = h4.g.f11909h;
                            u2.r.F(dVar, qVar);
                            h4.e eVar4 = h4.g.f11905d;
                            u2.r.J(eVar4, c5, qVar);
                            int i17 = i12;
                            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                            i3.t h10 = l1.n.h(m3.h.c(m3.h.k(r1.p2.o(qVar2, 50), 10, elevenLabsTheme.getShapes(qVar, 6).getFull(), 0L, 0L, 28), elevenLabsTheme.getShapes(qVar, 6).getFull()), d10, p3.h0.f26395b);
                            f4.f1 d13 = r1.p.d(lVar, false);
                            j12 = d10;
                            int hashCode2 = Long.hashCode(qVar.T);
                            c3.o l7 = qVar.l();
                            i3.t c10 = i3.a.c(h10, qVar);
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            u2.r.J(eVar, d13, qVar);
                            u2.r.J(eVar2, l7, qVar);
                            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                            u2.r.J(eVar4, c10, qVar);
                            LoaderKt.m1840LoadereopBjH0(r1.p2.o(qVar2, 20), 0L, 0L, num5, qVar, ((i17 << 6) & 7168) | 6, 6);
                            p.n.t(qVar, true, true, false);
                        } else {
                            j12 = d10;
                            qVar.X(38190163);
                            qVar.p(false);
                        }
                        num3 = num5;
                        j11 = j12;
                    } else {
                        num5 = num4;
                    }
                }
                d10 = j10;
                qVar.q();
                if (!z6) {
                }
                num3 = num5;
                j11 = j12;
            } else {
                qVar.R();
                num3 = num2;
                j11 = j10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.a1
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z FullScreenLoader_FNF3uiM$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        FullScreenLoader_FNF3uiM$lambda$1 = FullScreenLoaderKt.FullScreenLoader_FNF3uiM$lambda$1(z6, num3, j11, i10, i11, (u2.m) obj, intValue);
                        return FullScreenLoader_FNF3uiM$lambda$1;
                    }
                };
                return;
            }
            return;
        }
        num2 = num;
        if ((i10 & 384) != 0) {
        }
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z FullScreenLoader_FNF3uiM$lambda$1(boolean z6, Integer num, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1838FullScreenLoaderFNF3uiM(z6, num, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_FullScreenLoader(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1165273522);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1838FullScreenLoaderFNF3uiM(true, null, 0L, qVar, 6, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 9);
        }
    }

    public static final sn.z Preview_FullScreenLoader$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FullScreenLoader(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FullScreenLoader_Progress(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-699993880);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1838FullScreenLoaderFNF3uiM(true, 50, 0L, qVar, 54, 4);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 10);
        }
    }

    public static final sn.z Preview_FullScreenLoader_Progress$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FullScreenLoader_Progress(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
