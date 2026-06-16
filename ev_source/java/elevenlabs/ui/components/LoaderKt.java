package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a9\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0002¨\u0006\u000e"}, d2 = {"Lsn/z;", "LoaderRow", "(Lu2/m;I)V", "Li3/t;", "modifier", "Lp3/x;", "color", "trackColor", "", "progress", "Loader-eopBjH0", "(Li3/t;JJLjava/lang/Integer;Lu2/m;II)V", "Loader", "Preview_Loader", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LoaderKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /* renamed from: Loader-eopBjH0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1840LoadereopBjH0(i3.t tVar, long j4, long j10, Integer num, u2.m mVar, final int i10, final int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        long j11;
        long j12;
        int i14;
        int i15;
        Integer num2;
        int i16;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        final long j13;
        final long j14;
        final Integer num3;
        u2.r1 r10;
        i3.t tVar4;
        Integer num4;
        long j15;
        boolean z10;
        int i17;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1607637021);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
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
                j11 = j4;
                if (qVar2.e(j11)) {
                    i17 = 32;
                    i12 |= i17;
                }
            } else {
                j11 = j4;
            }
            i17 = 16;
            i12 |= i17;
        } else {
            j11 = j4;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            j12 = j10;
            if (qVar2.e(j12)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            i15 = i11 & 8;
            if (i15 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                num2 = num;
                if (qVar2.f(num2)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i16;
                if ((i12 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    qVar2.T();
                    if ((i10 & 1) != 0 && !qVar2.y()) {
                        qVar2.R();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        long j16 = j12;
                        tVar3 = tVar2;
                        num4 = num2;
                        j15 = j16;
                    } else {
                        if (i18 != 0) {
                            tVar4 = i3.q.f13017a;
                        } else {
                            tVar4 = tVar2;
                        }
                        if ((i11 & 2) != 0) {
                            j11 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar2, 6);
                            i12 &= -113;
                        }
                        if (i19 != 0) {
                            j12 = ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU();
                        }
                        if (i15 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        j15 = j12;
                        tVar3 = tVar4;
                    }
                    long j17 = j11;
                    qVar2.q();
                    if (num4 == null) {
                        qVar2.X(66074513);
                        y4.a(tVar3, j17, 3, j15, 1, t2.u.P, qVar2, (i12 & 14) | 384 | (i12 & 112) | ((i12 << 3) & 7168), 32);
                        qVar2.p(false);
                        qVar = qVar2;
                    } else {
                        qVar2.X(66302053);
                        float f10 = 3;
                        if ((i12 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Object L = qVar2.L();
                        if (z10 || L == u2.l.f33918a) {
                            L = new h0(num4, 1);
                            qVar2.h0(L);
                        }
                        int i20 = i12 << 3;
                        long j18 = j15;
                        i3.t tVar5 = tVar3;
                        y4.b((ho.a) L, tVar5, j17, f10, j18, 1, t2.u.P, qVar2, (i20 & 896) | (i20 & 112) | 3072 | ((i12 << 6) & 57344));
                        tVar3 = tVar5;
                        j17 = j17;
                        j15 = j18;
                        qVar = qVar2;
                        qVar.p(false);
                    }
                    num3 = num4;
                    j13 = j17;
                    j14 = j15;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    long j19 = j12;
                    tVar3 = tVar2;
                    j13 = j11;
                    j14 = j19;
                    num3 = num2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    final i3.t tVar6 = tVar3;
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.k1
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z Loader_eopBjH0$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            Loader_eopBjH0$lambda$1 = LoaderKt.Loader_eopBjH0$lambda$1(i3.t.this, j13, j14, num3, i10, i11, (u2.m) obj, intValue);
                            return Loader_eopBjH0$lambda$1;
                        }
                    };
                    return;
                }
                return;
            }
            num2 = num;
            if ((i12 & 1171) != 1170) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        j12 = j10;
        i15 = i11 & 8;
        if (i15 == 0) {
        }
        num2 = num;
        if ((i12 & 1171) != 1170) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final void LoaderRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(48169027);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(r1.d.E(i3.q.f13017a, ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), 1.0f);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
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
            u2.r.J(h4.g.f11905d, c5, qVar);
            m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 18);
        }
    }

    public static final sn.z LoaderRow$lambda$1(int i10, u2.m mVar, int i11) {
        LoaderRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final float Loader_eopBjH0$lambda$0$0(Integer num) {
        return num.intValue() / 100.0f;
    }

    public static final sn.z Loader_eopBjH0$lambda$1(i3.t tVar, long j4, long j10, Integer num, int i10, int i11, u2.m mVar, int i12) {
        m1840LoadereopBjH0(tVar, j4, j10, num, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_Loader(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(834190532);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 10;
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, f10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            m1840LoadereopBjH0(r1.p2.o(qVar2, f10), 0L, 0L, null, qVar, 6, 14);
            float f11 = 5;
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            m1840LoadereopBjH0(r1.p2.o(qVar2, 20), 0L, 0L, null, qVar, 6, 14);
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            m1840LoadereopBjH0(r1.p2.o(qVar2, 30), 0L, 0L, null, qVar, 6, 14);
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 19);
        }
    }

    public static final sn.z Preview_Loader$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Loader(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
