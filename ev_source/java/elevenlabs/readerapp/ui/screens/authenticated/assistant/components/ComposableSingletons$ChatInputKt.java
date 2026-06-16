package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import a2.y;
import c3.j;
import ho.p;
import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f;
import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import sn.z;
import u2.e;
import u2.l;
import u2.m;
import u2.r;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChatInputKt {
    public static final ComposableSingletons$ChatInputKt INSTANCE = new ComposableSingletons$ChatInputKt();

    /* renamed from: lambda$-1250437027 */
    private static q f244lambda$1250437027 = new j(new f(2), false, -1250437027);

    /* renamed from: lambda$-1359853804 */
    private static p f245lambda$1359853804 = new j(new c(0), false, -1359853804);

    /* renamed from: lambda$-522510158 */
    private static p f246lambda$522510158 = new j(new c(1), false, -522510158);

    public static final z lambda__1250437027$lambda$0(boolean z6, m mVar, int i10) {
        boolean z10;
        int i11;
        String str;
        int i12;
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).g(z6)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                i11 = R.drawable.arrow_up;
            } else {
                i11 = R.drawable.wave3;
            }
            u3.c M = kd.a.M(i11, qVar, 0);
            if (z6) {
                str = "Send message";
            } else {
                str = "Switch to voice mode";
            }
            y2.a(M, str, p2.o(i3.q.f13017a, 20), 0L, qVar, u3.c.$stable | 384, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1359853804$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = r.A("");
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            String lambda__1359853804$lambda$0$1 = lambda__1359853804$lambda$0$1(z0Var);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new y(z0Var, 15);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(13);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(14);
                qVar.h0(L4);
            }
            ChatInputKt.ChatInput(lambda__1359853804$lambda$0$1, lVar, aVar, (ho.a) L4, null, null, false, false, qVar, 1576368, 176);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    private static final String lambda__1359853804$lambda$0$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z lambda__1359853804$lambda$0$3$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z lambda__522510158$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = r.A("What is this book about?");
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            String lambda__522510158$lambda$0$1 = lambda__522510158$lambda$0$1(z0Var);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new y(z0Var, 14);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(11);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(12);
                qVar.h0(L4);
            }
            ChatInputKt.ChatInput(lambda__522510158$lambda$0$1, lVar, aVar, (ho.a) L4, null, null, false, false, qVar, 1576368, 176);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    private static final String lambda__522510158$lambda$0$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z lambda__522510158$lambda$0$3$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    /* renamed from: getLambda$-1250437027$app_productionRelease */
    public final q m1280getLambda$1250437027$app_productionRelease() {
        return f244lambda$1250437027;
    }

    /* renamed from: getLambda$-1359853804$app_productionRelease */
    public final p m1281getLambda$1359853804$app_productionRelease() {
        return f245lambda$1359853804;
    }

    /* renamed from: getLambda$-522510158$app_productionRelease */
    public final p m1282getLambda$522510158$app_productionRelease() {
        return f246lambda$522510158;
    }
}
