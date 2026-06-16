package io.elevenlabs.ui.components;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "applicationContext", "", "logErrors", "Lsn/z;", "installImageLoader", "(Landroid/content/Context;Z)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CoilKt {
    /* JADX WARN: Type inference failed for: r12v9, types: [fd.j, java.lang.Object] */
    public static final void installImageLoader(Context context, boolean z6) {
        context.getClass();
        pc.e eVar = new pc.e(context);
        eVar.f26635c = new sn.o(new h0(context, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new Object());
        eVar.f26636d = new pc.b(x7.e.U(arrayList), x7.e.U(arrayList2), x7.e.U(arrayList3), x7.e.U(arrayList4), x7.e.U(arrayList5));
        if (z6) {
            eVar.f26638f = new Object();
        }
        ad.c a10 = ad.c.a(eVar.f26634b, 16383);
        eVar.f26634b = a10;
        eVar.f26634b = ad.c.a(a10, 24575);
        fd.i iVar = eVar.f26637e;
        eVar.f26637e = new fd.i(iVar.f9419a, iVar.f9420b, false, iVar.f9422d, iVar.f9423e);
        pc.j a11 = eVar.a();
        synchronized (pc.a.class) {
            pc.a.f26624b = a11;
        }
    }

    public static final sc.a installImageLoader$lambda$0(Context context) {
        long j4;
        fs.y yVar = fs.n.f9989a;
        mr.e eVar = fr.r0.f9888a;
        mr.d dVar = mr.d.f23445b;
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        File l02 = eo.k.l0(cacheDir, "image_cache");
        String str = fs.c0.f9934b;
        fs.c0 w6 = hj.b.w(l02);
        if (0.0d > 0.0d) {
            j4 = 10485760;
            try {
                File file = w6.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j4 = ae.l.o((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
            } catch (Exception unused) {
            }
        } else {
            j4 = 10485760;
        }
        return new sc.h(j4, dVar, yVar, w6);
    }
}
