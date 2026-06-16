package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Li3/t;", "modifier", "Lp3/x;", "color", "Lsn/z;", "Divider-iJQMabo", "(Li3/t;JLu2/m;II)V", "Divider", "DividerLight-iJQMabo", "DividerLight", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DividerKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((r17 & 2) != 0) goto L84;
     */
    /* renamed from: Divider-iJQMabo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1827DivideriJQMabo(i3.t tVar, long j4, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        long j10;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-366824029);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
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
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if (i15 != 0) {
                    tVar = i3.q.f13017a;
                }
                if ((i11 & 2) != 0) {
                    j4 = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getDivider().m2059getLine0d7_KjU();
                    i12 &= -113;
                }
                i3.t tVar3 = tVar;
                long j11 = j4;
                qVar.q();
                d5.e(tVar3, 1, j11, qVar, (i12 & 14) | 48 | ((i12 << 3) & 896), 0);
                tVar2 = tVar3;
                j10 = j11;
            }
        } else {
            qVar.R();
            tVar2 = tVar;
            j10 = j4;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(tVar2, j10, i10, i11, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if ((r17 & 2) != 0) goto L84;
     */
    /* renamed from: DividerLight-iJQMabo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1828DividerLightiJQMabo(i3.t tVar, long j4, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        long j10;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(593597475);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
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
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if (i15 != 0) {
                    tVar = i3.q.f13017a;
                }
                if ((i11 & 2) != 0) {
                    j4 = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getDivider().m2058getLightLine0d7_KjU();
                    i12 &= -113;
                }
                i3.t tVar3 = tVar;
                long j11 = j4;
                qVar.q();
                d5.e(tVar3, 1, j11, qVar, (i12 & 14) | 48 | ((i12 << 3) & 896), 0);
                tVar2 = tVar3;
                j10 = j11;
            }
        } else {
            qVar.R();
            tVar2 = tVar;
            j10 = j4;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(tVar2, j10, i10, i11, 1);
        }
    }

    public static final sn.z DividerLight_iJQMabo$lambda$0(i3.t tVar, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1828DividerLightiJQMabo(tVar, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z Divider_iJQMabo$lambda$0(i3.t tVar, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1827DivideriJQMabo(tVar, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
