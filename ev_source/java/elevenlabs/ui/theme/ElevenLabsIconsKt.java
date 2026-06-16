package io.elevenlabs.ui.theme;

import c3.o;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import ig.f;
import io.elevenlabs.ui.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.j;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u3.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsn/z;", "Preview_Icons", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ElevenLabsIconsKt {
    public static final void Preview_Icons(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-523016630);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = f.I(Integer.valueOf(R.drawable.apple), Integer.valueOf(R.drawable.bookmark), Integer.valueOf(R.drawable.bookmark_24), Integer.valueOf(R.drawable.bookmark_active), Integer.valueOf(R.drawable.bookmark_active_24), Integer.valueOf(R.drawable.browser), Integer.valueOf(R.drawable.check_1), Integer.valueOf(R.drawable.check), Integer.valueOf(R.drawable.center_position), Integer.valueOf(R.drawable.chevron_down), Integer.valueOf(R.drawable.chevron_left), Integer.valueOf(R.drawable.chevron_right), Integer.valueOf(R.drawable.play), Integer.valueOf(R.drawable.musical_note), Integer.valueOf(R.drawable.musical_note_filled));
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(i3.q.f13017a, qVar);
            h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            qVar.X(1247104077);
            Iterator it = I.iterator();
            while (it.hasNext()) {
                n.c(kd.a.M(((Number) it.next()).intValue(), qVar, 0), "Sample icon", null, null, null, u.P, null, qVar, c.$stable | 48, 124);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 10);
        }
    }

    public static final z Preview_Icons$lambda$1(int i10, m mVar, int i11) {
        Preview_Icons(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
