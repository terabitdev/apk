package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.o;
import ho.p;
import ho.q;
import ho.r;
import i3.t;
import i4.e1;
import i4.j1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.l2;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceDesignTipsSheetKt {
    public static final ComposableSingletons$VoiceDesignTipsSheetKt INSTANCE = new ComposableSingletons$VoiceDesignTipsSheetKt();

    /* renamed from: lambda$-1086828725 */
    private static q f636lambda$1086828725 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(19), false, -1086828725);
    private static r lambda$121509084 = new c3.j(new io.elevenlabs.readerapp.ui.components.l(9), false, 121509084);
    private static p lambda$1105934662 = new c3.j(new a(0), false, 1105934662);

    public static final z lambda_1105934662$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(15);
                qVar.h0(L);
            }
            VoiceDesignTipsSheetKt.VoiceDesignTipsSheet((ho.a) L, qVar, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0(y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        List list;
        List list2;
        List list3;
        List list4;
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        final Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
        final e1 e1Var = (e1) qVar.j(j1.f13126e);
        final String R = kj.c.R(qVar, R.string.voice_design_tips_copied);
        i3.q qVar2 = i3.q.f13017a;
        t y10 = n.y(((r1.z) yVar).c(qVar2, 1.0f, false), n.x(qVar), true, true);
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        t F = r1.d.F(y10, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM());
        x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
        int hashCode = Long.hashCode(qVar.T);
        o l4 = qVar.l();
        t c5 = i3.a.c(F, qVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        qVar.b0();
        if (qVar.S) {
            qVar.k(fVar);
        } else {
            qVar.k0();
        }
        u2.r.J(h4.g.f11907f, a10, qVar);
        u2.r.J(h4.g.f11906e, l4, qVar);
        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, qVar);
        u2.r.J(h4.g.f11905d, c5, qVar);
        String R2 = kj.c.R(qVar, R.string.voice_design_tips_description);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i12 = EchoTheme.$stable;
        j7.d(R2, null, echoTheme.getColors(qVar, i12).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i12).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
        ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
        String R3 = kj.c.R(qVar, R.string.voice_design_trait_section_gender);
        list = VoiceDesignTipsSheetKt.genderTraits;
        boolean h10 = qVar.h(e1Var) | qVar.h(context) | qVar.f(R);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            final int i13 = 0;
            L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.d
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z lambda_121509084$lambda$0$0$0$0;
                    z lambda_121509084$lambda$0$0$1$0;
                    z lambda_121509084$lambda$0$0$2$0;
                    z lambda_121509084$lambda$0$0$3$0;
                    switch (i13) {
                        case 0:
                            lambda_121509084$lambda$0$0$0$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$0$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$0$0;
                        case 1:
                            lambda_121509084$lambda$0$0$1$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$1$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$1$0;
                        case 2:
                            lambda_121509084$lambda$0$0$2$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$2$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$2$0;
                        default:
                            lambda_121509084$lambda$0$0$3$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$3$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$3$0;
                    }
                }
            };
            qVar.h0(L);
        }
        VoiceDesignTipsSheetKt.TraitSection(R3, list, (ho.l) L, qVar, 0);
        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2360getX8D9Ej5fM()), qVar);
        String R4 = kj.c.R(qVar, R.string.voice_design_trait_section_age);
        list2 = VoiceDesignTipsSheetKt.ageTraits;
        boolean h11 = qVar.h(e1Var) | qVar.h(context) | qVar.f(R);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            final int i14 = 1;
            L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.d
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z lambda_121509084$lambda$0$0$0$0;
                    z lambda_121509084$lambda$0$0$1$0;
                    z lambda_121509084$lambda$0$0$2$0;
                    z lambda_121509084$lambda$0$0$3$0;
                    switch (i14) {
                        case 0:
                            lambda_121509084$lambda$0$0$0$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$0$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$0$0;
                        case 1:
                            lambda_121509084$lambda$0$0$1$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$1$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$1$0;
                        case 2:
                            lambda_121509084$lambda$0$0$2$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$2$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$2$0;
                        default:
                            lambda_121509084$lambda$0$0$3$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$3$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$3$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        VoiceDesignTipsSheetKt.TraitSection(R4, list2, (ho.l) L2, qVar, 0);
        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2360getX8D9Ej5fM()), qVar);
        String R5 = kj.c.R(qVar, R.string.voice_design_trait_section_accent);
        list3 = VoiceDesignTipsSheetKt.accentTraits;
        boolean h12 = qVar.h(e1Var) | qVar.h(context) | qVar.f(R);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            final int i15 = 2;
            L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.d
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z lambda_121509084$lambda$0$0$0$0;
                    z lambda_121509084$lambda$0$0$1$0;
                    z lambda_121509084$lambda$0$0$2$0;
                    z lambda_121509084$lambda$0$0$3$0;
                    switch (i15) {
                        case 0:
                            lambda_121509084$lambda$0$0$0$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$0$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$0$0;
                        case 1:
                            lambda_121509084$lambda$0$0$1$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$1$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$1$0;
                        case 2:
                            lambda_121509084$lambda$0$0$2$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$2$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$2$0;
                        default:
                            lambda_121509084$lambda$0$0$3$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$3$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$3$0;
                    }
                }
            };
            qVar.h0(L3);
        }
        VoiceDesignTipsSheetKt.TraitSection(R5, list3, (ho.l) L3, qVar, 0);
        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2360getX8D9Ej5fM()), qVar);
        String R6 = kj.c.R(qVar, R.string.voice_design_trait_section_tone);
        list4 = VoiceDesignTipsSheetKt.toneTraits;
        boolean h13 = qVar.h(e1Var) | qVar.h(context) | qVar.f(R);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            final int i16 = 3;
            L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.d
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z lambda_121509084$lambda$0$0$0$0;
                    z lambda_121509084$lambda$0$0$1$0;
                    z lambda_121509084$lambda$0$0$2$0;
                    z lambda_121509084$lambda$0$0$3$0;
                    switch (i16) {
                        case 0:
                            lambda_121509084$lambda$0$0$0$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$0$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$0$0;
                        case 1:
                            lambda_121509084$lambda$0$0$1$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$1$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$1$0;
                        case 2:
                            lambda_121509084$lambda$0$0$2$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$2$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$2$0;
                        default:
                            lambda_121509084$lambda$0$0$3$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_121509084$lambda$0$0$3$0(e1Var, context, R, (String) obj);
                            return lambda_121509084$lambda$0$0$3$0;
                    }
                }
            };
            qVar.h0(L4);
        }
        VoiceDesignTipsSheetKt.TraitSection(R6, list4, (ho.l) L4, qVar, 0);
        qVar.p(true);
        String R7 = kj.c.R(qVar, R.string.voice_design_tips_close);
        boolean h14 = qVar.h(bottomSheetControl);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new c(bottomSheetControl, 1);
            qVar.h0(L5);
        }
        EchoButtonKt.m1835EchoButton562pCRU(R7, (ho.a) L5, r1.d.F(p2.e(qVar2, 1.0f), elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM()), EchoButtonVariant.Primary, EchoButtonSize.Medium, null, false, false, null, false, false, qVar, 27648, 0, 2016);
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0$0$0$0(e1 e1Var, Context context, String str, String str2) {
        str2.getClass();
        ((i4.h) e1Var).a(new s4.h(str2));
        Toast.makeText(context, str, 0).show();
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0$0$1$0(e1 e1Var, Context context, String str, String str2) {
        str2.getClass();
        ((i4.h) e1Var).a(new s4.h(str2));
        Toast.makeText(context, str, 0).show();
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0$0$2$0(e1 e1Var, Context context, String str, String str2) {
        str2.getClass();
        ((i4.h) e1Var).a(new s4.h(str2));
        Toast.makeText(context, str, 0).show();
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0$0$3$0(e1 e1Var, Context context, String str, String str2) {
        str2.getClass();
        ((i4.h) e1Var).a(new s4.h(str2));
        Toast.makeText(context, str, 0).show();
        return z.f31622a;
    }

    public static final z lambda_121509084$lambda$0$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z lambda__1086828725$lambda$0(BottomSheetControl bottomSheetControl, m mVar, int i10) {
        bottomSheetControl.getClass();
        HeaderKt.EchoHeader(kj.c.R(mVar, R.string.voice_design_tips_title), null, null, c3.k.d(-1944595179, true, new b(bottomSheetControl, 0), mVar), null, mVar, 3072, 22);
        return z.f31622a;
    }

    public static final z lambda__1086828725$lambda$0$0(BottomSheetControl bottomSheetControl, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(bottomSheetControl);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new c(bottomSheetControl, 0);
                qVar.h0(L);
            }
            CloseButtonKt.CloseButton((ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1086828725$lambda$0$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1086828725$app_productionRelease */
    public final q m1766getLambda$1086828725$app_productionRelease() {
        return f636lambda$1086828725;
    }

    public final p getLambda$1105934662$app_productionRelease() {
        return lambda$1105934662;
    }

    public final r getLambda$121509084$app_productionRelease() {
        return lambda$121509084;
    }
}
