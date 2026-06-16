package io.elevenlabs.readerapp.core.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ja.c1;
import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import na.l0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/core/router/NavigationExtensions;", "", "<init>", "()V", "Lna/c0;", "", "route", "", "popUpWithCurrent", "popUpToRoute", "Lsn/z;", "navigateSingleTop", "(Lna/c0;Ljava/lang/String;ZLjava/lang/String;)V", "link", "launchDeeplink", "(Lna/c0;Ljava/lang/String;)Z", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NavigationExtensions {
    public static final int $stable = 0;
    public static final NavigationExtensions INSTANCE = new NavigationExtensions();

    private NavigationExtensions() {
    }

    public static /* synthetic */ void navigateSingleTop$default(NavigationExtensions navigationExtensions, na.c0 c0Var, String str, boolean z6, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        navigationExtensions.navigateSingleTop(c0Var, str, z6, str2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [na.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [na.l0, java.lang.Object] */
    public static final sn.z navigateSingleTop$lambda$0(boolean z6, na.c0 c0Var, String str, na.g0 g0Var) {
        String str2;
        g0Var.getClass();
        g0Var.f24313b = true;
        if (z6) {
            na.x g10 = c0Var.f24352b.g();
            if (g10 != null && (str2 = (String) g10.f24395b.f1674e) != null) {
                g0Var.b(str2);
                g0Var.f24315d = -1;
                g0Var.f24317f = false;
                ?? obj = new Object();
                navigateSingleTop$lambda$0$0$0(obj);
                g0Var.f24317f = obj.f24342a;
                g0Var.f24318g = false;
            }
        } else if (str != null) {
            g0Var.b(str);
            g0Var.f24315d = -1;
            g0Var.f24317f = false;
            ?? obj2 = new Object();
            navigateSingleTop$lambda$0$1(obj2);
            g0Var.f24317f = obj2.f24342a;
            g0Var.f24318g = false;
        }
        return sn.z.f31622a;
    }

    private static final sn.z navigateSingleTop$lambda$0$0$0(l0 l0Var) {
        l0Var.getClass();
        l0Var.f24342a = true;
        return sn.z.f31622a;
    }

    private static final sn.z navigateSingleTop$lambda$0$1(l0 l0Var) {
        l0Var.getClass();
        l0Var.f24342a = false;
        return sn.z.f31622a;
    }

    public final boolean launchDeeplink(na.c0 c0Var, String str) {
        na.x xVar;
        c0Var.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        qa.e eVar = c0Var.f24352b;
        na.y h10 = eVar.h();
        parse.getClass();
        if (h10.f(new c1(parse, null, null, false, 9)) == null) {
            return false;
        }
        na.j jVar = (na.j) eVar.f28164f.j();
        if (jVar != null && (xVar = jVar.f24329b) != null && xVar.f(new c1(parse, null, null, false, 9)) != null) {
            return false;
        }
        na.f0 f0Var = new na.f0(false, true, -1, false, false, -1, -1);
        c1 c1Var = new c1(parse, null, null, false, 9);
        na.n nVar = eVar.f28159a;
        if (eVar.f28161c != null) {
            na.y j4 = eVar.j();
            na.w g10 = j4.g(c1Var, j4);
            if (g10 != null) {
                na.x xVar2 = g10.f24387a;
                Bundle b10 = xVar2.b(g10.f24388b);
                if (b10 == null) {
                    b10 = kd.a.p((sn.k[]) Arrays.copyOf(new sn.k[0], 0));
                }
                Intent intent = new Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                b10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                eVar.m(xVar2, b10, f0Var);
                return true;
            }
            StringBuilder sb = new StringBuilder("Navigation destination that matches request ");
            sb.append(c1Var);
            zr.o.f(sb, " cannot be found in the navigation graph ", eVar.f28161c);
            return false;
        }
        m8.b.o(46, "Cannot navigate to ", c1Var, ". Navigation graph has not been set for NavController ", nVar);
        return false;
    }

    public final void navigateSingleTop(na.c0 c0Var, String str, boolean z6, String str2) {
        c0Var.getClass();
        str.getClass();
        c0Var.b(new f0(c0Var, str2, z6), str);
    }
}
