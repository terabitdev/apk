package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import a2.b2;
import a2.j3;
import a2.n1;
import a2.p2;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.i1;
import com.google.protobuf.c6;
import ec.r;
import f4.q1;
import fr.d0;
import fr.e0;
import fr.g0;
import fs.f0;
import h4.k0;
import ho.p;
import hr.n;
import i4.q2;
import io.elevenlabs.domain.model.AuthorProfileResourceTag;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreCollectionsSectionKt;
import ja.h3;
import ja.x2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l1.l1;
import l1.o;
import l1.o0;
import l2.r0;
import l2.t0;
import livekit.org.webrtc.t;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import q2.k6;
import q2.t3;
import q2.t7;
import q2.u5;
import q2.v5;
import q2.w2;
import r1.w1;
import rc.b0;
import rc.q;
import rc.u;
import s4.u0;
import s4.x;
import s4.x0;
import sn.z;
import u2.r1;
import u2.s1;
import u2.z0;
import ur.v;
import ur.w;
import v1.h1;
import v1.p0;
import w1.s;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16317c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(d0 d0Var, ho.l lVar) {
        this.f16315a = 9;
        this.f16317c = d0Var;
        this.f16316b = (yn.i) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [ho.l, yn.i] */
    /* JADX WARN: Type inference failed for: r3v16, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wn.c] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // ho.a
    public final Object invoke() {
        z SoundscapeList$lambda$0$2$0$1$0$0;
        z ResourceTagsRow$lambda$0$0$0$0;
        long j4;
        int i10;
        long j10;
        j3 d10;
        b2 b2Var;
        s4.h hVar;
        long a10;
        Drawable decodeDrawable;
        int i11 = 4;
        int i12 = 7;
        int i13 = 3;
        Object[] objArr = 0;
        objArr = 0;
        int i14 = 0;
        switch (this.f16315a) {
            case 0:
                SoundscapeList$lambda$0$2$0$1$0$0 = SoundscapesScreenKt.SoundscapeList$lambda$0$2$0$1$0$0((SoundscapesContract.State) this.f16317c, (ho.l) this.f16316b);
                return SoundscapeList$lambda$0$2$0$1$0$0;
            case 1:
                return VoicePickerExploreCollectionsSectionKt.c((ho.l) this.f16316b, (VoiceCollection) this.f16317c);
            case 2:
                ((j.e) this.f16317c).f18123c = (ho.a) this.f16316b;
                return z.f31622a;
            case 3:
                ((j.g) this.f16317c).f18127d = (p) this.f16316b;
                return z.f31622a;
            case 4:
                ((n) this.f16317c).d(this.f16316b);
                return z.f31622a;
            case 5:
                ResourceTagsRow$lambda$0$0$0$0 = AuthorProfileHeaderKt.ResourceTagsRow$lambda$0$0$0$0((q2) this.f16317c, (AuthorProfileResourceTag) this.f16316b);
                return ResourceTagsRow$lambda$0$0$0$0;
            case 6:
                o oVar = (o) this.f16317c;
                k0 k0Var = (k0) this.f16316b;
                oVar.f21008x0 = oVar.f21005d.mo1createOutlinePq9zytI(k0Var.f11967a.b(), k0Var.getLayoutDirection(), k0Var);
                return z.f31622a;
            case 7:
                ((kotlin.jvm.internal.d0) this.f16317c).f20559a = h4.n.h((o0) this.f16316b, q1.f8847a);
                return z.f31622a;
            case 8:
                h3 h3Var = (h3) this.f16317c;
                l1 l1Var = (l1) this.f16316b;
                h5.c cVar = h4.n.u(l1Var).P0;
                l1Var.f20984c.h();
                int h10 = l1Var.f20985d.h();
                h3Var.getClass();
                return Integer.valueOf(jo.a.y(0.33333334f * h10));
            case 9:
                g0.D((d0) this.f16317c, null, e0.f9815d, new p2((yn.i) this.f16316b, null), 1);
                return z.f31622a;
            case 10:
                r0 r0Var = (r0) this.f16317c;
                long j11 = ((h5.l) ((z0) this.f16316b).getValue()).f12092a;
                o3.b i15 = r0Var.i();
                if (i15 != null) {
                    long j12 = i15.f24764a;
                    s4.h m10 = r0Var.m();
                    if (m10 != null && m10.f31041b.length() != 0) {
                        n1 n1Var = (n1) r0Var.q.getValue();
                        if (n1Var == null) {
                            i10 = -1;
                        } else {
                            i10 = t0.f21264a[n1Var.ordinal()];
                        }
                        if (i10 != -1) {
                            if (i10 != 1 && i10 != 2) {
                                if (i10 == 3) {
                                    long j13 = r0Var.n().f38322b;
                                    int i16 = x0.f31169c;
                                    j10 = j13 & 4294967295L;
                                } else {
                                    c6.p();
                                    return null;
                                }
                            } else {
                                long j14 = r0Var.n().f38322b;
                                int i17 = x0.f31169c;
                                j10 = j14 >> 32;
                            }
                            int i18 = (int) j10;
                            b2 b2Var2 = r0Var.f21232d;
                            if (b2Var2 != null && (d10 = b2Var2.d()) != null && (b2Var = r0Var.f21232d) != null && (hVar = b2Var.f791a.f976a) != null) {
                                int m11 = ae.l.m(r0Var.f21230b.v(i18), 0, hVar.f31041b.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d10.d(j12) >> 32));
                                u0 u0Var = d10.f943a;
                                x xVar = u0Var.f31145b;
                                int d11 = xVar.d(m11);
                                float f10 = u0Var.f(d11);
                                float g10 = u0Var.g(d11);
                                float l4 = ae.l.l(intBitsToFloat, Math.min(f10, g10), Math.max(f10, g10));
                                if (h5.l.b(j11, 0L) || Math.abs(intBitsToFloat - l4) <= ((int) (j11 >> 32)) / 2) {
                                    float f11 = xVar.f(d11);
                                    j4 = (Float.floatToRawIntBits(l4) << 32) | (Float.floatToRawIntBits(((xVar.b(d11) - f11) / 2) + f11) & 4294967295L);
                                    return new o3.b(j4);
                                }
                            }
                        }
                    }
                }
                j4 = 9205357640488583168L;
                return new o3.b(j4);
            case 11:
                String str = (String) this.f16317c;
                r rVar = (r) this.f16316b;
                str.getClass();
                WorkDatabase workDatabase = rVar.f8477c;
                workDatabase.getClass();
                workDatabase.runInTransaction(new t(workDatabase, str, rVar, i13));
                ec.g.b(rVar.f8476b, workDatabase, rVar.f8479e);
                return z.f31622a;
            case 12:
                r rVar2 = (r) this.f16317c;
                UUID uuid = (UUID) this.f16316b;
                WorkDatabase workDatabase2 = rVar2.f8477c;
                workDatabase2.getClass();
                workDatabase2.runInTransaction(new x2(rVar2, uuid, 23));
                ec.g.b(rVar2.f8476b, rVar2.f8477c, rVar2.f8479e);
                return z.f31622a;
            case 13:
                na.m mVar = (na.m) this.f16317c;
                na.j jVar = (na.j) this.f16316b;
                synchronized (mVar.f24343a) {
                    try {
                        ir.b2 b2Var3 = mVar.f24344b;
                        Iterable iterable = (Iterable) b2Var3.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (!kotlin.jvm.internal.m.c((na.j) obj, jVar)) {
                                arrayList.add(obj);
                            } else {
                                b2Var3.getClass();
                                b2Var3.j(null, arrayList);
                            }
                        }
                        b2Var3.getClass();
                        b2Var3.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return z.f31622a;
            case 14:
                ((oa.m) this.f16317c).e((na.j) this.f16316b, false);
                return z.f31622a;
            case 15:
                Http2Connection http2Connection = (Http2Connection) this.f16317c;
                Http2Stream http2Stream = (Http2Stream) this.f16316b;
                try {
                    http2Connection.f25738a.b(http2Stream);
                } catch (IOException e10) {
                    Platform platform = Platform.f25840a;
                    Platform.f25840a.j(4, "Http2Connection.Listener failure for " + http2Connection.f25740c, e10);
                    try {
                        http2Stream.d(ErrorCode.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
                return z.f31622a;
            case 16:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.f16317c;
                Settings settings = (Settings) this.f16316b;
                ?? obj2 = new Object();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.L0) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.G0;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i19 = 0; i19 < 10; i19++) {
                                if (((1 << i19) & settings2.f25807a) != 0) {
                                    settings3.b(i19, settings2.f25808b[i19]);
                                }
                            }
                            for (int i20 = 0; i20 < 10; i20++) {
                                if (((1 << i20) & settings.f25807a) != 0) {
                                    settings3.b(i20, settings.f25808b[i20]);
                                }
                            }
                            obj2.f20559a = settings3;
                            a10 = settings3.a() - settings2.a();
                            if (a10 != 0 && !http2Connection2.f25739b.isEmpty()) {
                                objArr = (Http2Stream[]) http2Connection2.f25739b.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) obj2.f20559a;
                            settings4.getClass();
                            http2Connection2.G0 = settings4;
                            TaskQueue.b(http2Connection2.f25745y0, http2Connection2.f25740c + " onSettings", 0L, new c(http2Connection2, (Object) obj2, 17), 6);
                        } finally {
                        }
                    }
                    try {
                        http2Connection2.L0.a((Settings) obj2.f20559a);
                    } catch (IOException e11) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.a(errorCode, errorCode, e11);
                    }
                }
                if (objArr != 0) {
                    int length = objArr.length;
                    while (i14 < length) {
                        Http2Stream http2Stream2 = objArr[i14];
                        synchronized (http2Stream2) {
                            http2Stream2.f25778e += a10;
                            if (a10 > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                        i14++;
                    }
                }
                return z.f31622a;
            case 17:
                Http2Connection http2Connection3 = (Http2Connection) this.f16317c;
                http2Connection3.f25738a.a(http2Connection3, (Settings) ((kotlin.jvm.internal.d0) this.f16316b).f20559a);
                return z.f31622a;
            case 18:
                u5 u5Var = (u5) this.f16317c;
                d0 d0Var = (d0) this.f16316b;
                if (((Boolean) u5Var.f27767d.f30813d.invoke(v5.f27806c)).booleanValue()) {
                    g0.D(d0Var, null, null, new t3(u5Var, objArr, i12), 3);
                }
                return Boolean.TRUE;
            case 19:
                k6 k6Var = (k6) this.f16317c;
                w2 w2Var = (w2) this.f16316b;
                if (!kotlin.jvm.internal.m.c(k6Var, w2Var.f27829a)) {
                    tn.o.Q0(new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(k6Var, 25), w2Var.f27830b);
                    r1 r1Var = w2Var.f27831c;
                    if (r1Var != null) {
                        r1Var.b();
                    }
                }
                return z.f31622a;
            case 20:
                return o0.e.n((String) this.f16317c, sr.c.f31707c, new SerialDescriptor[0], new qr.e((qr.f) this.f16316b, i14));
            case 21:
                rc.z zVar = (rc.z) this.f16317c;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) this.f16316b;
                ?? obj3 = new Object();
                sd.h hVar2 = zVar.f29960a;
                fs.j z6 = hVar2.z();
                if (z6.W(0L, rc.r.f29938b) || z6.W(0L, rc.r.f29937a)) {
                    hVar2 = new b0(new f0(new q(hVar2.z())), new com.google.firebase.sessions.j(zVar.f29961b.f1838a, i11), null);
                }
                try {
                    decodeDrawable = ImageDecoder.decodeDrawable(zVar.b(hVar2), new rc.x(obj3, zVar, zVar2));
                    return decodeDrawable;
                } finally {
                    ImageDecoder g11 = u.g(obj3.f20559a);
                    if (g11 != null) {
                        g11.close();
                    }
                    hVar2.close();
                }
            case 22:
                g0.D((d0) this.f16317c, null, null, new s2.q((t7) this.f16316b, objArr, i14), 3);
                return Boolean.TRUE;
            case 23:
                u2.f0 f0Var = (u2.f0) this.f16317c;
                u1.b0 b0Var = (u1.b0) this.f16316b;
                u1.j jVar2 = (u1.j) f0Var.getValue();
                return new u1.k(b0Var, jVar2, new i1((no.g) b0Var.f33665d.f31856f.getValue(), jVar2));
            case 24:
                te.j jVar3 = (te.j) this.f16317c;
                s1 s1Var = (s1) this.f16316b;
                if (((c3.a) jVar3.f32859c).get() == 0) {
                    s1Var.invoke();
                }
                return z.f31622a;
            case 25:
                g1.o0 o0Var = (g1.o0) this.f16317c;
                u2.x xVar2 = (u2.x) this.f16316b;
                Object[] objArr2 = o0Var.f10328b;
                long[] jArr = o0Var.f10327a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i21 = 0;
                    while (true) {
                        long j15 = jArr[i21];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                            for (int i23 = 0; i23 < i22; i23++) {
                                if ((255 & j15) < 128) {
                                    xVar2.z(objArr2[(i21 << 3) + i23]);
                                }
                                j15 >>= 8;
                            }
                            if (i22 != 8) {
                            }
                        }
                        if (i21 != length2) {
                            i21++;
                        }
                    }
                }
                return z.f31622a;
            case 26:
                w wVar = (w) this.f16317c;
                String str2 = (String) this.f16316b;
                v vVar = (v) wVar.f34672c;
                if (vVar == null) {
                    Enum[] enumArr = (Enum[]) wVar.f34671b;
                    vVar = new v(str2, enumArr.length);
                    for (Enum r02 : enumArr) {
                        vVar.b(r02.name(), false);
                    }
                }
                return vVar;
            case 27:
                return o0.e.n((String) this.f16317c, sr.i.f31734e, new SerialDescriptor[0], new w1((w) this.f16316b, 15));
            case 28:
                return new h1((f3.h) this.f16317c, tn.u.f33548a, (f3.d) this.f16316b);
            default:
                u2.f0 f0Var2 = (u2.f0) this.f16317c;
                w1.e0 e0Var = (w1.e0) this.f16316b;
                s sVar = (s) f0Var2.getValue();
                return new w1.t(e0Var, sVar, new i1((no.g) ((p0) e0Var.f35962d.f5297f).getValue(), sVar));
        }
    }

    public /* synthetic */ c(ho.l lVar, VoiceCollection voiceCollection) {
        this.f16315a = 1;
        this.f16316b = lVar;
        this.f16317c = voiceCollection;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f16315a = i10;
        this.f16317c = obj;
        this.f16316b = obj2;
    }

    public /* synthetic */ c(na.m mVar, na.j jVar, boolean z6) {
        this.f16315a = 13;
        this.f16317c = mVar;
        this.f16316b = jVar;
    }
}
