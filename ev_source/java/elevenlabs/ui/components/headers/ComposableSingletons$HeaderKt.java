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
public final class ComposableSingletons$HeaderKt {
    public static final ComposableSingletons$HeaderKt INSTANCE = new ComposableSingletons$HeaderKt();
    private static q lambda$1513030983 = new j(new f(26), false, 1513030983);
    private static q lambda$1828532025 = new j(new f(27), false, 1828532025);
    private static q lambda$25680833 = new j(new f(28), false, 25680833);

    /* renamed from: lambda$-1251442835 */
    private static q f674lambda$1251442835 = new j(new f(29), false, -1251442835);

    /* renamed from: lambda$-928325014 */
    private static q f676lambda$928325014 = new j(new a(0), false, -928325014);

    /* renamed from: lambda$-746591765 */
    private static q f675lambda$746591765 = new j(new a(1), false, -746591765);

    public static final z lambda_1513030983$lambda$0(l2 l2Var, m mVar, int i10) {
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

    public static final z lambda_1828532025$lambda$0(l2 l2Var, m mVar, int i10) {
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

    public static final z lambda_25680833$lambda$0(l2 l2Var, m mVar, int i10) {
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

    public static final z lambda__1251442835$lambda$0(l2 l2Var, m mVar, int i10) {
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

    public static final z lambda__746591765$lambda$0(l2 l2Var, m mVar, int i10) {
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
                L = new d(22);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__928325014$lambda$0(l2 l2Var, m mVar, int i10) {
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
                L = new d(23);
                qVar.h0(L);
            }
            ButtonKt.Button("Action", (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3126, 1012);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1251442835$ui_release */
    public final q m1893getLambda$1251442835$ui_release() {
        return f674lambda$1251442835;
    }

    /* renamed from: getLambda$-746591765$ui_release */
    public final q m1894getLambda$746591765$ui_release() {
        return f675lambda$746591765;
    }

    /* renamed from: getLambda$-928325014$ui_release */
    public final q m1895getLambda$928325014$ui_release() {
        return f676lambda$928325014;
    }

    public final q getLambda$1513030983$ui_release() {
        return lambda$1513030983;
    }

    public final q getLambda$1828532025$ui_release() {
        return lambda$1828532025;
    }

    public final q getLambda$25680833$ui_release() {
        return lambda$25680833;
    }
}
