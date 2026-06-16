package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import a2.a2;
import a2.h0;
import a2.k3;
import a2.y1;
import a2.z1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "onSave", "RenameDialog", "(Ljava/lang/String;Lho/a;Lho/l;Lu2/m;I)V", "Ly4/w;", "currentTitle", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RenameDialogKt {
    public static final void RenameDialog(String str, ho.a aVar, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1653282331);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(new y4.w(str, 0L, 6));
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            String R = kj.c.R(qVar, R.string.common_ok);
            String R2 = kj.c.R(qVar, R.string.common_cancel);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            Object L2 = qVar.L();
            if (z10 || L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.d(lVar, z0Var, 2);
                qVar.h0(L2);
            }
            ConfirmationDialogKt.ConfirmationDialog(aVar, (ho.a) L2, c3.k.d(-791929297, true, new f2.i(lVar, z0Var, 7), qVar), R2, R, false, qVar, ((i11 >> 3) & 14) | 196992, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 17, str, aVar, lVar);
        }
    }

    private static final y4.w RenameDialog$lambda$1(z0 z0Var) {
        return (y4.w) z0Var.getValue();
    }

    public static final sn.z RenameDialog$lambda$3$0(ho.l lVar, z0 z0Var) {
        lVar.invoke(RenameDialog$lambda$1(z0Var).f38321a.f31041b);
        return sn.z.f31622a;
    }

    public static final sn.z RenameDialog$lambda$4(ho.l lVar, z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        sn.z zVar = sn.z.f31622a;
        if (O) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n3.v();
                qVar.h0(L);
            }
            n3.v vVar = (n3.v) L;
            y4.w RenameDialog$lambda$1 = RenameDialog$lambda$1(z0Var);
            i3.t j4 = n3.d.j(p2.e(i3.q.f13017a, 1.0f), vVar);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j(z0Var, 1);
                qVar.h0(L2);
            }
            i3.t s10 = n3.d.s(j4, (ho.l) L2);
            String R = kj.c.R(qVar, R.string.player_read_title_placeholder);
            boolean f10 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f10 || L3 == eVar) {
                L3 = new h0(lVar, z0Var, 3);
                qVar.h0(L3);
            }
            z1 z1Var = new z1((ho.l) L3, null, null, 62);
            a2 a2Var = new a2(1, 7, 115);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new j(z0Var, 2);
                qVar.h0(L4);
            }
            InputKt.Input(RenameDialog$lambda$1, (ho.l) L4, s10, (i3.t) null, (InputState) null, (String) null, (String) null, R, (ho.p) null, a2Var, z1Var, (y4.d0) null, false, 0, (u2.m) qVar, 48, 0, 14712);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new RenameDialogKt$RenameDialog$2$4$1(vVar, null);
                qVar.h0(L5);
            }
            u2.r.f((ho.p) L5, zVar, qVar);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final sn.z RenameDialog$lambda$4$1$0(z0 z0Var, n3.z zVar) {
        zVar.getClass();
        if (((n3.a0) zVar).b()) {
            z0Var.setValue(y4.w.b(RenameDialog$lambda$1(z0Var), null, s4.t.b(0, RenameDialog$lambda$1(z0Var).f38321a.f31041b.length()), 5));
        }
        return sn.z.f31622a;
    }

    public static final sn.z RenameDialog$lambda$4$2$0(ho.l lVar, z0 z0Var, y1 y1Var) {
        y1Var.getClass();
        lVar.invoke(RenameDialog$lambda$1(z0Var).f38321a.f31041b);
        return sn.z.f31622a;
    }

    public static final sn.z RenameDialog$lambda$4$3$0(z0 z0Var, y4.w wVar) {
        wVar.getClass();
        z0Var.setValue(wVar);
        return sn.z.f31622a;
    }

    public static final sn.z RenameDialog$lambda$5(String str, ho.a aVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        RenameDialog(str, aVar, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
