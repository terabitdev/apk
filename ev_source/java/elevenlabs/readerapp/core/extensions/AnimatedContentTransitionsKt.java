package io.elevenlabs.readerapp.core.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import h5.c;
import i1.d1;
import i1.f1;
import i1.g1;
import i1.h1;
import i1.h3;
import i1.k3;
import i1.l0;
import i1.q;
import i1.s1;
import i1.x;
import i1.x0;
import i1.y0;
import io.elevenlabs.highlighter.t;
import j1.a2;
import j1.b2;
import j1.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import na.j;
import tn.o;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Li1/q;", "Lna/j;", "", "", "tabRoutes", "Lh5/c;", "density", "Li1/d1;", "getTabEnterTransition", "(Li1/q;Ljava/util/List;Lh5/c;)Li1/d1;", "Li1/f1;", "getTabExitTransition", "(Li1/q;Ljava/util/List;Lh5/c;)Li1/f1;", "route", "getBaseRoute", "(Ljava/lang/String;)Ljava/lang/String;", "", "isTabRoute", "(Ljava/lang/String;Ljava/util/List;)Z", "", "getTabIndex", "(Ljava/lang/String;Ljava/util/List;)I", "Lh5/f;", "SLIDE_DISTANCE", TokenNames.F, "DURATION_MS", TokenNames.I, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AnimatedContentTransitionsKt {
    private static final int DURATION_MS = 300;
    private static final float SLIDE_DISTANCE = 100;

    private static final String getBaseRoute(String str) {
        if (str == null) {
            return null;
        }
        List z02 = n.z0((CharSequence) n.z0(str, new String[]{Separators.QUESTION}, 6).get(0), new String[]{Separators.SLASH}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            String str2 = (String) obj;
            if (!n.a0(str2, "{", false) && !n.a0(str2, "}", false)) {
                arrayList.add(obj);
            }
        }
        return o.E0(arrayList, Separators.SLASH, null, null, null, 62);
    }

    public static final d1 getTabEnterTransition(q qVar, List<String> list, c cVar) {
        qVar.getClass();
        list.getClass();
        cVar.getClass();
        int B = cVar.B(SLIDE_DISTANCE);
        x xVar = (x) qVar;
        String str = (String) ((j) xVar.b()).f24329b.f24395b.f1674e;
        String str2 = (String) ((j) xVar.a()).f24329b.f24395b.f1674e;
        if (isTabRoute(str, list) && isTabRoute(str2, list)) {
            int tabIndex = getTabIndex(str, list);
            int tabIndex2 = getTabIndex(str2, list);
            if (tabIndex != -1 && tabIndex2 != -1 && tabIndex != tabIndex2) {
                if (tabIndex2 > tabIndex) {
                    return y0.j(new x0(new t(B, 4), 2), e.s(300, 0, null, 6)).a(y0.e(e.s(300, 0, null, 6), 2));
                }
                return y0.j(new x0(new t(B, 5), 2), e.s(300, 0, null, 6)).a(y0.e(e.s(300, 0, null, 6), 2));
            }
        }
        return y0.e(e.s(300, 0, null, 6), 2);
    }

    public static final int getTabEnterTransition$lambda$2(int i10, int i11) {
        return -i10;
    }

    public static final f1 getTabExitTransition(q qVar, List<String> list, c cVar) {
        qVar.getClass();
        list.getClass();
        cVar.getClass();
        int B = cVar.B(SLIDE_DISTANCE);
        x xVar = (x) qVar;
        String str = (String) ((j) xVar.b()).f24329b.f24395b.f1674e;
        String str2 = (String) ((j) xVar.a()).f24329b.f24395b.f1674e;
        if (isTabRoute(str, list) && isTabRoute(str2, list)) {
            int tabIndex = getTabIndex(str, list);
            int tabIndex2 = getTabIndex(str2, list);
            if (tabIndex != -1 && tabIndex2 != -1 && tabIndex != tabIndex2) {
                if (tabIndex2 > tabIndex) {
                    a2 s10 = e.s(300, 0, null, 6);
                    t tVar = new t(B, 2);
                    b2 b2Var = y0.f12962a;
                    return new g1(new k3((h1) null, new h3(new x0(tVar, 4), s10), (l0) null, (s1) null, (LinkedHashMap) null, 125)).a(y0.f(e.s(300, 0, null, 6), 2));
                }
                a2 s11 = e.s(300, 0, null, 6);
                t tVar2 = new t(B, 3);
                b2 b2Var2 = y0.f12962a;
                return new g1(new k3((h1) null, new h3(new x0(tVar2, 4), s11), (l0) null, (s1) null, (LinkedHashMap) null, 125)).a(y0.f(e.s(300, 0, null, 6), 2));
            }
        }
        return y0.f(e.s(300, 0, null, 6), 2);
    }

    public static final int getTabExitTransition$lambda$1(int i10, int i11) {
        return -i10;
    }

    private static final int getTabIndex(String str, List<String> list) {
        if (str != null) {
            String baseRoute = getBaseRoute(str);
            int i10 = 0;
            for (String str2 : list) {
                if (!m.c(baseRoute, getBaseRoute(str2)) && !u.W(str, str2, false)) {
                    i10++;
                } else {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    private static final boolean isTabRoute(String str, List<String> list) {
        if (str != null) {
            String baseRoute = getBaseRoute(str);
            if (list == null || !list.isEmpty()) {
                for (String str2 : list) {
                    if (m.c(baseRoute, getBaseRoute(str2)) || u.W(str, str2, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int getTabEnterTransition$lambda$1(int i10, int i11) {
        return i10;
    }

    public static final int getTabExitTransition$lambda$2(int i10, int i11) {
        return i10;
    }
}
