package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.states;

import c3.o;
import e5.k;
import fm.e;
import h4.f;
import h4.g;
import h4.h;
import ho.a;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a3\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onReconnectClick", "Li3/t;", "modifier", "", "errorMessage", "AssistantDisconnectedState", "(Lho/a;Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_AssistantDisconnectedState", "(Lu2/m;I)V", "Preview_AssistantDisconnectedState_WithError", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantDisconnectedStateKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistantDisconnectedState(a aVar, t tVar, String str, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        String str2;
        int i15;
        boolean z6;
        t tVar3;
        String str3;
        r1 r10;
        t tVar4;
        String str4;
        String str5;
        int i16;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1186442605);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                str2 = str;
                if (qVar.f(str2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i17 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    t d10 = p2.d(tVar4, 1.0f);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i18 = EchoTheme.$stable;
                    t G = d.G(d10, echoTheme.getSpacings(qVar, i18).getX5(), u.P, 2);
                    x a10 = w.a(j.f29232e, i3.d.C0, qVar, 54);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    t c5 = i3.a.c(G, qVar);
                    h.f11920i.getClass();
                    f fVar = g.f11903b;
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
                    t e10 = p2.e(qVar2, 1.0f);
                    if (str4 == null) {
                        qVar.X(1353342603);
                        String R = c.R(qVar, R.string.assistant_disconnected_body);
                        qVar.p(false);
                        str5 = R;
                    } else {
                        qVar.X(1353342107);
                        qVar.p(false);
                        str5 = str4;
                    }
                    t tVar5 = tVar4;
                    j7.d(str5, e10, echoTheme.getColors(qVar, i18).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i18).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 48, 0, 130040);
                    qVar = qVar;
                    i.o(echoTheme, qVar, i18, qVar2, qVar);
                    FullWidthButtonKt.EchoThemeFullWidthButton(c.R(qVar, R.string.assistant_disconnected_reconnect_button), aVar, null, null, null, null, false, false, false, qVar, (i12 << 3) & 112, 508);
                    qVar.p(true);
                    str3 = str4;
                    tVar3 = tVar5;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    str3 = str2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new im.a(aVar, tVar3, str3, i10, i11);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        str2 = str;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z AssistantDisconnectedState$lambda$1(a aVar, t tVar, String str, int i10, int i11, m mVar, int i12) {
        AssistantDisconnectedState(aVar, tVar, str, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AssistantDisconnectedState(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1453749368);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantDisconnectedStateKt.INSTANCE.getLambda$106073198$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 7);
        }
    }

    public static final z Preview_AssistantDisconnectedState$lambda$0(int i10, m mVar, int i11) {
        Preview_AssistantDisconnectedState(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AssistantDisconnectedState_WithError(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1408308699);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantDisconnectedStateKt.INSTANCE.m1298getLambda$1421835381$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 6);
        }
    }

    public static final z Preview_AssistantDisconnectedState_WithError$lambda$0(int i10, m mVar, int i11) {
        Preview_AssistantDisconnectedState_WithError(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
