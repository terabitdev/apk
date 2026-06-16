package io.elevenlabs.ui.components.headers;

import c3.j;
import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.l2;
import sn.z;
import u2.l;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HeaderActionsKt {
    public static final ComposableSingletons$HeaderActionsKt INSTANCE = new ComposableSingletons$HeaderActionsKt();
    private static q lambda$1283681648 = new j(new f(20), false, 1283681648);

    /* renamed from: lambda$-1631919601 */
    private static q f672lambda$1631919601 = new j(new f(21), false, -1631919601);
    private static q lambda$1961583226 = new j(new f(22), false, 1961583226);

    /* renamed from: lambda$-1367821253 */
    private static q f671lambda$1367821253 = new j(new f(23), false, -1367821253);
    private static q lambda$1528867198 = new j(new f(24), false, 1528867198);

    /* renamed from: lambda$-1800537281 */
    private static q f673lambda$1800537281 = new j(new f(25), false, -1800537281);

    public static final z lambda_1283681648$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1528867198$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonSize buttonSize = ButtonSize.Small;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(20);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1961583226$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonSize buttonSize = ButtonSize.Small;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(19);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1367821253$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonSize buttonSize = ButtonSize.Small;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(21);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1631919601$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1800537281$lambda$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonSize buttonSize = ButtonSize.Small;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(18);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1367821253$ui_release */
    public final q m1890getLambda$1367821253$ui_release() {
        return f671lambda$1367821253;
    }

    /* renamed from: getLambda$-1631919601$ui_release */
    public final q m1891getLambda$1631919601$ui_release() {
        return f672lambda$1631919601;
    }

    /* renamed from: getLambda$-1800537281$ui_release */
    public final q m1892getLambda$1800537281$ui_release() {
        return f673lambda$1800537281;
    }

    public final q getLambda$1283681648$ui_release() {
        return lambda$1283681648;
    }

    public final q getLambda$1528867198$ui_release() {
        return lambda$1528867198;
    }

    public final q getLambda$1961583226$ui_release() {
        return lambda$1961583226;
    }
}
