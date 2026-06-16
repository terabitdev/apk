package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import com.google.firebase.messaging.Constants;
import io.elevenlabs.readerapp.ui.screens.authenticated.r;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Lsn/z;", "AccountSectionDivider", "(Ljava/lang/String;Lu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountSectionDividerKt {
    public static final void AccountSectionDivider(String str, m mVar, int i10, int i11) {
        String str2;
        int i12;
        int i13;
        boolean z6;
        String str3;
        String str4;
        q qVar = (q) mVar;
        qVar.Z(-111979145);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 6) == 0) {
            str2 = str;
            if (qVar.f(str2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i14 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            float x22 = echoTheme.getSpacings(qVar, i15).getX2();
            float x42 = echoTheme.getSpacings(qVar, i15).getX4();
            i3.q qVar2 = i3.q.f13017a;
            DividerKt.m1827DivideriJQMabo(r1.d.F(qVar2, x42, x22), echoTheme.getColors(qVar, i15).getBorder().getSenary(qVar, EchoThemeColors.Border.$stable), qVar, 0, 0);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i15).getX6()), qVar);
            if (str4 == null) {
                qVar.X(1219207069);
                qVar.p(false);
                str3 = str4;
            } else {
                qVar.X(1219207070);
                str3 = str4;
                j7.d(str3, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i15).getX5(), u.P, 2), echoTheme.getColors(qVar, i15).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i15).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, i12 & 14, 0, 131064);
                qVar = qVar;
                ib.i.o(echoTheme, qVar, i15, qVar2, qVar);
                qVar.p(false);
            }
        } else {
            qVar.R();
            str3 = str2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r(str3, i10, i11, 1);
        }
    }

    public static final z AccountSectionDivider$lambda$1(String str, int i10, int i11, m mVar, int i12) {
        AccountSectionDivider(str, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
