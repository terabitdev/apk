package io.elevenlabs.ui.components.scaffolds;

import c3.k;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.d;
import i3.t;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.b3;
import r1.p2;
import r1.z1;
import s2.i;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aC\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "topBar", "Lr1/b3;", "contentWindowInsets", FirebaseAnalytics.Param.CONTENT, "CenteredContentScaffold", "(Li3/t;Lho/p;Lr1/b3;Lho/p;Lu2/m;II)V", "CenteredContentBox", "(Li3/t;Lho/p;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CenteredContentScaffoldKt {
    public static final void CenteredContentBox(t tVar, p pVar, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        boolean z6;
        int i14;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-252316847);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
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
            i3.q qVar2 = i3.q.f13017a;
            if (i15 != 0) {
                tVar2 = qVar2;
            }
            f1 d10 = r1.p.d(d.f12998b, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(tVar2, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            e eVar = g.f11907f;
            r.J(eVar, d10, qVar);
            e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            e eVar4 = g.f11905d;
            r.J(eVar4, c5, qVar);
            t u6 = p2.u(qVar2, u.P, 500, 1);
            f1 d11 = r1.p.d(d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(u6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d11, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            c.r((i12 >> 3) & 14, pVar, qVar, true, true);
        } else {
            qVar.R();
        }
        t tVar3 = tVar2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(tVar3, pVar, i10, i11, 24);
        }
    }

    public static final z CenteredContentBox$lambda$1(t tVar, p pVar, int i10, int i11, m mVar, int i12) {
        CenteredContentBox(tVar, pVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CenteredContentScaffold(t tVar, p pVar, b3 b3Var, p pVar2, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        p pVar3;
        int i14;
        b3 b3Var2;
        boolean z6;
        q qVar;
        t tVar3;
        p pVar4;
        b3 b3Var3;
        r1 r10;
        t tVar4;
        t tVar5;
        b3 m10;
        int i15;
        int i16;
        pVar2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-995520869);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            pVar3 = pVar;
            if (qVar2.h(pVar3)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) != 0) {
                if ((i11 & 4) == 0) {
                    b3Var2 = b3Var;
                    if (qVar2.f(b3Var2)) {
                        i16 = RpcError.MAX_MESSAGE_BYTES;
                        i12 |= i16;
                    }
                } else {
                    b3Var2 = b3Var;
                }
                i16 = 128;
                i12 |= i16;
            } else {
                b3Var2 = b3Var;
            }
            if ((i10 & 3072) == 0) {
                if (qVar2.h(pVar2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                qVar2.T();
                if ((i10 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    tVar5 = tVar2;
                    pVar4 = pVar3;
                } else {
                    if (i17 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        m10 = i.m(qVar2);
                        tVar5 = tVar4;
                        qVar2.q();
                        qVar = qVar2;
                        k5.a(tVar5, k.d(-264952489, true, new f3.a(pVar4, 2), qVar2), null, null, null, 0, 0L, 0L, m10, k.d(1342867500, true, new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.b(pVar2, 6), qVar2), qVar, (i12 & 14) | 805306416 | ((i12 << 18) & 234881024), 252);
                        tVar3 = tVar5;
                        b3Var3 = m10;
                    } else {
                        tVar5 = tVar4;
                    }
                }
                m10 = b3Var2;
                qVar2.q();
                qVar = qVar2;
                k5.a(tVar5, k.d(-264952489, true, new f3.a(pVar4, 2), qVar2), null, null, null, 0, 0L, 0L, m10, k.d(1342867500, true, new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.b(pVar2, 6), qVar2), qVar, (i12 & 14) | 805306416 | ((i12 << 18) & 234881024), 252);
                tVar3 = tVar5;
                b3Var3 = m10;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
                pVar4 = pVar3;
                b3Var3 = b3Var2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(tVar3, pVar4, b3Var3, pVar2, i10, i11, 10);
                return;
            }
            return;
        }
        pVar3 = pVar;
        if ((i10 & 384) != 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z CenteredContentScaffold$lambda$0(p pVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (pVar != null) {
                qVar.X(950324413);
                CenteredContentBox(p2.e(i3.q.f13017a, 1.0f), pVar, qVar, 6, 0);
                qVar.p(false);
            } else {
                qVar.X(950460875);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z CenteredContentScaffold$lambda$1(p pVar, z1 z1Var, m mVar, int i10) {
        boolean z6;
        int i11;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentBox(r1.d.o(r1.d.D(p2.d(i3.q.f13017a, 1.0f), z1Var), z1Var), pVar, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z CenteredContentScaffold$lambda$2(t tVar, p pVar, b3 b3Var, p pVar2, int i10, int i11, m mVar, int i12) {
        CenteredContentScaffold(tVar, pVar, b3Var, pVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
