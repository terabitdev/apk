package io.elevenlabs.ui.theme;

import c3.o;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import io.elevenlabs.ui.R;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import oo.f0;
import q2.j7;
import r1.j;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w4.g0;
import w4.m0;
import w4.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Ls4/y0;", "", "weight", "withFontWeight", "(Ls4/y0;I)Ls4/y0;", "Lsn/z;", "Preview_Typography", "(Lu2/m;I)V", "Lw4/u;", "inter", "Lw4/u;", "getInter", "()Lw4/u;", "elevenWaldenburg", "getElevenWaldenburg", "libre", "getLibre", "openDyslexic", "getOpenDyslexic", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ElevenLabsTypographyKt {
    private static final u elevenWaldenburg;
    private static final u inter;
    private static final u libre;
    private static final u openDyslexic;

    static {
        int i10 = R.font.inter_400_regular;
        g0 g0Var = g0.f36110c;
        m0 a10 = c1.a(i10, g0Var, 0, 12);
        m0 a11 = c1.a(R.font.inter_500_medium, g0.f36111d, 0, 12);
        m0 a12 = c1.a(R.font.inter_600_semibold, g0.f36112e, 0, 12);
        int i11 = R.font.inter_700_bold;
        g0 g0Var2 = g0.f36113f;
        inter = f0.f(a10, a11, a12, c1.a(i11, g0Var2, 0, 12));
        elevenWaldenburg = f0.f(c1.a(R.font.eleven_waldenburg_bold_semi, g0Var2, 0, 12));
        libre = f0.f(c1.a(R.font.libre_baskerville_400_regular, g0Var, 0, 12), c1.a(R.font.libre_baskerville_700_bold, g0Var2, 0, 12));
        openDyslexic = f0.f(c1.a(R.font.dyslexic3, g0Var, 0, 12), c1.a(R.font.dyslexic3_bold, g0Var2, 0, 12));
    }

    public static final void Preview_Typography(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-735799718);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t y10 = n.y(i3.q.f13017a, n.x(qVar), true, true);
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(y10, qVar);
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d("titleXLarge700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleXLarge700(), qVar, 6, 0, 131070);
            j7.d("titleXLarge700Eleven", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleXLarge700Eleven(), qVar, 6, 0, 131070);
            j7.d("titleLarge400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleLarge400(), qVar, 6, 0, 131070);
            j7.d("titleLarge500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleLarge500(), qVar, 6, 0, 131070);
            j7.d("titleLarge600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleLarge600(), qVar, 6, 0, 131070);
            j7.d("titleLarge700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleLarge700Inter(), qVar, 6, 0, 131070);
            j7.d("titleMedium400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleMedium400(), qVar, 6, 0, 131070);
            j7.d("titleMedium500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleMedium500(), qVar, 6, 0, 131070);
            j7.d("titleMedium600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleMedium600(), qVar, 6, 0, 131070);
            j7.d("titleMedium700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleMedium700(), qVar, 6, 0, 131070);
            j7.d("titleMedium700Eleven", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleMedium700Eleven(), qVar, 6, 0, 131070);
            j7.d("titleSmall400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleSmall400(), qVar, 6, 0, 131070);
            j7.d("titleSmall500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleSmall500(), qVar, 6, 0, 131070);
            j7.d("titleSmall600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleSmall600(), qVar, 6, 0, 131070);
            j7.d("titleSmall700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getTitleSmall700(), qVar, 6, 0, 131070);
            j7.d("subtitleLarge400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleLarge400(), qVar, 6, 0, 131070);
            j7.d("subtitleLarge500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleLarge500(), qVar, 6, 0, 131070);
            j7.d("subtitleLarge600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleLarge600(), qVar, 6, 0, 131070);
            j7.d("subtitleLarge700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleLarge700(), qVar, 6, 0, 131070);
            j7.d("subtitleMedium400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium400(), qVar, 6, 0, 131070);
            j7.d("subtitleMedium500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium500(), qVar, 6, 0, 131070);
            j7.d("subtitleMedium600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium600(), qVar, 6, 0, 131070);
            j7.d("subtitleMedium700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium700(), qVar, 6, 0, 131070);
            j7.d("subtitleSmall400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall400(), qVar, 6, 0, 131070);
            j7.d("subtitleSmall500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall500(), qVar, 6, 0, 131070);
            j7.d("subtitleSmall600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall600(), qVar, 6, 0, 131070);
            j7.d("subtitleSmall700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall700(), qVar, 6, 0, 131070);
            j7.d("bodyLarge400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge400(), qVar, 6, 0, 131070);
            j7.d("bodyLarge500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge500(), qVar, 6, 0, 131070);
            j7.d("bodyLarge600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge600(), qVar, 6, 0, 131070);
            j7.d("bodyLarge700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyLarge700(), qVar, 6, 0, 131070);
            j7.d("bodyMedium400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium400(), qVar, 6, 0, 131070);
            j7.d("bodyMedium500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium500(), qVar, 6, 0, 131070);
            j7.d("bodyMedium600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium600(), qVar, 6, 0, 131070);
            j7.d("bodyMedium700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium700(), qVar, 6, 0, 131070);
            j7.d("bodySmall400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall400(), qVar, 6, 0, 131070);
            j7.d("bodySmall500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall500(), qVar, 6, 0, 131070);
            j7.d("bodySmall600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall600(), qVar, 6, 0, 131070);
            j7.d("bodySmall700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall700(), qVar, 6, 0, 131070);
            j7.d("bodyXSmall400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall400(), qVar, 6, 0, 131070);
            j7.d("bodyXSmall500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall500(), qVar, 6, 0, 131070);
            j7.d("bodyXSmall600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall600(), qVar, 6, 0, 131070);
            j7.d("bodyXSmall700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall700(), qVar, 6, 0, 131070);
            j7.d("bodyTiny400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyTiny400(), qVar, 6, 0, 131070);
            j7.d("bodyTiny500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyTiny500(), qVar, 6, 0, 131070);
            j7.d("bodyTiny600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyTiny600(), qVar, 6, 0, 131070);
            j7.d("bodyTiny700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyTiny700(), qVar, 6, 0, 131070);
            j7.d("pillMedium400", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getPill400(), qVar, 6, 0, 131070);
            j7.d("pillMedium500", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getPill500(), qVar, 6, 0, 131070);
            j7.d("pillMedium600", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getPill600(), qVar, 6, 0, 131070);
            j7.d("pillMedium700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getPill700(), qVar, 6, 0, 131070);
            j7.d("buttonLargeEleven700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonLargeEleven700(), qVar, 6, 0, 131070);
            j7.d("buttonMediumEleven700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonMediumEleven700(), qVar, 6, 0, 131070);
            j7.d("buttonSmallEleven700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonSmallEleven700(), qVar, 6, 0, 131070);
            j7.d("buttonLargeDefault700", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonLargeDefault700(), qVar, 6, 0, 131070);
            j7.d("buttonMediumDefault", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonMediumDefault(), qVar, 6, 0, 131070);
            j7.d("buttonSmallDefault", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getButtonSmallDefault(), qVar, 6, 0, 131070);
            j7.d("bookText", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBookText(), qVar, 6, 0, 131070);
            j7.d("body", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBody(), qVar, 6, 0, 131070);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 12);
        }
    }

    public static final z Preview_Typography$lambda$1(int i10, m mVar, int i11) {
        Preview_Typography(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final u getElevenWaldenburg() {
        return elevenWaldenburg;
    }

    public static final u getInter() {
        return inter;
    }

    public static final u getLibre() {
        return libre;
    }

    public static final u getOpenDyslexic() {
        return openDyslexic;
    }

    public static final y0 withFontWeight(y0 y0Var, int i10) {
        y0Var.getClass();
        return y0.a(y0Var, 0L, 0L, new g0(i10), null, null, 0L, 0, 0L, null, null, 16777211);
    }
}
