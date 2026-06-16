package io.elevenlabs.ui.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.URLSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e5.p;
import g1.l0;
import ig.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.a1;
import p3.n0;
import p3.s;
import p3.t;
import p3.x;
import s4.d;
import s4.e;
import s4.h;
import s4.p0;
import tn.c0;
import u2.l;
import u2.m;
import u2.q;
import w4.a0;
import w4.b0;
import w4.g0;
import w4.u;
import wq.i;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000f\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0000*\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\t*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001e\u001a\u00020\u0013*\u00020\u001a2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ls4/h;", "Lp3/t;", "brush", "applyGradient", "(Ls4/h;Lp3/t;Lu2/m;I)Ls4/h;", "", "id", "annotatedStringResource", "(ILu2/m;I)Ls4/h;", "", "Lp3/x;", "left", "right", "parseGradientText-1wkBAMs", "(Ljava/lang/String;JJLu2/m;I)Ls4/h;", "parseGradientText", "parseHtmlLinks", "(Ljava/lang/String;Lu2/m;I)Ls4/h;", "parseMarkdownLinks", "", ParameterNames.TEXT, "spannableStringToAnnotatedString", "(Ljava/lang/CharSequence;)Ls4/h;", "Landroid/text/Spanned;", "toHtmlWithoutParagraphs", "(Landroid/text/Spanned;)Ljava/lang/String;", "Landroid/content/res/Resources;", "", "", "args", "getText", "(Landroid/content/res/Resources;I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AnnotatedStringExtensionsKt {
    public static final h annotatedStringResource(int i10, m mVar, int i11) {
        boolean z6;
        q qVar = (q) mVar;
        Resources resources = ((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b)).getResources();
        if ((((i11 & 14) ^ 6) > 4 && qVar.d(i10)) || (i11 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        Object L = qVar.L();
        if (z6 || L == l.f33918a) {
            CharSequence text = resources.getText(i10);
            text.getClass();
            L = spannableStringToAnnotatedString(text);
            qVar.h0(L);
        }
        return (h) L;
    }

    public static final h applyGradient(h hVar, t tVar, m mVar, int i10) {
        boolean z6;
        boolean z10;
        hVar.getClass();
        String str = hVar.f31041b;
        tVar.getClass();
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(hVar)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && ((q) mVar).f(tVar)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10 | z6;
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z11 || L == l.f33918a) {
            wq.l lVar = new wq.l("<gradient>(.*?)</gradient>");
            if (lVar.a(str)) {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                l0 l0Var = new l0(wq.l.b(lVar, str), (byte) 0);
                int i11 = 0;
                while (l0Var.hasNext()) {
                    i iVar = (i) ((wq.h) l0Var.next());
                    sb.append(str.substring(i11, iVar.b().f24556a));
                    String str2 = (String) ((c0) iVar.a()).get(1);
                    int length = sb.length();
                    sb.append(str2);
                    arrayList.add(new d(new p0(tVar), length, str2.length() + length, 8));
                    i11 = iVar.b().f24557b + 1;
                }
                if (i11 < str.length()) {
                    sb.append(str.substring(i11));
                }
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList2.add(((d) arrayList.get(i12)).a(sb.length()));
                }
                hVar = new h(sb2, arrayList2);
            }
            qVar.h0(hVar);
            L = hVar;
        }
        return (h) L;
    }

    private static final CharSequence getText(Resources resources, int i10, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof Spanned) {
                obj = toHtmlWithoutParagraphs((Spanned) obj);
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        String htmlWithoutParagraphs = toHtmlWithoutParagraphs(new SpannedString(resources.getText(i10)));
        Object[] copyOf = Arrays.copyOf(array, array.length);
        Spanned fromHtml = Html.fromHtml(String.format(htmlWithoutParagraphs, Arrays.copyOf(copyOf, copyOf.length)), 0);
        fromHtml.getClass();
        return fromHtml;
    }

    /* renamed from: parseGradientText-1wkBAMs, reason: not valid java name */
    public static final h m1964parseGradientText1wkBAMs(String str, long j4, long j10, m mVar, int i10) {
        boolean z6;
        boolean z10;
        boolean z11;
        str.getClass();
        int i11 = 0;
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(str)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && ((q) mVar).e(j4)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z6 | z10;
        if ((((i10 & 896) ^ 384) > 256 && ((q) mVar).e(j10)) || (i10 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z11 | z12;
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z13 || L == l.f33918a) {
            s sVar = t.Companion;
            List I = f.I(new x(j4), new x(j10));
            sVar.getClass();
            n0 n0Var = new n0(I, null, 0L, 9187343241974906880L);
            eo.i b10 = wq.l.b(new wq.l("<gradient>(.*?)</gradient>"), str);
            e eVar = new e();
            l0 l0Var = new l0(b10, (byte) 0);
            while (l0Var.hasNext()) {
                i iVar = (i) ((wq.h) l0Var.next());
                int i12 = iVar.b().f24556a;
                int i13 = iVar.b().f24557b + 1;
                String substring = str.substring(i11, i12);
                String str2 = (String) ((c0) iVar.a()).get(1);
                eVar.d(substring);
                int i14 = eVar.i(new p0(n0Var));
                try {
                    eVar.d(str2);
                    eVar.g(i14);
                    i11 = i13;
                } catch (Throwable th) {
                    eVar.g(i14);
                    throw th;
                }
            }
            if (i11 < str.length()) {
                eVar.d(str.substring(i11));
            }
            L = eVar.k();
            qVar.h0(L);
        }
        return (h) L;
    }

    public static final h parseHtmlLinks(String str, m mVar, int i10) {
        boolean z6;
        str.getClass();
        int i11 = 0;
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(str)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == l.f33918a) {
            eo.i b10 = wq.l.b(new wq.l("<a\\s+href=\"(.*?)\".*?>(.*?)</a>"), str);
            e eVar = new e();
            l0 l0Var = new l0(b10, (byte) 0);
            while (l0Var.hasNext()) {
                i iVar = (i) ((wq.h) l0Var.next());
                int i12 = iVar.b().f24556a;
                int i13 = iVar.b().f24557b + 1;
                String substring = str.substring(i11, i12);
                String str2 = (String) ((c0) iVar.a()).get(1);
                String str3 = (String) ((c0) iVar.a()).get(2);
                eVar.d(substring);
                StringBuilder sb = eVar.f31024a;
                int length = sb.length();
                eVar.d(str3);
                int length2 = sb.length();
                eVar.b(new p0(0L, 0L, (g0) null, (a0) null, (b0) null, (u) null, (String) null, 0L, (e5.a) null, (p) null, (a5.c) null, 0L, e5.l.f8290c, (a1) null, 61439), length, length2);
                eVar.a(length, "href", str2, length2);
                i11 = i13;
            }
            if (i11 < str.length()) {
                eVar.d(str.substring(i11));
            }
            L = eVar.k();
            qVar.h0(L);
        }
        return (h) L;
    }

    public static final h parseMarkdownLinks(String str, m mVar, int i10) {
        boolean z6;
        str.getClass();
        int i11 = 0;
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(str)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == l.f33918a) {
            eo.i b10 = wq.l.b(new wq.l("\\[(.*?)\\]\\((.*?)\\)"), str);
            e eVar = new e();
            l0 l0Var = new l0(b10, (byte) 0);
            while (l0Var.hasNext()) {
                i iVar = (i) ((wq.h) l0Var.next());
                int i12 = iVar.b().f24556a;
                int i13 = iVar.b().f24557b + 1;
                String substring = str.substring(i11, i12);
                String str2 = (String) ((c0) iVar.a()).get(1);
                String str3 = (String) ((c0) iVar.a()).get(2);
                eVar.d(substring);
                StringBuilder sb = eVar.f31024a;
                int length = sb.length();
                eVar.d(str2);
                int length2 = sb.length();
                eVar.b(new p0(0L, 0L, (g0) null, (a0) null, (b0) null, (u) null, (String) null, 0L, (e5.a) null, (p) null, (a5.c) null, 0L, e5.l.f8290c, (a1) null, 61439), length, length2);
                eVar.a(length, "href", str3, length2);
                i11 = i13;
            }
            if (i11 < str.length()) {
                eVar.d(str.substring(i11));
            }
            L = eVar.k();
            qVar.h0(L);
        }
        return (h) L;
    }

    private static final h spannableStringToAnnotatedString(CharSequence charSequence) {
        e eVar = new e();
        if (charSequence instanceof Spanned) {
            eVar.c(charSequence);
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), URLSpan.class);
            spans.getClass();
            for (Object obj : spans) {
                URLSpan uRLSpan = (URLSpan) obj;
                eVar.b(new p0(0L, 0L, (g0) null, (a0) null, (b0) null, (u) null, (String) null, 0L, (e5.a) null, (p) null, (a5.c) null, 0L, e5.l.f8290c, (a1) null, 61439), spanned.getSpanStart(uRLSpan), spanned.getSpanEnd(uRLSpan));
                String url = uRLSpan.getURL();
                url.getClass();
                eVar.a(spanned.getSpanStart(uRLSpan), "href", url, spanned.getSpanEnd(uRLSpan));
            }
        } else {
            eVar.c(charSequence);
        }
        return eVar.k();
    }

    private static final String toHtmlWithoutParagraphs(Spanned spanned) {
        String html = Html.toHtml(spanned, 0);
        html.getClass();
        String D0 = n.D0(html, "<p dir=\"ltr\">", html);
        int p02 = n.p0(6, D0, "</p>");
        if (p02 == -1) {
            return D0;
        }
        return D0.substring(0, p02);
    }
}
