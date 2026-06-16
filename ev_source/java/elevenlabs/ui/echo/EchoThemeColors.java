package io.elevenlabs.ui.echo;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0007\u001c\u001d\u001e\u001f !\"BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors;", "", "background", "Lio/elevenlabs/ui/echo/EchoThemeColors$Background;", ParameterNames.TEXT, "Lio/elevenlabs/ui/echo/EchoThemeColors$Text;", "fill", "Lio/elevenlabs/ui/echo/EchoThemeColors$Fill;", ParameterNames.ICON, "Lio/elevenlabs/ui/echo/EchoThemeColors$Icon;", "border", "Lio/elevenlabs/ui/echo/EchoThemeColors$Border;", "component", "Lio/elevenlabs/ui/echo/EchoThemeColors$Component;", "<init>", "(Lio/elevenlabs/ui/echo/EchoThemeColors$Background;Lio/elevenlabs/ui/echo/EchoThemeColors$Text;Lio/elevenlabs/ui/echo/EchoThemeColors$Fill;Lio/elevenlabs/ui/echo/EchoThemeColors$Icon;Lio/elevenlabs/ui/echo/EchoThemeColors$Border;Lio/elevenlabs/ui/echo/EchoThemeColors$Component;)V", "getBackground", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Background;", "getText", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Text;", "getFill", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Fill;", "getIcon", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Icon;", "getBorder", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Border;", "getComponent", "()Lio/elevenlabs/ui/echo/EchoThemeColors$Component;", "Companion", "Background", "Text", "Fill", "Icon", "Border", "Component", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeColors {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeColors INSTANCE = new EchoThemeColors(null, null, null, null, null, null, 63, null);
    private final Background background;
    private final Border border;
    private final Component component;
    private final Fill fill;
    private final Icon icon;
    private final Text text;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Background;", "", "<init>", "()V", "Lp3/x;", "getPrimary", "(Lu2/m;I)J", "primary", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Background {
        public static final int $stable = 0;

        public final long getPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0011\u0010-\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b,\u0010\u0006¨\u0006."}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Border;", "", "<init>", "()V", "Lp3/x;", "getPrimary", "(Lu2/m;I)J", "primary", "getSecondary", "secondary", "getTertiary", "tertiary", "getQuaternary", "quaternary", "getQuiniary", "quiniary", "getPrimaryAlpha", "primaryAlpha", "getSecondaryAlpha", "secondaryAlpha", "getTertiaryAlpha", "tertiaryAlpha", "getQuaternaryAlpha", "quaternaryAlpha", "getQuiniaryAlpha", "quiniaryAlpha", "getSenary", "senary", "getSenaryAlpha", "senaryAlpha", "getSeptenary", "septenary", "getSeptenaryAlpha", "septenaryAlpha", "getHeavy", "heavy", "getWhiteQuaternary", "whiteQuaternary", "getOctonary", "octonary", "getOctonaryAlpha", "octonaryAlpha", "getBlueSenaryAlpha", "blueSenaryAlpha", "getWhitePrimary", "whitePrimary", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Border {
        public static final int $stable = 0;

        public final long getBlueSenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaBlue300(mVar, 0);
        }

        public final long getHeavy(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1200(mVar, 0);
        }

        public final long getOctonary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }

        public final long getOctonaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray100(mVar, 0);
        }

        public final long getPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getPrimaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray800(mVar, 0);
        }

        public final long getQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray500(mVar, 0);
        }

        public final long getQuaternaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray500(mVar, 0);
        }

        public final long getQuiniary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray400(mVar, 0);
        }

        public final long getQuiniaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray400(mVar, 0);
        }

        public final long getSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray700(mVar, 0);
        }

        public final long getSecondaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray700(mVar, 0);
        }

        public final long getSenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray300(mVar, 0);
        }

        public final long getSenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray300(mVar, 0);
        }

        public final long getSeptenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray200(mVar, 0);
        }

        public final long getSeptenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray200(mVar, 0);
        }

        public final long getTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray600(mVar, 0);
        }

        public final long getTertiaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray600(mVar, 0);
        }

        public final long getWhitePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getWhiteQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha40(mVar, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Component;", "", "<init>", "()V", "Lp3/x;", "getToggleBackgroundActive", "(Lu2/m;I)J", "toggleBackgroundActive", "getToggleForegroundActive", "toggleForegroundActive", "getToggleBackgroundInactive", "toggleBackgroundInactive", "getToggleForegroundInactive", "toggleForegroundInactive", "getAssistantInput", "assistantInput", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Component {
        public static final int $stable = 0;

        public final long getAssistantInput(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-1431276746);
                long solidGray100 = echoTheme.getColorResources(qVar, 6).getSolidGray100(qVar, 0);
                qVar.p(false);
                return solidGray100;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-1431202408);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getToggleBackgroundActive(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-549376330);
                long solidGray500 = echoTheme.getColorResources(qVar, 6).getSolidGray500(qVar, 0);
                qVar.p(false);
                return solidGray500;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-549301899);
            long solidGray1200 = echoTheme.getColorResources(qVar2, 6).getSolidGray1200(qVar2, 0);
            qVar2.p(false);
            return solidGray1200;
        }

        public final long getToggleBackgroundInactive(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray500(mVar, 0);
        }

        public final long getToggleForegroundActive(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-585648011);
                long solidGray1200 = echoTheme.getColorResources(qVar, 6).getSolidGray1200(qVar, 0);
                qVar.p(false);
                return solidGray1200;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-585572650);
            long solidGray100 = echoTheme.getColorResources(qVar2, 6).getSolidGray100(qVar2, 0);
            qVar2.p(false);
            return solidGray100;
        }

        public final long getToggleForegroundInactive(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-141694346);
                long solidGray800 = echoTheme.getColorResources(qVar, 6).getSolidGray800(qVar, 0);
                qVar.p(false);
                return solidGray800;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-141619946);
            long solidGray100 = echoTheme.getColorResources(qVar2, 6).getSolidGray100(qVar2, 0);
            qVar2.p(false);
            return solidGray100;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bb\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0011\u0010-\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0011\u0010/\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0011\u00101\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0011\u00103\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0011\u00105\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b4\u0010\u0006R\u0011\u00107\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u0011\u00109\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0011\u0010;\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u0011\u0010=\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b<\u0010\u0006R\u0011\u0010?\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0011\u0010A\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0011\u0010C\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0011\u0010E\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u0011\u0010G\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u0011\u0010I\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0011\u0010K\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006R\u0011\u0010M\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bL\u0010\u0006R\u0011\u0010O\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bN\u0010\u0006R\u0011\u0010Q\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bP\u0010\u0006R\u0011\u0010S\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bR\u0010\u0006R\u0011\u0010U\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bT\u0010\u0006R\u0011\u0010W\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0011\u0010Y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bX\u0010\u0006R\u0011\u0010[\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u0011\u0010]\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0011\u0010_\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b^\u0010\u0006R\u0011\u0010a\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0011\u0010c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bb\u0010\u0006R\u0011\u0010e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bd\u0010\u0006¨\u0006f"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Fill;", "", "<init>", "()V", "Lp3/x;", "getDenary", "(Lu2/m;I)J", "denary", "getPrimary", "primary", "getSecondary", "secondary", "getTertiary", "tertiary", "getQuaternary", "quaternary", "getQuiniary", "quiniary", "getSenary", "senary", "getSeptenary", "septenary", "getOctonary", "octonary", "getNonary", "nonary", "getDenaryAlpha", "denaryAlpha", "getCriticalPrimary", "criticalPrimary", "getUndenary", "undenary", "getDuodenary", "duodenary", "getVisualRaisedLg", "visualRaisedLg", "getVisualRaisedXs", "visualRaisedXs", "getInput", "input", "getWhitePrimary", "whitePrimary", "getWhiteQuaternary", "whiteQuaternary", "getWhiteQuiniary", "whiteQuiniary", "getPlayerOverlay", "playerOverlay", "getWhiteSenary", "whiteSenary", "getOverlay", "overlay", "getUndenaryAlpha", "undenaryAlpha", "getCriticalUndenaryAlpha", "criticalUndenaryAlpha", "getCriticalUndenary", "criticalUndenary", "getVisualRaisedMd", "visualRaisedMd", "getVisualRaisedSm", "visualRaisedSm", "getOnFillPrimary", "onFillPrimary", "getBlueUndenary", "blueUndenary", "getMenu", "menu", "getBluePrimary", "bluePrimary", "getBlueDenary", "blueDenary", "getRedPrimary", "redPrimary", "getRedDenary", "redDenary", "getAmberPrimary", "amberPrimary", "getAmberDenary", "amberDenary", "getJadePrimary", "jadePrimary", "getJadeDenary", "jadeDenary", "getIrisPrimary", "irisPrimary", "getIrisDenary", "irisDenary", "getVioletPrimary", "violetPrimary", "getVioletDenary", "violetDenary", "getBlack", "black", "getNonaryAlpha", "nonaryAlpha", "getOctonaryAlpha", "octonaryAlpha", "getSeptenaryAlpha", "septenaryAlpha", "getSenaryAlpha", "senaryAlpha", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Fill {
        public static final int $stable = 0;

        public final long getAmberDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidAmber300(mVar, 0);
        }

        public final long getAmberPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidAmber900(mVar, 0);
        }

        public final long getBlack(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-195548180);
                long solidGray100 = echoTheme.getColorResources(qVar, 6).getSolidGray100(qVar, 0);
                qVar.p(false);
                return solidGray100;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-195473749);
            long solidGray1200 = echoTheme.getColorResources(qVar2, 6).getSolidGray1200(qVar2, 0);
            qVar2.p(false);
            return solidGray1200;
        }

        public final long getBlueDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidBlue300(mVar, 0);
        }

        public final long getBluePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidBlue900(mVar, 0);
        }

        public final long getBlueUndenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidBlue200(mVar, 0);
        }

        public final long getCriticalPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed900(mVar, 0);
        }

        public final long getCriticalUndenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed200(mVar, 0);
        }

        public final long getCriticalUndenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaRed200(mVar, 0);
        }

        public final long getDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray300(mVar, 0);
        }

        public final long getDenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray300(mVar, 0);
        }

        public final long getDuodenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }

        public final long getInput(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-636547902);
                long solidGray200 = echoTheme.getColorResources(qVar, 6).getSolidGray200(qVar, 0);
                qVar.p(false);
                return solidGray200;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-636473564);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getIrisDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidIris300(mVar, 0);
        }

        public final long getIrisPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidIris900(mVar, 0);
        }

        public final long getJadeDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidJade300(mVar, 0);
        }

        public final long getJadePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidJade900(mVar, 0);
        }

        public final long getMenu(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-1121028614);
                long solidGray200 = echoTheme.getColorResources(qVar, 6).getSolidGray200(qVar, 0);
                qVar.p(false);
                return solidGray200;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-1120954276);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getNonary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray400(mVar, 0);
        }

        public final long getNonaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray400(mVar, 0);
        }

        public final long getOctonary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray500(mVar, 0);
        }

        public final long getOctonaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray500(mVar, 0);
        }

        public final long getOnFillPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }

        public final long getOverlay(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-25920279);
                long alphaBlackAlpha60 = echoTheme.getColorResources(qVar, 6).getAlphaBlackAlpha60(qVar, 0);
                qVar.p(false);
                return alphaBlackAlpha60;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-25841074);
            long alphaGray500 = echoTheme.getColorResources(qVar2, 6).getAlphaGray500(qVar2, 0);
            qVar2.p(false);
            return alphaGray500;
        }

        public final long getPlayerOverlay(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaBlackAlpha60(mVar, 0);
        }

        public final long getPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1200(mVar, 0);
        }

        public final long getQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray900(mVar, 0);
        }

        public final long getQuiniary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getRedDenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed900(mVar, 0);
        }

        public final long getRedPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed900(mVar, 0);
        }

        public final long getSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1100(mVar, 0);
        }

        public final long getSenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray700(mVar, 0);
        }

        public final long getSenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray700(mVar, 0);
        }

        public final long getSeptenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray600(mVar, 0);
        }

        public final long getSeptenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray600(mVar, 0);
        }

        public final long getTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1000(mVar, 0);
        }

        public final long getUndenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray200(mVar, 0);
        }

        public final long getUndenaryAlpha(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaGray200(mVar, 0);
        }

        public final long getVioletDenary(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(1680330520);
                long solidViolet300 = echoTheme.getColorResources(qVar, 6).getSolidViolet300(qVar, 0);
                qVar.p(false);
                return solidViolet300;
            }
            q qVar2 = (q) mVar;
            qVar2.X(1680406842);
            long solidIris300 = echoTheme.getColorResources(qVar2, 6).getSolidIris300(qVar2, 0);
            qVar2.p(false);
            return solidIris300;
        }

        public final long getVioletPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidViolet900(mVar, 0);
        }

        public final long getVisualRaisedLg(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-368577734);
                long solidGray500 = echoTheme.getColorResources(qVar, 6).getSolidGray500(qVar, 0);
                qVar.p(false);
                return solidGray500;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-368503396);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getVisualRaisedMd(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-11366470);
                long solidGray400 = echoTheme.getColorResources(qVar, 6).getSolidGray400(qVar, 0);
                qVar.p(false);
                return solidGray400;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-11292132);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getVisualRaisedSm(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-591478950);
                long solidGray300 = echoTheme.getColorResources(qVar, 6).getSolidGray300(qVar, 0);
                qVar.p(false);
                return solidGray300;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-591404612);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getVisualRaisedXs(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(1462485973);
                long alphaBlackAlpha80 = echoTheme.getColorResources(qVar, 6).getAlphaBlackAlpha80(qVar, 0);
                qVar.p(false);
                return alphaBlackAlpha80;
            }
            q qVar2 = (q) mVar;
            qVar2.X(1462565116);
            long solidWhite = echoTheme.getColorResources(qVar2, 6).getSolidWhite(qVar2, 0);
            qVar2.p(false);
            return solidWhite;
        }

        public final long getWhitePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getWhiteQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha40(mVar, 0);
        }

        public final long getWhiteQuiniary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha20(mVar, 0);
        }

        public final long getWhiteSenary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha10(mVar, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006¨\u0006$"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Icon;", "", "<init>", "()V", "Lp3/x;", "getPrimary", "(Lu2/m;I)J", "primary", "getSecondary", "secondary", "getTertiary", "tertiary", "getPlaceholder", "placeholder", "getOnFillPrimary", "onFillPrimary", "getInactive", "inactive", "getOnFillPrimaryCritical", "onFillPrimaryCritical", "getQuaternary", "quaternary", "getWhitePrimary", "whitePrimary", "getWhiteSecondary", "whiteSecondary", "getWhiteTertiary", "whiteTertiary", "getWhiteQuaternary", "whiteQuaternary", "getWhiteQuiniary", "whiteQuiniary", "getCriticalPrimary", "criticalPrimary", "getCriticalQuaternary", "criticalQuaternary", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Icon {
        public static final int $stable = 0;

        public final long getCriticalPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed900(mVar, 0);
        }

        public final long getCriticalQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed800(mVar, 0);
        }

        public final long getInactive(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray500(mVar, 0);
        }

        public final long getOnFillPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }

        public final long getOnFillPrimaryCritical(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getPlaceholder(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1200(mVar, 0);
        }

        public final long getQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1100(mVar, 0);
        }

        public final long getTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray900(mVar, 0);
        }

        public final long getWhitePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getWhiteQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha40(mVar, 0);
        }

        public final long getWhiteQuiniary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha20(mVar, 0);
        }

        public final long getWhiteSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha80(mVar, 0);
        }

        public final long getWhiteTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha60(mVar, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u0010\u0006¨\u0006,"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Text;", "", "<init>", "()V", "Lp3/x;", "getPrimary", "(Lu2/m;I)J", "primary", "getSecondary", "secondary", "getTertiary", "tertiary", "getPlaceholder", "placeholder", "getOnFillPrimary", "onFillPrimary", "getInactive", "inactive", "getOnFillPrimaryCritical", "onFillPrimaryCritical", "getQuaternary", "quaternary", "getWhitePrimary", "whitePrimary", "getWhiteQuaternary", "whiteQuaternary", "getWhiteSecondary", "whiteSecondary", "getWhiteTertiary", "whiteTertiary", "getCriticalPrimary", "criticalPrimary", "getCriticalSecondary", "criticalSecondary", "getOnFillSecondary", "onFillSecondary", "getOnFillTertiary", "onFillTertiary", "getOnFillQuaternary", "onFillQuaternary", "getBluePrimary", "bluePrimary", "getWarningPrimary", "warningPrimary", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Text {
        public static final int $stable = 0;

        public final long getBluePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidBlue900(mVar, 0);
        }

        public final long getCriticalPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed900(mVar, 0);
        }

        public final long getCriticalSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidRed800(mVar, 0);
        }

        public final long getInactive(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray600(mVar, 0);
        }

        public final long getOnFillPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray100(mVar, 0);
        }

        public final long getOnFillPrimaryCritical(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getOnFillQuaternary(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-1704113845);
                long alphaBlackAlpha40 = echoTheme.getColorResources(qVar, 6).getAlphaBlackAlpha40(qVar, 0);
                qVar.p(false);
                return alphaBlackAlpha40;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-1704034485);
            long alphaWhiteAlpha40 = echoTheme.getColorResources(qVar2, 6).getAlphaWhiteAlpha40(qVar2, 0);
            qVar2.p(false);
            return alphaWhiteAlpha40;
        }

        public final long getOnFillSecondary(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-645084541);
                long alphaBlackAlpha80 = echoTheme.getColorResources(qVar, 6).getAlphaBlackAlpha80(qVar, 0);
                qVar.p(false);
                return alphaBlackAlpha80;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-645005181);
            long alphaWhiteAlpha80 = echoTheme.getColorResources(qVar2, 6).getAlphaWhiteAlpha80(qVar2, 0);
            qVar2.p(false);
            return alphaWhiteAlpha80;
        }

        public final long getOnFillTertiary(m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            if (echoTheme.isDarkMode(mVar, 6)) {
                q qVar = (q) mVar;
                qVar.X(-2060530229);
                long alphaBlackAlpha60 = echoTheme.getColorResources(qVar, 6).getAlphaBlackAlpha60(qVar, 0);
                qVar.p(false);
                return alphaBlackAlpha60;
            }
            q qVar2 = (q) mVar;
            qVar2.X(-2060450869);
            long alphaWhiteAlpha60 = echoTheme.getColorResources(qVar2, 6).getAlphaWhiteAlpha60(qVar2, 0);
            qVar2.p(false);
            return alphaWhiteAlpha60;
        }

        public final long getPlaceholder(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1200(mVar, 0);
        }

        public final long getQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray800(mVar, 0);
        }

        public final long getSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray1100(mVar, 0);
        }

        public final long getTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidGray900(mVar, 0);
        }

        public final long getWarningPrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidAmber900(mVar, 0);
        }

        public final long getWhitePrimary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getSolidWhite(mVar, 0);
        }

        public final long getWhiteQuaternary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha40(mVar, 0);
        }

        public final long getWhiteSecondary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha80(mVar, 0);
        }

        public final long getWhiteTertiary(m mVar, int i10) {
            return EchoTheme.INSTANCE.getColorResources(mVar, 6).getAlphaWhiteAlpha60(mVar, 0);
        }
    }

    public /* synthetic */ EchoThemeColors(Background background, Text text, Fill fill, Icon icon, Border border, Component component, int i10, f fVar) {
        this((i10 & 1) != 0 ? new Background() : background, (i10 & 2) != 0 ? new Text() : text, (i10 & 4) != 0 ? new Fill() : fill, (i10 & 8) != 0 ? new Icon() : icon, (i10 & 16) != 0 ? new Border() : border, (i10 & 32) != 0 ? new Component() : component);
    }

    public final Background getBackground() {
        return this.background;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Component getComponent() {
        return this.component;
    }

    public final Fill getFill() {
        return this.fill;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Text getText() {
        return this.text;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeColors$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeColors;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeColors;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeColors getINSTANCE() {
            return EchoThemeColors.INSTANCE;
        }

        private Companion() {
        }
    }

    public EchoThemeColors(Background background, Text text, Fill fill, Icon icon, Border border, Component component) {
        background.getClass();
        text.getClass();
        fill.getClass();
        icon.getClass();
        border.getClass();
        component.getClass();
        this.background = background;
        this.text = text;
        this.fill = fill;
        this.icon = icon;
        this.border = border;
        this.component = component;
    }

    public EchoThemeColors() {
        this(null, null, null, null, null, null, 63, null);
    }
}
