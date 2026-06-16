package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "progress", "Li3/t;", "modifier", "Lp3/x;", "backgroundColor", "foregroundColor", "Lsn/z;", "ProgressBar-eaDK9VM", "(FLi3/t;JJLu2/m;II)V", "ProgressBar", "Preview_ProgressBar", "(Lu2/m;I)V", "value", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ProgressBarKt {
    public static final void Preview_ProgressBar(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-860280518);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t h10 = l1.n.h(r1.p2.e(qVar2, 1.0f), p3.x.f26429d, p3.h0.f26395b);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, 6, h10);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
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
            float f10 = 4;
            m1869ProgressBareaDK9VM(-1.0f, r1.p2.f(r1.p2.e(qVar2, 1.0f), f10), 0L, 0L, qVar, 48, 12);
            m1869ProgressBareaDK9VM(t2.u.P, r1.p2.f(r1.p2.e(qVar2, 1.0f), f10), 0L, 0L, qVar, 54, 12);
            m1869ProgressBareaDK9VM(0.5f, r1.p2.f(r1.p2.e(qVar2, 1.0f), f10), 0L, 0L, qVar, 54, 12);
            m1869ProgressBareaDK9VM(1.0f, r1.p2.f(r1.p2.e(qVar2, 1.0f), f10), 0L, 0L, qVar, 54, 12);
            m1869ProgressBareaDK9VM(1.5f, r1.p2.f(r1.p2.e(qVar2, 1.0f), f10), 0L, 0L, qVar, 54, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 0);
        }
    }

    public static final sn.z Preview_ProgressBar$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ProgressBar(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: ProgressBar-eaDK9VM */
    public static final void m1869ProgressBareaDK9VM(final float f10, final i3.t tVar, long j4, long j10, u2.m mVar, final int i10, final int i11) {
        int i12;
        final long j11;
        final long j12;
        boolean z6;
        int i13;
        int i14;
        int i15;
        int i16;
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2114099804);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j4;
                if (qVar.e(j11)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                j11 = j4;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            j11 = j4;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j10;
                if (qVar.e(j12)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                j12 = j10;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            j12 = j10;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    j11 = ElevenLabsTheme.INSTANCE.getColors(qVar, 6).getProgressBarBg();
                }
                if ((i11 & 8) != 0) {
                    j12 = ElevenLabsTheme.INSTANCE.getColors(qVar, 6).getProgressBarFg();
                }
            }
            qVar.q();
            u2.s2 b10 = j1.f.b(ae.l.l(f10, t2.u.P, 1.0f), null, "progress", qVar, 3072, 22);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t c5 = m3.h.c(tVar, elevenLabsTheme.getShapes(qVar, 6).getFull());
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(c5, qVar);
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
            i3.q qVar2 = i3.q.f13017a;
            i3.t c11 = m3.h.c(r1.p2.d(qVar2, 1.0f), elevenLabsTheme.getShapes(qVar, 6).getFull());
            p3.w0 w0Var = p3.h0.f26395b;
            r1.p.a(l1.n.h(c11, j11, w0Var), qVar, 0);
            r1.p.a(l1.n.h(m3.h.c(r1.p2.e(r1.p2.c(qVar2, 1.0f), ProgressBar_eaDK9VM$lambda$0(b10)), elevenLabsTheme.getShapes(qVar, 6).getFull()), j12, w0Var), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.v1
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ProgressBar_eaDK9VM$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    ProgressBar_eaDK9VM$lambda$2 = ProgressBarKt.ProgressBar_eaDK9VM$lambda$2(f10, tVar, j11, j12, i10, i11, (u2.m) obj, intValue);
                    return ProgressBar_eaDK9VM$lambda$2;
                }
            };
        }
    }

    private static final float ProgressBar_eaDK9VM$lambda$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z ProgressBar_eaDK9VM$lambda$2(float f10, i3.t tVar, long j4, long j10, int i10, int i11, u2.m mVar, int i12) {
        m1869ProgressBareaDK9VM(f10, tVar, j4, j10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
