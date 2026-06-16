package io.elevenlabs.ui.theme;

import a2.q0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import fe.h0;
import ho.a;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.i;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import k6.h2;
import k6.k2;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b8;
import q2.c3;
import q2.f0;
import q2.g0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.q1;
import u2.r;
import u2.r1;
import vr.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"", "isDarkTheme", "Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "ElevenLabsTheme", "(ZLho/p;Lu2/m;II)V", "Lu2/q1;", "Lio/elevenlabs/ui/theme/ElevenLabsColors;", "LocalColors", "Lu2/q1;", "getLocalColors", "()Lu2/q1;", "Lio/elevenlabs/ui/theme/ColorScheme;", "LocalColorScheme", "getLocalColorScheme", "Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "LocalTypography", "getLocalTypography", "Lio/elevenlabs/ui/theme/ElevenLabsShapes;", "LocalShapes", "getLocalShapes", "Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "LocalSpacings", "getLocalSpacings", "Lio/elevenlabs/ui/theme/ElevenLabsShadows;", "LocalShadows", "getLocalShadows", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ElevenLabsThemeKt {
    private static final q1 LocalColors = new q1(new k(5));
    private static final q1 LocalColorScheme = new q1(new k(6));
    private static final q1 LocalTypography = new q1(new k(7));
    private static final q1 LocalShapes = new q1(new k(8));
    private static final q1 LocalSpacings = new q1(new k(9));
    private static final q1 LocalShadows = new q1(new k(10));

    public static final void ElevenLabsTheme(boolean z6, p pVar, m mVar, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        ElevenLabsColors light;
        ColorScheme lightColorScheme;
        f0 h10;
        boolean z12;
        int i14;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(434750299);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            z10 = z6;
        } else if ((i10 & 6) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            z10 = z6;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i12 & 1, z11)) {
            if (i15 != 0) {
                z10 = false;
            }
            if (z10) {
                light = new ElevenLabsColors.Dark();
            } else {
                light = new ElevenLabsColors.Light();
            }
            if (z10) {
                lightColorScheme = ColorSchemeKt.getDarkColorScheme();
            } else {
                lightColorScheme = ColorSchemeKt.getLightColorScheme();
            }
            ElevenLabsTypography elevenLabsTypography = new ElevenLabsTypography(lightColorScheme.getText().m2185getPrimary0d7_KjU(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 536870911, null);
            ElevenLabsShapes elevenLabsShapes = new ElevenLabsShapes(null, null, null, null, null, null, null, null, null, null, 1023, null);
            ElevenLabsSpacings elevenLabsSpacings = new ElevenLabsSpacings(u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, 8191, null);
            ElevenLabsShadows elevenLabsShadows = new ElevenLabsShadows(null, 1, null);
            if (z10) {
                h10 = g0.d(lightColorScheme.getText().m2185getPrimary0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, light.getPrimaryBg(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8194, 65535);
            } else {
                h10 = g0.h(lightColorScheme.getText().m2185getPrimary0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, light.getPrimaryBg(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8194, 65535);
            }
            View view = (View) qVar.j(AndroidCompositionLocals_androidKt.f2295f);
            if (!view.isInEditMode()) {
                qVar.X(-1974321710);
                boolean h11 = qVar.h(view) | qVar.f(light);
                if ((i12 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z13 = z12 | h11;
                Object L = qVar.L();
                if (z13 || L == l.f33918a) {
                    L = new i(view, light, z10);
                    qVar.h0(L);
                }
                r.j((a) L, qVar);
                qVar.p(false);
            } else {
                qVar.X(-1974024761);
                qVar.p(false);
            }
            r.b(new h0[]{LocalColors.a(light), LocalColorScheme.a(lightColorScheme), LocalTypography.a(elevenLabsTypography), LocalShapes.a(elevenLabsShapes), LocalSpacings.a(elevenLabsSpacings), LocalShadows.a(elevenLabsShadows)}, c3.k.d(1924294683, true, new q0(h10, elevenLabsTypography, pVar, 12), qVar), qVar, 56);
        } else {
            qVar.R();
        }
        boolean z14 = z10;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.i(z14, pVar, i10, i11, 4);
        }
    }

    public static final z ElevenLabsTheme$lambda$0$0(View view, ElevenLabsColors elevenLabsColors, boolean z6) {
        Activity activity;
        Window window;
        c h2Var;
        Context context = view.getContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(p3.h0.G(elevenLabsColors.getPrimaryBg()));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                h2Var = new k2(window);
            } else if (i10 >= 30) {
                h2Var = new k2(window);
            } else if (i10 >= 26) {
                h2Var = new h2(window);
            } else {
                h2Var = new h2(window);
            }
            h2Var.M(!z6);
        }
        return z.f31622a;
    }

    public static final z ElevenLabsTheme$lambda$1(f0 f0Var, ElevenLabsTypography elevenLabsTypography, p pVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            c3.b(f0Var, null, new b8(null, elevenLabsTypography.getBody(), null, 32255), pVar, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ElevenLabsTheme$lambda$2(boolean z6, p pVar, int i10, int i11, m mVar, int i12) {
        ElevenLabsTheme(z6, pVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final ColorScheme LocalColorScheme$lambda$0() {
        return ColorSchemeKt.getLightColorScheme();
    }

    public static final ElevenLabsColors LocalColors$lambda$0() {
        return new ElevenLabsColors.Light();
    }

    public static final ElevenLabsShadows LocalShadows$lambda$0() {
        return new ElevenLabsShadows(null, 1, null);
    }

    public static final ElevenLabsShapes LocalShapes$lambda$0() {
        return new ElevenLabsShapes(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static final ElevenLabsSpacings LocalSpacings$lambda$0() {
        return new ElevenLabsSpacings(u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, 8191, null);
    }

    public static final ElevenLabsTypography LocalTypography$lambda$0() {
        return new ElevenLabsTypography(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 536870911, null);
    }

    public static final q1 getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final q1 getLocalColors() {
        return LocalColors;
    }

    public static final q1 getLocalShadows() {
        return LocalShadows;
    }

    public static final q1 getLocalShapes() {
        return LocalShapes;
    }

    public static final q1 getLocalSpacings() {
        return LocalSpacings;
    }

    public static final q1 getLocalTypography() {
        return LocalTypography;
    }
}
