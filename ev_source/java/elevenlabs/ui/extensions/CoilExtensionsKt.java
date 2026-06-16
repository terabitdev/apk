package io.elevenlabs.ui.extensions;

import ad.h;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.f;
import p3.k0;
import tn.n;
import tn.o;
import u2.l;
import u2.m;
import u2.q;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lad/h;", "", "src", "srcOrData", "(Lad/h;Ljava/lang/String;Lu2/m;I)Lad/h;", "encoded", "Lp3/k0;", "rememberBase64ImageBitmap", "(Ljava/lang/String;Lu2/m;I)Lp3/k0;", "url", "coverData", "(Lad/h;Ljava/lang/String;)Lad/h;", "coverMemoryCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "", "COVER_SIZE_SEGMENTS", "Ljava/util/Set;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CoilExtensionsKt {
    private static final Set<String> COVER_SIZE_SEGMENTS = n.f1(new String[]{"thumbnail", "medium", "large"});

    public static final h coverData(h hVar, String str) {
        yc.a aVar;
        hVar.getClass();
        yc.a aVar2 = null;
        if (str == null) {
            hVar.f1788c = null;
            return hVar;
        }
        String coverMemoryCacheKey = coverMemoryCacheKey(str);
        hVar.f1788c = str;
        if (coverMemoryCacheKey != null) {
            aVar = new yc.a(coverMemoryCacheKey);
        } else {
            aVar = null;
        }
        hVar.f1791f = aVar;
        if (coverMemoryCacheKey != null) {
            aVar2 = new yc.a(coverMemoryCacheKey);
        }
        hVar.f1802r = aVar2;
        return hVar;
    }

    private static final String coverMemoryCacheKey(String str) {
        String str2;
        List z02 = wq.n.z0(str, new String[]{Separators.SLASH}, 6);
        Iterator it = z02.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (COVER_SIZE_SEGMENTS.contains((String) it.next())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && (str2 = (String) o.z0(i10 + 1, z02)) != null) {
            return str2;
        }
        return str;
    }

    public static final k0 rememberBase64ImageBitmap(String str, m mVar, int i10) {
        boolean z6;
        Object lVar;
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(str)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == l.f33918a) {
            Object obj = null;
            if (str != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (decodeByteArray != null) {
                        lVar = new f(decodeByteArray);
                    } else {
                        lVar = null;
                    }
                } catch (Throwable th) {
                    lVar = new sn.l(th);
                }
                if (!(lVar instanceof sn.l)) {
                    obj = lVar;
                }
                obj = (k0) obj;
            }
            L = obj;
            qVar.h0(L);
        }
        return (k0) L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [u2.q] */
    public static final h srcOrData(h hVar, String str, m mVar, int i10) {
        boolean z6;
        hVar.getClass();
        str.getClass();
        if ((((i10 & 112) ^ 48) > 32 && ((q) mVar).f(str)) || (i10 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        ?? r52 = (q) mVar;
        Object L = r52.L();
        if (z6 || L == l.f33918a) {
            if (u.W(str, "data:image/", false)) {
                try {
                    str = Base64.decode(wq.n.D0(str, "base64,", str), 0);
                } catch (IllegalArgumentException unused) {
                }
            }
            r52.h0(str);
            L = str;
        }
        hVar.f1788c = (Serializable) L;
        return hVar;
    }
}
