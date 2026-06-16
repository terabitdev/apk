package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m1;
import androidx.lifecycle.u;
import com.google.protobuf.c6;
import fr.d0;
import hr.q;
import i4.o1;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreCollectionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt;
import j1.b1;
import j1.u1;
import j2.s;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;
import l1.h0;
import l1.h1;
import l1.h2;
import l1.l1;
import m2.a0;
import m2.f0;
import n1.b2;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import q2.a8;
import q2.j6;
import q2.k6;
import q2.m3;
import q2.m6;
import q2.u2;
import q2.u5;
import q2.w6;
import q2.y7;
import q2.z7;
import s2.c1;
import s2.d1;
import sn.z;
import tn.o;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16449b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f16448a = i10;
        this.f16449b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicePickerScreen$lambda$10$0;
        int voicePickerExploreFeaturedSection$lambda$1$0$0;
        long j4;
        ob.f fVar;
        float f10;
        z7 z7Var;
        ho.a aVar;
        int i10 = this.f16448a;
        int i11 = 0;
        l1.i iVar = null;
        z zVar = z.f31622a;
        Object obj = this.f16449b;
        switch (i10) {
            case 0:
                VoicePickerScreen$lambda$10$0 = VoicePickerScreenKt.VoicePickerScreen$lambda$10$0((VoicePickerViewModel) obj);
                return VoicePickerScreen$lambda$10$0;
            case 1:
                return Integer.valueOf(VoicePickerExploreCollectionsSectionKt.e((ExploreVoiceSections.Section.VoiceCollections) obj));
            case 2:
                voicePickerExploreFeaturedSection$lambda$1$0$0 = VoicePickerExploreFeaturedSectionKt.voicePickerExploreFeaturedSection$lambda$1$0$0((ExploreVoiceSections.Section.FeaturedVoices) obj);
                return Integer.valueOf(voicePickerExploreFeaturedSection$lambda$1$0$0);
            case 3:
                return Float.valueOf(j1.e.o(((d0) obj).getCoroutineContext()));
            case 4:
                b1 b1Var = (b1) obj;
                u1 u1Var = b1Var.f18175e;
                if (u1Var != null) {
                    j4 = ((Number) u1Var.f18422l.getValue()).longValue();
                } else {
                    j4 = 0;
                }
                b1Var.f18176f = j4;
                return zVar;
            case 5:
                Object systemService = ((View) ((j2.l) obj).f18493c).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 6:
                return new BaseInputConnection(((s) obj).f18519a, false);
            case 7:
                jb.g gVar = (jb.g) obj;
                gVar.getLifecycle().addObserver(new jb.b(gVar, i11));
                return zVar;
            case 8:
                k2.i iVar2 = (k2.i) obj;
                iVar2.E0 = null;
                h4.n.u(iVar2).E();
                h4.n.u(iVar2).D();
                h4.n.l(iVar2);
                return Boolean.TRUE;
            case 9:
                k2.m mVar = (k2.m) obj;
                mVar.A0 = null;
                h4.n.u(mVar).E();
                h4.n.u(mVar).D();
                h4.n.l(mVar);
                return Boolean.TRUE;
            case 10:
                ho.a aVar2 = ((h0) obj).N0;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Boolean.TRUE;
            case 11:
                l1 l1Var = (l1) obj;
                if (l1Var.f20984c.h() <= l1Var.f20985d.h()) {
                    return null;
                }
                ((h1) l1Var.f20988x0.getValue()).getClass();
                return Float.valueOf(l1Var.r0() + r0.h());
            case 12:
                h2 h2Var = (h2) obj;
                l1.j jVar = (l1.j) h4.n.h(h2Var, l1.u1.f21070a);
                h2Var.C0 = jVar;
                if (jVar != null) {
                    iVar = new l1.i(jVar.f20957a, jVar.f20958b, jVar.f20959c, jVar.f20960d);
                }
                h2Var.D0 = iVar;
                return zVar;
            case 13:
                return Float.valueOf(((a0) obj).a().d0(m2.z.f22824b));
            case 14:
                f0 f0Var = (f0) obj;
                if (!kotlin.jvm.internal.m.c(null, f0Var.f22525a)) {
                    o.Q0(new lm.g(8), f0Var.f22526b);
                    r1 r1Var = f0Var.f22527c;
                    if (r1Var != null) {
                        r1Var.b();
                    }
                }
                return zVar;
            case 15:
                return Float.valueOf(((h5.c) obj).d0(125));
            case 16:
                return (b2) q.a(((hr.n) obj).i());
            case 17:
                qa.c cVar = ((na.j) obj).Z;
                if (cVar.f28152i) {
                    if (cVar.f28153j.f2799c != u.f2891a) {
                        return ((qa.b) hj.b.t(cVar.f28144a, (m1) cVar.f28156m.getValue(), 4).a(e0.f20562a.b(qa.b.class))).f28143a;
                    }
                    c6.x("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                c6.x("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                return null;
            case 18:
                ob.g gVar2 = (ob.g) obj;
                String str = gVar2.f25037b;
                if (str != null && gVar2.f25039d) {
                    Context context = gVar2.f25036a;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    fVar = new ob.f(gVar2.f25036a, new File(noBackupFilesDir, str).getAbsolutePath(), new o1(21), gVar2.f25038c, gVar2.f25040e);
                } else {
                    fVar = new ob.f(gVar2.f25036a, gVar2.f25037b, new o1(21), gVar2.f25038c, gVar2.f25040e);
                }
                fVar.setWriteAheadLoggingEnabled(gVar2.Y);
                return fVar;
            case 19:
                Http2Connection http2Connection = (Http2Connection) obj;
                Settings settings = Http2Connection.O0;
                http2Connection.getClass();
                try {
                    http2Connection.L0.E(2, 0, false);
                } catch (IOException e10) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e10);
                }
                return zVar;
            case 20:
                List list = RealWebSocket.N0;
                ((RealWebSocket) obj).cancel();
                return zVar;
            case 21:
                List list2 = RealWebSocket.N0;
                _UtilCommonKt.b((WebSocketWriter) obj);
                return zVar;
            case 22:
                List list3 = RealWebSocket.N0;
                _UtilCommonKt.b((Closeable) ((kotlin.jvm.internal.d0) obj).f20559a);
                return zVar;
            case 23:
                h4.n.l((p2.a) obj);
                return zVar;
            case 24:
                y7 y7Var = ((a8) obj).f26856o;
                if (y7Var != null && (z7Var = ((u2) y7Var).f27744a) != null) {
                    f10 = z7Var.a();
                } else {
                    f10 = t2.u.P;
                }
                return Float.valueOf(f10);
            case 25:
                ((m3) obj).f27401e.invoke();
                return zVar;
            case 26:
                return new h5.f(kd.a.H(d1.f30748d, d1.f30749e, ((c1) obj).invoke()));
            case 27:
                return ((u5) obj).f27766c;
            case 28:
                j6 j6Var = (j6) obj;
                if (!((Boolean) j6Var.f27320m.getValue()).booleanValue() && (aVar = j6Var.f27308a) != null) {
                    aVar.invoke();
                }
                return zVar;
            default:
                fr.n nVar = ((m6) ((k6) obj)).f27420b;
                if (nVar.isActive()) {
                    nVar.resumeWith(w6.f27854a);
                }
                return Boolean.TRUE;
        }
    }
}
