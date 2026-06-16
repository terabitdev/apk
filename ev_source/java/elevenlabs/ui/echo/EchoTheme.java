package io.elevenlabs.ui.echo;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fe.h0;
import ho.p;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.z;
import u2.m;
import u2.q;
import u2.q1;
import u2.r;
import u2.r1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lio/elevenlabs/ui/echo/EchoTheme;", "", "<init>", "()V", "Lio/elevenlabs/ui/echo/EchoTheme$Mode;", "mode", "Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "invoke", "(Lio/elevenlabs/ui/echo/EchoTheme$Mode;Lho/p;Lu2/m;II)V", "", "isDarkMode", "(Lu2/m;I)Z", "Lio/elevenlabs/ui/echo/EchoThemeColors;", "getColors", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeColors;", "colors", "Lio/elevenlabs/ui/echo/EchoThemeColorResources;", "getColorResources", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeColorResources;", "colorResources", "Lio/elevenlabs/ui/echo/EchoThemeTypography;", "getTypography", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeTypography;", "typography", "Lio/elevenlabs/ui/echo/EchoThemeBlurs;", "getBlurs", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeBlurs;", "blurs", "Lio/elevenlabs/ui/echo/EchoThemeRadii;", "getRadii", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeRadii;", "radii", "Lio/elevenlabs/ui/echo/EchoThemeShapes;", "getShapes", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeShapes;", "shapes", "Lio/elevenlabs/ui/echo/EchoThemeSpacings;", "getSpacings", "(Lu2/m;I)Lio/elevenlabs/ui/echo/EchoThemeSpacings;", "spacings", "Mode", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoTheme {
    public static final int $stable = 0;
    public static final EchoTheme INSTANCE = new EchoTheme();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/ui/echo/EchoTheme$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "System", "Light", "Dark", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Mode extends Enum<Mode> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode System = new Mode("System", 0);
        public static final Mode Light = new Mode("Light", 1);
        public static final Mode Dark = new Mode("Dark", 2);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{System, Light, Dark};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Mode(String str, int i10) {
            super(str, i10);
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.System.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Light.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EchoTheme() {
    }

    public static final z invoke$lambda$1(p pVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            pVar.invoke(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z invoke$lambda$2(EchoTheme echoTheme, Mode mode, p pVar, int i10, int i11, m mVar, int i12) {
        echoTheme.invoke(mode, pVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public final EchoThemeBlurs getBlurs(m mVar, int i10) {
        return (EchoThemeBlurs) ((q) mVar).j(EchoThemeKt.getLocalBlurs());
    }

    public final EchoThemeColorResources getColorResources(m mVar, int i10) {
        return (EchoThemeColorResources) ((q) mVar).j(EchoThemeKt.getLocalColorResources());
    }

    public final EchoThemeColors getColors(m mVar, int i10) {
        return (EchoThemeColors) ((q) mVar).j(EchoThemeKt.getLocalColors());
    }

    public final EchoThemeRadii getRadii(m mVar, int i10) {
        return (EchoThemeRadii) ((q) mVar).j(EchoThemeKt.getLocalRadii());
    }

    public final EchoThemeShapes getShapes(m mVar, int i10) {
        return (EchoThemeShapes) ((q) mVar).j(EchoThemeKt.getLocalShapes());
    }

    public final EchoThemeSpacings getSpacings(m mVar, int i10) {
        return (EchoThemeSpacings) ((q) mVar).j(EchoThemeKt.getLocalSpacings());
    }

    public final EchoThemeTypography getTypography(m mVar, int i10) {
        return (EchoThemeTypography) ((q) mVar).j(EchoThemeKt.getLocalTypography());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Mode mode, p pVar, m mVar, int i10, int i11) {
        int i12;
        int ordinal;
        int i13;
        boolean z6;
        Mode mode2;
        Mode mode3;
        boolean z10;
        int i14;
        int i15;
        int i16;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-624047026);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (mode == null) {
                ordinal = -1;
            } else {
                ordinal = mode.ordinal();
            }
            if (qVar.d(ordinal)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        boolean z11 = false;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i17 != 0) {
                mode3 = Mode.System;
            } else {
                mode3 = mode;
            }
            boolean w6 = n.w(qVar);
            q1 q1Var = AndroidCompositionLocals_androidKt.f2290a;
            Configuration configuration = (Configuration) qVar.j(q1Var);
            q1 q1Var2 = AndroidCompositionLocals_androidKt.f2291b;
            Context context = (Context) qVar.j(q1Var2);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i18 = iArr[mode3.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        z10 = w6;
                    } else {
                        c6.p();
                        return;
                    }
                } else if (!w6) {
                    z10 = true;
                }
                if (z10) {
                    Configuration configuration2 = new Configuration(configuration);
                    int i19 = iArr[mode3.ordinal()];
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 == 3) {
                                i15 = (configuration2.uiMode & (-49)) | 16;
                            } else {
                                c6.p();
                                return;
                            }
                        } else {
                            i15 = 32 | (configuration2.uiMode & (-49));
                        }
                    } else {
                        i15 = configuration2.uiMode;
                    }
                    configuration2.uiMode = i15;
                    configuration = configuration2;
                }
                if (z10) {
                    context = context.createConfigurationContext(configuration);
                }
                i14 = iArr[mode3.ordinal()];
                if (i14 == 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            c6.p();
                            return;
                        }
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = w6;
                }
                h0 a10 = q1Var.a(configuration);
                context.getClass();
                r.b(new h0[]{a10, q1Var2.a(context), EchoThemeKt.getLocalColors().a(EchoThemeColors.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalColorResources().a(EchoThemeColorResources.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalTypography().a(EchoThemeTypography.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalBlurs().a(EchoThemeBlurs.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalRadii().a(EchoThemeRadii.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalShapes().a(EchoThemeShapes.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalSpacings().a(EchoThemeSpacings.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalDarkMode().a(Boolean.valueOf(z11))}, k.d(999645070, true, new f3.a(pVar, 4), qVar), qVar, 56);
                mode2 = mode3;
            }
            z10 = false;
            if (z10) {
            }
            if (z10) {
            }
            i14 = iArr[mode3.ordinal()];
            if (i14 == 1) {
            }
            h0 a102 = q1Var.a(configuration);
            context.getClass();
            r.b(new h0[]{a102, q1Var2.a(context), EchoThemeKt.getLocalColors().a(EchoThemeColors.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalColorResources().a(EchoThemeColorResources.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalTypography().a(EchoThemeTypography.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalBlurs().a(EchoThemeBlurs.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalRadii().a(EchoThemeRadii.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalShapes().a(EchoThemeShapes.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalSpacings().a(EchoThemeSpacings.INSTANCE.getINSTANCE()), EchoThemeKt.getLocalDarkMode().a(Boolean.valueOf(z11))}, k.d(999645070, true, new f3.a(pVar, 4), qVar), qVar, 56);
            mode2 = mode3;
        } else {
            qVar.R();
            mode2 = mode;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new om.a(this, mode2, pVar, i10, i11, 2);
        }
    }

    public final boolean isDarkMode(m mVar, int i10) {
        return ((Boolean) ((q) mVar).j(EchoThemeKt.getLocalDarkMode())).booleanValue();
    }
}
