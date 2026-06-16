package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f;
import h4.g;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountAvatarKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.h0;
import p4.b0;
import p4.y;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.u0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/model/User;", "user", "", "isFreeUser", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "HomeAccountButtonV4", "(Lio/elevenlabs/domain/model/User;Ljava/lang/Boolean;Lho/a;Li3/t;Lu2/m;II)V", "Preview_HomeAccountButtonV4_Free", "(Lu2/m;I)V", "Preview_HomeAccountButtonV4_Subscriber", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeAccountButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeAccountButtonV4(User user, Boolean bool, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        t tVar5;
        EchoTheme echoTheme;
        int i14;
        String str;
        String str2;
        int i15;
        int i16;
        int i17;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-244049113);
        if ((i10 & 6) == 0) {
            if (qVar.h(user)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(bool)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            aVar2 = aVar;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                boolean c5 = kotlin.jvm.internal.m.c(bool, Boolean.TRUE);
                String R = kj.c.R(qVar, R.string.account_header_title);
                t c10 = h.c(tVar3, z1.h.a());
                if (c5) {
                    qVar.X(1692015823);
                    tVar4 = n.h(qVar2, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
                    qVar.p(false);
                } else {
                    qVar.X(1692017263);
                    qVar.p(false);
                    tVar4 = qVar2;
                }
                t then = c10.then(tVar4);
                boolean f10 = qVar.f(R);
                Object L = qVar.L();
                if (f10 || L == l.f33918a) {
                    L = new am.c(R, 20);
                    qVar.h0(L);
                }
                t p10 = n.p(p4.q.c(then, true, (ho.l) L), false, null, null, null, aVar2, 15);
                if (c5) {
                    qVar.X(913214043);
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    int i19 = EchoTheme.$stable;
                    tVar5 = r1.d.H(qVar2, echoTheme2.getSpacings(qVar, i19).getX3(), echoTheme2.getSpacings(qVar, i19).getX1(), echoTheme2.getSpacings(qVar, i19).getX1(), echoTheme2.getSpacings(qVar, i19).getX1());
                    qVar.p(false);
                } else {
                    qVar.X(913362347);
                    qVar.p(false);
                    tVar5 = qVar2;
                }
                t then2 = p10.then(tVar5);
                k kVar = i3.d.f13005z0;
                u0 u0Var = j.f29228a;
                EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                k2 a10 = i2.a(i.m(echoTheme3, qVar, i20), kVar, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c11 = i3.a.c(then2, qVar);
                h4.h.f11920i.getClass();
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
                r.J(g.f11905d, c11, qVar);
                if (c5) {
                    qVar.X(-1796568757);
                    echoTheme = echoTheme3;
                    i14 = i20;
                    j7.d(kj.c.R(qVar, R.string.read_details_try_ultra_button), null, echoTheme3.getColors(qVar, i20).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme3.getTypography(qVar, i20).getSmRegular600(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    echoTheme = echoTheme3;
                    i14 = i20;
                    qVar.X(-1796355105);
                    qVar.p(false);
                }
                String str3 = null;
                if (user != null) {
                    str = user.getName();
                } else {
                    str = null;
                }
                if (user != null) {
                    str2 = user.getEmail();
                } else {
                    str2 = null;
                }
                if (user != null) {
                    str3 = user.getPhoto();
                }
                AccountAvatarKt.m1235AccountAvatarhGBTI10(str, str2, n.j(1, echoTheme.getColors(qVar, i14).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable), qVar2, z1.h.f39128a), 36, str3, qVar, 3072, 0);
                qVar.p(true);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) user, (Object) bool, aVar, (Object) tVar3, i10, i11, 15);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeAccountButtonV4$lambda$0$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z HomeAccountButtonV4$lambda$2(User user, Boolean bool, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeAccountButtonV4(user, bool, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeAccountButtonV4_Free(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2077799401);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeAccountButtonKt.INSTANCE.m1426getLambda$977844541$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 13);
        }
    }

    public static final z Preview_HomeAccountButtonV4_Free$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeAccountButtonV4_Free(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeAccountButtonV4_Subscriber(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1151723621);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeAccountButtonKt.INSTANCE.m1425getLambda$1981976641$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 12);
        }
    }

    public static final z Preview_HomeAccountButtonV4_Subscriber$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeAccountButtonV4_Subscriber(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
