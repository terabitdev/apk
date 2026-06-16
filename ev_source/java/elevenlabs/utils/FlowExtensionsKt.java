package io.elevenlabs.utils;

import a2.a0;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import fr.g0;
import fr.m1;
import fr.r0;
import ir.z1;
import kotlin.Metadata;
import kr.d;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.e;
import t.a;
import wn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {TokenNames.T, "Lir/z1;", "Landroidx/lifecycle/k0;", "asLiveData", "(Lir/z1;)Landroidx/lifecycle/k0;", "elevenlabs-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FlowExtensionsKt {
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.h, androidx.lifecycle.k0, androidx.lifecycle.n0, androidx.lifecycle.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [qd.y1, java.lang.Object] */
    public static final <T> k0 asLiveData(z1 z1Var) {
        z1Var.getClass();
        m mVar = new m(z1Var, null, 0);
        ?? n0Var = new n0();
        m1 m1Var = new m1(null);
        e eVar = r0.f9888a;
        d c5 = g0.c(o.f20734a.f11741e.plus(i.f37087a).plus(m1Var));
        a0 a0Var = new a0(n0Var, 4);
        ?? obj = new Object();
        obj.f28487a = n0Var;
        obj.f28488b = mVar;
        obj.f28489c = c5;
        obj.f28490d = a0Var;
        n0Var.f2829m = obj;
        if (a.I().J()) {
            n0Var.j(z1Var.getValue());
            return n0Var;
        }
        n0Var.k(z1Var.getValue());
        return n0Var;
    }
}
