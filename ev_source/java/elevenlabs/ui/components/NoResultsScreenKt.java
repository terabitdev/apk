package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/t;", "modifier", "", "title", ParameterNames.TEXT, "Lsn/z;", "NoResultsScreen", "(Li3/t;Ljava/lang/String;Ljava/lang/String;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NoResultsScreenKt {
    public static final void NoResultsScreen(i3.t tVar, String str, String str2, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        String str3;
        boolean z6;
        i3.t tVar3;
        int i14;
        int i15;
        str.getClass();
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1584386182);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
        if ((i10 & 48) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            str3 = str;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            if (i16 != 0) {
                tVar2 = qVar2;
            }
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t f10 = ib.i.f(elevenLabsTheme, qVar, 6, tVar2);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
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
            q2.y2.a(kd.a.M(R.drawable.search_menu, qVar, 0), null, null, defpackage.f.A(elevenLabsTheme, qVar, 6), qVar, u3.c.$stable | 48, 4);
            r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM()), qVar);
            j7.d(str3, null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium700(), qVar, (i12 >> 3) & 14, 0, 130046);
            ib.i.A(elevenLabsTheme, qVar, 6, qVar2, qVar);
            j7.d(str2, null, defpackage.f.A(elevenLabsTheme, qVar, 6), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall400(), qVar, (i12 >> 6) & 14, 0, 130042);
            qVar = qVar;
            qVar.p(true);
            tVar3 = tVar2;
        } else {
            qVar.R();
            tVar3 = tVar2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r1(str, str2, tVar3, i10, i11);
        }
    }

    public static final sn.z NoResultsScreen$lambda$1(i3.t tVar, String str, String str2, int i10, int i11, u2.m mVar, int i12) {
        NoResultsScreen(tVar, str, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
