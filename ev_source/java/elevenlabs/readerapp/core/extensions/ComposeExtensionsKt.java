package io.elevenlabs.readerapp.core.extensions;

import android.content.Intent;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.support.v4.media.session.b;
import androidx.fragment.app.n0;
import androidx.room.b0;
import com.google.firebase.messaging.Constants;
import ho.p;
import io.elevenlabs.readerapp.R;
import ir.j1;
import j.j;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import ta.z0;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import ua.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "link", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "ShareLinkHandler", "(Ljava/lang/String;Lho/a;Lu2/m;I)V", "Lj/j;", "Landroid/content/Intent;", "Lm/a;", "shareLauncher", Constants.ScionAnalytics.PARAM_LABEL, "handleShare", "(Ljava/lang/String;Lj/j;Ljava/lang/String;)V", "", TokenNames.T, "Lta/z0;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lua/b;", "rememberPreviewLazyPagingItems", "(Lta/z0;Lu2/m;I)Lua/b;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposeExtensionsKt {
    public static final void ShareLinkHandler(String str, ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1183104322);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z11 = true;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            n0 n0Var = new n0(4);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (z10 || L == eVar) {
                L = new b0(1, aVar);
                qVar.h0(L);
            }
            j C = b.C(n0Var, (ho.l) L, qVar, 0);
            String R = c.R(qVar, R.string.share_choose_an_app);
            if ((i11 & 14) != 4) {
                z11 = false;
            }
            boolean h10 = qVar.h(C) | z11 | qVar.f(R);
            Object L2 = qVar.L();
            if (h10 || L2 == eVar) {
                L2 = new ComposeExtensionsKt$ShareLinkHandler$1$1(str, C, R, null);
                qVar.h0(L2);
            }
            r.f((p) L2, str, qVar);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(str, aVar, i10, 0);
        }
    }

    public static final z ShareLinkHandler$lambda$0$0(ho.a aVar, m.a aVar2) {
        aVar2.getClass();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z ShareLinkHandler$lambda$2(String str, ho.a aVar, int i10, m mVar, int i11) {
        ShareLinkHandler(str, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void handleShare(String str, j jVar, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.getClass();
        jVar.a(createChooser);
    }

    public static final <T> ua.b rememberPreviewLazyPagingItems(z0 z0Var, m mVar, int i10) {
        z0Var.getClass();
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (L == l.f33918a) {
            L = ir.r.c(z0Var);
            qVar.h0(L);
        }
        return d.a((j1) L, qVar);
    }
}
