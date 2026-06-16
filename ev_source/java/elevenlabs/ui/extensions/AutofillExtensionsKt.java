package io.elevenlabs.ui.extensions;

import android.graphics.Rect;
import com.google.protobuf.c6;
import f4.f0;
import f4.i0;
import ho.l;
import i3.t;
import i4.j1;
import io.elevenlabs.data.database.entities.reads.h;
import j3.i;
import j3.n;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n3.a0;
import n3.d;
import sn.z;
import u2.e;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li3/t;", "", "Lj3/n;", "autofillTypes", "Lkotlin/Function1;", "", "Lsn/z;", "onFill", "autofill", "(Li3/t;Ljava/util/List;Lho/l;)Li3/t;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AutofillExtensionsKt {
    public static final t autofill(t tVar, List<? extends n> list, l lVar) {
        tVar.getClass();
        list.getClass();
        lVar.getClass();
        return i3.a.a(new io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.l(list, 1, lVar), tVar);
    }

    public static final t autofill$lambda$0(List list, l lVar, t tVar, m mVar, int i10) {
        tVar.getClass();
        q qVar = (q) mVar;
        qVar.X(-1255665648);
        i iVar = (i) qVar.j(j1.f13123b);
        j3.l lVar2 = new j3.l(list, lVar);
        ((j3.m) qVar.j(j1.f13124c)).f18567a.put(Integer.valueOf(lVar2.f18566d), lVar2);
        boolean h10 = qVar.h(lVar2);
        Object L = qVar.L();
        e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(lVar2, 4);
            qVar.h0(L);
        }
        t p10 = i0.p(tVar, (l) L);
        boolean h11 = qVar.h(iVar) | qVar.h(lVar2);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new h(iVar, lVar2, 24);
            qVar.h0(L2);
        }
        t s10 = d.s(p10, (l) L2);
        qVar.p(false);
        return s10;
    }

    public static final z autofill$lambda$0$0$0(j3.l lVar, f0 f0Var) {
        f0Var.getClass();
        lVar.f18564b = i0.h(f0Var, true);
        return z.f31622a;
    }

    public static final z autofill$lambda$0$1$0(i iVar, j3.l lVar, n3.z zVar) {
        zVar.getClass();
        if (iVar != null) {
            if (((a0) zVar).b()) {
                j3.a aVar = (j3.a) iVar;
                o3.c cVar = lVar.f18564b;
                if (cVar != null) {
                    aVar.f18545c.notifyViewEntered(aVar.f18543a, lVar.f18566d, new Rect(Math.round(cVar.f24766a), Math.round(cVar.f24767b), Math.round(cVar.f24768c), Math.round(cVar.f24769d)));
                } else {
                    c6.x("requestAutofill called before onChildPositioned()");
                    return null;
                }
            } else {
                j3.a aVar2 = (j3.a) iVar;
                aVar2.f18545c.notifyViewExited(aVar2.f18543a, lVar.f18566d);
            }
        }
        return z.f31622a;
    }
}
